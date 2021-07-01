import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D03_Collections {
	
	/*
	  # Collections 클래스
	  
	  - 컬렉션을 편리하게 다룰 수 있는 다양한 기능들이 모여있는 클래스 
	 */
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		foods.add("햄버거");
		foods.add("돈까스");
		foods.add("돈부리");
		foods.add("청국장");
		foods.add("카라아게");
		foods.add("짜장면");
		
		System.out.println(foods);
		// String도 유니코드 값으로 순서가 있다 
		System.out.println("max food : " + Collections.max(foods));
		System.out.println("min food : " + Collections.min(foods));
		// 정렬하기 
		Collections.sort(foods);
		System.out.println(foods);
		
		// 배열에도 sort가 있다 
		int[] arr = {1,5,3,4,7,9};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// 뒤섞기
		Collections.shuffle(foods);
		System.out.println(foods);
		
		// 컬렉션에 한번에 여러개 추가하기 
		Collections.addAll(foods,"감자튀김","치즈스틱","치킨너겟","오징어튀김","새우튀김");
		
		System.out.println(foods);
		
		foods.add("감자튀김");
		foods.add("감자튀김");
		foods.add("감자튀김");
		
		System.out.println(foods);
		
		System.out.println(Collections.frequency(foods, "감자튀김"));
		
		// 컬렉션을 뒤집는다 
		Collections.reverse(foods);
		System.out.println(foods);
		
		// 컬렉션 인덱스 스왑하기 : 두 값의 위치를 바꾼다 
		Collections.swap(foods, 0, 3);
		System.out.println(foods);
		
		// 오른쪽으로 5칸 이동
		Collections.rotate(foods,5);
		System.out.println(foods);
		
		// 왼쪽으로 10칸 이동
		Collections.rotate(foods,-10);
		System.out.println(foods);
	}
}
