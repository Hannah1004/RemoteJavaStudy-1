package myinterface;

public class Main {

	public static void main(String[] args) {
		Car audi = new Car();
		
		test(audi);
//		test(new Bicycle());
		
	}
	
	public static void acceleration(Vehicle to_accel) {
		to_accel.acceleration();
	}
	public static void deceleration(Vehicle to_decel) {
		to_decel.deceleration();
	}
	public static void ride(Vehicle to_ride) {
		to_ride.ride();
	}
	
	public static void test(Vehicle vehicle) {
		
		for(int i = 0; i < 10; ++i) {
			System.out.println("속도를 더 냈습니다");
			System.out.println("현재 속도는" + vehicle.acceleration() + "km/h 입니다");
		}
		
		System.out.println("무서워서 속도를 줄였습니다");
		for (int i = 0; i < 3; ++i) {
			System.out.println("현재 속도는" + vehicle.deceleration() + "km/h 입니다");
		}
		
		for (int i = 0; i < 3; ++i) {
			if(!vehicle.ride()) {
				System.out.println("더이상 탈 수 없습니다");
			} else {
				System.out.println("한명이 더 탔습니다");
			}
		}
	}
}
