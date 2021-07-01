package quiz.fivedice;

import java.util.Arrays;

public class Player {
	final static int MAX_TABLE_SIZE = 5;
	
	Dice[] tables;
	
	int count;
	
	Player(){
		tables = new Dice[MAX_TABLE_SIZE];
	}
	
	void add(Dice dice) {
		tables[count++] = dice;
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
	
	int level() {
		int value = 0;
		int count = 0;
		int[] value_size = new int[6];
		
		for(int i = 0; i < tables.length; ++i) {
			value_size[tables[i].getValue() - 1]++;	
		}
		System.out.println(java.util.Arrays.toString(value_size));
		return value;
	}

//	void check() {
//		while(true) {
//			if(dices.fivedice()) {
//				System.out.println("5다이스 !");
//			} else if(dices.fourdice()) {
//				System.out.println("4다이스 !");
//			} else if(dices.Large()) {
//				System.out.println("라지스트레이트 !");
//			} else if(dices.Small()) {
//				System.out.println("스몰스트레이트 !");
//			} else if(dices.Full()) {
//				System.out.println("풀하우스 !");
//			} else {
//				System.out.println("아무것도 아닙니다 !");
//			}
//			break;
//		}
//	}
	
	
	
	
}

//1. 풀하우스 (같은 눈이 2개 + 3개 ) (11666/22333/55252)
//2. 스몰 스트레이트 (1234,2345,3456)
//3. 라지 스트레이트 (12345/23456)
//4. 4 다이스 (같은 숫자 4개)
//5. 5 다이스 (Yacht) (같은 숫자 5개) - 제일 좋은 패 