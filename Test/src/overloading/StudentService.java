package overloading;

import java.util.Scanner;

public class StudentService {
    
	//멤버 필드//
	
	Scanner sc;
	ClassStudent stu;
	
	//생성자에 초기화하지 않고 선언과 동시에 초기화를 이용할 수도 있다
	//private ClassStudent stu = new Student();
	
	
	
	//생성자 //
	
	public StudentService() {
		
		stu = new ClassStudent();
	
		sc=new Scanner(System.in);		
	
	}
	
	//학생 인적 정보 입력//
	
	public void insertInfo() {	
		System.out.println(" ++ 기본 정보 입력 ++ ");
		System.out.print("Input name : ");
		stu.setName(sc.nextLine());
		System.out.print("Input age : ");
		stu.setAge(sc.nextInt());				
	}
	
	//점수 입력 //
	
	public void insertScore() {		
		System.out.println(" ++ 3과목 점수 입력 ++ ");
		System.out.print("국어 점수 : ");
		stu.setKor(sc.nextInt());
		System.out.print("영어 점수 : ");
		stu.setEng(sc.nextInt());
		System.out.print("수학 점수 : ");
		stu.setMath(sc.nextInt());
		this.calcSum();
		this.calcAvg();
	}
	
	
	//총점계산//
	
	private void calcSum() { //클래스 내부적으로만 사용하는 메소드
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());			
	}
	
	
	//평균계산//
	
	private void calcAvg() { //클래스 내부적으로만 사용하는 메소드
		stu.setAvg((stu.getKor()+stu.getEng()+stu.getMath())/(double)3);
	}
	
	
	//출력//
	
	public void printStu() {
		System.out.println(" ++ 출      력 ++ ");
		System.out.println("=== 학생 정보 ===");
		System.out.println("이름 : "+stu.getName());
		System.out.println("나이 : "+stu.getAge());
		System.out.println("==== 성   적 ====");
		System.out.println("국어 : "+stu.getKor());
		System.out.println("영어 : "+stu.getEng());
		System.out.println("수학 : "+stu.getMath());
	    System.out.println("총점 : "+stu.getSum());
	    System.out.print("평균 : ");
	    System.out.printf("%.2f",stu.getAvg());
	
	}
	

	
}
