package com.shuozi.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDateTime;
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
@TableName("factory_house_info")
@ApiModel(value="FactoryHouseInfo对象", description="")
public class FactoryHouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "factory_house_id", type = IdType.AUTO)
    private Long factoryHouseId;

    @ApiModelProperty(value = "业主名称")
    private String ownerName;

    @ApiModelProperty(value = "业主电话")
    private String owenerPhone;

    @ApiModelProperty(value = "区域")
    private String area;

    @ApiModelProperty(value = "商圈")
    private String businessCircle;

    @ApiModelProperty(value = "地址")
    private String address;

    @ApiModelProperty(value = "房源等级")
    private String houseResourceLevel;

    @ApiModelProperty(value = "盘别 0 公盘 1 私盘 2 抢盘")
    private String panBie;

    @ApiModelProperty(value = "房屋展示图片")
    private String image;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "用途id")
    private Long purposeId;

    @ApiModelProperty(value = "底价")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "买进价格")
    private BigDecimal boughtPrice;

    @ApiModelProperty(value = "总面积")
    private BigDecimal totalArea;

    @ApiModelProperty(value = "厂房面积")
    private BigDecimal buildingArea;

    @ApiModelProperty(value = "宿舍面积")
    private BigDecimal dormitoryArea;

    @ApiModelProperty(value = "办公面积")
    private BigDecimal workArea;

    @ApiModelProperty(value = "占地面积")
    private BigDecimal takeArea;

    @ApiModelProperty(value = "空地面积")
    private BigDecimal nullArea;

    @ApiModelProperty(value = "公摊面积")
    private BigDecimal gongtanArea;

    @ApiModelProperty(value = "现配电")
    private String peidianNow;

    @ApiModelProperty(value = "可配电")
    private String peidianSurplus;

    @ApiModelProperty(value = "层高")
    private BigDecimal layerHigh;

    @ApiModelProperty(value = "层数")
    private Integer layerNum;

    @ApiModelProperty(value = "跨度")
    private BigDecimal span;

    @ApiModelProperty(value = "1:全新  9:9成新 8：8成新")
    private String newOldLevel;

    @ApiModelProperty(value = "适合的行业")
    private String suitIndustry;

    @ApiModelProperty(value = "消防  0 没有 1 有")
    private String fireControl;

    @ApiModelProperty(value = "行车 0 没有  1 有")
    private String trainWorking;

    @ApiModelProperty(value = "电梯 0 没有 1 有 ")
    private String lift;

    @ApiModelProperty(value = "配套的东西")
    private String peiTao;

    @ApiModelProperty(value = "来源渠道id")
    private Long sourceFromId;

    @ApiModelProperty(value = "建筑年代")
    private Integer buildYear;

    @ApiModelProperty(value = "厂房结构")
    private Integer factoryStructureId;

    @ApiModelProperty(value = "抵押  0没有 1 有")
    private String mortgage;

    @ApiModelProperty(value = "卡车能进  0 不能 1 能 ")
    private String lorry;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "创建人")
    private Long createUser;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;


}
