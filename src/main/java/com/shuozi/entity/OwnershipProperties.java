package com.shuozi.entity;

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
 * @since 2023-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("ownership_properties")
@ApiModel(value="OwnershipProperties对象", description="")
public class OwnershipProperties implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "ownership_id", type = IdType.AUTO)
    private Long ownershipId;

    @ApiModelProperty(value = "产权性质 名称")
    private String ownershipProperties;


}
