package com.mkyong.common;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module2.xml");

		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		MySpring mySpring = (MySpring) context.getBean("mySpring");
		//Dbutil dbutil = (Dbutil) context.getBean("dataSource");
		DruidDataSource d= (DruidDataSource) context.getBean("dataSource");
		mySpring.doSayHello();
		obj.printHello();
	}
}
