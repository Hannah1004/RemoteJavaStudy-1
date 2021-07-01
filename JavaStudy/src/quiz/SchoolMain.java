package quiz;

public class SchoolMain {
	public static void main(String[] args) {
		String[] studentName = {"철수","민수","영수","희수","지수",
								"영희","민희","진희","용희","민상",
								"영란","영철","재석","세호","홍철",
								"하하","형돈","지용","미란","민지",
								"강호","호동","민재","권혁","태흔",
								"미노","하나","두울","세엣","네엣",
								"다섯","일국","이국","삼국","사국"};
		
		
		String[] subject = {"국어","영어","수학","프로그래밍 언어",
				   			"알고리즘","자료구조"};
		
		int[] score = new int[100];

		for (int i = 0; i < studentName.length; ++i) {
			int random_number = (int)(Math.random()*30);
			int sum = 0;
			
			System.out.println("이 학생의 이름은 : " + studentName[random_number]);
				for (int j = 0; j < subject.length; ++j) {
					int score_random = (int)(Math.random()*101);	
					sum += score_random;
				
				System.out.print("과목 명 : " + subject[j] + " / ");
				System.out.println("점수 : " + score_random + "점");
			}
				
				System.out.print("총점은 : " + sum + "점" + "\t");
				int average = sum / subject.length;
				System.out.println("평균은 : " + average + "점");
		}
			
	}
}
