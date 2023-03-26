package com.shuozi.service;

import com.shuozi.entity.LayerLevel;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
public interface ILayerLevelService extends IService<LayerLevel> {

    List<LayerLevel> getAll();
}
