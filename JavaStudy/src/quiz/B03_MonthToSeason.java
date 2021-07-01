package quiz;
import java.util.Scanner;
public class B03_MonthToSeason {

	/*
	 사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요 
	 (switch case 이용 )
	
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String season;
		int month;
	
		System.out.print("달을 입력해보세요 >");
		month = sc.nextInt();

		switch(month) {
		case 12: case 1: case 2:
			season = "겨울";
			break;
		case 3: case 4: case 5:
			season = "봄";
			break;
		case 6: case 7: case 8:
			season = "여름";
			break;
		case 9: case 10: case 11:
			season = "가";
			break;
		default:
			season = "없음";
			break;
		}
		// 변수값에 1~12 가 아닌값이 들어올 수 있기 때문에 default 를 설정해야한다 
		if (month < 1 || month > 12) {
			System.out.println("잘못된 계절입니다");
		} else {
			System.out.printf("%d월은 %s입니다.\n", month, season);
		}
		
	}
}
		
		

