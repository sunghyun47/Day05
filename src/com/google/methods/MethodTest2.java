package com.google.methods;

import java.util.Scanner;

public class MethodTest2 {

	// m1 - 급여 받아서 고용보험료 0.2% 계산 출력
	// m2 - 급여 받아서 의료보험료 1.3% 계산 출력
	// m3 - 급여 받아서 국민연금 1.0% 계산 출력
	// m4 - 급여 받아서 산재보험 0.4% 계산 출력
	
	public void m1(int sal) {
		System.out.println(sal*0.002);
	}
	public void m2(int sal) {
		System.out.println(sal*0.013);
	}
	public void m3(int sal) {
		System.out.println(sal*0.01);
	}
	public void m4(int sal) {
		System.out.println(sal*0.004);
	}
	
	
}
