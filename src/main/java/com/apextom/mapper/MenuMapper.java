package com.apextom.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.apextom.domain.MenuTreeModel;

public interface MenuMapper extends SqlMapper{

	/**
	 * 查询用户功能菜单树
	 * 
	 * @param ptype 
	 * @return 用户功能菜单树
	 */
	@Select("SELECT ID,MENU_NAME,MENU_URL,PID FROM MENU WHERE PID = #{pid} ORDER BY PID,MENU_ORDER")
	@Results(value = {
			@Result(column="ID",property="id",javaType=Integer.class,jdbcType=JdbcType.INTEGER),
			@Result(column="MENU_NAME",property="text",javaType=String.class,jdbcType=JdbcType.VARCHAR),
			@Result(column="PID",property="pid",javaType=Integer.class,jdbcType=JdbcType.INTEGER),
			@Result(column="MENU_URL",property="url",javaType=String.class,jdbcType=JdbcType.VARCHAR)
	})
	List<MenuTreeModel> queryMenuTree(int pid);

}
