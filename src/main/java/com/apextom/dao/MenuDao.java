package com.apextom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apextom.domain.ProjectsModel;
import com.apextom.mapper.MenuMapper;

@Repository
public class MenuDao {
	
	@Autowired
	private MenuMapper menuMapper;
	
	/**
	 * 根据项目类型查询
	 * 
	 * @param ptype
	 * @return List<ProjectsModel>
	 */
	public List<ProjectsModel> queryMenuTreeByPtype(String ptype){
		return menuMapper.queryMenuTreeByPtype(ptype);
	}
	
}
