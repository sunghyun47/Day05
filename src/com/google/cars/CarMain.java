package com.google.cars;

public class CarMain {

	public static void main(String[] args) {

		Car c1 = new Car();
		
		c1.wheel = 4; //멤버변수
		c1.color = "white";
		c1.size = "small";
		c1.company = "benz";
		
		Car c2 = new Car();
		c2.wheel = c1.wheel;
		c2.color = c1.color;
		c2.size = c1.size;
		c2.company = c1.company;
		
		c2.color = "red";
	
		System.out.println(c2.color);	
	
		Bike b1 = new Bike();
		b1.wheel = 2;
		b1.color = "black";
		b1.company = "honda";

		// Engine
		System.out.println(c1);
		
//		Engine engine = new Engine();
//		engine.hp = 100;
//		engine.fuel = "gas";
//		engine.cc = 1000;
//		c1.engine = engine;
		
		c1.engine = new Engine();
		c1.engine.hp = 100;
		c1.engine.fuel = "gas";
		c1.engine.cc = 1000;
		
		System.out.println(c1.engine.fuel);
		
		// =======================================
		
		Airplane airplane = new Airplane();
		//airplane.engine = new Engine();
		//airplane.engine2 = new Engine();
		
		//엔진배열 2개 만들어야됨
		airplane.engine = new Engine[2];
		airplane.engine[0] = new Engine();
		airplane.engine[1] = new Engine();
		
		//첫번째 엔진 10000 입력
		airplane.engine[0].hp = 10000;
		
		System.out.println(airplane.engine);
		
		Airplane airplane2 = new Airplane();
		airplane2.engine = new Engine[2020];
		for(int i=0; i<airplane2.engine.length; i++) {
			
			airplane2.engine[i] = new Engine();
			airplane2.engine[i].hp = 1000;
			airplane2.engine[i].fuel = "항공유";
			airplane2.engine[i].cc = 30000; //밑에 5줄이랑 똑같음
			
			
//			Engine e = new Engine();
//			e.hp = 1000;
//			e.fuel = "항공유";
//			e.cc = 30000;	
//			airplane2.engine[i]=e;
		}
		
		
		
		
	}

}
