package quiz;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class A09_conditionQuiz {

	public static void main(String[] args) {
		
		int a = 15;
		int b = 2;
		int c = 7;
		int hour = 13;
		int d = 40 , e = 10;
		int year = 40;
		int minsuAge = 16 , chulsuAge = 14;
		int minsuBirth = 22 , chulBirth = 19;
		boolean powerOn = false;
		
		
		
		System.out.println(20 > a && a > 10);
		System.out.println(b % 2 == 0);
		System.out.println(c % 7 == 0);
		System.out.println(!(hour < 0 && hour >= 24) && hour >= 12);
		System.out.println(Math.abs(d - e) == 30);
		System.out.println(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
		System.out.println((minsuAge - chulsuAge) == 2);
		System.out.println((minsuBirth - chulBirth) == 3);
		System.out.println(!powerOn);
		// 타입형이 대문자로 시작하는 참조형 변수들은 반드시 .equals()를 이용해 비교해야 한다 
		
		String str = "yes"; 
		String str2 = "yes"; 
		String str3 = new String("yes"); 
		
		// 참조형 변수의 ==은 두 변수가 서로 같은 주소를 지니고 있는지를 비교한다  
		System.out.println(str == "yes");
		System.out.println("str == \"yes\" :" + (str == "yes"));
		System.out.println("str == str3 :" + (str == str3));
		
		//입력값이 같을 경우 불러들이는 값을 재사용하는게 원칙인데, 아예 새로운 주소로 저장을 하면 값이 다르게 나온다 
		// 소문자로 사용하는 변수들은 stack에 저장되고, 대문자는 stack에 주소값만 보관하고 실체는 heap에 존재
		// 대문자로 시작하는 타입 변수들은 주소값이 저장되어 있고, 거기에 .을 찍고 실제 데이터를 참조할 수 있다 
		System.out.println(str.equals("yes"));
		System.out.println(str.equals(str3));
		
		
	}
	
}
