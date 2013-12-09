package com.apextom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apextom.domain.ClassModel;
import com.apextom.mapper.ClassMapper;

@Repository
public class ClassDao {
	
	@Autowired
	private ClassMapper classMapper;
	
	public ClassModel queryClassByClassId(int id){
		return classMapper.queryClassByClassId(id);
	}
	
	public List<ClassModel> queryClasses(){
		return classMapper.queryClasses();
	}
}
