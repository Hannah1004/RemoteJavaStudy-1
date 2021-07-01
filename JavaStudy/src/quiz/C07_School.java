package quiz;

import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

abstract public class C07_School {
	
	/*
	  1. 각 반의 정원은 30명이다 
	  2. 프로그래밍 반 학생들은 각자의 국어, 영어, 수학,프로그래밍 언어, 알고리즘, 자료구조 점수가 있다
	  3. 모든학생의 점수와 이름을 랜덤으로 생성한다 
	     학번은 중복없이 순차적으로 생성되어야 한다 (또는 중복없이 랜덤도 가능)
	  4. 성적표 매서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다 
	  
	  첫번째로는 학생 클래스를 만들어서 어느반에서든 상속받아 사용하게 만든다 또한 겹치는 과목들도 코드를 간략하게 하기위해 추가한다 
	  
	  한명의 학생의 성적표가 완성되면 반복문과 배열을통해 30명의 학생들을 랜덤으로 생성한다 
	 */
	
	public static void main(String[] args) {
		ProgrammingStudent pro = new ProgrammingStudent();
		Student[] school = new Student[30];
		
		for (int i = 0; i < school.length; ++i) {
			school[i] = new ProgrammingStudent();
			
			school[i].printGradeCard(); 
		}
		
		for (int i = 0; i < school.length; ++i) {
			school[i] = new NetworkStudent();
			school[i].printGradeCard();
		}
		
		
	}
	
}
