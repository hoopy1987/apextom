package com.apextom.mapper;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.apextom.domain.UserModel;

public interface UserMapper extends SqlMapper{

	/**
	 * 根据用户代码查询用户信息
	 * 
	 * @param userdm 用户代码
	 * @return 用户信息对象
	 */
	@Select("SELECT LOGINUSER,PASSWORD,USERNAME,RIGHTS FROM USERS WHERE LOGINUSER = #{userdm} ")
	@Results(value = {
			@Result(column="LOGINUSER",property="userdm",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="PASSWORD",property="password",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="USERNAME",property="username",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="RIGHTS",property="authType",javaType=String.class,jdbcType=JdbcType.CHAR)
	})
	UserModel getUserInfoByUserdm(String userdm);
	
}
