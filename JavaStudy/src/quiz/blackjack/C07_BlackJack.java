package quiz.blackjack;
import java.util.Scanner;

public class C07_BlackJack {
	

	/*
	  # 카드
	     4가지의 문양 : 하트. 클로버. 다이아모든. 스페이드
	     숫자 : A 2 3 4 5 6 7 8 9 10 J Q K 
	    J,Q,K는 10이다 
	     
	     # 블랙잭에서 A는 1로 쓸 수도 있고 11로도 쓸 수 있음 
	 
	  # 블랙잭을 만들어 보세요
	  
	  1. 컴퓨터(딜러)와 사람(플레이어)이 카드를 뽑는다 
	  2. 처음에는 둘 모두 2장씩 받는다. 이 때 딜러의 카드는 한장 가려놓는다 (다른 한장은 보여야함)
	  3. 플레이어는 상황을 보고 더 뽑을지(hit) 여기서 멈출지를(stand) 결정한다 
	  4. 플레이어가 멈추면 딜러의 카드중 가려져 있던 카드를 오픈하고 규칙에 따라 카드를 뽑는다 
	     (딜러는 반드시 카드 합이 16 이하일때 무조건 뽑고, 17 이상이면 무조건 멈춰야 한다 )
	  5. 플레이어의 카드 숫자들의 합이 딜러보다 높거나 정확하게 21이라면 승리한다 
	     플레이어의 카드 숫자들의 합이 21보다 크면 패배한다 (A~K)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int dealer_sum = 0;
		
		int[] card = {1,2,3,4,5,6,7,8,9,10,10,10,10};
		String[] img = {"H","C","D","S"};
		String[] num = {"A","1","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String[][] cardImg = new String[4][13];
		
		for(int i = 0; i < img.length; ++i) {
			for(int j = 0; j < num.length; ++j) {
				cardImg[i][j] = img[i] + num[j];
			}
		}
		System.out.println(java.util.Arrays.toString(cardImg));
		
		for(int i = 1; i < 3; ++i) {
			int random = (int)(Math.random()*card.length);
			int random_card = card[random];
			sum += random_card;
			System.out.println("[플레이어의 카드]");
			System.out.println(i+"번째 숫자는 : "+random_card + " 입니다");
		}
		System.out.println("플레이어의 숫자의 합은 : " + sum);
		
		
		for(int i = 1; i < 2; ++i) {
			int random = (int)(Math.random()*card.length);
			int dealer_random_card = card[random];
			dealer_sum += dealer_random_card;
			System.out.println("[딜러의 카드]");
			System.out.println(i+"번째 숫자는 : "+dealer_random_card + " 입니다");
		}
		
		while(true) {
			System.out.println("카드를 한장 더 받겠습니까 ? = 1 입력");
			System.out.println("카드를 안받겠습니까 ? = 0 입력");
			
			String choice = sc.next();
			
			if(choice.equals("1")) {
				int random = (int)(Math.random()*card.length);
				int random_card = card[random];
				sum += random_card;
				System.out.println("한장 더 뽑은 카드는 : " + random_card + " 입니다");
				System.out.println("현재 총 카드의 총합은 : " + sum );
				
				if(sum > 21) {
					System.out.println("플레이어 패배 !");
					break;
				}
			} else if(choice.equals("0")) {
				while(dealer_sum < 17) {
					int random = (int)(Math.random()*card.length);
					int dealer_random_card = card[random];
					dealer_sum += dealer_random_card;
				} 
				System.out.println(dealer_sum);
				break;
			}
			
		}
		if (sum > dealer_sum && sum <= 21 ) {
			System.out.println("플레이어가 승리하였습니다");
		} else if (sum == dealer_sum) {
			System.out.println("무승부입니다");
		} else if (sum < dealer_sum && dealer_sum <= 21) {
			System.out.println("딜러가 승리하였습니다");
		}
		System.out.println("게임이 종료되었습니다");
		
	}
}
