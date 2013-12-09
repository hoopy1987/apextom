package com.apextom.service;

import java.util.List;

import com.apextom.domain.ClassModel;

/**
 * 课程服务接口
 * 
 * @author lys
 *
 */
public interface ClassService {
	
	public ClassModel queryClassByClassId(int id);
	
	public List<ClassModel> queryClasses();
	
}
