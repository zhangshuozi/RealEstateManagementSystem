package com.shuozi.service.impl;

import com.shuozi.entity.Action;
import com.shuozi.mapper.ActionMapper;
import com.shuozi.service.IActionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Service
public class ActionServiceImpl extends ServiceImpl<ActionMapper, Action> implements IActionService {

}
