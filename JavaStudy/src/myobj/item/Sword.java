package myobj.item;

public class Sword extends Item{

	public Sword(String name, int price) {
		super(name, price);
	}
	public void use() {
		System.out.println("찌르기");
	}
}
	


