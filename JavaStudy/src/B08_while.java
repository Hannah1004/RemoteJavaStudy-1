import java.util.Scanner;
public class B08_while {

		/*
		  # while
		  - for문과 사용법이 약간 다른 반복문
		  - 초기값과 증가값의 위치가 정해져 있지 않다 
		  - ()안의 조건이 참인 동안 {}안의 내용을 반복한다 
		  - 증가값의 위치에 따라 프로그램 실행이 달라질 수 있으므로 주의해야 한다 
		  - while문은 증가값의 위치에 따라 결과가 달라질 수 있다 
		 */
	
	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 10) {
			
			System.out.println(i++);
			// ++ 이 앞에 있으면 1~10 출력 / ++ 이 뒤에 있으면 0~9 출력 
		}
		
		while(i++ < 10) {
			
			System.out.println(i);
			// while ++i 는 잘 사용하지 않는다 (직관적이지 않음 : 다른 값들은 10개 출력하는데 이 함수는 9개 출력함)
		}
		// while 문에서도 break 와 continue 를 사용할 수 있다 
		
		i = 0;
		
		while (true) {
			System.out.println(++i);
			
			if(i == 140) {
				break;
			}
				
		}

	
	}

	
}
