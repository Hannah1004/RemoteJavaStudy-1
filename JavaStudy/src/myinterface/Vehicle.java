package myinterface;

public interface Vehicle {
	int acceleration();
	
	int deceleration();
	
	boolean ride();
}

class Car implements Vehicle {
	
	int vleocity = 0;
	int max_seat = 10;
	int passenger = 0;

	@Override
	public int acceleration() {
		return vleocity += 10;
	}

	@Override
	public int deceleration() {
		return vleocity -= 10;
	}

	@Override
	public boolean ride() {
		if(passenger == max_seat) {
			return false;
		} else {
			passenger++;
			return true;
		}
	}
	
}

class Bicycle implements Vehicle {
	int vleocity = 0;
	int max_seat = 2;
	int passenger = 0;
	
	@Override
	public int acceleration() {
		return vleocity += 20;
	}

	@Override
	public int deceleration() {
		return vleocity -= 20;
	}

	@Override
	public boolean ride() {
		if(passenger == max_seat) {
			return false;
		} else {
			passenger++;
			return true;
		}
	}
	
}
