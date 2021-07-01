package myobj.StudentList;
import java.util.ArrayList;
import java.util.Random;

public class D01_StudentList {
	
	/*
	  학생 클래스를 요소로 갖는 ArrayList를 생성하고 학생을 30명 추가해보세요
	  
	  1. 각 학생의 점수는 랜덤으로 설정 
	  2. 과목은 국/영/수
	  3. 30명의 평균점수를 출력 
	  4. 30명중 가장 평균 점수가 높은 학생의 성적을 출력 
	 */
	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.randomscore();
		student.averScore();
		student.topScore();
	}
}

	


