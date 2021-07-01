
public class A06_Operator01 {
	
	public static void main(String[] args) {
		
		/*
		  # 연산자 (Opertaor)
		  - 계산할 때 사용하는 것
		  - +,-,* 등등
		 
		 */
		// 산술 연산
		int a = 10, b = 7;
		double c = 7.0;
		
		System.out.println("a + b: " + (a + b));
		System.out.println("a - b: " + (a - b));
		System.out.println("a * b: " + a * b);
		// 정수 나누기 정수는 몫만 나온다  
		System.out.println("a / b: " + a / b);
		// 정확한 나누기 결과를 원한다면 나누기에 실수타입이 포함되어야 한다
		// 변수를 만들어도 되고 double로 타입을 변경해도 된
		System.out.println("a / b: " + a / (double)b);  
		System.out.println("a / c:" + a / c);
		
		// 나머지 연산  
		System.out.println("a 나누기 b를 하면 나머지는? : " + a % b);
		System.out.println("b 나누기 a를 하면 나머지는? : " + b % a);
		
		// ^는 제곱이 아니다 비트연산중 하나인데 중요하진 않음  
		System.out.println(10 ^ 2);
		System.out.println(10 ^ 3);
		System.out.println(10 ^ 4);
		
		// Math.pow(a,b) : a의 b제곱을 계산하여 반환해주는 함수  
		System.out.println(Math.pow(10,2));
		System.out.println(Math.pow(10,3));
		System.out.println(Math.pow(10,4));
		
		// 제곱근을 구할 때 
		System.out.println(Math.sqrt(9));
		System.out.println(Math.sqrt(12));
		
		// Math.abs(a) : a의 절대값을 구해서 반환한다 - 무조건 양수로 반환 
		System.out.println(Math.abs(-123.12345));
		
		// Math.round(a) : a를 소수 첫째 자리에서 반올림한 결과를 반환한다
		// long 타입으로 반환 - 롱타입은 정수타입 플롯 더블은 실수타입  
		System.out.println(Math.round(123.5678));
		
		// Math.round()로 원하는 자릿수에서 반올림하기
		//- 반올림 하고 싶은 자리를 소수 첫째 자리로 만들만큼 곱한 후 다시 나눈다  
		System.out.println(Math.round(123.56789 * 1000) / 1000.0);
	}
	
}
