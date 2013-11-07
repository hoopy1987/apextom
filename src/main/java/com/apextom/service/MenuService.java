package com.apextom.service;

import java.util.List;

import com.apextom.domain.MenuTreeModel;

/**
 * 功能菜单树服务接口
 * 
 * @author lys
 *
 */
public interface MenuService {
	
	/**
	 * 根据权限查询功能菜单树
	 * @return List<MenuNode>
	 */
	public List<MenuTreeModel> queryMenuTreeByRight(String right);
	
}
