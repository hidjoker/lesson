package overloading;

import java.util.Scanner;

class car{
	
	private String model;
	private String color;
		
	
	//constructor//
	
	
	
	public car(String model,String color) {
		
		setModel(model);
		setColor(color);
				
	}
	
	//method//
	
	public void display() {
		
		System.out.println("모델명 : " +getModel());
		System.out.println("색상 : "+getColor());
	
	}

	
	//setter//
	
	public void setModel(String model) {
		
		this.model = model;
				
	}
	
	public void setColor (String color) {
		
		this.color = color;
		
	}
	
	
	//getter//
	
	public String getModel() {
	
		return this.model;
		
	}
	public String getColor() {
		
		return this.color;
		
	}
	
	// getter , setter 자동 생성 source ㅡ> generate getter and setter

}


	
public class carEx{
	
	public static void main(String[] args) {
		
		car c = new car("k5", "black");
		c.display();
		
		System.out.println("-------------------");
		
		c.setModel("모닝");
		c.setColor("white");
		
		c.display();
	
		
		
	}
		
}



