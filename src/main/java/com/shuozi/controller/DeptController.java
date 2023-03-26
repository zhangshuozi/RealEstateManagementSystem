package com.shuozi.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuozi.common.R;
import com.shuozi.dto.DeptDto;
import com.shuozi.entity.DeptInfo;
import com.shuozi.service.IDeptInfoService;
import com.shuozi.entity.LayerLevel;
import com.shuozi.service.ILayerLevelService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.BeanUtils;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/dept")
@Log4j2
public class DeptController
{
    @Resource
    IDeptInfoService deptInfoService;

    @Resource
    ILayerLevelService layerLevelService;



//    显示所有的部门
    @GetMapping("/page")
    public R<Page> showDept(int page ,int pageSize ,String name)
    {
//        分页构造器
        Page<DeptInfo> deptInfoPage = new Page<>(page,pageSize);
        Page<DeptDto> deptDtoPage = new Page<>();
//      进行copy到dto中
        LambdaQueryWrapper<DeptInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(name!=null,DeptInfo::getDeptName,name);
        queryWrapper.orderByDesc(DeptInfo::getUpdateTime);

        deptInfoService.page(deptInfoPage,queryWrapper);

        BeanUtils.copyProperties(deptInfoPage,deptDtoPage,"records");

        List<DeptInfo> records = deptInfoPage.getRecords();
        List<DeptDto> list = records.stream().map((items) -> {
            DeptDto deptDto = new DeptDto();
            BeanUtils.copyProperties(items, deptDto);
            Long layerLevel = items.getLayerLevel();
            LayerLevel layerLevel1 = layerLevelService.getById(layerLevel);
            if (layerLevel1 != null) {
                deptDto.setLayerLevelName(layerLevel1.getLayerLevelName());
                deptDto.setWeight(layerLevel1.getWeight());
            }
            return deptDto;
        }).collect(Collectors.toList());

        log.info(list);

        deptDtoPage.setRecords(list);

        return R.success(deptDtoPage);
    }


//    点击添加的下拉框后会发送请求 获取层级列表 顺带着权重 由前端进行判断权重大小展示哪些数据
    @GetMapping("/layer")
    public R<List<LayerLevel>> showLayer()
    {
        List<LayerLevel> layer = layerLevelService.getAll();
        if (layer==null)
        {
            return R.error("未获取到层级信息");
        }
        return R.success(layer);
    }


//    点击保存提交表单   前端判断勾选  公司id 通过
    @PostMapping("/change")
    @Transactional(rollbackFor = Exception.class)
    public R<String> add(@RequestBody @Validated DeptDto deptDto)
    {
        if (deptDto == null) {
            return R.error("部门数据为空");
        }
        boolean save = deptInfoService.save(deptDto);
        if (!save)
        {
            return R.error("业务繁忙");
        }

        return R.success("添加部门成功");
    }


    @PutMapping("update")
    @Transactional(rollbackFor = Exception.class)
    public R<String> update(@RequestBody @Validated DeptDto deptDto){
        if (deptDto== null)
        {
            return R.error("未上传数据");
        }
        boolean b = deptInfoService.updateById(deptDto);
        if (!b)
        {
            return R.error("业务繁忙");
        }
        return R.success("更新成功");
    }

    //   做数据的回显
    @GetMapping("/{id}")
    public R<DeptDto> deptReshow(@PathVariable Long id)
    {
        DeptDto reshow = deptInfoService.reshow(id);
        return R.success(reshow);
    }



   @DeleteMapping("/del/{id}")
   @Transactional(rollbackFor = Exception.class)
   public R<String> del(@PathVariable Long id)
   {


       String s = deptInfoService.removeDept(id);
       if (s==null)
       {
       return R.success("删除成功");
       }
       return R.error(s);
   }






}
