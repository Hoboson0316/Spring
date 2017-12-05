package com.mkyong.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mkyong.dao.UserDao;

/** 
 * @ClassName: UserService 
 * @author: Hoboson
 * @Email:  1104069183@qq.com  
 * @date: 2017年12月5日 上午9:53:27  
 */
@Service
public class UserService {
	@Resource
	private UserDao userDao;
	public void doSaveUser() {
		System.out.println("UserService.doSaveUser........");
		userDao.doSave();
	}
}
