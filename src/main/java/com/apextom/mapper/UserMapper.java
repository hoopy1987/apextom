package com.apextom.mapper;

import java.util.List;

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
	@Select("SELECT LOGINUSER,PASSWORD,USERNAME FROM USERS WHERE LOGINUSER = #{userdm} ")
	@Results(value = {
			@Result(column="LOGINUSER",property="userdm",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="PASSWORD",property="password",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="USERNAME",property="username",javaType=String.class,jdbcType=JdbcType.VARCHAR),
	})
	UserModel getUserInfoByUserdm(String userdm);
	
	/**
	 * 查询所有用户信息
	 * 
	 * @param userdm 用户代码
	 * @return 用户信息对象
	 */
	@Select("SELECT RY.SWRY_DM,RY.USERPASSWORD,RY.MC,RY.SWJG_DM,JG.MC AS JGMC FROM T_DM_GY_SWRY RY LEFT JOIN T_DM_GY_SWJG JG ON RY.SWJG_DM = JG.SWJG_DM")
	@Results(value = {
			@Result(column="SWRY_DM",property="userdm",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="USERPASSWORD",property="password",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="MC",property="username",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="SWJG_DM",property="jgdm",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="JGMC",property="jgmc",javaType=String.class,jdbcType=JdbcType.VARCHAR)
	})
	List<UserModel> getAllUserInfos();

}
