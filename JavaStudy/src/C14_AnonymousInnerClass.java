
public class C14_AnonymousInnerClass {
	
	/*
	 	# 익명 내부 클래스 
	 	
	 	- 클래스를 정의하자마자 이름도 짓지 않고 바로 사용한 다음 버리는 방식 
	 	- 일회용이다 
	 */
	
	public static void main(String[] args) {
		fight(new Dragon());
		fight(new SkeletonWarrior());
		
		// 익명 내부 클래스는 즉석으로 해당 클래스를 상속을 구현한다 
		// 생성자 뒤에 ()를 열어서 즉석에서 클래스를 개조해서 사용하는 방법을 익명 내부 클래스라고 한다 
		Dragon dragon01 = new Dragon() {
			void attack() {
				System.out.println("얼음 드래곤은 얼음을 뿜어서 공격합니다");
				// 중괄호를 연다는건 부모클래스를 내맘대로 개조해서 자식클래스를 만든다 // 이 방법은 익명으로 만든것 
			}
		};
		
		fight(dragon01);
		fight(new SkeletonWarrior() {
			void attack() {
				System.out.println("스켈레톤 방패병은 방패를 밀어서 공격합니다");
			}
		});
		
		// 인스턴스화 할 수 없는 추상 클래스를 즉석에서 상속받아 구현해버릴 수 있다 
		Monster monster01 = new Monster() {
			void attack() {
				System.out.println("몸통박치기!");
			}
		};
		fight(monster01);
	}
	
	private static void fight(Monster monster) {
		monster.attack();
	}
	
}

abstract class Monster {
	
	abstract void attack();
	
}

class Dragon extends Monster {
	
	void attack() {
		System.out.println("드래곤은 불을 뿜어서 공격합니다");
	}
}

class SkeletonWarrior extends Monster {
	
	void attack() {
		System.out.println("해골전사는 칼을 휘둘러서 공격합니다");
	}
}
