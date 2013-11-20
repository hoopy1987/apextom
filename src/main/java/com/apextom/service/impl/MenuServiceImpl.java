package com.apextom.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apextom.dao.MenuDao;
import com.apextom.domain.MenuTreeModel;
import com.apextom.domain.ProjectsModel;
import com.apextom.service.MenuService;

/**
 * 
 * @author hoopy
 *
 */
@Service("menuService")
public class MenuServiceImpl implements MenuService {
	
	private final String CLASS_NODE_ID = "99";
	private final String CLASS_NODE_NAME = "课程设置";
	
	private final String NORMAL_NODE_TYPE = "0";
	private final String CLASS_NODE_TYPE = "1";
	private final String DOWNLOAD_NODE_TYPE = "2";
	
	@Autowired
	private MenuDao menuDao;

	public List<MenuTreeModel> queryMenuTreeByRight(String right) {
		// List<MenuTreeModel> menuList = new ArrayList<MenuTreeModel>(); 如果需要导航栏抬头
		// 栏目类型（0：常规栏目，1：课程类）
		List<ProjectsModel> projectsModelNormalList = menuDao.queryMenuTreeByPtype(NORMAL_NODE_TYPE);
		List<ProjectsModel> projectsModelDownloadList = menuDao.queryMenuTreeByPtype(DOWNLOAD_NODE_TYPE);
		projectsModelNormalList.addAll(projectsModelDownloadList);
		
		List<MenuTreeModel> menuNormalList = new ArrayList<MenuTreeModel>();
		MenuTreeModel menuTreeModel = null;
		for(ProjectsModel pm : projectsModelNormalList){
			menuTreeModel = new MenuTreeModel();
			menuTreeModel.setId(String.valueOf(pm.getId()));
			menuTreeModel.setText(pm.getPname());
			
			Map<String,String> attributes = new HashMap<String,String>();
			attributes.put("ptype", pm.getPtype());
			
			menuTreeModel.setAttributes(attributes);
			
			menuNormalList.add(menuTreeModel);
		}
		
		// 权限（0：管理员，1：课程设置）right
		if("0".equals(right)){
			List<ProjectsModel> projectsModelClassList = menuDao.queryMenuTreeByPtype(CLASS_NODE_TYPE);
			
			// 插入课程节点
			MenuTreeModel menuTreeClassNode = new MenuTreeModel();
			menuTreeClassNode.setId(CLASS_NODE_ID);
			menuTreeClassNode.setText(CLASS_NODE_NAME);
			
			List<MenuTreeModel> menuClassList = new ArrayList<MenuTreeModel>();
			MenuTreeModel menuTreeClassModel = null;
			for(ProjectsModel pm : projectsModelClassList){
				menuTreeClassModel = new MenuTreeModel();
				menuTreeClassModel.setId(String.valueOf(pm.getId()));
				menuTreeClassModel.setText(pm.getPname());
				
				Map<String,String> attributes = new HashMap<String,String>();
				attributes.put("ptype", pm.getPtype());
				
				menuTreeClassModel.setAttributes(attributes);
				
				menuClassList.add(menuTreeClassModel);
			}
			
			menuTreeClassNode.setChildren(menuClassList);
			menuNormalList.add(menuTreeClassNode);
		}
		
		return menuNormalList;
	}

}
