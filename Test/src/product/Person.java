package product;

public class Person {
	
	private String name;
	private int money;
	private Product prob;
	
	public Person(String name,int money) {
		setName(name);
		setMoney(money);
	}
	
	public void buy(Product prob) {
		this.prob = new prob();
		setMoney()
		prob.out();
		
	}

	
	// Getter & Setter //
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Product getProb() {
		return prob;
	}

	public void setProb(Product prob) {
		this.prob = prob;
	}

}
