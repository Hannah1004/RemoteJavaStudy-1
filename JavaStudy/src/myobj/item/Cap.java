package myobj.item;

public class Cap extends Item{
	public Cap(String name, int price) {
		super(name, price);
	}
	public void use() {
		System.out.println("모자쓰기");
	}
}


