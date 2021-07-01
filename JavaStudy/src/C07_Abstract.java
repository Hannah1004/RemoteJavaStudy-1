
public class C07_Abstract {
	
	/*
	  # 추상클래 (abstract class)
	  
	  - 형태만 만들어 놓고 완성을 자손 클래스에게 미루는 클래스
	  - 내부에 추상 매서드를 포함하고 있는 클래스
	  
	  # 추상 매서드 (abstract method)
	  
	  - 몸통이 없는 매서드
	  - abstract가 붙으면 직접 구현할 수 없고, 상속받은 클래스에서 구현해야 한다 
	 */
	public static void main(String[] args) {
		testPokemon(new Pikachu());
		testPokemon(new LongStone());
		
	}
	
	// Pokemon 클래스를 상속받은 모든 인스턴스가 매개변수로 들어올 수 있는 매서드 
	public static void testPokemon(Pokemon p) {
		p.skill1();
		p.skill2();
	}
	
	// 위에 매서드가 있으면 밑에 매서드들은 없어도 됨 / 위에서 다 포함시키기 때문에 
	// 밑에 방식으로 만들면 포켓몬 한마리 추가할때마다 매서드 한개씩 계속 추가해야한다 
//	public static void testPokemon(Pikachu p) {
//		p.skill1();
//		p.skill2();
//	}
//	
//	public static void testPokemon(LongStone stone) {
//		stone.skill1();
//		stone.skill2();
//	}
}

// abstract method가 있으면 class 이전에 abstract를 꼭 붙혀야 함 
abstract class Pokemon {
	
	abstract void skill1();
	abstract void skill2();
	
}

class Pikachu extends Pokemon {

	@Override
	void skill1() {
		System.out.println("몸통박치기");
	}

	@Override
	void skill2() {
		System.out.println("백만볼트");
	}
	
}

class LongStone extends Pokemon {

	@Override
	void skill1() {
		System.out.println("땅파기");
		
	}

	@Override
	void skill2() {
		System.out.println("박치");
		
	}
	
}