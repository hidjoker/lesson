package overloading;

import java.util.Scanner;

public class StudentService_ver2 {
    
	//��� �ʵ�//
	
	Scanner sc;
	
	private int idx;
	private ClassStudent_ver2[] stuArr;

	
	
	//������ //
	
	public StudentService_ver2() {
		for(int i=0; i<stuArr.length ; i++) {
			stuArr[i] = new ClassStudent_ver2();
		}
		sc=new Scanner(System.in);
	}
	
	//�ε��� getter//
	
	public int getIdx() {
		return this.idx;	
	}
	
	//�л� ���� ���� �Է�//
	
	private void insertInfo(ClassStudent_ver2 stu,int idx) {
		   System.out.print(idx+"��° �л� �̸� : ");
		   stu.setName(sc.nextLine());
		   System.out.println(idx+"��° �л� ���� : ");
		   stu.setAge(sc.nextInt());
		   sc.skip("\r\n");	   
	}
	
	//�л� ���� ��ü �Է�//
	
	public void insertInfoAll() {	
		System.out.println(" + + �л� ���� �Է� + +");
		for(int i=0 ; i<stuArr.length ; i++) {
			   System.out.print(idx+"��° �л� �̸� : ");
			   stuArr[i].setName(sc.nextLine());
			   System.out.println(idx+"��° �л� ���� : ");
			   stuArr[i].setAge(sc.nextInt());
			   sc.skip("\r\n");	   
			}
	}
	
	//���� �ε��� �Է�//
	
	public void insertInfoIdx() {
		System.out.println(" + + �л� ���� ���� �Է� + + ");
		System.out.print("Input Index : ");
		this.idx=sc.nextInt()+1;
		sc.skip("\r\n");
		insertInfo(stuArr[idx-1],idx);		
	}
	
	
	//�л� ���� ���� �Է� //
	
	private void insertScore(ClassStudent_ver2 stu,int idx) {
		
		System.out.print(idx+"��° �л��� ���� ���� : ");
		stu.setKor(sc.nextInt());
		System.out.print(idx+"��° �л��� ���� ���� : ");
		stu.setEng(sc.nextInt());
		System.out.print(idx+"��° �л��� ���� ���� : ");
		stu.setMath(sc.nextInt());
		this.calcSum(stuArr[idx-1]);
		this.calcAvg(stuArr[idx-1]);
		sc.skip("\r\n");
		
	}
	
	//�л� ���� ��ü �Է�//
	
	public void insertScoreAll() {
		for(int i=0 ; i<stuArr.length ; i++) {
			System.out.print((i+1)+"��° �л��� ���� ���� : ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print((i+2)+"��° �л��� ���� ���� : ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print((i+3)+"��° �л��� ���� ���� : ");
			stuArr[i].setMath(sc.nextInt());
			this.calcSum(stuArr[i]);
			this.calcAvg(stuArr[i]);
			sc.skip("\r\n");
		}

	}
	// �л� ���� �ε��� �Է�//
	
	public void insertScoreIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		insertScore(stuArr[idx-1], getIdx());
	}
	

	
	//�л� ����+���� ��ü �Է�//
	public void insertStuAll() {
		System.out.println(" + + �л� ���� �Է� + +");
		for(int i=0 ; i<stuArr.length ; i++) {
			   System.out.print(idx+"��° �л� �̸� : ");
			   stuArr[i].setName(sc.nextLine());
			   System.out.println(idx+"��° �л� ���� : ");
			   stuArr[i].setAge(sc.nextInt());
			   sc.skip("\r\n");	   
			}
		for(int i=0 ; i<stuArr.length ; i++) {
			System.out.print((i+1)+"��° �л��� ���� ���� : ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print((i+2)+"��° �л��� ���� ���� : ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print((i+3)+"��° �л��� ���� ���� : ");
			stuArr[i].setMath(sc.nextInt());
			this.calcSum(stuArr[i]);
			this.calcAvg(stuArr[i]);
			sc.skip("\r\n");
	  }
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
	
	public void calcSum(ClassStudent_ver2 stu) {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}
	
	
	//��հ��//
	
	public void calcAvg(ClassStudent_ver2 stu) {
		stu.setAvg(Math.round((stu.getKor()+stu.getEng()+stu.getMath())*100/(double)3)/(double)100);
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
