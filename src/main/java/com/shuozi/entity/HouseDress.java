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
@TableName("house_dress")
@ApiModel(value="HouseDress对象", description="")
public class HouseDress implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "house_dress_id", type = IdType.AUTO)
    private Long houseDressId;

    @ApiModelProperty(value = "装修程度名称")
    @TableField("dress_name")
    private String dressName;


}
