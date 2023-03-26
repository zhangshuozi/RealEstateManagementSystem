package com.shuozi.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
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
 * 员工信息
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
@ApiModel(value="UserInfo对象", description="员工信息")
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    @TableId(value = "id")
    private Long id;

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "性别")
    private String sex;

    @ApiModelProperty(value = "头像")
    private String icon;

    @ApiModelProperty(value = "0:不在职 1 代表在职  2 代表冻结")
    private String empStatus;

    @ApiModelProperty(value = "手机号")
    private String phone;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "身份证号")
    private String idNumber;

    @ApiModelProperty(value = "工号")
    private String workNumber;

    @ApiModelProperty(value = "部门")
    private Long dept;

    @ApiModelProperty(value = "入职日期")
    private LocalDateTime joinTime;

    @ApiModelProperty(value = "生日")
    private LocalDate birthday;

    @ApiModelProperty(value = "招聘渠道")
    private String useFrom;

    @ApiModelProperty(value = "推荐人")
    private String referrer;

    @ApiModelProperty(value = "籍贯")
    private String nativePlace;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "政治面貌")
    private String politicalOutlook;

    @ApiModelProperty(value = "婚姻情况")
    private String maritalStatus;

    @ApiModelProperty(value = "最高学历")
    private String educationBackground;

    @ApiModelProperty(value = "毕业年份")
    private String graduationYear;

    @ApiModelProperty(value = "毕业学校")
    private String graduationSchool;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "银行卡号  6-12位")
    private String bankNumber;

    @ApiModelProperty(value = "开户银行")
    private String bankName;

    @ApiModelProperty(value = "社保账号18位")
    private String socialSecurityAccount;

    @ApiModelProperty(value = "公积金12位")
    private String publicAccumulationFunds;

    @ApiModelProperty(value = "qq号")
    private String qq;

    @ApiModelProperty(value = "微信")
    private String wechat;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "备用电话")
    private String anotherPhone;

    @ApiModelProperty(value = "现居地址")
    private String addrNow;

    @ApiModelProperty(value = "户口地址")
    private String accountAddress;

    @ApiModelProperty(value = "紧急联系电话")
    private String urgentConnect;

    @ApiModelProperty(value = "紧急联系人")
    private String urgentPerson;

    @ApiModelProperty(value = "技能证书")
    private String skillCertificate;

    @ApiModelProperty(value = "荣誉奖项")
    private String honoraryAwards;

    @ApiModelProperty(value = "兴趣爱好")
    private String hobby;

    @ApiModelProperty(value = "备注")
    private String remark;


}
