
public class B03_Switch {

	public static void main(String[] args) {
		
		/*
		  # Switch case 문
		  - 괄호안의 연산결과에 따라 실행할 코드를 결정한다
		  - 괄호안에 boolean 타입은 들어갈 수 없다
		  - if문으로 완벽하게 대체 가능하다
		  - default는 if문의 else 역할을 한다 
		  - break를 안 쓰면 break를 만날 때까지 내려가면서 모든 case를 실행한다 
		 */
		int a = -2;
		
		switch (a % 2) {
		case 1:
			System.out.println("case 1 블록이 실행되었습니다. ");
			System.out.println("a는 홀수입니다. ");
			break;
		case 0:
			System.out.println("case 0 블록이 실행되었습니다. ");
			System.out.println("a는 짝수입니다. ");
			break;
		default:
			System.out.println("default 블록이 실행되었습니다. ");
			System.out.println("위에 해당하는 case가 없습니다. ");
			break;
		}
		
		char cmd = 'w';
		
		switch (cmd) {
		case 'w':
			System.out.println("move forward");
			
		case 's':
			System.out.println("move backward");
			
		case 'a':
			System.out.println("move left");
			break;
		case 'd':
			System.out.println("move right");
			break;
		case 'p':
			System.out.println("paused");
			break;
		case 'q':
			System.out.println("quit");
			break;
		default:
			System.out.println("해당하는 커맨드가 없습니");
			break;
		}
	}
	
}
