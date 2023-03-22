package com.shuozi.controller;

import com.shuozi.service.OwnerService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Log4j2
@RequestMapping("/count")
public class CountController
{
    @Resource
    OwnerService ownerService;

//    统计

}
