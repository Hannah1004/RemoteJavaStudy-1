package quiz.seokda;

import java.util.Random;
import java.util.Scanner;

public class Seokda {
	
	Scanner sc;
	Cards cards;
	Player player;
	Computer com;
	
	
	public Seokda() {
		cards = new Cards();
		player = new Player();
		com = new Computer();
		sc = new Scanner(System.in);
		Random ran = new Random();
	}
	
	public void new_game() {
//		Card card1,card2,card3,card4;
//		card1 = new Card(0);
//		card2 = new Card(10);
//		card3 = new Card(12);
//		card4 = new Card(16);
//		
//		player.add(card1);
//		player.add(card2);
//		com.add(card3);
//		com.add(card4);
		
		
		
		System.out.println("*************섯다를 시작합니다**************");
		System.out.println();
		player.add(cards.next());
		com.add(cards.next());
		System.out.println("카드를 한장씩 받았습니다.");
		System.out.println("나의 카드는 : " + player);
		System.out.println("컴퓨터 카드는 : " + com);
		
		player.betting();
		if (com.select() == 3) {
			new Seokda().new_game();
			
		} else {
			player.add(cards.next());
			com.add(cards.next());
			
			player.betting();
			
			player.calc();
			com.calc();
			player.lv();
			com.lv();
			System.out.println("나의 카드는 : " + player);
			System.out.println("나의 족보는 : " + player.levelString1());
			System.out.println();
			System.out.println("컴퓨터 카드는 : " + com);
			System.out.println("컴퓨터 족보는 : " + com.levelString1());
			System.out.println();
		}
		
		if ((player.calc() == 333) && (com.calc() < 999) || (com.calc() == 333) && (player.calc() < 999)) {
			System.out.println("멍사구입니다. 재경기해주세요");
			new Seokda().new_game();
		} else if ((player.calc() == 33) && (com.calc() <= 20) || (com.calc() == 33) && (player.calc() <= 20)) {
			System.out.println("사구입니다. 재경기해주세요");
			new Seokda().new_game();
		} else if ((player.lv() == 2) && (com.lv() == 1)) {
			System.out.println("플레이어가 땡잡이로 승리하였습니다 !");
		} else if ((com.lv() == 2) && (player.lv() == 1)) {
			System.out.println("컴퓨터가 땡잡이로 승리하였습니다 !");
		} else if ((player.lv() == 5) && (com.lv() == 4)) {
			System.out.println("플레이어가 암행어사로 승리하였습니다 !");
		} else if ((com.lv() == 5) && (player.lv() == 4)) {
			System.out.println("컴퓨터가 암행어사로 승리하였습니다 !");
		} else if (player.calc() > com.calc()) {
			System.out.println("플레이어 승리 !");
		} else if (player.calc() == com.calc()) {
			System.out.println("무승부입니다");
			System.out.println("재경기 하겠습니다.");
			new Seokda().new_game();
		} else {
			System.out.println("컴퓨터의 승리 !");
		}
	}
	
	public static void main(String[] args) {
		new Seokda().new_game();
		
	}
}
