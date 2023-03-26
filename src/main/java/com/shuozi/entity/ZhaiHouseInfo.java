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
@TableName("zhai_house_info")
@ApiModel(value="ZhaiHouseInfo对象", description="")
public class ZhaiHouseInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "zhuzhai_id", type = IdType.AUTO)
    private Long zhuzhaiId;

    @ApiModelProperty(value = "用途id")
    private Long purposeId;

    @ApiModelProperty(value = "业主名称")
    private String ownerName;

    @ApiModelProperty(value = "业主电话")
    private String ownerPhone;

    @ApiModelProperty(value = "底价")
    private BigDecimal minPrice;

    @ApiModelProperty(value = "小区")
    private String smallQu;

    @ApiModelProperty(value = "栋座")
    private String dongZuo;

    @ApiModelProperty(value = "单元")
    private String part;

    @ApiModelProperty(value = "房号")
    private String houseNumber;

    @ApiModelProperty(value = "房源等级   A B C")
    private String houseResourceLevel;

    @ApiModelProperty(value = "盘别 0公盘 1私盘 2 抢盘")
    private String panBie;

    @ApiModelProperty(value = "价格")
    private BigDecimal price;

    @ApiModelProperty(value = "卧室")
    private String shi;

    @ApiModelProperty(value = "客厅")
    private String ting;

    @ApiModelProperty(value = "卫生间")
    private String wei;

    @ApiModelProperty(value = "阳台")
    private String yang;

    @ApiModelProperty(value = "建筑面积   单位：平  ")
    private String buildingArea;

    @ApiModelProperty(value = "使用面积")
    private String useArea;

    @ApiModelProperty(value = "楼层 不能大于999")
    private Integer floor;

    @ApiModelProperty(value = "住宅类型id")
    private Long zhaiType;

    @ApiModelProperty(value = "房屋朝向")
    private String tend;

    @ApiModelProperty(value = "装修情况id")
    private Long dress;

    @ApiModelProperty(value = "卖点")
    private String cellPoint;

    @ApiModelProperty(value = "来源渠道id")
    private Long sourceFromId;

    @ApiModelProperty(value = "电梯 0 没有 1 有 ")
    private String lift;

    @ApiModelProperty(value = "房屋年限")
    private String houseYear;

    @ApiModelProperty(value = "唯一住房 0 不是  1 是")
    private String onlyLive;

    @ApiModelProperty(value = "建筑年代 最小不能小于1900")
    private Integer buildYear;

    @ApiModelProperty(value = "产权性质 id")
    private Long ownershipId;

    @ApiModelProperty(value = "产权年限 40年 50年 70年")
    private String ownershipYear;

    @ApiModelProperty(value = "抵押  0 没有 1 有")
    private String mortgage;

    @ApiModelProperty(value = "备注")
    private String remark;


}
