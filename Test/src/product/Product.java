package product;

public abstract class Product {
	
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		setModel(model);
		setPrice(price);
	}
	
	//추상메소드
	abstract public void out();  
	// abstract 추상성을 가진 메소드를 자식클래스에서 반드시 오버라이딩을 해야한다
	// 코드 가독성을 위해서 오버라이딩을 통해 기능의 규칙성을 부여한다
	// 추상메소드를 가지고 있는 클래스는 반드시 추상클래스여야함

	
	
	// Getter & Setter //
	// alt + shift + s + r 자동생성 단축키
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

