package myobj;

public class Weapon {
	/*
	  칼의 속성
	  -공격력
	  -강화등급
	  -레벨별 강화 확률 (등급마다 강화 확률이 다름)
	  -강화등급별 공격력 증가폭 
	  
	  칼의 메서드
	  - 강화하기 (레벨별 강화 확률에 따라 강화가 성공하거나 실패한다 (랜덤))
	 	성공하면 강화 등급이 1 증가한다 
	 	실패하면 강화등급이 그대로 유지된다 (원한다면 떨어뜨려도 좋음)
	 	
	 - 공격하기 
	 공격력을 확인할 수 있다 
	 */
	String name;
	int attack;
	int grade;
	int[] upgrade_chance = {
			90, 90, 80, 80, 80, 
			70, 70, 70, 70, 60, 
			50, 50, 50, 40, 40, 
			40, 30, 5, 5, 5
	};
	int[] attack_increment = {
			10, 30, 100, 150, 200 ,300 ,700 ,700 ,700 ,700, 
			1000, 1000, 1000, 1000, 1500, 1500, 2500, 2500, 3000, 3500
	};
	
	Weapon(){
		name = "나뭇가지";
		attack = 5;
		grade = 0;
	}
	
	Weapon(int attack, String name){
		this.attack = attack;
		this.name = name;
		grade = 0;
	}
	
	boolean upgrade() {
		int value = (int)(Math.random() * 100);
		
		if (value < upgrade_chance[grade]) {
			System.out.printf("\"%s %+d\" 강화에 성공하셨습니다!\n", name, grade);
			grade++;
			return true;
		} else {
			System.out.println("강화실패..");
			return false;
		}
	}
	
	void attack() {
		int damage = attack;
		
		for (int i = 0; i < grade; ++i) {
			damage += attack_increment[i];
		}
		
		System.out.printf("\"%s %+d\"를 휘둘렀습니다. [데미지:%d]\n",
						name,grade,damage);
	}
	public static void main(String[] args) {
		Weapon w = new Weapon();
//		System.out.println(w.upgrade_chance.length);
//		System.out.println(w.attack_increment.length);
		
		Weapon gun = new Weapon(10, "비눗방울 총");
		
		for (int i = 0; i < 30; ++i) {
			gun.upgrade();
			gun.attack();
		}
		
		
	}
}

	
	
