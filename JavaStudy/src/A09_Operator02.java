
public class A09_Operator02 {

	
	public static void main(String[] args) {
		
		/*
		  # 비교 연산자
		  
		  - 두 값을 비교하는 연산
		  - 비교 연산의 결과는 boolean타입이다 (참 / 거짓) 
		  - 산술 연산과 비교 연산이 함께 있으면 산술 연산을 먼저 계산한
		 
		 */
		
		int a = 10, b = 7;
		
		System.out.println(a > b);
		System.out.println(a < b);
		// 반드시 부등호가 먼저 나와야 한다 (등호가 먼저 나오면 안된다)
		System.out.println(a >= b);
		System.out.println(a <= b);
		
		System.out.println(a == b); // 두 값이 서로 같으면 true
		System.out.println(a != b); // 두 값이 서로 다르면 true  
		
		/*
		  # 논리 연산자
		  
		   - boolean 타입 값으로 하는 연산
		   - 비교 연산관 논리 연산이 함께 있으면 비교 연산을 먼저 계산한
		   - && : 양 옆의 값이 모두 true 일 때만 true(AND)
		   - || : 양 옆의 값 중 하나만 true 여도 true(OR)
		   - | : true 면 false, flase 면 true (NOT)
		 
		 */
		System.out.println("true && true: " + (true && true));
		System.out.println("true && false: " + (true && false));
		System.out.println("false && true: " + (false && true));
		System.out.println("false && false: " + (false && false));
		
		System.out.println("true || true: " + (true || true));
		System.out.println("true || false: " + (true || false));
		System.out.println("false || true: " + (false || true));
		System.out.println("false || false: " + (false || false));
		
		System.out.println(!true);
		System.out.println(!false);
		
		int c = 40;
		// 비교보다는 산술연산이 먼저여서 괄호를 칠 필요가 없다.  
		System.out.println("c가 짝수인가요?" + (c % 2 == 0));
		System.out.println("c가 홀수인가요?" +(c % 2 == 1));
		
		System.out.print("c가 짝수이면서 10의배수인가요?");
		System.out.println(c % 2 == 0 && c % 10 == 0);
		
		System.out.print("c가 짝수이면서 50보다 큰가요?");
		System.out.println(c % 2 == 0 && c > 50);
		
		// 연습문제: 변수 x,y,z가 모두 3의 배수가 아닐 때 true가 되는 비교 연산을 만들기
		
		int x = 10, y = 100 , z = 200;
		System.out.print("세개의 변수가 3의 배수가 아닌가요?");
		System.out.println(x % 3 != 0 && y % 3 != 0 && z % 3 != 0);
		
		System.out.println(!(x % 3 == 0 || y % 3 == 0 || z % 3 == 0));
		
	}	
	
}
