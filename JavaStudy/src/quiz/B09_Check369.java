package quiz;
import java.util.Scanner;

public class B09_Check369 {
	
	/*
	 사용자로부터 정수를 하나 입력받은 후
	 해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
	 (33,36,39 등의 숫자는 여러번칩니다)
	 
	 문제해결력 - 문제를 푸는 길을 찾는 것
	 구현력 - 생각해낸 길을 코드로 구현하는 것
	 언어이해력 - 사용하는 언어에 대한 깊은 이해도  
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요 >");
		int user = sc.nextInt();
		int count = 0;
		for(int i = 0; i <= user; i++) {
			if(i == 3 || i == 6 || i == 9) {
				count += 1;
			} else {
				boolean a1 = false;
				boolean a2 = false;
				
				int n1 = i / 10;
				int n2 = i % 10;
				
				if(n1 == 3 || n1 == 6 || n1 == 9) {
					a1 = true;
				}
				
				if (n2 == 3 || n2 == 6 || n2 == 9) {
					a2 = true;
				}
				
				if(a1 && a2) {
					count += 2;
				} else if(a1 || a2){
					count += 1;
				}
			}
		}
		System.out.printf("총 박수 횟수는 %d입니다", count);
	}
}
