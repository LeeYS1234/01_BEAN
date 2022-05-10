package com.goodee.ex01.xml06;

public class BMICalculator {
	// field
	private Calculator calculator;
	private double heigth; 	// 키(cm 단위)
	private double weight; 	// 몸무게(kg 단위)
	private double bmi;		// BMI : 몸무게(kg) / 키(cm) * 키(cm)
	private String health;
	// BMI < 20			: 저체중
	// 20 <= BMI <25	: 정상체중
	// 25 <= BMI <30	: 과체중
	// 30 <= BMI 		:	비만
	
	// constructor
	// heigth, weight 정보를 이용해서 bmi, health 값을 구해야 되므로 bmi, health 값을 받아오지 않는다.
	public BMICalculator(Calculator calculator, double heigth, double weight) {
		// 전달 받은 값 정보 저장하기
		this.calculator = calculator;
		this.heigth = heigth;
		this.weight = weight;
		
		// bmi 계산하기
		heigth /= 100; // 키 단위를 cm -> m 수정하는 작업
		this.bmi = this.calculator.div( weight,this.calculator.mul(heigth, heigth));   //weight / (heigth * heigth)
		
		// health 계산하기
		if(this.bmi < 20 ) {
			this.health ="저체중";
		}
		else if(this.bmi < 25) {
			this.health ="정상체중";
		}
		else if(this.bmi< 30) {
			this.health ="과체중";	
		}
		else{
			this.health ="비만";	
		}
	}
	// info() 메소드
	public void info() {
		System.out.println("heigth : " + heigth +"cm");
		System.out.println("weight : " + weight +"kg");
		System.out.println("bmi : " + bmi);
		System.out.println("health : " + health);
	}
	
	
	
}
