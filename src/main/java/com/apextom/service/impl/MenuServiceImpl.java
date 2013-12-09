package com.apextom.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.apextom.dao.MenuDao;
import com.apextom.domain.MenuTreeModel;
import com.apextom.service.MenuService;

/**
 * 
 * @author hoopy
 *
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	@Autowired
	private MenuDao menuDao;
	
	public List<MenuTreeModel> queryMenuTreeByRight(String right){
		List<MenuTreeModel> menusList = new ArrayList<MenuTreeModel>();
		MenuTreeModel root = new MenuTreeModel();
		root.setId(0);
		root.setText("root");
		
		List<MenuTreeModel> menuList = menuDao.queryMenuTree(0);
		List<MenuTreeModel> classMenusList = menuDao.queryMenuTree(2);
		
		for(MenuTreeModel menu : classMenusList){
			menu.getAttributes().put("url", menu.getUrl());
		}
		
		for(MenuTreeModel menu : menuList){
			if(menu.getId() == 2){
				menu.setChildren(classMenusList);
				menu.getAttributes().put("url", "");
			}else{
				menu.getAttributes().put("url", menu.getUrl());
			}
		}
		
		root.setChildren(menuList);
		menusList.add(root);
		
		System.out.println(JSON.toJSONString(menusList));
		
		
		return menusList;
	}

}
