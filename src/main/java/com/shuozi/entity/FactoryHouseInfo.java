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
@TableName("factory_house_info")
@ApiModel(value="FactoryHouseInfo对象", description="")
public class FactoryHouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "factoury_house_id", type = IdType.AUTO)
    private Long factouryHouseId;

    @ApiModelProperty(value = "区域")
    @TableField("area")
    private String area;

    @ApiModelProperty(value = "底价")
    @TableField("min_price")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "买进价格")
    @TableField("bought_price")
    private BigDecimal boughtPrice;

    @ApiModelProperty(value = "总面积")
    @TableField("total_area")
    private BigDecimal totalArea;

    @ApiModelProperty(value = "厂房面积")
    @TableField("building_area")
    private BigDecimal buildingArea;

    @ApiModelProperty(value = "宿舍面积")
    @TableField("dormitory_area")
    private BigDecimal dormitoryArea;

    @ApiModelProperty(value = "办公面积")
    @TableField("work_area")
    private BigDecimal workArea;

    @ApiModelProperty(value = "占地面积")
    @TableField("take_area")
    private BigDecimal takeArea;

    @ApiModelProperty(value = "空地面积")
    @TableField("null_area")
    private BigDecimal nullArea;

    @ApiModelProperty(value = "公摊面积")
    @TableField("gongtan_area")
    private BigDecimal gongtanArea;

    @ApiModelProperty(value = "现配电")
    @TableField("peidian_now")
    private String peidianNow;

    @ApiModelProperty(value = "可配电")
    @TableField("peidian_surplus")
    private String peidianSurplus;

    @ApiModelProperty(value = "层高")
    @TableField("layer_high")
    private BigDecimal layerHigh;

    @ApiModelProperty(value = "层数")
    @TableField("layer_num")
    private Integer layerNum;

    @ApiModelProperty(value = "跨度")
    @TableField("span")
    private BigDecimal span;

    @ApiModelProperty(value = "1:全新  9:9成新 8：8成新")
    @TableField("new_old_level")
    private String newOldLevel;

    @ApiModelProperty(value = "适合的行业")
    @TableField("suit_industry")
    private String suitIndustry;

    @ApiModelProperty(value = "消防  0 没有 1 有")
    @TableField("fire_control")
    private String fireControl;

    @ApiModelProperty(value = "行车 0 没有  1 有")
    @TableField("train_working")
    private String trainWorking;

    @ApiModelProperty(value = "电梯 0 没有 1 有 ")
    @TableField("lift")
    private String lift;

    @ApiModelProperty(value = "来源渠道id")
    @TableField("source_from_id")
    private Long sourceFromId;

    @ApiModelProperty(value = "建筑年代")
    @TableField("build_year")
    private Integer buildYear;

    @ApiModelProperty(value = "厂房结构")
    @TableField("factory_structure_id")
    private Integer factoryStructureId;

    @ApiModelProperty(value = "抵押  0没有 1 有")
    @TableField("mortgage")
    private String mortgage;

    @ApiModelProperty(value = "卡能进  0 不能 1 能 ")
    @TableField("lorry")
    private String lorry;

    @ApiModelProperty(value = "备注")
    @TableField("remarks")
    private String remarks;

    @ApiModelProperty(value = "用途id")
    @TableField("purpose_id")
    private Long purposeId;


}
