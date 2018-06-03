package overloading;

import java.util.Scanner;

public class StudentService_ver2 {
    
	//��� �ʵ�//
	
	Scanner sc;
	
	ClassStudent_ver2 stu2a;
	ClassStudent_ver2 stu2b;
	ClassStudent_ver2 stu2c;
	
	private int idx;
	private String[] stuArr;

	
	
	//������ //
	
	public StudentService_ver2() {
		
		stu2a = new ClassStudent_ver2();
		stu2b = new ClassStudent_ver2();
		stu2c = new ClassStudent_ver2();
	
		sc=new Scanner(System.in);
		
		stuArr = new String[3];
	}
	
	//�ε��� getter//
	
	public int getIdx() {
		return this.idx;	
	}
	
	//�л� ���� ���� �Է�//
	
	private void insertInfo(String stu,int index) {
			
		if(idx==0) {
		System.out.print("["+idx+"��]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("["+idx+"��]Input age : ");
		stu2a.setAge(sc.nextInt());
		stuArr[idx]=stu2a.getName();
		sc.skip("\r\n");
		}
		
		if(idx==1) {
			System.out.print("["+idx+"��]Input name : ");
			stu2b.setName(sc.nextLine());
			System.out.print("["+idx+"��]Input age : ");
			stu2b.setAge(sc.nextInt());
			stuArr[idx]=stu2b.getName();
			sc.skip("\r\n");
		}
		
		if(idx==2) {
			System.out.print("["+idx+"��]Input name : ");
			stu2c.setName(sc.nextLine());
			System.out.print("["+idx+"��]Input age : ");
			stu2c.setAge(sc.nextInt());
			stuArr[idx]=stu2c.getName();
			sc.skip("\r\n");
		}
	}
	
	//�л� ���� ��ü �Է�//
	
	public void insertInfoAll() {		
		System.out.print("[0��]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("[0��]Input age : ");
		stu2a.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[0]=stu2a.getName();
		System.out.print("[1��]Input name : ");
		stu2b.setName(sc.nextLine());
		System.out.print("[1��]Input age : ");
		stu2b.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[1]=stu2b.getName();
		System.out.print("[2��]Input name : ");
		stu2c.setName(sc.nextLine());
		System.out.print("[2��]Input age : ");
		stu2c.setAge(sc.nextInt());
		stuArr[2]=stu2c.getName();
		sc.skip("\r\n");
	}
	
	//���� �ε��� �Է�//
	
	public void insertInfoIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();
		sc.skip("\r\n");
		insertInfo(stuArr[getIdx()],getIdx());
		
	}
	
	
	//�л� ���� ���� �Է� //
	
	private void insertScore(String stu,int idx) {
		
		if(idx==0) {
		System.out.print("[0��]���� ���� : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		sc.skip("\r\n");
		}
		if(idx==1) {
			System.out.print("[1��]���� ���� : ");
			stu2b.setKor(sc.nextInt());
			System.out.print("[1��]���� ���� : ");
			stu2b.setEng(sc.nextInt());
			System.out.print("[1��]���� ���� : ");
			stu2b.setMath(sc.nextInt());
			this.calcSum(stuArr[1]);
			this.calcAvg(stuArr[1]);
			sc.skip("\r\n");
		}
		if(idx==2) {
			System.out.print("[2��]���� ���� : ");
			stu2c.setKor(sc.nextInt());
			System.out.print("[2��]���� ���� : ");
			stu2c.setEng(sc.nextInt());
			System.out.print("[2��]���� ���� : ");
			stu2c.setMath(sc.nextInt());
			this.calcSum(stuArr[2]);
			this.calcAvg(stuArr[2]);
			sc.skip("\r\n");

		}
			
	}
	
	//�л� ���� ��ü �Է�//
	
	public void insertScoreAll() {
		System.out.print("[0��]���� ���� : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		System.out.print("[1��]���� ���� : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setMath(sc.nextInt());
		this.calcSum(stuArr[1]);
		this.calcAvg(stuArr[1]);
		System.out.print("[2��]���� ���� : ");
		stu2c.setKor(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setEng(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setMath(sc.nextInt());		
		this.calcSum(stuArr[2]);
		this.calcAvg(stuArr[2]);
		sc.skip("\r\n");

	}
	// �л� ���� �ε��� �Է�//
	
	public void insertScoreIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		insertScore(stuArr[getIdx()], getIdx());
	}
	

	
	//�л� ����+���� ��ü �Է�//
	public void insertStuAll() {
		System.out.print("[0��]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("[0��]Input age : ");
		stu2a.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[0]=stu2a.getName();
		System.out.print("[0��]���� ���� : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		sc.skip("\r\n");
		
		System.out.print("[1��]Input name : ");
		stu2b.setName(sc.nextLine());
		System.out.print("[1��]Input age : ");
		stu2b.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[1]=stu2b.getName();
		System.out.print("[1��]���� ���� : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setMath(sc.nextInt());
		this.calcSum(stuArr[1]);
		this.calcAvg(stuArr[1]);
		sc.skip("\r\n");
		
		System.out.print("[2��]Input name : ");
		stu2c.setName(sc.nextLine());
		System.out.print("[2��]Input age : ");
		stu2c.setAge(sc.nextInt());
		stuArr[2]=stu2c.getName();
		sc.skip("\r\n");	
		System.out.print("[2��]���� ���� : ");
		stu2c.setKor(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setEng(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setMath(sc.nextInt());		
		this.calcSum(stuArr[2]);
		this.calcAvg(stuArr[2]);
		sc.skip("\r\n");					
	}
	
	//�л� ����+���� ���� �Է�//
	public void insertStu(int idx) {
		if(idx==0) {
		System.out.print("[0��]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("[0��]Input age : ");
		stu2a.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[0]=stu2a.getName();
		System.out.print("[0��]���� ���� : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0��]���� ���� : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		}
		if(idx==1) {
		System.out.print("[1��]Input name : ");
		stu2b.setName(sc.nextLine());
		System.out.print("[1��]Input age : ");
		stu2b.setAge(sc.nextInt());
		stuArr[1]=stu2b.getName();
		sc.skip("\r\n");
		System.out.print("[1��]���� ���� : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[1��]���� ���� : ");
		stu2b.setMath(sc.nextInt());
		this.calcSum(stuArr[1]);
		this.calcAvg(stuArr[1]);
		}
		if(idx==2) {
		System.out.print("[2��]Input name : ");
		stu2c.setName(sc.nextLine());
		System.out.print("[2��]Input age : ");
		stu2c.setAge(sc.nextInt());
		stuArr[2]=stu2c.getName();
		sc.skip("\r\n");	
		System.out.print("[2��]���� ���� : ");
		stu2c.setKor(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setEng(sc.nextInt());
		System.out.print("[2��]���� ���� : ");
		stu2c.setMath(sc.nextInt());		
		this.calcSum(stuArr[2]);
		this.calcAvg(stuArr[2]);
		sc.skip("\r\n");		
		}
	}
	
	
	
	//�л� ����+���� ���� �Է� �ε��� //
		
	public void insertStuIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		insertStu(getIdx());
	}
	
	//�������//
	
	public void calcSum(String name) {
		if(name==stuArr[0])
		stu2a.setSum(stu2a.getKor()+stu2a.getEng()+stu2a.getMath());
		if(name==stuArr[1])
		stu2b.setSum(stu2b.getKor()+stu2b.getEng()+stu2b.getMath());
		if(name==stuArr[2])
		stu2c.setSum(stu2c.getKor()+stu2c.getEng()+stu2c.getMath());
	}
	
	
	//��հ��//
	
	public void calcAvg(String name) {
		stu2a.setAvg(Math.round((stu2a.getKor()+stu2a.getEng()+stu2a.getMath())*100/(double)3)/(double)100);
		stu2b.setAvg(Math.round((stu2b.getKor()+stu2b.getEng()+stu2b.getMath())*100/(double)3)/(double)100);		
		stu2c.setAvg(Math.round((stu2c.getKor()+stu2c.getEng()+stu2c.getMath())*100/(double)3)/(double)100);
	}
	
	//���� ���//
	

	private void printStu(String name, int idx) {
		if(idx==0) {
			System.out.println("==================== �л� ����   =========================");
	        System.out.println("++[��ȣ]++\t++[�̸�]++\t++[����]++");
	        System.out.print("+[ 0�� ]+ \t +["+stu2a.getName()+"]+\t +["+stu2a.getAge()+"��]\r\n");
	        System.out.println();
			System.out.println("=========================  ��   ��   =========================");
			System.out.println("++[��ȣ]++\t++[����]++\t++[����]++\t++[����]++\t++[����]++\t++[���]++");
			System.out.print("+[ 0�� ]+ \t +["+stu2a.getKor()+"]+ \t +["+stu2a.getEng()+"]+ \t +["+stu2a.getMath()+"]+ \t +["+stu2a.getSum()+"]+ \t +["+stu2a.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		if(idx==1) {
			System.out.println("==================== �л� ����   =========================");
	        System.out.println("++[��ȣ]++\t++[�̸�]++\t++[����]++");
	        System.out.print("+[ 1�� ]+ \t +["+stu2b.getName()+"]+\t +["+stu2b.getAge()+"��]\r\n");
	        System.out.println();
			System.out.println("=========================  ��   ��   =========================");
			System.out.println("++[��ȣ]++\t++[����]++\t++[����]++\t++[����]++\t++[����]++\t++[���]++");
			System.out.print("+[ 1�� ]+ \t +["+stu2b.getKor()+"]+ \t +["+stu2b.getEng()+"]+ \t +["+stu2b.getMath()+"]+ \t +["+stu2b.getSum()+"]+ \t +["+stu2b.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		if(idx==2) {
			System.out.println("==================== �л� ����   =========================");
	        System.out.println("++[��ȣ]++\t++[�̸�]++\t++[����]++");
	        System.out.print("+[ 2�� ]+ \t +["+stu2c.getName()+"]+\t +["+stu2c.getAge()+"��]\r\n");
	        System.out.println();
			System.out.println("=========================  ��   ��   =========================");
			System.out.println("++[��ȣ]++\t++[����]++\t++[����]++\t++[����]++\t++[����]++\t++[���]++");
			System.out.print("+[ 2�� ]+ \t +["+stu2c.getKor()+"]+ \t +["+stu2c.getEng()+"]+ \t +["+stu2c.getMath()+"]+ \t +["+stu2c.getSum()+"]+ \t +["+stu2c.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		
		
		
	}
	
	//��ü ���//
	
	public void printStuAll() {
		
		System.out.println("==================== �л� ����   =========================");
        System.out.println("++[��ȣ]++\t++[�̸�]++\t++[����]++");
        System.out.print("+[ 0�� ]+ \t +["+stu2a.getName()+"]+\t +["+stu2a.getAge()+"��]\r\n");
        System.out.print("+[ 1�� ]+ \t +["+stu2b.getName()+"]+\t +["+stu2b.getAge()+"��]\r\n");
        System.out.print("+[ 2�� ]+ \t +["+stu2c.getName()+"]+\t +["+stu2c.getAge()+"��]\r\n");
        System.out.println();
		System.out.println("=========================  ��   ��   =========================");
		System.out.println("++[��ȣ]++\t++[����]++\t++[����]++\t++[����]++\t++[����]++\t++[���]++");
		System.out.print("+[ 0�� ]+ \t +["+stu2a.getKor()+"]+ \t +["+stu2a.getEng()+"]+ \t +["+stu2a.getMath()+"]+ \t +["+stu2a.getSum()+"]+ \t +["+stu2a.getAvg()+"]+\r\n");
		System.out.print("+[ 1�� ]+ \t +["+stu2b.getKor()+"]+ \t +["+stu2b.getEng()+"]+ \t +["+stu2b.getMath()+"]+ \t +["+stu2b.getSum()+"]+ \t +["+stu2b.getAvg()+"]+\r\n");
		System.out.print("+[ 2�� ]+ \t +["+stu2c.getKor()+"]+ \t +["+stu2c.getEng()+"]+ \t +["+stu2c.getMath()+"]+ \t +["+stu2c.getSum()+"]+ \t +["+stu2c.getAvg()+"]+\r\n");
        System.out.println("======================================================");
	
	}
	
	//��� �ε���//
	
	public void printStuIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		printStu(stuArr[getIdx()], getIdx());
	}
	
}
