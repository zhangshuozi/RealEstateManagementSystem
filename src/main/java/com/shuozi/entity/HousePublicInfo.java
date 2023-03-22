package com.shuozi.entity;

import java.math.BigDecimal;

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
@TableName("house_public_info")
@ApiModel(value="HousePublicInfo对象", description="")
public class HousePublicInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = " ")
    @TableId(value = "core_info_id", type = IdType.AUTO)
    private Long coreInfoId;

    @ApiModelProperty(value = "业主名称")
    @TableField("owener_name")
    private String owenerName;

    @ApiModelProperty(value = "业主电话")
    @TableField("owner_phone")
    private String ownerPhone;

    @ApiModelProperty(value = "区域")
    @TableField("area")
    private String area;

    @ApiModelProperty(value = "小区")
    @TableField("xiao_qu")
    private String xiaoQu;

    @ApiModelProperty(value = "栋座")
    @TableField("dong_zuo")
    private String dongZuo;

    @ApiModelProperty(value = "单元")
    @TableField("unit")
    private String unit;

    @ApiModelProperty(value = "房号")
    @TableField("room_number")
    private String roomNumber;

    @ApiModelProperty(value = "房源等级  ")
    @TableField("house_resource_level")
    private String houseResourceLevel;

    @ApiModelProperty(value = "盘别 0 公盘 1 私盘 2 抢盘")
    @TableField("pan_bie")
    private String panBie;

    @ApiModelProperty(value = "价格")
    @TableField("price")
    private BigDecimal price;


}
