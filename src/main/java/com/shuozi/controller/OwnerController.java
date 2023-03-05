package com.shuozi.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuozi.common.R;
import com.shuozi.pojo.Owner;
import com.shuozi.service.OwnerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
@RequestMapping("/owner")
public class OwnerController
{
    @Autowired
    OwnerService ownerService;

    @GetMapping("/test1/{id}")
    public R<Owner> test01(@PathVariable Integer id)
    {
        System.out.println("我输出了一段话和参数id="+id);
        LambdaQueryWrapper<Owner> queryWrapper= new LambdaQueryWrapper<>();
        queryWrapper.eq(Owner::getCode,id);
        Owner owner = ownerService.getOne(queryWrapper);

        return R.success(owner);
    }

//    分页查询并且显示业主的信息
    @GetMapping("/page")
    public R<Page<Owner>> ownerInfo(int page,int pageSize,String name)
    {
//        分页构造器
        Page<Owner> page1 = new Page<>(page,pageSize);
        LambdaQueryWrapper<Owner> queryWrapper= new LambdaQueryWrapper<>();
//        如果有查询条件则按照查询条件  进行模糊查询
        queryWrapper.like(name!=null,Owner::getName,name);
//        根据创建时间降序排序
        queryWrapper.orderByDesc(Owner::getCreateTime);
        ownerService.page(page1,queryWrapper);
        return R.success(page1);
    }

//    获取到某个员工的id进行修改
    @GetMapping("{id}")
    public R<Owner> getOne(@PathVariable("id") Long id)
    {
        if (id!=null)
        {
            Owner oneInfo = ownerService.getById(id);
            return R.success(oneInfo);
        }
        return R.error("没拿到这个人的信息");
    }

//    添加一个新的业主
    @PostMapping
    public R<String> addOwner(@RequestBody Owner owner)
    {
        log.info("开始进行添加到数据库里面进行保存~"+owner.toString());
        ownerService.save(owner);
        return R.success("卖家信息添加成功!");
    }

//    对单个卖家信息的删除
    @DeleteMapping("{id}")
    public R<String> delOwner(@PathVariable Long id)
    {
        if (id!=null){
            ownerService.removeById(id);
            return R.success("删除成功");
        }
        return R.error("业务繁忙,删除失败，请重试");

    }

//    更新卖家信息
    @PutMapping
    public R<String> updateOwner(@RequestBody Owner owner)
    {
        ownerService.updateById(owner);
        return R.success("更新成功");
    }


}
