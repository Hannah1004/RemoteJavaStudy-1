package quiz;
import java.util.Scanner;

public class B05_Palindrome {
	/*
	 사용자로부터 단어를 하나 입력받고
	 해당 단어가 회문이라면 "PALINDROME"를 출력
	 회문이 아니라면 "NOT PALINDROME"를 출력
	 
	 회문이란 - MOM , bob 데칼코마니 가능단어 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("단어를 입력해주세요 >");
		String user = sc.nextLine();
		
		int leng = user.length();
		
		for (int i = 0; i < leng/2; i++) {
			if (user.charAt(i) == user.charAt(leng - i -1)) {
				System.out.println("PALIDNROME");
			} else {
				System.out.println("NOT PALINDROME");
			}
			
		}
	}
	
	public static void main2(String[] args) {
		
		String str = "apple";
		
		String reverse = "";
		
		for (int i = str.length() -1; i > -1; --i) {
			reverse += str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("PALIDNROME");
		} else {
			System.out.println("NOT PALINDROME");
		}
	}
		
	
}
