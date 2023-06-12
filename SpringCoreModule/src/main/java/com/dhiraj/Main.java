package com.dhiraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext("ApplicationContex.xml");
		Welcome welcome=ac.getBean("welcome",Welcome.class);
		
		welcome.PrintWelcome();
	}

}
