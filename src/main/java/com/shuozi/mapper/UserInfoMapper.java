package com.shuozi.mapper;

import com.shuozi.entity.UserInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 * @author zhangshuo
 * @since 2023-03-24
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {

}
