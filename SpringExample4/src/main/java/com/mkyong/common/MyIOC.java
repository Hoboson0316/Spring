package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.controller.UserController;

public class MyIOC {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Module.xml");
		UserController userController=(UserController) context.getBean("userController");
		userController.doSaveUserCtl();
		/*MySpring2 mySpring2=(MySpring2) context.getBean("mySpring2");
		mySpring.doSayHello();
		mySpring2.doSayHello1();*/
	}

}
