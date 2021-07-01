package quiz.fivedice;

import java.util.Arrays;

public class Dices {
	final public static int DICE_SIZE = 6;
	
	Dice[] dices;
	int[] value_size = new int[6];
	boolean[] fullhouse_count = new boolean[2];
	
	public Dices() {
		dices = new Dice[DICE_SIZE];
		for(int i = 0; i < DICE_SIZE; ++i) {
			dices[i] = new Dice(i);
		}
	}
	public Dice next() {
		int random = (int)(Math.random()*DICE_SIZE);
		return dices[random];
	}
	
	public String toString() {
		return Arrays.toString(dices);
	}
	
	
	boolean Large() {
		if ((value_size[0] == 1 && value_size[1] == 1 && value_size[2] == 1 && value_size[3] == 1 && value_size[4] == 1)
				|| value_size[1] == 1 && value_size[2] == 1 && value_size[3] == 1 && value_size[4] == 1 && value_size[5] == 1){
			return true;
		}
		return false;
	}
	
	boolean Small() {
		if ((value_size[0] != 0 && value_size[1] != 0 && value_size[2] != 0 && value_size[3] != 0) ||
				(value_size[1] != 0 && value_size[2] != 0 && value_size[3] != 0 && value_size[4] != 0) ||
				(value_size[2] != 0 && value_size[3] != 0 && value_size[4] != 0 && value_size[5] != 0)) {
			return true;
		}
		return false;
	}
	
	boolean Full() {
		for(int i = 0; i < value_size.length; ++i) {
			if(value_size[i] == 3) {
				fullhouse_count[0] = true;
				for (int j = 0; j < value_size.length; ++j) {
					if (value_size[j] == 2) {
						fullhouse_count[1] = true;
					}
				}
			}
			if (fullhouse_count[0] && fullhouse_count[1]) {
				return true;
			}
		}
		return false;
	}
	
	boolean fivedice() {
		for(int i = 0; i < value_size.length; ++i) {
			if(value_size[i] == 5) {
				return true;
			}
		}
		return false;
	}
	
	boolean fourdice() {
		for (int i = 0; i < value_size.length; ++i) {
			if(value_size[i] == 4) {
				return true;
			}
		}
		return false;
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

class Dice {
	final private static String[] DICES = {"*","**","***","****","*****","******"};
	final private static int[] DICES_VALUES = {1,2,3,4,5,6};
	
	int dice;
	
	public Dice(int dice) {
		this.dice = dice;
	}
	
	public String toString() {
		return DICES[dice];
	}
	
	int getValue() {
		return DICES_VALUES[dice];
	}
	
}

