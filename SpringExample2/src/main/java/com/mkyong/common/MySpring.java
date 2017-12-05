package com.mkyong.common;

public class MySpring {
	private String age;
	
	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void doSayHello() {
		System.out.println("Say Spring first  Hello"+"age==="+this.age);
	}

}
