package quiz.blackjack;

import java.util.Arrays;

// 후에 플레이어가 여러명이 될 수도 있기때문에 Player 와 Dealer를 나눠서 만든다 
public class Player {
	// 최소 숫자로 계속 받았을때 11장이상 받으면 21이 넘어감 
	final static int MAX_TABLE_SIZE = 11;
	
	Card[] tables;
	
	int count;
	int ace_count; // a의 갯수 세기 

	Player() {
		tables = new Card[MAX_TABLE_SIZE];
	}
	
	void add(Card card) {
		if (card.rank == 0) {
			ace_count++;
		}
		tables[count++] = card;
	}
	
	int calc() {
		int value = 0;
		for (int i = 0; i < count; ++i) {
			value += tables[i].getValue();
		}
		
		int i = 0;
		while (ace_count - i > 0 && value > 21) {
			value -= 10;
			i++;
		}
		
		return value;
	}
	
	public String toString() {
		String str = "";
		int index = 0;
		for (int i = 0; i < MAX_TABLE_SIZE; ++i) {
			if(tables[i] == null) {
				break;
			} else {
				str += "[" + tables[i] + "]";
			}
		}
		return str;
	}
}
