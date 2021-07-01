package interfaceNation;

public class Korea implements Nation{
	int population = 5000;
	int gas_increase = 100;
	boolean arborday = true;
	

	@Override
	public int population_increase() {
		return population += 100;
	}

	@Override
	public int gas_output() {
		return gas_increase += 1500;
	}

	@Override
	public boolean arborDay() {
		if (arborday == false) {
			return false;
		} else {
			return true;
		}
	}

}
