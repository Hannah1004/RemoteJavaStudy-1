package quiz.seokda;

import java.util.Random;

public class Computer extends Player{
	Random ran = new Random();
	
	public int select() {
		int select = ran.nextInt(3) + 1;
		
		return select;
	}
	
	public int com_betting() {
		int money = ran.nextInt(500) + 500;
		System.out.printf("Computer : %d Bet !!",money);
		System.out.println();
		return money;
	}
}
	
