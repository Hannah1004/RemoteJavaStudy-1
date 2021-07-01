package quiz;
import java.util.Scanner;

public class B09_GCD {
	/*
	 
	 두 숫자를 입력받고 두 숫자의 최대공약수를 구해보세요 
	 
	  # 최대공약수
	  - 두 숫자의 공약수 중 가장 큰 공약수
	  - 20 : 1 2 4 5 10 20
	  - 50 : 1 2 5 10 25 50
	  최대 공약수는 10
	 */
	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 50;

		int max = Math.max(num1, num2);
		int min = Math.min(num1, num2);
		
		int gcd = 1;
		
		for (int i = 1; i <= min; ++i) {
			if (min % i == 0 && max % i == 0) {
				gcd = i;
			}
		}
		System.out.printf("%d와 %d의 최대 공약수는 %d입니다", num1, num2, gcd);

	}
}
