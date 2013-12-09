package com.apextom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apextom.dao.ClassDao;
import com.apextom.domain.ClassModel;
import com.apextom.service.ClassService;

/**
 * 
 * @author hoopy
 *
 */
@Service("classService")
public class ClassServiceImpl implements ClassService {
	
	@Autowired
	private ClassDao classDao;

	public ClassModel queryClassByClassId(int id) {
		return classDao.queryClassByClassId(id);
	}

	public List<ClassModel> queryClasses() {
		return classDao.queryClasses();
	}

}
