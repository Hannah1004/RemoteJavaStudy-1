package quiz;
import java.util.Scanner;

public class A06_CelToFahr {
	
	/*
	 사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램만들기
	 (변환 공식 검색 / 출력은 소수 첫째 자)
	 */
	public static void main(String[] args) {
		
		Scanner ft = new Scanner(System.in);
		
		System.out.print("섭씨온도를 입력해보세요 >");
		double fea = ft.nextDouble();
		System.out.print("당신이 입력한 값은" + fea + "도 입니다.");
		System.out.print("화씨 온도로는 " + (fea*1.8 + 32)+ "도 입니다 ");
		
	}
	
}
