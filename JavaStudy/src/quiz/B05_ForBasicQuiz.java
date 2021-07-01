 package quiz;
import java.util.Scanner;

public class B05_ForBasicQuiz {
	/*
	 사용자가 숫자를 입력했을 때
	 1. 10부터 입력한 숫자까지의 총합을 구해보세요
	 2. 1000부터 입력한 숫자까지 순서대로 나오게 만들어보세요 
	 3. 1부터 입력한 숫자 사이의 5의 배수만 출력해보세요 
	 */
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		int user = sc.nextInt();
		
		int sum = 0;
		
		int start, end;
		
		if (user > 10) {
			start = 10;
			end = user;
		} else {
			start = user;
			end = 10;
		}
		
		for (int i = start; i <= end; ++i) {
			sum += i;
		}
		
		System.out.printf("10부터 %d까지의 총합은 %d입니다\n", user, sum);
		
		
		int num2;
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		num2 = sc2.nextInt();
	
		if (num2 > 1000) {
			for (int i = 1000; i <= num2; ++i) {
				System.out.println(i);
			}
		} else {
			System.out.println("1000보다 큰값을 입력해주세요 ");
		}
		
		int num3;
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		num3 = sc3.nextInt();
		
		for (int i = 1; i <= num3; ++i) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
			
		}
		
	}
}
