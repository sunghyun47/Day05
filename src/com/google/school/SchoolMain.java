package com.google.school;

public class SchoolMain {

	public static void main(String[] args) {

		// student class 참조해서 student 객체를 생성
		// 클래스명 변수명 = new 클래스명();
		
		Student st = new Student();
		System.out.println(st);
		System.out.println(st.name);
		System.out.println(st.num);
		
		st.name = "IU";
		st.num = 1;
		
		System.out.println(st.name);
		System.out.println(st.num);
		
		
		Student st2 = new Student();
		System.out.println(st2);
		System.out.println(st2.name);
		System.out.println(st.num);
		
		System.out.println("===============");
		System.out.println("total :  "+ st.total);
		st.kor=40;
		st.eng=40;
		st.math=40;
		
		st.total=st.kor+st.eng+st.math;
		st.avg=st.total/3.0;
		System.out.println("===============");
		System.out.println("total :  "+ st.total);
		
		
		// System.out.println(st==st2);
		
		
		
	}

}
