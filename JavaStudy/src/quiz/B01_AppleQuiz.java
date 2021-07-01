package quiz;
import java.util.Scanner;

public class B01_AppleQuiz {
	/*
	 사과를 10개씩 담을수 있는 바구니가 있다
	 
	  사용자가 구매하고 싶은 사과의 개수를 입력하면
	  사과를 모두 담기 위해 필요한 바구니의 개수를 알려주는 프로그램을 만들어보세요 
	 
	 if 문 안쓰고 프로그램 만들때 필요한 공식 
	 Math.ceil(a) = a를 소수 첫째 자리에서 올린다
	 Math.floor(a) = a를 소수 첫째 자리에서 내린다 
	 
	 */
	
		public static void main(String[] args) {
		
			
			Scanner ap = new Scanner(System.in);
			
			System.out.println("원하는 사과개수를 입력해보세요  >");
			int num = ap.nextInt();
			
			if (num % 10 == 0) {
				System.out.println((num / 10) + "개의 바구니가 필요합니다 ");
			}
			if (num <0) {
				System.out.println("올바른 사과 개수가 아닙니다 ");
			}
			else if (num % 10 != 0){
				System.out.println((num / 10 + 1) + "개의 바구니가 필요합니다 " );
			}
			
			
	}
}
