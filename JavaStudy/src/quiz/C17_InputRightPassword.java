package quiz;
import java.lang.invoke.StringConcatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C17_InputRightPassword {
	
	/*
	 # 올바른 패스워드를 만들기 위한 규칙 
	 1. 모두 숫자이면 안됨 
	 2. 대문자와 소문자 숫자 특수문자가 섞여있어야 함 
	 3. 특수문자는 !,@,#,$,%,^,&,* 만 사용 가능하다 
	 4. 비밀번호의 길이가 8자리 이상 24자리 이하여야 함 
	 
	 규칙을 어긴 경우 예외를 발생시켜서 알맞은 안내문구를 출력해보세요 
	 */
	public static void main(String[] args){
		
		while(true) {
			try {
				test();
				break;
			} catch (PasswordLen e) {
				System.out.println("비밀번호 길이가 알맞지 않습니다 ");
			} catch (Contain e) {
				System.out.println("모든 허용된 문자열을 포함시켜야 합니다");
//			} catch (InputMismatchException e) {
//				System.out.println("숫자로만 입력하시면 안됩니다");
			} catch (SpecialChar e) {
				System.out.println("허용된 특수문자가 아닙니다");
			}
		}
	}
	
	public static void test() throws PasswordLen,SpecialChar,Contain{
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요");
		String password = sc.nextLine();
		int len = password.length();
		
		// 길이가 맞지 않을 때 
		if (len < 8 || len > 24) {
			throw new PasswordLen();
		} 
		
		// 모든 허용된 문자 포함시키기 
		boolean[] contain = new boolean[4];
		
		for (int q = 0; q < password.length(); ++q) {
			char ch = password.charAt(q);
			if (ch >= 0 && ch <= 9) {
				contain[0] = true;
			}
			if (ch >= 'a' && ch <= 'z') {
				contain[1] = true;
			}
			if (ch >= 'A' && ch <= 'Z') {
				contain[2] = true;
			}
			if (ch == '!' || ch == '@' || ch == '#' || ch == '%'
					|| ch == '^' || ch == '&' || ch == '*') {
				contain[3] = true;
			}
			
			for (int j = 0; j < contain.length; ++j) {
				if(contain[j] == false) {
					throw new Contain();
				}
			}
		}
		
		// 숫자로만 입력했을 때 예외처리 
		
		
		// 허용된 특수문자 
		for (int i = 0; i < password.length(); ++i) {
			char ch1 = password.charAt(i);
			if (!(ch1 == '!' || ch1 == '@' || ch1 == '#' || ch1 == '%'
				|| ch1 == '^' || ch1 == '&' || ch1 == '*')) {
						throw new SpecialChar();
			}
		}
		
	}
}

class PasswordLen extends Exception {
	public PasswordLen() {
		super("비밀번호의 길이가 알맞지 않습니다");
	}
}

class OnlyNum extends Exception {
	public OnlyNum() {
		super("숫자로만 입력하시면 안됩니다");
	}
}

class SpecialChar extends Exception {
	public SpecialChar() {
		super("허용하지 않은 특수문자");
	}
}

class Contain extends Exception{
	public Contain() {
		super("모든 허용된 문자열을 포함시켜야 합니다");
	}
}
