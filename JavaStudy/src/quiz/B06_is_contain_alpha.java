package quiz;
import java.util.Scanner;

public class B06_is_contain_alpha {

	/*
	 사용자가 입력한 문자열에 알파벳이 포함되어 있으면 true, 없으면 false
	 
	 사용자가 입력한 문자열이 알파벳으로만 이루어져 있으면 true 아니면 false
	 
	 사용자가 허락한 문자만으로 이루어진 문자열이라면 true, 아니면 false (허락한 문자열: 알파벳 소문자, 숫자, _, $ / 첫번째문자에 숫자 불가)
	 
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자를 입력하세요 >");
		String user = sc.nextLine();
		
		boolean contain = false;
		
		for (int i = 0; i < user.length(); ++i) {
			
			char ch = user.charAt(i);
			
			if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				contain = true;
				break;
			}
		}
		
		System.out.println("영어가 한번이라도 나온적 있나요?" + contain);
		
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("문자를 입력하세요 >");
		String user2 = sc2.nextLine();
		
		boolean only_alpha = true;
		
		for (int i = 0; i < user2.length(); ++ i) {
			char ch = user2.charAt(i);
			if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
				only_alpha = false;
				break;
			}
		}
		System.out.println("영어만 나왔나요?"+ only_alpha);
		
		Scanner sc3 = new Scanner(System.in);
		System.out.println("문자를 입력하세요 >");
		String user3 = sc3.nextLine();
		
		
		boolean first_letter_check = true, letter_check = true;
		
		if (user3.charAt(0) >= '0' && user3.charAt(0) <= '9') {
			first_letter_check = false;
		}
		
		for (int i = 0; i < user3.length(); ++i) {
			char ch3 = user3.charAt(i);
			
			if (!((ch3 >= '0' && ch3 <= '9') || (ch3 >= 'a' && ch3 <= 'z') || (ch3 == '_' || ch3 =='$' ))){
				letter_check = false;
				break;
			}
		}
		
		if (first_letter_check && letter_check) {
			System.out.println("올바른 문자입니다" + true);
		} else {
			System.out.println("허용되지 않은 문자열입니다" + false);
		}
		
		
	}
}
