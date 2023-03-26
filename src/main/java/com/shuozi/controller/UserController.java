package com.shuozi.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.shuozi.common.R;
import com.shuozi.entity.UserInfo;
import com.shuozi.service.IUserInfoService;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/*
   人员管理界面的代码实现
 */
@RestController
@Log4j2
@RequestMapping("/user")
public class UserController
{
    @Resource
    IUserInfoService userInfoService;


//    查询所有的员工信息 展示在职人员和 离职 冻结人员的数量
@GetMapping("/index")
public R<Object> showIndex()
{
//    查找三次  0 代表 不在值 1 代表在职  2 代表冻结
    Map<String,Object> map = new HashMap<>();
    LambdaQueryWrapper<UserInfo> queryWrapper = new LambdaQueryWrapper<>();
    queryWrapper.eq(UserInfo::getEmpStatus,0);
    int count = userInfoService.count(queryWrapper);

    LambdaQueryWrapper<UserInfo> queryWrapper1 = new LambdaQueryWrapper<>();
    queryWrapper1.eq(UserInfo::getEmpStatus,1);
    int count1 = userInfoService.count(queryWrapper1);

    LambdaQueryWrapper<UserInfo> queryWrapper2 = new LambdaQueryWrapper<>();
    queryWrapper2.eq(UserInfo::getEmpStatus,2);
    int count2 = userInfoService.count(queryWrapper2);

    map.put("0",count);
    map.put("1",count1);
    map.put("2",count2);
    R<Object> r  = new R<Object>();
    r.setMap(map);
    return r;
}

    //    新增员工
    @PostMapping("/add")
    public R<String> addEmployee(@RequestBody UserInfo userInfo)
    {
        if (userInfo==null)
        {
            return R.error("您未提交数据");
        }
        boolean saveFlag = userInfoService.save(userInfo);
        if (saveFlag){
            return R.success("保存成功");
        }
        return R.error("系统错误");
    }


}
