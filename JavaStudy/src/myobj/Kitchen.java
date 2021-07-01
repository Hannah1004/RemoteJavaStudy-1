package myobj;

public class Kitchen {
	
	final int MAX_JJAMBBONG_NUM = 4;
	
	Food[] jjambbong;
	int jjambbong_index;
	
	Kitchen(){
		jjambbong = new Food[MAX_JJAMBBONG_NUM];
	}
	
	boolean checkMaxJjambbong() {
		return jjambbong_index == MAX_JJAMBBONG_NUM;
	}
	
	void make1levelJjambbong() {
		if (checkMaxJjambbong()) {
			System.out.println("화구가 부족합니다 !");
			return;
		}
		jjambbong[jjambbong_index++] = new Food("1단계 짬뽕",1);
	}
	
	void make2levelJjambbong() {
		if (checkMaxJjambbong()) {
			System.out.println("화구가 부족합니다 !");
			return;
		}
		jjambbong[jjambbong_index++] = new Food("2단계 짬뽕",2);
	}

}
