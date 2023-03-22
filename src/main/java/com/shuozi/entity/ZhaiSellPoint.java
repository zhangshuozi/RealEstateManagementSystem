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
@TableName("zhai_sell_point")
@ApiModel(value="ZhaiSellPoint对象", description="")
public class ZhaiSellPoint implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "卖点id")
    @TableId(value = "sell_point_id", type = IdType.AUTO)
    private Long sellPointId;

    @ApiModelProperty(value = "住宅id")
    @TableField("zhai_house_id")
    private Long zhaiHouseId;


}
