package com.google.mart;

public class ProductView {

	// 제품 정보 출력하는 메서드
	public void info(Product product) {
		System.out.println("Brand " + product); // 위에 추가해야됨
		System.out.println("Price " + product);
		System.out.println("Amount " + product);
		System.out.println("Sale " + product);
		
	}
}
