package quiz.fivedice;

public class C07_FiveDice {
	/*
	  랜덤으로 5개의 주사위를 굴린 다음에 주사위의 결과를 통해 다음을 구분하는 클래스를 만들어보세요
	  
	  1. 풀하우스 (같은 눈이 2개 + 3개 ) (11666/22333/55252)
	  2. 스몰 스트레이트 (1234,2345,3456)
	  3. 라지 스트레이트 (12345/23456)
	  4. 4 다이스 (같은 숫자 4개)
	  5. 5 다이스 (Yacht) (같은 숫자 5개) - 제일 좋은 패 
	 */
	
	Dices dices;
	Player player;
	int level;
	
	public C07_FiveDice() {
		dices = new Dices();
		player = new Player();
	}
	
	public void new_game() {
		player.add(dices.next());
		player.add(dices.next());
		player.add(dices.next());
		player.add(dices.next());
		player.add(dices.next());
		System.out.print("플레이어의 주사위 : ");
		System.out.println(player);
		System.out.println("플레이어의 족보는 : " );
		player.level();
	
	
		
	}
	
	public static void main(String[] args) {
		new C07_FiveDice().new_game();
		
	}
}
