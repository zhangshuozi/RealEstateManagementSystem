package com.shuozi.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
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
 * @since 2023-03-22
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("role_action")
@ApiModel(value="RoleAction对象", description="")
public class RoleAction implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "权限行为的id")
    @TableId(value = "action_id", type = IdType.AUTO)
    private Long actionId;

    @ApiModelProperty(value = "角色的编号")
    @TableField("role_id")
    private Long roleId;


}
