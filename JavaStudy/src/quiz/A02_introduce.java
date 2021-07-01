package quiz;

public class A02_introduce {

	public static void main(String[] args) {

		String name = "홍길동";
		int age = 20;
		String phone = "010-1234-1234";
		float height = 178.5f;
		int weight = 75;
		String bloodtype = "O";
		boolean male = true;
		
		System.out.println("이름\t:"+ name);
		System.out.println("나이\t:"+ age);
		System.out.println("Tel\t:"+ phone);
		System.out.println("키\t:"+ height);
		System.out.println("몸무게\t:"+ weight);
		System.out.println("혈액형\t:"+ bloodtype);
		System.out.println("남자\t:"+ male);
		
		/*
		 byte 타입은 데이터 전송시에 사용하는 경우가 대부분이다  
		 숫자 범위가 작다고 해서 byte타입을 사용하지는 않는다  
		 
		혈액형은 AB형도 있기 때문에 char를 쓰면 문자 한개만 들어가게 되서 안됨
		-> String 문자열을 사용해야 한다
		
		weight 몸무게도 int 보다는 double 을 사용하는게 좋음
		소수점이 나올 수 있기 때문에
		 */
	}
}
