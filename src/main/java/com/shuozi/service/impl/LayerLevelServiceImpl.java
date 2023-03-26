package com.shuozi.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shuozi.entity.LayerLevel;
import com.shuozi.mapper.LayerLevelMapper;
import com.shuozi.service.ILayerLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Service
public class LayerLevelServiceImpl extends ServiceImpl<LayerLevelMapper, LayerLevel> implements ILayerLevelService {

    @Resource
    LayerLevelMapper  layerLevelMapper;

    @Override
    public List<LayerLevel>  getAll() {
//        添加不能添加总公司
        LambdaQueryWrapper<LayerLevel> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.lt(LayerLevel::getWeight,1);
        return  layerLevelMapper.selectList(queryWrapper);

    }
}
