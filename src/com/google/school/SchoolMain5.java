package com.google.school;

import java.util.Scanner;

public class SchoolMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Teacher iu = new Teacher();
		StudentView view = new StudentView();
		System.out.println("선생님 이름 입력");
		iu.name = sc.next();

		System.out.println("선생님 과목 입력");
		iu.subject = sc.next();

		// 선생님의 학생의 수 입력
		boolean check = true;
		while(check) {
			System.out.println("1. 학생정보 입력");
			System.out.println("2. 전체정보 입력");
			System.out.println("3. 학생정보 검색");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();

			switch(select) {
			case 1:
				System.out.println("학생의 수 입력");
				select = sc.nextInt();
				iu.students = new Student[select];

				//학생정보 입력
				for(int i=0; i<iu.students.length; i++) {
					Student student = new Student();

					System.out.println("이름 입력");
					student.name = sc.next();

					System.out.println("번호 입력");
					student.num = sc.nextInt();

					System.out.println("국어 점수 입력");
					student.kor = sc.nextInt();

					System.out.println("영어 점수 입력");
					student.eng = sc.nextInt();

					System.out.println("수학 점수 입력");
					student.math = sc.nextInt();

					student.total = student.kor + student.eng + student.math;
					student.avg = student.total/3.0;
					iu.students[i] = student;	
				}

				break;
			case 2: // 학생정보 출력
				if(iu.students != null ) {
					for(int i=0; i<iu.students.length; i++) {
//						System.out.println("이름 : " + iu.students[i].name);
//						System.out.println("번호 : " + iu.students[i].num);
//						System.out.println("국어 : " + iu.students[i].kor);
//						System.out.println("영어 : " + iu.students[i].eng);
//						System.out.println("수학 : " + iu.students[i].math);
//						System.out.println("총점 : " + iu.students[i].total);
//						System.out.println("평균 : " + iu.students[i].avg);
//						System.out.println("=============================");
					}

				}
			
				else {
					System.out.println("학생정보가 없음");
				}
				break;
				
			case 3:
				if(iu.students != null) {
					System.out.println("학생번호 입력");
					select = sc.nextInt();
					boolean find = true;
					for(int i=0; i<iu.students.length; i++) {//select랑 첫번째 학생숫자비교
						if(select == iu.students[i].num) {
//							System.out.println("이름 : " + iu.students[i].name);
//							System.out.println("번호 : " + iu.students[i].num);
//							System.out.println("국어 : " + iu.students[i].kor);
//							System.out.println("영어 : " + iu.students[i].eng);
//							System.out.println("수학 : " + iu.students[i].math);
//							System.out.println("총점 : " + iu.students[i].total);
//							System.out.println("평균 : " + iu.students[i].avg);
							view.view(iu.students[i]);
							find = !find;
							break;
						}
					} // for end
					if(find) {
						System.out.println("없는 번호");
					}
					
				}
				else {
					System.out.println("학생정보 없음");
				}
				
				break;

			default :
				check =! check;
			}

		} // while end
		
		//		for (int i=0; i<iu.students.length; i++) {
		//			System.out.println(iu.students[i].name);
		//			System.err.println(iu.students[i].avg);
		//		}

	} // main end

} // class end
