package interfaceNation;

public class Main {
	public static void main(String[] args) {
		test(new Korea());
	}


	public static void test(Nation nation) {
		for (int i = 0; i < 50; ++i) {
			System.out.println("인구증가량 : " + nation.population_increase() + "만 명");
			System.out.println("가스배출량 증가 : " + nation.gas_output());
		}
		if(nation.arborDay()) {
			System.out.println("식목일이 있습니다");
		} else {
			System.out.println("식목일이 없습니다");
		}
	
	}
}