package com.shuozi.service.impl;

import com.shuozi.entity.UserInfo;
import com.shuozi.mapper.UserInfoMapper;
import com.shuozi.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 员工信息 服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Resource
    UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> selectUser() {

        return userInfoMapper.selectList(null);

    }
}
