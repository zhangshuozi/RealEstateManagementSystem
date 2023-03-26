package com.shuozi.service;

import com.shuozi.entity.UserInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 员工信息 服务类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
public interface IUserInfoService extends IService<UserInfo> {
    List<UserInfo> selectUser();
}
