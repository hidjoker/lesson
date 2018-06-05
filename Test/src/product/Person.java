package product;

public class Person {
	
	private String name;
	private static int MONEY;
	private Product prob;
	
	public Person(String name,int money) {
		setName(name);
		setMoney(money);
	}
	
	public void buy(Product prod) {
		setProb(prod);
		prod.out();
		Person.MONEY -= prod.getPrice();
		System.out.println(this.name+"님이 "+prod.price+"원을 지불하고 "+prod.model+"을 구매함");
        System.out.println("[잔액] "+Person.MONEY);		
	}

	
	// Getter & Setter //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return MONEY;
	}

	public void setMoney(int money) {
		this.MONEY = money;
	}

	public Product getProb() {
		return prob;
	}

	public void setProb(Product prob) {
		this.prob = prob;
	}

}
