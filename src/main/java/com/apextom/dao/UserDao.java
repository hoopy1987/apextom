package com.apextom.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apextom.domain.UserModel;
import com.apextom.mapper.UserMapper;

@Repository
public class UserDao {
	
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 获取用户信息 - redis
	 * 
	 * @param userdm
	 * @return
	 */
	public UserModel queryUserInfoByUserdm(String userdm){
		return userMapper.getUserInfoByUserdm(userdm);
	}
	
}
