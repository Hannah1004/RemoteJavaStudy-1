package quiz;
import java.util.Scanner;

public class B02_ScoreToGrade {

	public static void main(String[] args) {
		/*
		 점수를 입력받으면 점수에 해당하는 알맞은 등급을 출력해주는 프로그램을 만들어보세요
		 90 이상 a
		 80 b
		 70 c
		 60 d
		 그 외 f
		 
		 유효한 점수는 0~100
		 */
		// 첫번째 실패 !
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("당신의 점수를 입력하세요 >");
//		int num = sc.nextInt();
//		char grade = A, B, C, D, F;
//		if (100 >= A > 90 >= B > 80 >= C > 70 >= D > 60 >= F >= 0) {
//			  System.out.printf("당신의 등급은 %d 입니다 ", grade);
//		}
		
		
		// 두번째 성공이지만 너무 노가다 
//		if (num >= 90 && num <= 100) {
//			System.out.println("당신의 등급은 A입니다 ");
//		} else if (num >= 80 && num < 90) {
//			System.out.println("당신의 등급은 B입니다 ");
//		} else if (num >= 70 && num < 80) {
//			System.out.println("당신의 등급은 C입니다 ");
//		} else if (num >= 60 && num < 70) {
//			System.out.println("당신의 등급은 D입니다 ");
//		} else if (num >= 0 && num < 60) {
//			System.out.println("당신의 등급은 F입니다 ");
//		}
		 
		//정답
		// 입력을 받았 때 잘못된 값을 먼저 거르는 것이 좋다
		Scanner sc = new Scanner(System.in);
		char grade = 'Z';
		int score;
		System.out.print("점수를 입력해주세요 > ");
		score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.print("잘못된 값을 입력하셨습니다 !");
		} else if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		System.out.printf("당신의 등급은 %c 입니다\n ",grade);
		
		
		
	}
}

  