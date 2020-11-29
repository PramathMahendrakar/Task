package com.pra.spring.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pra.spring.files.Mobile;

public class tester {

	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("resources/context.xml");
		Mobile mobile=context.getBean(Mobile.class);
		
		mobile.show_values();
		boolean isItem =mobile.isItem_supported();
		System.out.println("IsItem_supported\t"+isItem);
		
		
		
	}
}
