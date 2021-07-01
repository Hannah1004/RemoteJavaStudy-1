
public class A10_TypeCasting {

		public static void main(String[] args) {
			
			/*
			  # 타입 캐스팅
			  1. 타입이 자연스럽게 변하는 경우(암묵적인 타입캐스팅)
			  	- 작은 타입에서 큰 타입으로 변할 때는 아무 문제가 생기지 않는다  
			  	- 그렇기 때문에, 자연스럽게 타입이 변한다  
			  2. 타입을 강제로 변환시키는 경우(명시적인 타입캐스팅) 
			  	- 타입을 변환 시킬 때 문제가 생길 가능성이 있는 경우에는
			     프로그래머가 직접 명시적으로 타입을 변환시켜야 한다  
			     
			  # 타입 크기 순서
			  
			  	byte < short <= char < int < long < float < double
			  	
			  	- long 타입 = 8byte , float 타입 = 4byte 지만 
			  		표현범위는 float이 더 넓다. 
			  	(실수 타입은 정수 타입보다 표현 범위가 무조건 넓다)
			  	
			 */
			
			char ch = 75;
			int num = ch;
			
			System.out.println((char)75);
			// 작은 타입 -> 큰 타입 (자연스럽게 변)
			byte b = 127;
			int i = b;
			
			int p = 3000;
			byte c = (byte)p;
			// 큰거에서 작은거로 갈 때 원을 돌듯이 범주내를 계속 돈다고 생각하면 된다  
			System.out.println(c);
			
			/*
			int q = 10;
			byte z = q;
			*/
			
			int q = 10;
			byte z = (byte)q;
			
			// 10이 byte에 속해있어도 프로그램상에서 안되는 값은 일단 막는다
			// 그렇기 때문에 프로그램에 알고있다는 것을 알려주는 느낌으로 타입캐스팅을 억지로 해줘야함  
			
			/*
			byte f = 70;
			char eh = f;
			char에는 음수가 없기 때문에 음수가 있는 byte를 받아들이지 못한
			*/
			byte f = -70;
			char eh = (char)f;
			
			System.out.println((int)eh);
			
			// 일반적으로는 크기가 큰 타입에서 작은 타입으로 변할 때도 명시적인 타입캐스팅이 필요하다 
			float v = 123.1234f;
			long h = (long)v;
			System.out.println(h);
			
			// 문제가 생기지는 않지만 같은 값이 다르게 해석될 필요가 있는 경우에도
			// 명시적 타입 캐스팅이 필요하다
			System.out.println('A');
			System.out.println((int)'A');
			
			System.out.println(80);
			System.out.println((char)80);
			
		}
	
}
