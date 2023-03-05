package com.shuozi.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shuozi.mapper.OwnerMapper;
import com.shuozi.pojo.Owner;
import com.shuozi.service.OwnerService;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl extends ServiceImpl<OwnerMapper, Owner> implements OwnerService
{

}
