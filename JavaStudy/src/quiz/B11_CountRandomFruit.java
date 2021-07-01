package quiz;
import java.util.Scanner;

public class B11_CountRandomFruit {
	/*
	 사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다 
	 (랜덤으로 등장하는 과일 : apple, banana, kiwi, orange, grape, peach)
	 
	 그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력해보세요 
	 */
	public static void main(String[] args) {
//		System.out.print("숫자를 입력해주세요 >");
//		int num = new Scanner(System.in).nextInt();
//		
//		String[] fruit = {"apple","banana","kiwi","orange","grape","peach"};
//		int f = (int)(Math.random() * 6 + 1);
//		String random_fruit = fruit[f];
//		
//		for (int i = 0; i < num; ++i) {
//			
//		}
		int repeat = 100;
		
		String[] fruits = {"apple","banana","kiwi","orange","grape","peach"};
		
		int[] fruit_count = new int[fruits.length];
		
		for (int i = 0; i < repeat; ++i) {
			int random_number = (int)(Math.random()*fruits.length);
			System.out.println(fruits[random_number]);
			fruit_count[random_number]++;
		}
		
		System.out.println("#### 과일 등장 횟수 ####");
		
		for (int i = 0; i < fruits.length; ++i) {
			System.out.printf("%s는 %d번 등장했습니다.\n", fruits[i], fruit_count[i]);
		}
		
	}
	
	
	
}
