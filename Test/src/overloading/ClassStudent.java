package overloading;

public class ClassStudent {

	// class student //
	
	private String name;
	private int age;
	
	private int kor;
	private int eng;
	private int math;
	
	private int sum;
	private double avg;
	
	
	// Setter //
	 
	public void setName(String name) {	
		this.name = name;
	}
	public void setAge(int age) {	
		this.age = age;
	}
	public void setKor(int kor) {	
		this.kor = kor;
	}
	public void setEng(int eng) {	
		this.eng = eng;
	}
	public void setMath(int math) {	
		this.math = math;
	}
	public void setSum(int sum) {	
		this.sum = sum;
	}
	public void setAvg(double avg) {	
		this.avg = avg;
	}
	
	
	// Getter //
	
	public String getName() {	
		return this.name;
	}
	public int getAge() {	
		return this.age;
	}
	public int getKor() {	
		return this.kor;
	}
	public int getEng() {	
		return this.eng;
	}
	public int getMath() {	
		return this.math;
	}
	public int getSum() {	
		return this.sum;
	}
	public double getAvg() {	
		return this.avg;
	}
	
	
	
	
}
