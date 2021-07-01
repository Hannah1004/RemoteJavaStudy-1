package quiz;

import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Random ran = new Random();
		
		for (int i = 0; i < 10; ++i) {
			System.out.println(ran.nextInt());
		}
	}
}
