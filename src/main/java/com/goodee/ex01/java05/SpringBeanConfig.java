package com.goodee.ex01.java05;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringBeanConfig {

	@Bean(name="gun2")
	public Gun a() {
		Gun res = new Gun();
		res.setModel("AK-47");
		res.setBullet(20);
		
		return res;
		
	}
	
	@Bean(name="soldier2")
	public Soldier b() {
		Soldier res = new Soldier();

		Map<String, String> army = new HashMap<String, String>();
		army.put("부대명", "이기자");
		army.put("부대위치", "화천");
		
		res.setName("박중사");
		res.setGun(a());
		res.setArmy(army);
		
		return res;
		
	}
	
}
