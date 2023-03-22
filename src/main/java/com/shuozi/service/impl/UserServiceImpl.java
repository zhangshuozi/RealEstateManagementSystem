package com.shuozi.service.impl;

import com.shuozi.entity.User;
import com.shuozi.mapper.UserMapper;
import com.shuozi.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-22
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
