package com.mkyong.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/** 
 * @ClassName: UserDao 
 * @author: Hoboson
 * @Email:  1104069183@qq.com  
 * @date: 2017年12月5日 上午9:53:21  
 */
@Repository
@Transactional
public class UserDao {
	public void doSave() {
		System.out.println("UserDao.doSave..........");
	}
}
