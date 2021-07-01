
public class C04_Static {
	/*
	  # static이란 (정적 영역, 클래스 영역<=> 인스턴스 영역)
	  
	  - 모든 인스턴스가 공유하는 변수 (static변수)
	  - 앞에 static이 붙은 자원은 같은 클래스로 만들어진 모든 인스턴스가
	    공동으로 사용하는 자원이 된다 
	  - static 영역은 아무리 인스턴스가 많아도 클래스당 하나밖에 생성되지 않기 때문에
	    메모리가 절약된다 
	  - static 영역은 클래스당 하나이기 때문에 클래스 이름에 .을 찍고 접근하는 것이 가능하다 (권장)
	  - static이 붙은 자원은 인스턴스가 생기기 전에도 호출할 수 있다 
	  - static 매서드는 static 자원만을 활용할 수 있는 매서드이다 
	  - 인스턴스가 하나도 존재하지 않을 때도 static 매서드가 사용될 가능성이 존재하기 때문에
	    static 매서드에서는 인스턴스 자원을 사용할 수 없다 
	 */
	
	
	
	// myboj 패키지에 static 자원을 포함한 클래스를 정의해보세요 
	static int a = 10;
	int b = 10;
	
	public static void main(String[] args) {
		붕어빵 붕어1 = new 붕어빵();
		붕어빵 빵2 = new 붕어빵();
		붕어빵 붕어빵3 = new 붕어빵();
		
		System.out.println(붕어1.너비);
		System.out.println(빵2.너비);
		System.out.println(붕어빵3.너비);
		
		System.out.println(붕어빵.너비);
		// 변하지 않는 값을 static으로 묶어서 메모리를 절약하는 느낌 
		// 인스턴스가 없어도 static 으로 묶인 값은 출력할 수 있다
	}
}
class 붕어빵 {
	static int 너비 = 100;
	static int 높이 = 50;
	int 팥의양;
	int 구운시간;
}

class Glasses {
	static int initial_lens = 2;
	static int initial_tae = 1;
	String brand;
	int price;
	int lens;
	int tae;
}