package com.shuozi.controller;

/*
    对于员工的增删改查
 */

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shuozi.common.R;

import com.shuozi.service.UserService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/*
    对员工的增删改查
 */
@Log4j2
@RestController
public class UserController
{
    @Resource
    UserService userService;

    //    分页查询并且显示员工的信息
    @GetMapping("/page")
    public R<Page<UserDto>> customerInfo(int page, int pageSize, String name)
    {
//        分页构造器
        Page<UserDto> pageInfo = new Page<>(page,pageSize);
        LambdaQueryWrapper<UserDto> queryWrapper= new LambdaQueryWrapper<>();
//        如果有查询条件则按照查询条件  进行模糊查询
        queryWrapper.like(name!=null,UserDto::getName,name);
//        根据创建时间降序排序
        queryWrapper.orderByDesc(UserDto::getCreateTime);
        userService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }


    @GetMapping("{id}")
    public R<UserDto> getOne(@PathVariable("id") Long id)
    {
        if (id != null )
        {
            UserDto user = userService.getById(id);
            return R.success(user);
        }
        return R.error("没拿到这个人的信息");
    }


    @PostMapping
    public R<String> addOwner(@RequestBody UserDto userDto)
    {
        log.info("开始进行添加到数据库里面进行保存~"+userDto.toString());
        userService.save(userDto);
        return R.success("卖家信息添加成功!");
    }

    @DeleteMapping("{id}")
    public R<String> delCustomer(@PathVariable Long id)
    {

        return R.error("业务繁忙,删除失败，请重试");

    }

    @PutMapping
    public R<String> updateOwner(@RequestBody UserDto userDto)
    {
        userService.updateById(userDto);
        return R.success("更新成功");
    }

}
