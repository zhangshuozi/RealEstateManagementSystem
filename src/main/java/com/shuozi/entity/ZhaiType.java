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
@TableName("zhai_type")
@ApiModel(value="ZhaiType对象", description="")
public class ZhaiType implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zhai_type_id", type = IdType.AUTO)
    private Long zhaiTypeId;

    @ApiModelProperty(value = "住宅类型名称")
    @TableField("type_name")
    private String typeName;


}
