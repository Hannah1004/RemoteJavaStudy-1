package quiz;
import java.util.Scanner;

public class D04_isJavaVariable {
	/*
	  사용자로부터 문자열을 입력받으면 해당 문자열이 자바의 변수로써 사용될 수 있는지 
	  검사하는 메서드를 만들고 테스트해보세요 
	  알파벳 소문자, 숫자, _, $, 맨 앞에 숫자 안됨 
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력 >");
		String user = sc.nextLine();
		
		test(user);
		
		System.out.println(check(user.toCharArray()));
	}
	
	// 노가다로 자바변수로 쓸 수 있는지 확인하는 방법 
	public static void test(String a) {
		boolean firstCheck = true;
		boolean letterCheck = true;
		
		if (a.charAt(0) >= '0' && a.charAt(0) <= '9' ) {
			firstCheck = false;
		}

		for (int i = 0; i < a.length(); ++i) {
			char ch = a.charAt(i);
						
			if (!((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch == '_' || ch =='$' ) ||
					(ch >= 'A' && ch <= 'Z'))){
				letterCheck = false;
				break;
			}
		}
		if (firstCheck && letterCheck) {
			System.out.println("변수로 사용 가능합니다");
		} else {
			System.out.println("변수로 사용 불가능합니다");
		}
	}
	
	// 이미 만들어진 함수로 자바변수 가능성 체크하는 방법 
	public static boolean check(char[] user) {
		boolean check = Character.isJavaIdentifierStart(user[0]);
		
		for (int i = 1; i < user.length; ++i) {
			check = check && Character.isJavaIdentifierPart(user[i]);
		}
		return check;
	}
	
	
	
	
	
}
