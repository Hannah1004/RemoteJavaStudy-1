package quiz;
import java.util.Scanner;

public class C01_FunctionQuiz {
	/*
	  # 다음의 함수를 정의하고 올바르게 동작하는지 테스트 하기
	  1. 전달한 문자가 알파벳이면 true 아니면 false
	  2. 전달한 숫자가 3의 배수면 true 아니면 false 
	  3. 숫자를 하나 전달하면 문자열 "짝수입니다" / "홀수입니다" 반환
	  4. 숫자를 전달하면 해당 숫자의 모든 약수를 배열 형태로 반환하는 함수
	  5. 전달한 정수가 소수라면 true 아니면 false 반환 함수
	  6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	  	(factorial: (n)*(n-1)*(n-2)* ... 3*2*1)
	 */
	
	public static void main(String[] args) {
		String str = "한글 Hanguel";
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			if (alphabet(ch)) {
				System.out.println(i + "번째 문자는 영어입니다");
			} else {
				System.out.println(i + "번째 문자는 영어가 아닙니다");
			}
		}
	}
	public static boolean alphabet(char ch) {
		return ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z'; 
	}
	
	public static boolean isNum(int num) {
		return num % 3 == 0;
	}
	
	public static String evenOdd(int num) {
		return num % 2 == 0 ? "짝수입니다" : "홀수입니다";
	}
	
	public static int[] allYaksu(int num) {
		// 50 인 경우 boolean타입 변수 50개를 생성 
		boolean[] divided = new boolean[num];
		
		int count = 0;
		for (int i = 1; i <= num; ++i) {
			if (num % i == 0) {
				divided[i-1] = true; // 배열에 나누어 떨어진 숫자들을 표시 해놓는다 
				count++;
			}
		}
		int[] yaksu = new int[count];
		int index = 0;
		
		for (int i = 0; i < num; ++i) {
			if (divided[i]) {
				yaksu[index++] = i + 1;
			}
		}
		
		return yaksu;
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		else if (num == 2) {
			return true;
		}
		else if (num % 2 == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(num); i += 2) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static int factorial(int num) {
		// 곱하기를 누적시킬때는 초기값을 1로준다
		int factorial = 1;
		for(int i = num; i > 0; --i) {
			factorial *= i;
		}
		return factorial;
	}
	// 어떤 함수가 자기 자신을 불러서 사용하는 것을 재귀함수라고 부른다(성능이 좋지는 않다)
	public static int recursive_factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * recursive_factorial(num - 1);
	}
}
