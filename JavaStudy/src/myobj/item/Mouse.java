package myobj.item;

public class Mouse extends Item{
	public Mouse(String name, int price) {
		super(name, price);
	}
	public void use() {
		System.out.println("클릭하기");
	}
}


