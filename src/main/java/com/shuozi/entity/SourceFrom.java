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
@TableName("source_from")
@ApiModel(value="SourceFrom对象", description="")
public class SourceFrom implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "source_from_id", type = IdType.AUTO)
    private Long sourceFromId;

    @ApiModelProperty(value = "房屋来源名称")
    @TableField("source_from_name")
    private String sourceFromName;


}
