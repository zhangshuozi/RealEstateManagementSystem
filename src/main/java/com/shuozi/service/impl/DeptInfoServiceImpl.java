package com.shuozi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shuozi.common.R;
import com.shuozi.dto.DeptDto;
import com.shuozi.entity.DeptInfo;
import com.shuozi.entity.LayerLevel;
import com.shuozi.mapper.DeptInfoMapper;
import com.shuozi.mapper.LayerLevelMapper;
import com.shuozi.service.IDeptInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuozi.service.ILayerLevelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Service
public class DeptInfoServiceImpl extends ServiceImpl<DeptInfoMapper, DeptInfo> implements IDeptInfoService {

    @Resource
    LayerLevelMapper layerLevelMapper;

//    将数据封装到dto中进行回显
    @Override
    public DeptDto reshow(Long id) {
        DeptInfo deptInfo = this.getById(id);
        DeptDto deptDto = new DeptDto();
        BeanUtils.copyProperties(deptInfo,deptDto);

//      查找所属的层级信息 添加到dto中
        LambdaQueryWrapper<LayerLevel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(LayerLevel::getLayerLevelId,deptInfo.getLayerLevel());

        LayerLevel layerLevel = layerLevelMapper.selectOne(queryWrapper);
        deptDto.setLayerLevelName(layerLevel.getLayerLevelName());
        deptDto.setWeight(layerLevel.getWeight());
        return deptDto;
    }

//    删除一个部门

    @Override
    public String removeDept(Long id) {

        LambdaQueryWrapper<DeptInfo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(DeptInfo::getParentId,id);
        int count = this.count(queryWrapper);
        if (count>0)
        {
            return "该部门中还有" + count + "个部门";
        }
        boolean b = removeById(id);
        if (!b)
        {
            return "执行删除失败";
        }
        return null;
    }

}
