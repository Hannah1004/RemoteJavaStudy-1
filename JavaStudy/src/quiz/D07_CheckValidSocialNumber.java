package quiz;

public class D07_CheckValidSocialNumber {
	/*
	  사용자가 주민등록번호를 입력하면 
	  그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	  
	  일 자리에 01 ~ 31 이내의 숫자 
	  (1,3,5,7,8,10,12월이면 31 / 4,6,9,11월 이면 30 / 2월은 윤년일때 29 아니면 28)
	  
	  했음 
	  월 자리에 01 ~ 12 이내의 숫자
	  7번째 자리 '-'
	  맨앞 2자리 숫자
	  뒷자리 전부 숫자 
	 */
	public static void checkValidSocialNumber(char[] socialNum) {
		boolean check = true;
			for(int i = 0; i < socialNum.length; ++i) {
				if (!checkDigit(socialNum)){
					check = false;
					System.out.println("숫자만 입력가능합니다");
				}
			}
			if (socialNum.length != 14) {
				check = false;
				System.out.println("길이가 알맞지 않습니다");
			} else if (socialNum[6] != '-') {
				check = false;
				System.out.println("7번째 자리에 '-' 이 들어가지 않았습니다");
			} else if (socialNum[2] > '1') {
				check = false;
				System.out.println("해당월은 존재하지 않습니다1");
			} else if ((socialNum[2] == '1') && (socialNum[3] > '2')) {
				check = false;
				System.out.println("해당월은 존재하지 않습니다2");
			} else if (socialNum[7] > '4') {
				check = false;
				System.out.println("해당하는 성별이 없습니다");
			} else if (!checkDay(socialNum)) {
				check = false;
				System.out.println("해당월에 맞지 않는 일입니다");
			} else if (!(leeapYearCheck(socialNum)) && 
					(socialNum[4] == '2' && socialNum[5] > '8') ) {
				check = false;
				System.out.println("2월의 일수가 잘못됬습니다");
			}
			
			if(check) {
				System.out.println("알맞은 주민번호입니다 !");	
			} else {
				System.out.println("주민번호를 올바르게 작성해주세요 !");
			}
	}
	
	public static boolean checkDay(char[] socialNum) {
		String[] thirtyOne = {"01","03","05","07","08","10","12"};
		String[] thirty = {"04","06","09","11"};
		
		String monCal = "" + socialNum[2] + socialNum[3];
		
		boolean day = true;
		
		for(int i = 0; i < socialNum.length; ++i) {
			for(String t_O : thirtyOne) {
				if(t_O.contains(monCal)) {
					if (socialNum[4] == 3 && socialNum[5] > 1) {
						day = false;
					}
				}
			}
			for(String t_y : thirty) {
				if(t_y.contains(monCal)) {
					if (socialNum[4] == 3 && socialNum[5] > 0) {
						day = false;
					}
				}
			}
		}
		return true;
	}
	
	public static boolean checkDigit(char[] socialNum) {
		for (int i = 0; i < socialNum.length; ++i) {
			if (socialNum[6] == '-') {
				continue;
			} else if (Character.isDigit(socialNum[i])) {
				continue;
			} else {
				return false;
			}
		}
		return true;
	}
	public static boolean leeapYearCheck(char[] socialNum) {
		boolean leeapYear = false;
		
		int year = Integer.parseInt(""+socialNum[0]+socialNum[1]);
		int sex = Integer.parseInt("" + socialNum[7]);
		
		if (sex == 1 && sex == 2) {
			year += 1900;
		} else if (sex == 3 && sex == 4) {
			year += 2000;
		}
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			leeapYear = true;
		}
		return false;
	}
	public static void main(String[] args) {
		checkValidSocialNumber("961125-34021112".toCharArray());
	}
}
