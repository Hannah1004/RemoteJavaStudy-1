package myobj;

public class Main {

	public static void main(String[] args) {
		
		Barrack b1 = new Barrack();
		Kitchen k1 = new Kitchen();
		
		b1.createSheep();
		b1.createSheep();
		b1.createSheep();
		b1.createCow();
		b1.createCow();
		
		k1.make1levelJjambbong();
		k1.make1levelJjambbong();
		k1.make2levelJjambbong();
		k1.make2levelJjambbong();
		k1.make2levelJjambbong();
		
		
		System.out.println(b1.queue[0].name);
		System.out.println(b1.queue[1].name);
		System.out.println(b1.queue[2].name);
		System.out.println(b1.queue[3].name);
		System.out.println(b1.queue[4].name);
		
		System.out.println(k1.jjambbong[0].name);
		System.out.println(k1.jjambbong[1].name);
		System.out.println(k1.jjambbong[2].name);
		System.out.println(k1.jjambbong[3].name);
	
	}
}
