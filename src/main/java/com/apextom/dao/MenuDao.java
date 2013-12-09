package com.apextom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apextom.domain.MenuTreeModel;
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
	public List<MenuTreeModel> queryMenuTree(int pid){
		return menuMapper.queryMenuTree(pid);
	}
	
}
