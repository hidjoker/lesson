package overloading;

import java.util.Scanner;

public class StudentService {
    
	//��� �ʵ�//
	
	Scanner sc;
	ClassStudent stu;
	
	
	//������ //
	
	public StudentService() {
		
		stu = new ClassStudent();
	
		sc=new Scanner(System.in);		
	
	}
	
	//�л� ���� �Է�//
	
	public void insertInfo() {
		
		System.out.print("Input name : ");
		stu.setName(sc.nextLine());
		System.out.print("Input age : ");
		stu.setAge(sc.nextInt());
				
	}
	
	//���� �Է� //
	
	public void insertScore() {
		
		System.out.print("���� ���� : ");
		stu.setKor(sc.nextInt());
		System.out.print("���� ���� : ");
		stu.setEng(sc.nextInt());
		System.out.print("���� ���� : ");
		stu.setMath(sc.nextInt());
		
		this.calcSum();
		this.calcAvg();
			
	}
	
	
	//�������//
	
	public void calcSum() {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());			
	}
	
	
	//��հ��//
	
	public void calcAvg() {
		stu.setAvg((stu.getKor()+stu.getEng()+stu.getMath())/3);
	}
	
	
	//���//
	
	public void printStu() {
		
		System.out.println("=== �л� ���� ===");
		System.out.println("�̸� : "+stu.getName());
		System.out.println("���� : "+stu.getAge());
		System.out.println("==== ��   �� ====");
		System.out.println("���� : "+stu.getKor());
		System.out.println("���� : "+stu.getEng());
		System.out.println("���� : "+stu.getMath());
	    System.out.println("���� : "+stu.getSum());
	    System.out.println("��� : "+stu.getAvg());
	
	}
	

	
}
