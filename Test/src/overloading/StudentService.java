package overloading;

import java.util.Scanner;

public class StudentService {
    
	//��� �ʵ�//
	
	Scanner sc;
	ClassStudent stu;
	
	//�����ڿ� �ʱ�ȭ���� �ʰ� ����� ���ÿ� �ʱ�ȭ�� �̿��� ���� �ִ�
	//private ClassStudent stu = new Student();
	
	
	
	//������ //
	
	public StudentService() {
		
		stu = new ClassStudent();
	
		sc=new Scanner(System.in);		
	
	}
	
	//�л� ���� ���� �Է�//
	
	public void insertInfo() {	
		System.out.println(" ++ �⺻ ���� �Է� ++ ");
		System.out.print("Input name : ");
		stu.setName(sc.nextLine());
		System.out.print("Input age : ");
		stu.setAge(sc.nextInt());				
	}
	
	//���� �Է� //
	
	public void insertScore() {		
		System.out.println(" ++ 3���� ���� �Է� ++ ");
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
	
	private void calcSum() { //Ŭ���� ���������θ� ����ϴ� �޼ҵ�
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());			
	}
	
	
	//��հ��//
	
	private void calcAvg() { //Ŭ���� ���������θ� ����ϴ� �޼ҵ�
		stu.setAvg((stu.getKor()+stu.getEng()+stu.getMath())/(double)3);
	}
	
	
	//���//
	
	public void printStu() {
		System.out.println(" ++ ��      �� ++ ");
		System.out.println("=== �л� ���� ===");
		System.out.println("�̸� : "+stu.getName());
		System.out.println("���� : "+stu.getAge());
		System.out.println("==== ��   �� ====");
		System.out.println("���� : "+stu.getKor());
		System.out.println("���� : "+stu.getEng());
		System.out.println("���� : "+stu.getMath());
	    System.out.println("���� : "+stu.getSum());
	    System.out.print("��� : ");
	    System.out.printf("%.2f",stu.getAvg());
	
	}
	

	
}
