package com.shuozi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("access_record")
@ApiModel(value="AccessRecord对象", description="")
public class AccessRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "登录用户id")
    private Long userId;

    @ApiModelProperty(value = "0代表登出 1 代表登入")
    private String accessType;

    @ApiModelProperty(value = "登入 登出时间")
    private LocalDateTime accessTime;

    @ApiModelProperty(value = "用户登入或登出对应的IP地址")
    private String accessIp;


}
