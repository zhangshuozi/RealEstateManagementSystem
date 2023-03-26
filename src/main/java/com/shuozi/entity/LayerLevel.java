package com.shuozi.entity;

import java.math.BigDecimal;
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
@TableName("layer_level")
@ApiModel(value="LayerLevel对象", description="")
public class LayerLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "layer_level_id", type = IdType.AUTO)
    private Long layerLevelId;

    @ApiModelProperty(value = "层级名称")
    private String layerLevelName;

    @ApiModelProperty(value = "区分部门层级的一个权重")
    private BigDecimal weight;


}
