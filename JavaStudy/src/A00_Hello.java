// public class의 이름은 반드시 파일명과 같아야 한다.
public class A00_Hello {
	// 빨간 줄이 생겼을 때는 그곳에 마우스 커서를 두거나 F2를 누르면
	// 해당 에러에 대한 정보와 해결책을 볼 수 있다
	
	/*
	 main()함수
	 프로그램의 시작 지점
	 사용자가 프로그램을 실행하면 가장 먼저 main() 함수를 찾아서 실행한다
	 main() 함수의 범위는 중괄호로{} 결정된다
	 중괄호의 범위를 알기 쉽게 하기 위해 들여쓰기를 사용한다
	 main() 함수가 끝나면 프로그램도 종료된다 (나중에는 달라짐! 다른거 배우면)
	
	함수란? 어떤 단어 뒤에 ()가 있으면 무조건 함수다.
	 */

	public static void main(String[] args) {
		/*
		 System.out.println() 함수
		 - ()안에 전달한 데이터를 콘솔에 출력하는 함수
		 
		 콘솔
		 - 글자만 나오는 검은 화면
		 - Eclipse에서는 테스트용으로 하얀 바탕의 콘솔을 제공
		 - 이클립스에서 ctrl + f11 을 누르면 우리가 만든 프로그램을
		   테스트용 콘솔에서 실행해 볼 수 있다
		 - 우리가 만든 소스 코드(.java)의 컴파일 결과물(.class)은 
		   bin폴더에 저장되어 있다  
		   
		 세미콜론
		 - 명령어 맨 뒤에 붙혀 명령어가 끝났음을 알리는 용도
		 */
		System.out.println("Hello, world! 1");
		System.out.println("Hello, world! 2");
		//System.out.println("Hello, world! 3");
		System.out.println("Hello, world! 4");
		System.out.println("Hello, world! 5");
		/*
		 JAVA의 데이터 종류
		 - ""사이에 적는 것들 : 문자열(String), 문자를 여러개 쓸 수 있음
		 - ''사이에 적는 것 : 문자(Character), 문자 단 하나만 쓸 수 있음
		 - 숫자를 적는 것 : 정수(Integer)
		 - 소수를 적는 것 : 실수(Float, Double)
		 - true,false (Boolean)
		 */
		System.out.println("ABCDEF");
		System.out.println('A');
		System.out.println(123456789 + 10);
		System.out.println("123456789" + 10);
		
		System.out.println(123.12345 + 0.0333);
		System.out.println(true);
		System.out.println(false);
		
		
		// ''를 사용하는 문자 타입 데이터는 실제로는 숫자값을 가지고 있다.
		// 문자와 정수는 실제로는 거의 같은 타입이며 서로 계산도 가능함. 
		System.out.println('A');
		System.out.println((int)'A'); // A를 숫자로 표현하라는 뜻
		
		System.out.println(66);
		System.out.println((char)66); // 66을 문자로 표현하라는 뜻  
		
		System.out.println('D' - 'A'); //D가 A보다 얼마나 뒤에 있는 문자인지 알수있음  
		System.out.println('A' + 3); //정수와 문자를 계산하면 기본적으로 정수가 된다.
		System.out.println((char)('A' + 3));//문자로 보이게 하기  
		System.out.println((char)('A' + 25));  
		System.out.println((char)('A' + 26)); // 아스키 코드표 참조  
		
		System.out.println((int)'한');
		System.out.println((int)'가');
		
		//""을 사용하는 문자열 타입과 다른 타입을 더하면 계산을 하는 것이 아니라
		//이어붙인다.
		System.out.println("10" + 10);
		System.out.println(10 + 10);
		
		// 정수 + 실수의 결과는 실수다
		System.out.println(3.14 + 10);
		
		// 실수를 정수로 변환하면 소수점 아래를 삭제한다
		System.out.println((int)33.999999);
		System.out.println((int)3.5 + 3.5);
		System.out.println((int)(3.5 + 3.5)); //괄호의 중요성!!
		
	}
}
