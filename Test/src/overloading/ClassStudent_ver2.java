package overloading;

public class ClassStudent_ver2 {

	// class student //
	
	private String stuArr[]= new String[3];
	private int ageArr[] = new Int[3];
	
	private int korArr[] = new int[3];
	private int engArr[] = new int[3];
	private int mathArr[] = new int[3];
	
	private int sumArr[] = new int[3];
	private double avgArr[] = new double[3];
	
	
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
