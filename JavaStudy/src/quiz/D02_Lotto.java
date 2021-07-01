package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;

public class D02_Lotto {
	
	/*
	  1. 1부터 45사이의 중복없는 랜덤 숫자 6개 또는 7개를 생성하는 매서드를 작성해보세요 
	  2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
	  	당첨번호와 일치하는 7개의 숫자가 나올 때 까지 번호를 계속 뽑아보세요 
	  3. 2등 또는 1등에 당첨될때까지 돈을 얼마나 썼는지 계산해보세요 (숫자 6개 뽑는데 천원)
	 */
	public static void main(String[] args) {
		HashSet<Integer> lottoNum = new HashSet<>();
		final int LOTTONUM_SIZE = 7;
		int count = 1;
		
		while(true) {
			lottoNum.add((int)(Math.random()*45+1));
			if(lottoNum.size() == LOTTONUM_SIZE) {
				break;
			}
		}
		ArrayList<Integer> lotto = new ArrayList<>();
		ArrayList<Integer> lottoSelect = new ArrayList<>(selectNum());
		
		lotto.addAll(lottoNum);
		System.out.println("이번회차 로또 번호는 : "+ lotto);
		System.out.println("처음 뽑은 로또번호 : " + lottoSelect);
		
		boolean first = true;
		
		ArrayList<Integer> bonus_ball = new ArrayList<>();
		bonus_ball.add(lotto.get(6));

		while(true) {
			ArrayList<Integer> relottoSelect = new ArrayList<>(selectNum());
			relottoSelect.retainAll(lotto);
			if(relottoSelect.size() == 6) {
				System.out.println();
				System.out.println("*****************축 당첨*******************");
				System.out.println("* 당첨됬을때의 번호 :" + relottoSelect);
				for(int i = 0; i < relottoSelect.size(); ++i) {
					if(relottoSelect.get(i) == bonus_ball.get(0)) {
						first = false;
					} else {
						first = true;
					}
				}
				if(first) {
					System.out.println("* 1등 당첨입니다 !");
				} else {
					System.out.println("* 2등 당첨입니다 !");
				}
				break;
			} else if(relottoSelect.size() != 6) {
				System.out.println("다시 뽑았을 때 일치한 번호 : " + relottoSelect);
				count++;
			}
		}
		System.out.println("* 몇 번 뽑았나요 ? " + (count+1) + "번");
		System.out.print("* 사용한 금액 : ");
		
		int converted[] = new int[5];
		int moneys[] = new int[5];
		String[] won = {"억","천","백","십","만"};
		int money = (count+1)*1000;
		
		moneys[0] = 100000000;
		moneys[1] = 10000000;
		moneys[2] = 1000000;
		moneys[3] = 100000;
		moneys[4] = 10000;
		
		for (int i = 0; i < converted.length; ++i) {
			converted[i] = money / moneys[i];
			money %= moneys[i];
		}
		
		boolean exist = false;
		
		for (int i = 0; i < converted.length; ++i) {
			if (converted[i] != 0 || exist) {
				System.out.printf("%d%s ", converted[i], won[i]);
				exist = true;
			}
		}
		System.out.printf("%d원 \t\t  ",money);
		System.out.println();
		System.out.println("*****************************************");
	}
	public static HashSet<Integer> selectNum(){
		HashSet<Integer> selectNum = new HashSet<>();
		final int SELECT_SIZE = 6;
		
		while(true) {
			selectNum.add((int)(Math.random()*45+1));
			if(selectNum.size() == SELECT_SIZE) {
				break;
			}
		}
		return selectNum;
	}
	
//	public static HashSet<Integer> intersection(Collection a, Collection b){
//		HashSet<Integer> intersection = new HashSet<>();
//		
//		intersection.addAll(a);
//		intersection.retainAll(b);
//		
//		return intersection;
//	}
}
