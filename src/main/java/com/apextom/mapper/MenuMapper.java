package com.apextom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.apextom.domain.ProjectsModel;

public interface MenuMapper extends SqlMapper{

	/**
	 * 查询用户功能菜单树
	 * 
	 * @param ptype 
	 * @return 用户功能菜单树
	 */
	@Select("SELECT ID,PNAME,PTYPE,ORDERS FROM PROJECTS WHERE PTYPE = #{ptype} ORDER BY ORDERS")
	@Results(value = {
			@Result(column="ID",property="id",javaType=Integer.class,jdbcType=JdbcType.INTEGER),
			@Result(column="PNAME",property="pname",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="PTYPE",property="ptype",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="ORDERS",property="order",javaType=Integer.class,jdbcType=JdbcType.INTEGER)
	})
	List<ProjectsModel> queryMenuTreeByPtype(String ptype);

}
