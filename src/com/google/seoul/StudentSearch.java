package com.google.seoul;

import java.util.Scanner;

public class StudentSearch {

	public Student search(Student [] students) {
		
		// 학생 번호 입력
		// 배열에서 학생번호 일치하는 학생 찾아서 리턴
		
		Scanner sc = new Scanner(System.in);
		
		int searchNum = sc.nextInt();
		Student student = null;
		for(int i=0; i<students.length; i++) {
			if(searchNum == students[i].num) {
				student = students[i];
				break;
			}
		}
		return student;// 학생 한명 리턴
		
		
	}
	
	
	
}
