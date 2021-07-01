package quiz;
import java.util.Scanner;

public class B07_Prime {
	
	/*
	 사용자로부터 숫자(양수)를 입력받으면 1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요 (소수: 나누어 떨어지는 수가 1과 자기 자신밖에 없는 숫자)
	 소수: 2 3 5 7 11 13 17 23 29 31 
	 음수를 입력하면 다시 제대로 입력하게 하기 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해보세요 >");
		int num = sc.nextInt();
	
		for (; num < 0;) {
			System.out.println("잘못된 숫자입니다. 다시 입력해주세요");
			System.out.print("> ");
			
			num = sc.nextInt();
		}
		
		for (int chkNum = 2; chkNum <= num; ++chkNum) {
			int count = 0;
			for (int divNum = 1; divNum <= chkNum; ++divNum) {
				if (chkNum % divNum == 0) {
					count++;
					}
				}	
				if (count == 2) {	
					System.out.println(chkNum);
				}
		}
		
	}
		
	
	
	

}
