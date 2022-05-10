package com.goodee.ex01.java03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
		
		Gugudan gugudan = (Gugudan)ctx.getBean("gugudan"); // 캐스팅을 해도 상관없다
		
		gugudan.printGugudan();
		
		ctx.close();
		

	}

}
