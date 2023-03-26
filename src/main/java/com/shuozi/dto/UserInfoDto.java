package com.shuozi.dto;


import com.shuozi.entity.UserInfo;
import lombok.Data;

import java.util.List;

@Data
public class UserInfoDto
{
//    员工基本信息
   private List<UserInfo> userInfos ;

//   岗位(角色名称)
   private String roleName;

}
