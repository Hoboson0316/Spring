package com.mkyong.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.mkyong.service.UserService;

/** 
 * @ClassName: UserController 
 * @author: Hoboson
 * @Email:  1104069183@qq.com  
 * @date: 2017年12月5日 上午9:53:12  
 */
@Controller
public class UserController {
	@Resource
	private UserService userService;
	
	public void doSaveUserCtl() {
		System.out.println("UserController.doSaveUserCtl...........");
		userService.doSaveUser();
	}

}
