package com.goodee.ex01.java02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean(name="stu") 		// <bean id="stu">가 된다.
	public Student stu() {	// 위에서 아이디를 줬기 때문에 메소드 이름은 아무렇게나 지어도 된다.
		Student res = new Student();	//default constructor
		List<Integer> scores = new ArrayList<Integer>();
		for(int i= 0; i<5; i++) {		
			scores.add((int)(Math.random() *100));
			//(int)Math.random() *101
		}
		
		Set<String> awards = new HashSet<String>();
		awards.add("인기상");
		awards.add("개근상");
		awards.add("봉사상");

		Map<String, String> home = new HashMap<String, String>();
		home.put("address", "서울");
		home.put("phone", "02-555-6666");
	
		// setter injection
		res.setScores(scores);
		res.setAwards(awards);
		res.setHome(home);
		
		return res;
		
	}

	
	
}
