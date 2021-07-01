package myobj.item;

public class ItemMain {
	int money;
	
	ItemMain m = new ItemMain();
	
	public ItemMain() {
		money = 10000;
	}

	public static void itemtest(Item p) {
		p.info();
		p.use();
	}
	
	public void purchase(Item p) {
		this.money -= p.price;
		System.out.println(p.name + "을 사고 " + this.money + " 원이 남았습니다");
	}
	
	
	public static void main(String[] args) {
		itemtest(new Sword("칼",1000));
		itemtest(new Cap("베레모",1000));
		itemtest(new Mouse("짱구마우스",1000));
		
	}
	
}
