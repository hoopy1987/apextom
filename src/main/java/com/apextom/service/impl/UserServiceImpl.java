package com.apextom.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apextom.dao.UserDao;
import com.apextom.domain.UserModel;
import com.apextom.exception.UnMacthingDataException;
import com.apextom.service.UserService;
import com.apextom.util.DigestUtil;

/**
 * 
 * @author hoopy
 *
 */
@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	
	private final String ERROR_NOTMATCH = "用户名和密码不匹配！";
	
	private final String ERROR_BLANKKEY = "用户名和密码不能为空！";
	
	private final String ERROR_ILLEGAL = "参数非法！";

	/* (non-Javadoc)
	 * @see com.apextom.service.UserService#checkLogin(java.lang.String, java.lang.String)
	 */
	public UserModel checkLogin(String userdm, String password) throws UnMacthingDataException {
		// 二次校验减少数据库开销
		if(StringUtils.isBlank(userdm)
				|| StringUtils.isBlank(password)){
			throw new UnMacthingDataException(ERROR_BLANKKEY);
		}
		// 查询用户代码下的用户信息
		String pwd = null;
		UserModel user = userDao.queryUserInfoByUserdm(userdm);
		try {
			pwd = DigestUtil.encodeMessageMD5(password);
		} catch (Exception e) {
			throw new UnMacthingDataException(ERROR_ILLEGAL);
		}
		// 匹配用户名密码
		if(user != null && pwd.equals(user.getPassword())){
			return user;
		}else {
			throw new UnMacthingDataException(ERROR_NOTMATCH);
		}
	}

}
