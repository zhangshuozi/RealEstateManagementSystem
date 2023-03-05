package com.shuozi.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Owner {
    private Long id;

    //   业主编号
    private String code;

    //   业主姓名
    private String name;

    //    业主电话号
    private String phone;

    //   房屋地址
    private String addr;

    //    面积
    private Double area;

    //   类别
    private String type;

    //    朝向
    private String face;

    //   价格
    private Double price;

    //   创建时间
    private LocalDateTime createTime;

    //   更新时间
    private LocalDateTime updateTime;

    //   创建人
    private Long createUser;

    //   更新人
    private Long updateUser;
}
