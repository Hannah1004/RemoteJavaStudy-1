package quiz;
import java.util.Scanner;

public class A06_GuessAge {
	
	/*
	 사용자로부터 태어난 해와 올해의 년도를 입력받으면
	 그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을 만들어보세요 
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("올해년도를 입력해보세요 >");
		int num = sc.nextInt();
		System.out.print("당신이 입력한 값은" + num + "입니다.");
		System.out.print("태어난 해를 입력해보세요 >");
		int age = sc.nextInt();
		System.out.print("당신의 나이는 " +(num - age + 1));
	}
	
}
