package product;

public abstract class Product {
	
	protected String model;
	protected int price;
	
	public Product(String model, int price) {
		setModel(model);
		setPrice(price);
	}
	
	//�߻�޼ҵ�
	abstract public void out();  
	// abstract �߻��� ���� �޼ҵ带 �ڽ�Ŭ�������� �ݵ�� �������̵��� �ؾ��Ѵ�
	// �ڵ� �������� ���ؼ� �������̵��� ���� ����� ��Ģ���� �ο��Ѵ�
	// �߻�޼ҵ带 ������ �ִ� Ŭ������ �ݵ�� �߻�Ŭ����������

	
	
	// Getter & Setter //
	// alt + shift + s + r �ڵ����� ����Ű
	
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

