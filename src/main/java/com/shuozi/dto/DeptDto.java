package com.shuozi.dto;

import com.shuozi.entity.DeptInfo;
import lombok.Data;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
@Data
public class DeptDto extends DeptInfo
{
//    部门基本信息
//   private List<DeptInfo> deptInfos ;

//   层级名称
//   @Size(max = 3,message = "-太长了不行-")
   private String layerLevelName;

//   权重
//   @DecimalMax("10.5")
//   @DecimalMin(value = "5.3",message = "-权重不对-")
   private BigDecimal weight;

}
