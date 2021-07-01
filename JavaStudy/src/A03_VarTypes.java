
public class A03_VarTypes {
	
	public static void main(String[] args) {
		
	/*
	 #정수타입
	- byte	(1byte)
		
	 	0000 0000 8비트
	 	8비트로 256개의 가짓수를 표현할 수 있다. (0을 포함)
	 	0000 0000 ~ 1111 1111 (부호가 없는 경우 0 ~ 255까지 표현 가능)
	 	
	 	부호를 사용하는 경우에는 첫 번째 bit를 부호 비트로 사용한다 
	 	1000 0000
	 	-> 첫번째 비트는 부호비트 맨 앞이 1이면 음수로 간주 
	 	
	 	byte타입의 양수 범위 0000 0000(0) ~ 0111 1111(127)
	 	byte타입의 음수 범위 1000 0000(-128) ~ 1111 1111(-1)
	 	
	- short (2byte)
	0000 0000 0000 0000 ~ 1111 1111 1111 1111
	-32,768 ~ 32,767
	- char	(2byte unsigned)
	0000 0000 0000 0000 ~ 0111 1111 1111 1111
	0 ~ 2^16-1
	- int	(4byte)
	32비트  
	-2^31 ~ 2^31-1
	- long	(8byte)
	64비트  
	-2^63 ~ 2^63-1
	*/
		byte a = 127; //128부터는 에러가 난다 -128 ~ 127
		short b = 10;
		char c = 10;
		int d = 10;
		long e = 10;
		
		byte _byte = 127;
		short _short = 32767;
		char _char = 65535;
		int _int = 2100000000;
		// 정수타입 리터럴은 기본적으로 int타입이다 그래서 뒤에 l/L을 붙혀줘야 한다  
		long _long = 20000000000L;
		// int 타입보다 커지기 때문에 리터럴을 롱타입으로 바꿔줘야 함 !!
		
		
		System.out.println(a);
		
		/*
		# 실수 타입
		- float		(4byte)
		- double	(8byte)
		
		실수는 주로 그래픽 계산에 사용된다
		부동 소수점 방식을 사용한다
		
		 */
		// 소수 리터럴은 기본적으로 double	타입이므로 더블타입 변수에는 아무 문제없이 들어감 
		double _double = 123.1234;
		// 소수 뒤에 f/F 를 적어주면 float타입 리터럴이라는 표시가 된다 
		float _float = 123.123F;
		
		/*
		  참/거짓 타입 
		  - boolean
		 들어갈 수 있는 값은 true,false 밖에 없다 
		 */
		
		boolean female = true;
		boolean powerOn = true;
		boolean goonpill = false;
		boolean computerscience = false;
		
		/*
		  참조형 타입
		  
		  참조형 타입은 대문자로 시작한다
		  소문자로 시작하는 타입은 모두 기본형 타입이라고 부른다
		  
		  String : 문자열을 담당하는 타입
		  그 외 모든 클래스들.. 
		 */
		String welcome_message = "hello, world";
		System.out.println(welcome_message);
		
		//char 타입은 문자 코드를 저장하는 정수 타입이다
		char ch = 97;
		System.out.println(ch);
		char ch2 = 'x';
		int num1 = 'x';
		System.out.println("'x'를 저장한 char타입 변수의 출력: " + ch2);
		System.out.println("'x'를 저장한 int타입 변수의 출력: " + num1);
	}
}
