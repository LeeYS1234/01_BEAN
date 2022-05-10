package com.goodee.ex01.java05;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("java/soldier_context.xml");
		
		Soldier soldier1 = ctx.getBean("soldier1", Soldier.class);
		soldier1.info();
		
		System.out.println();
		
		Soldier soldier2 = ctx.getBean("soldier2", Soldier.class);
		soldier2.info();
		
		ctx.close();
	}

}
