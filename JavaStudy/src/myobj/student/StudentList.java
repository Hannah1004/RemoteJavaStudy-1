package myobj.student;

import java.util.ArrayList;

public class StudentList {
	public static void main(String[] args) {
		ArrayList<Student> student_list = new ArrayList<>();
		
		for(int i = 0; i < 30; ++i) {
			student_list.add(new Student());
		}
		
		System.out.println(student_list);
		
		for (Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("가장 높은 점수 : " + Student.best_avg);
		System.out.println("가장 높은 점수인 학생의 학번 : " + Student.best_avg_snum);
	}
}
