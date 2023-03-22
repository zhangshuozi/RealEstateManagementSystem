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
@TableName("zhai_house_info")
@ApiModel(value="ZhaiHouseInfo对象", description="")
public class ZhaiHouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zhuzhai_id", type = IdType.AUTO)
    private Long zhuzhaiId;

    @ApiModelProperty(value = "底价")
    @TableField("min_price")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "小区")
    @TableField("small_qu")
    private String smallQu;

    @ApiModelProperty(value = "卧室")
    @TableField("shi")
    private String shi;

    @ApiModelProperty(value = "客厅")
    @TableField("ting")
    private String ting;

    @ApiModelProperty(value = "卫生间")
    @TableField("wei")
    private String wei;

    @ApiModelProperty(value = "阳台")
    @TableField("yang")
    private String yang;

    @ApiModelProperty(value = "建筑面积   单位：平  ")
    @TableField("building_area")
    private String buildingArea;

    @ApiModelProperty(value = "使用面积")
    @TableField("use_area")
    private String useArea;

    @ApiModelProperty(value = "楼层 不能大于999")
    @TableField("floor")
    private Integer floor;

    @ApiModelProperty(value = "住宅类型id")
    @TableField("zhai_type")
    private Long zhaiType;

    @ApiModelProperty(value = "房屋朝向")
    @TableField("tend")
    private String tend;

    @ApiModelProperty(value = "装修情况id")
    @TableField("dress")
    private Long dress;

    @ApiModelProperty(value = "来源渠道id")
    @TableField("source_from_id")
    private Long sourceFromId;

    @ApiModelProperty(value = "电梯 0 没有 1 有 ")
    @TableField("lift")
    private String lift;

    @ApiModelProperty(value = "房屋年限")
    @TableField("house_year")
    private String houseYear;

    @ApiModelProperty(value = "唯一住房 0 不是  1 是")
    @TableField("only_live")
    private String onlyLive;

    @ApiModelProperty(value = "建筑年代 最小不能小于1900")
    @TableField("build_year")
    private Integer buildYear;

    @ApiModelProperty(value = "产权性质 id")
    @TableField("ownership_id")
    private Long ownershipId;

    @ApiModelProperty(value = "产权年限 40年 50年 70年")
    @TableField("ownership_year")
    private String ownershipYear;

    @ApiModelProperty(value = "抵押  0 没有 1 有")
    @TableField("mortgage")
    private String mortgage;

    @ApiModelProperty(value = "备注")
    @TableField("remark")
    private String remark;


}
