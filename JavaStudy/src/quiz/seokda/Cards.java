package quiz.seokda;

import java.util.Arrays;

public class Cards {
	
	final public static int CARD_SIZE = 20;
	
	Card[] cards;
	
	private int cursor;
	
	public Cards() {
		cards = new Card[CARD_SIZE];
		
		for (int i = 0; i < CARD_SIZE; ++i) {
			cards[i] = new Card(i);
		}
		shuffle(100);
		
	}
	
	public void shuffle(int times) {
		for (int i = 0; i < times; ++i) {
			int x = (int)(Math.random()*CARD_SIZE);
			int y = (int)(Math.random()*CARD_SIZE);
			
			Card temp = cards[x];
			cards[x] = cards[y];
			cards[y] = temp;
		}
	}
	
	public Card next() {
		if (cursor > CARD_SIZE - 1) {
			shuffle(500);
			cursor = 0;
		}
		return cards[cursor++];
	}
	
	public String toString() {
		return Arrays.toString(cards);
	}
	
	public static void main(String[] args) {
		Cards cds = new Cards();
		System.out.println(cds);
	}
	
}

class Card {
	final public static String[] mins = {"m1","m2","m3","m4","m5","m6","m7","m8","m9","m10"
										,"光1","p2","光3","p4","p5","p6","p7","光8","p9","p10"};
	final public static int[] mins_VALUES = {1,2,3,4,5,6,7,8,9,10,
												1,2,3,4,5,6,7,8,9,10};
	
	final public static boolean[] POWER = {false,false,false,false,false,false,false,false,false,false,
											true,false,true,true,false,false,true,true,true,false};
	int min;
	
	public Card(int min) {
		this.min = min;
	}
	
	public String toString() {
		return mins[min];
	}
	
	int getValue() {
		return mins_VALUES[min];
	}
	
	boolean getPower() {
		return POWER[min];
	}
	
	
}