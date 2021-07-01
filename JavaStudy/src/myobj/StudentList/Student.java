package myobj.StudentList;

import java.util.ArrayList;
import java.util.Random;

public class Student {
	
	ArrayList<Integer> students = new ArrayList<>();
	ArrayList<Integer> korean = new ArrayList<>();
	ArrayList<Integer> english = new ArrayList<>();
	ArrayList<Integer> math = new ArrayList<>();
	ArrayList<Integer> average = new ArrayList<>();

	Random ran;
	int topAverage = 0;

	void randomscore() {
		ran = new Random();
		for(int i =0; i < 30; ++i) {
			students.add(0,i);
			korean.add(ran.nextInt(100));
			english.add(ran.nextInt(100));
			math.add(ran.nextInt(100));
			
			int aver = (korean.get(i) + english.get(i) + math.get(i)) / 3;
			average.add(aver);
			
			if (aver > topAverage) {
				topAverage = aver;
			}
		}
	}
	
	void averScore() {
		for (int i = 0; i < students.size(); ++i) {
			System.out.printf("%d번째 학생의 평균점수는 %d점입니다", students.get(i),average.get(i));
			System.out.println();
		}
	}
	
	void topScore() {
		System.out.printf("학생이 가장 높은 평균점수 %d점입니다",topAverage);
	}
}

