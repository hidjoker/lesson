package overloading;

import java.util.Scanner;

public class StudentService_ver2 {
    
	//멤버 필드//
	
	Scanner sc;
	
	ClassStudent_ver2 stu2a;
	ClassStudent_ver2 stu2b;
	ClassStudent_ver2 stu2c;
	
	private int idx;
	private String[] stuArr;

	
	
	//생성자 //
	
	public StudentService_ver2() {
		
		stu2a = new ClassStudent_ver2();
		stu2b = new ClassStudent_ver2();
		stu2c = new ClassStudent_ver2();
	
		sc=new Scanner(System.in);
		
		stuArr = new String[3];
	}
	
	//인덱스 getter//
	
	private int getIdx() {
		return this.idx;	
	}
	
	//학생 인적 선택 입력//
	
	private void insertInfo(String stuArr[],int index) {
			
		if(idx==0) {
		System.out.print("["+idx+"번]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("["+idx+"번]Input age : ");
		stu2a.setAge(sc.nextInt());
		stuArr[idx]=stu2a.getName();
		sc.skip("/r/n");
		}
		
		if(idx==1) {
			System.out.print("["+idx+"번]Input name : ");
			stu2b.setName(sc.nextLine());
			System.out.print("["+idx+"번]Input age : ");
			stu2b.setAge(sc.nextInt());
			stuArr[idx]=stu2b.getName();
			sc.skip("/r/n");
		}
		
		if(idx==2) {
			System.out.print("["+idx+"번]Input name : ");
			stu2c.setName(sc.nextLine());
			System.out.print("["+idx+"번]Input age : ");
			stu2c.setAge(sc.nextInt());
			stuArr[idx]=stu2c.getName();
			sc.skip("/r/n");
		}
	}
	
	//학생 인적 전체 입력//
	
	public void insertInfoAll() {		
		System.out.print("[0번]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("[0번]Input age : ");
		stu2a.setAge(sc.nextInt());
		sc.skip("/r/n");
		stuArr[0]=stu2a.getName();
		System.out.print("[1번]Input name : ");
		stu2b.setName(sc.nextLine());
		System.out.print("[1번]Input age : ");
		stu2b.setAge(sc.nextInt());
		sc.skip("/r/n");
		stuArr[1]=stu2b.getName();
		System.out.print("[2번]Input name : ");
		stu2c.setName(sc.nextLine());
		System.out.print("[2번]Input age : ");
		stu2c.setAge(sc.nextInt());
		stuArr[2]=stu2c.getName();
		sc.skip("/r/n");
	}
	
	//인적 인덱스 입력//
	
	public void insertInfoIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();
		sc.skip("/r/n");
	}
	
	
	//학생 점수 선택 입력 //
	
	private void insertScore(String stuArr[],int idx) {
		
		if(idx==0) {
		System.out.print("[0번]국어 점수 : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0번]영어 점수 : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0번]수학 점수 : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		sc.skip("/r/n");
		}
		if(idx==1) {
			System.out.print("[1번]국어 점수 : ");
			stu2b.setKor(sc.nextInt());
			System.out.print("[1번]영어 점수 : ");
			stu2b.setEng(sc.nextInt());
			System.out.print("[1번]수학 점수 : ");
			stu2b.setMath(sc.nextInt());
			this.calcSum(stuArr[1]);
			this.calcAvg(stuArr[1]);
			sc.skip("/r/n");
		}
		if(idx==2) {
			System.out.print("[2번]국어 점수 : ");
			stu2b.setKor(sc.nextInt());
			System.out.print("[2번]영어 점수 : ");
			stu2b.setEng(sc.nextInt());
			System.out.print("[2번]수학 점수 : ");
			stu2b.setMath(sc.nextInt());
			this.calcSum(stuArr[2]);
			this.calcAvg(stuArr[2]);
			sc.skip("/r/n");

		}
			
	}
	
	//학생 점수 전체 입력//
	
	public void insertScoreAll() {
		System.out.print("[0번]국어 점수 : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0번]영어 점수 : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0번]수학 점수 : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		System.out.print("[1번]국어 점수 : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[1번]영어 점수 : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[1번]수학 점수 : ");
		stu2b.setMath(sc.nextInt());
		this.calcSum(stuArr[1]);
		this.calcAvg(stuArr[1]);
		System.out.print("[2번]국어 점수 : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[2번]영어 점수 : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[2번]수학 점수 : ");
		stu2b.setMath(sc.nextInt());		
		this.calcSum(stuArr[2]);
		this.calcAvg(stuArr[2]);
		sc.skip("/r/n");

	}
	// 학생 성적 인덱스 입력//
	
	public void insertScoreIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("/r/n");
	}
	
	//학생 배열 입력//
	public void insertStu(int idx) {
		if(idx==0) {
			stuArr[0]=stu2a.getName();
		}
		if(idx==1) {
			stuArr[1]=stu2b.getName();
		}
		if(idx==2) {
			stuArr[2]=stu2c.getName();
		}
	}
	
	//학생 배열 전체 입력//
	public void insertStuAll() {
		stuArr[0]=stu2a.getName();
		stuArr[1]=stu2b.getName();
		stuArr[2]=stu2c.getName();	
	}
	
	
	//총점계산//
	
	public void calcSum(String name) {
		if(name==stuArr[0])
		stu2a.setSum(stu2a.getKor()+stu2a.getEng()+stu2a.getMath());
		if(name==stuArr[1])
		stu2b.setSum(stu2b.getKor()+stu2b.getEng()+stu2b.getMath());
		if(name==stuArr[2])
		stu2c.setSum(stu2c.getKor()+stu2c.getEng()+stu2c.getMath());
	}
	
	
	//평균계산//
	
	public void calcAvg(String name) {
		if(name==stuArr[0])
		stu2a.setAvg((stu2a.getKor()+stu2a.getEng()+stu2a.getMath())/3);
		if(name==stuArr[1])
		stu2b.setAvg((stu2b.getKor()+stu2b.getEng()+stu2b.getMath())/3);		
		if(name==stuArr[2])
		stu2c.setAvg((stu2c.getKor()+stu2c.getEng()+stu2c.getMath())/3);
	}
	
	//선택 출력//
	

	private void printStu(String name, int idx) {
		if(idx==0) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++/t++[이름]++/t++[나이]++");
	        System.out.print("+[ 0번 ]+/t"+"+["+stu2a.getName()+"]+/t+["+stu2a.getAge()+"/r/n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++/t++[국어]++/t++[영어]++/t++[수학]++/t++[총점]++/t++[평균]++");
			System.out.print("+[ 0번 ]+/t"+" +["+stu2a.getKor()+"]+ /t +["+stu2a.getEng()+"]+ /t +["+stu2a.getMath()+"]+ /t +["+stu2a.getSum()+"]+ /t +["+stu2a.getAvg()+"]+/r/n");
	        System.out.println("======================================================");

		}
		if(idx==1) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++/t++[이름]++/t++[나이]++");
	        System.out.print("+[ 1번 ]+/t"+"+["+stu2b.getName()+"]+/t+["+stu2b.getAge()+"/r/n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++/t++[국어]++/t++[영어]++/t++[수학]++/t++[총점]++/t++[평균]++");
			System.out.print("+[ 1번 ]+/t"+" +["+stu2b.getKor()+"]+ /t +["+stu2b.getEng()+"]+ /t +["+stu2b.getMath()+"]+ /t +["+stu2b.getSum()+"]+ /t +["+stu2b.getAvg()+"]+/r/n");
	        System.out.println("======================================================");

		}
		if(idx==2) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++/t++[이름]++/t++[나이]++");
	        System.out.print("+[ 2번 ]+/t"+"+["+stu2c.getName()+"]+/t+["+stu2c.getAge()+"/r/n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++/t++[국어]++/t++[영어]++/t++[수학]++/t++[총점]++/t++[평균]++");
			System.out.print("+[ 2번 ]+/t"+" +["+stu2b.getKor()+"]+ /t +["+stu2c.getEng()+"]+ /t +["+stu2c.getMath()+"]+ /t +["+stu2c.getSum()+"]+ /t +["+stu2c.getAvg()+"]+/r/n");
	        System.out.println("======================================================");

		}
		
		
		
	}
	
	//전체 출력//
	
	public void printStuAll() {
		
		System.out.println("==================== 학생 정보   =========================");
        System.out.println("++[번호]++/t++[이름]++/t++[나이]++");
        System.out.print("+[ 0번 ]+/t"+"+["+stu2a.getName()+"]+/t+["+stu2a.getAge()+"/r/n");
        System.out.print("+[ 1번 ]+/t"+"+["+stu2b.getName()+"]+/t+["+stu2b.getAge()+"/r/n");
        System.out.print("+[ 2번 ]+/t"+"+["+stu2c.getName()+"]+/t+["+stu2c.getAge()+"/r/n");
        System.out.println();
		System.out.println("=========================  성   적   =========================");
		System.out.println("++[번호]++/t++[국어]++/t++[영어]++/t++[수학]++/t++[총점]++/t++[평균]++");
		System.out.print("+[ 0번 ]+/t"+" +["+stu2a.getKor()+"]+ /t +["+stu2a.getEng()+"]+ /t +["+stu2a.getMath()+"]+ /t +["+stu2a.getSum()+"]+ /t +["+stu2a.getAvg()+"]+/r/n");
		System.out.print("+[ 1번 ]+/t"+" +["+stu2b.getKor()+"]+ /t +["+stu2b.getEng()+"]+ /t +["+stu2b.getMath()+"]+ /t +["+stu2b.getSum()+"]+ /t +["+stu2b.getAvg()+"]+/r/n");
		System.out.print("+[ 2번 ]+/t"+" +["+stu2b.getKor()+"]+ /t +["+stu2c.getEng()+"]+ /t +["+stu2c.getMath()+"]+ /t +["+stu2c.getSum()+"]+ /t +["+stu2c.getAvg()+"]+/r/n");
        System.out.println("======================================================");
	
	}
	
	//출력 인덱스//
	
	public void printStuIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("/r/n");
	}
}
