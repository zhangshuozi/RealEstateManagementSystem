package com.shuozi.service;

import com.shuozi.dto.DeptDto;
import com.shuozi.entity.DeptInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
public interface IDeptInfoService extends IService<DeptInfo> {

    DeptDto reshow(Long id);

    String removeDept(Long id);

}
