package quiz;
import java.util.Scanner;

public class B05_PrintReverse {

		/*
		 사용자가 어떤 문장을 입력하면 그 문장을 거꾸로 출력해보세
		 */
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.print("문장을 입력해 보세요 >");
			String user = sc.nextLine();
			
			
		    for (int i = user.length()-1; i >= 0; i--) {

		    	System.out.print(user.charAt(i));
			}
		}
}
