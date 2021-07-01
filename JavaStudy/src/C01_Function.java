
public class C01_Function {
	public static void main(String[] args) {
		/*
		 	# 함수 (Function)
		 	
		 	- 기능을 미리 정의해두고 나중에 가져다 쓰는 것 
		 	- 정의한 시점에서는 실행되지 않고 함수 이름 뒤에 ()를 붙혀서 함수를 호출하면 실행된다 
		 	- 나중에 재사용할 가능성이 있는 기능들을 미리 만들어둠으로써 작업의 반복을 줄일 수 있다 
		 	- 자바에서의 함수는 반드시 클래스 내부에 선언해야 한다 (method)
		 	
		 	# 함수의 리턴 (return)
		 	
		 	- 함수를 정의할 때 함수명 앞에 해당 함수가 반환하는 값의 타입을 적는다 
		 	- 함수를 호출하면 호출한 자리에 함수의 실행 결과가 반환된다(return)
		 	- return 타입 void는 해당 함수가 반환하는 값이 없다는 것을 의미하는 반환 타입이다 
		 	
		 	# 함수의 매개변수 (arguments)
		 	
		 	- 함수를 호출할 때 ()안에 함께 전달하는 값을 인자라고 한다
		 	- 함수를 정의할 때 ()안에 인자를 받을 수 있는 변수들을 선언하는데, 이를 매개변수라고 한다 
		 */
		for (int i = 0; i < 2; ++i) {
			printRabbit();
		}
		System.out.println();
		int need = appleBasket(31,10);
		System.out.println("필요한 바구니의 개수는 " + need + "개 입니다");
	}
	public static void printRabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >)");	
	}
	
	// ex : 사과의 개수와 바구니의 크기를 전달하면 필요한 바구니의 개수를 알려주는 함수 
	public static int appleBasket(int apple, int size) {
		int basket = apple % size == 0 ? apple / size : apple / size + 1;
		
		return basket;
	}
	
}
