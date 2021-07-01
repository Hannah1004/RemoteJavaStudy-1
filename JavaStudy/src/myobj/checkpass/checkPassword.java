package myobj.checkpass;

public class checkPassword {
	
	public static void main(String[] args) {
		try {
			check_password("abcd");
			System.out.println("비밀번호 생성 완료 !");
		} catch(IllegalLength e) {
			System.out.println("길이가 잘못됬습니다");
		} catch(NumericPassword e) {
			System.out.println("모두 숫자인 비밀번호입니다");
		} catch(NotSatisfiedPassword e) {
			System.out.println("모든 문자열을 포함시키지 못했습니다");
		} catch(IllegalCharacter e) {
			System.out.println("허용되지 않은 문자열입니다");
		}
		
	}
	
	public static void check_password(String password) 
			throws IllegalLength, NumericPassword, NotSatisfiedPassword, IllegalCharacter{
		
		int len = password.length();
		
		if (len < 8 || len > 24) {
			throw new IllegalLength();
		}
		
		if (check_numeric(password.toCharArray())) {
			throw new NumericPassword();
		}
		
		if (!check_character_types(password.toCharArray())) {
			throw new NotSatisfiedPassword();
		}
	}
	
	private static boolean check_numeric(char[] pass) {
		for (int i = 0, len = pass.length; i < len; ++i) {
			char ch = pass[i];
			if (ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
		
	}
	private static boolean check_special(char ch) {
		String permit = "!@#$%^&*";
		
		for (int i = 0; i < permit.length(); ++i) {
			if (ch == permit.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	
	private static boolean check_character_types(char[] pass) throws IllegalCharacter {
		
		int len = pass.length;
		
		boolean num = false;
		boolean low = false;
		boolean upper = false;
		boolean special = false;
		
		for (int i = 0; i < len; ++i) {
			char ch = pass[i];
			if (ch >= '0' && ch <= '9') {
				num = true;
			} else if (ch >= 'a' && ch <= 'z') {
				low = true;
			} else if (ch >= 'A' && ch <= 'Z') {
				upper = true;
			} else if (check_special(ch)) {
				special = true;
			} else {
				throw new IllegalCharacter();
			}
			
		}
		
		return num && low && upper && special;
	}
}
