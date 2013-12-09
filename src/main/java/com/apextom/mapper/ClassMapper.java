package com.apextom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.apextom.domain.ClassModel;

public interface ClassMapper extends SqlMapper{

	/**
	 * 根据课程Id查询课程信息
	 * 
	 * @param pid 
	 * @return 
	 */
	@Select("SELECT ID,PNAME,CONTENT,PTYPE,SHOWFLAG,ORDERS FROM PROJECTS WHERE ID = #{id}")
	@Results(value = {
			@Result(column="ID",property="id",javaType=Integer.class,jdbcType=JdbcType.INTEGER),
			@Result(column="PNAME",property="name",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="CONTENT",property="content",javaType=String.class,jdbcType=JdbcType.INTEGER),
			@Result(column="PTYPE",property="type",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="SHOWFLAG",property="show",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="ORDERS",property="orders",javaType=Integer.class,jdbcType=JdbcType.VARCHAR)
	})
	ClassModel queryClassByClassId(int id);
	
	/**
	 * 查询课程信息
	 *  
	 * @return
	 */
	@Select("SELECT ID,PNAME,CONTENT,PTYPE,SHOWFLAG,ORDERS FROM PROJECTS WHERE SHOW = '1'")
	@Results(value = {
			@Result(column="ID",property="id",javaType=Integer.class,jdbcType=JdbcType.INTEGER),
			@Result(column="PNAME",property="name",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="CONTENT",property="content",javaType=String.class,jdbcType=JdbcType.INTEGER),
			@Result(column="PTYPE",property="type",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="SHOWFLAG",property="show",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="ORDERS",property="orders",javaType=Integer.class,jdbcType=JdbcType.VARCHAR)
	})
	List<ClassModel> queryClasses();

}
