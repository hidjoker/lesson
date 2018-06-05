package overloading;

import java.util.Scanner;

public class StudentService_ver2 {
    
	//멤버 필드//
	
	Scanner sc;
	
	private int idx;
	private ClassStudent_ver2[] stuArr;

	
	
	//생성자 //
	
	public StudentService_ver2() {
		for(int i=0; i<stuArr.length ; i++) {
			stuArr[i] = new ClassStudent_ver2();
		}
		sc=new Scanner(System.in);
	}
	
	//인덱스 getter//
	
	public int getIdx() {
		return this.idx;	
	}
	
	//학생 인적 선택 입력//
	
	private void insertInfo(ClassStudent_ver2 stu,int idx) {
		   System.out.print(idx+"번째 학생 이름 : ");
		   stu.setName(sc.nextLine());
		   System.out.println(idx+"번째 학생 나이 : ");
		   stu.setAge(sc.nextInt());
		   sc.skip("\r\n");	   
	}
	
	//학생 인적 전체 입력//
	
	public void insertInfoAll() {	
		System.out.println(" + + 학생 정보 입력 + +");
		for(int i=0 ; i<stuArr.length ; i++) {
			   System.out.print(idx+"번째 학생 이름 : ");
			   stuArr[i].setName(sc.nextLine());
			   System.out.println(idx+"번째 학생 나이 : ");
			   stuArr[i].setAge(sc.nextInt());
			   sc.skip("\r\n");	   
			}
	}
	
	//인적 인덱스 입력//
	
	public void insertInfoIdx() {
		System.out.println(" + + 학생 정보 선택 입력 + + ");
		System.out.print("Input Index : ");
		this.idx=sc.nextInt()+1;
		sc.skip("\r\n");
		insertInfo(stuArr[idx-1],idx);		
	}
	
	
	//학생 점수 선택 입력 //
	
	private void insertScore(ClassStudent_ver2 stu,int idx) {
		
		System.out.print(idx+"번째 학생의 국어 점수 : ");
		stu.setKor(sc.nextInt());
		System.out.print(idx+"번째 학생의 영어 점수 : ");
		stu.setEng(sc.nextInt());
		System.out.print(idx+"번째 학생의 수학 점수 : ");
		stu.setMath(sc.nextInt());
		this.calcSum(stuArr[idx-1]);
		this.calcAvg(stuArr[idx-1]);
		sc.skip("\r\n");
		
	}
	
	//학생 점수 전체 입력//
	
	public void insertScoreAll() {
		for(int i=0 ; i<stuArr.length ; i++) {
			System.out.print((i+1)+"번째 학생의 국어 점수 : ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print((i+2)+"번째 학생의 영어 점수 : ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print((i+3)+"번째 학생의 수학 점수 : ");
			stuArr[i].setMath(sc.nextInt());
			this.calcSum(stuArr[i]);
			this.calcAvg(stuArr[i]);
			sc.skip("\r\n");
		}

	}
	// 학생 성적 인덱스 입력//
	
	public void insertScoreIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		insertScore(stuArr[idx-1], getIdx());
	}
	

	
	//학생 인적+성적 전체 입력//
	public void insertStuAll() {
		System.out.println(" + + 학생 정보 입력 + +");
		for(int i=0 ; i<stuArr.length ; i++) {
			   System.out.print(idx+"번째 학생 이름 : ");
			   stuArr[i].setName(sc.nextLine());
			   System.out.println(idx+"번째 학생 나이 : ");
			   stuArr[i].setAge(sc.nextInt());
			   sc.skip("\r\n");	   
			}
		for(int i=0 ; i<stuArr.length ; i++) {
			System.out.print((i+1)+"번째 학생의 국어 점수 : ");
			stuArr[i].setKor(sc.nextInt());
			System.out.print((i+2)+"번째 학생의 영어 점수 : ");
			stuArr[i].setEng(sc.nextInt());
			System.out.print((i+3)+"번째 학생의 수학 점수 : ");
			stuArr[i].setMath(sc.nextInt());
			this.calcSum(stuArr[i]);
			this.calcAvg(stuArr[i]);
			sc.skip("\r\n");
	  }
	}
	
	//학생 인적+성적 선택 입력//
	public void insertStu(int idx) {
		if(idx==0) {
		System.out.print("[0번]Input name : ");
		stu2a.setName(sc.nextLine());
		System.out.print("[0번]Input age : ");
		stu2a.setAge(sc.nextInt());
		sc.skip("\r\n");
		stuArr[0]=stu2a.getName();
		System.out.print("[0번]국어 점수 : ");
		stu2a.setKor(sc.nextInt());
		System.out.print("[0번]영어 점수 : ");
		stu2a.setEng(sc.nextInt());
		System.out.print("[0번]수학 점수 : ");
		stu2a.setMath(sc.nextInt());
		this.calcSum(stuArr[0]);
		this.calcAvg(stuArr[0]);
		}
		if(idx==1) {
		System.out.print("[1번]Input name : ");
		stu2b.setName(sc.nextLine());
		System.out.print("[1번]Input age : ");
		stu2b.setAge(sc.nextInt());
		stuArr[1]=stu2b.getName();
		sc.skip("\r\n");
		System.out.print("[1번]국어 점수 : ");
		stu2b.setKor(sc.nextInt());
		System.out.print("[1번]영어 점수 : ");
		stu2b.setEng(sc.nextInt());
		System.out.print("[1번]수학 점수 : ");
		stu2b.setMath(sc.nextInt());
		this.calcSum(stuArr[1]);
		this.calcAvg(stuArr[1]);
		}
		if(idx==2) {
		System.out.print("[2번]Input name : ");
		stu2c.setName(sc.nextLine());
		System.out.print("[2번]Input age : ");
		stu2c.setAge(sc.nextInt());
		stuArr[2]=stu2c.getName();
		sc.skip("\r\n");	
		System.out.print("[2번]국어 점수 : ");
		stu2c.setKor(sc.nextInt());
		System.out.print("[2번]영어 점수 : ");
		stu2c.setEng(sc.nextInt());
		System.out.print("[2번]수학 점수 : ");
		stu2c.setMath(sc.nextInt());		
		this.calcSum(stuArr[2]);
		this.calcAvg(stuArr[2]);
		sc.skip("\r\n");		
		}
	}
	
	
	
	//학생 인적+성적 선택 입력 인덱스 //
		
	public void insertStuIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		insertStu(getIdx());
	}
	
	//총점계산//
	
	public void calcSum(ClassStudent_ver2 stu) {
		stu.setSum(stu.getKor()+stu.getEng()+stu.getMath());
	}
	
	
	//평균계산//
	
	public void calcAvg(ClassStudent_ver2 stu) {
		stu.setAvg(Math.round((stu.getKor()+stu.getEng()+stu.getMath())*100/(double)3)/(double)100);
	}
	
	//선택 출력//
	

	private void printStu(String name, int idx) {
		if(idx==0) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++\t++[이름]++\t++[나이]++");
	        System.out.print("+[ 0번 ]+ \t +["+stu2a.getName()+"]+\t +["+stu2a.getAge()+"세]\r\n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++\t++[국어]++\t++[영어]++\t++[수학]++\t++[총점]++\t++[평균]++");
			System.out.print("+[ 0번 ]+ \t +["+stu2a.getKor()+"]+ \t +["+stu2a.getEng()+"]+ \t +["+stu2a.getMath()+"]+ \t +["+stu2a.getSum()+"]+ \t +["+stu2a.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		if(idx==1) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++\t++[이름]++\t++[나이]++");
	        System.out.print("+[ 1번 ]+ \t +["+stu2b.getName()+"]+\t +["+stu2b.getAge()+"세]\r\n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++\t++[국어]++\t++[영어]++\t++[수학]++\t++[총점]++\t++[평균]++");
			System.out.print("+[ 1번 ]+ \t +["+stu2b.getKor()+"]+ \t +["+stu2b.getEng()+"]+ \t +["+stu2b.getMath()+"]+ \t +["+stu2b.getSum()+"]+ \t +["+stu2b.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		if(idx==2) {
			System.out.println("==================== 학생 정보   =========================");
	        System.out.println("++[번호]++\t++[이름]++\t++[나이]++");
	        System.out.print("+[ 2번 ]+ \t +["+stu2c.getName()+"]+\t +["+stu2c.getAge()+"세]\r\n");
	        System.out.println();
			System.out.println("=========================  성   적   =========================");
			System.out.println("++[번호]++\t++[국어]++\t++[영어]++\t++[수학]++\t++[총점]++\t++[평균]++");
			System.out.print("+[ 2번 ]+ \t +["+stu2c.getKor()+"]+ \t +["+stu2c.getEng()+"]+ \t +["+stu2c.getMath()+"]+ \t +["+stu2c.getSum()+"]+ \t +["+stu2c.getAvg()+"]+\r\n");
	        System.out.println("======================================================");

		}
		
		
		
	}
	
	//전체 출력//
	
	public void printStuAll() {
		
		System.out.println("==================== 학생 정보   =========================");
        System.out.println("++[번호]++\t++[이름]++\t++[나이]++");
        System.out.print("+[ 0번 ]+ \t +["+stu2a.getName()+"]+\t +["+stu2a.getAge()+"세]\r\n");
        System.out.print("+[ 1번 ]+ \t +["+stu2b.getName()+"]+\t +["+stu2b.getAge()+"세]\r\n");
        System.out.print("+[ 2번 ]+ \t +["+stu2c.getName()+"]+\t +["+stu2c.getAge()+"세]\r\n");
        System.out.println();
		System.out.println("=========================  성   적   =========================");
		System.out.println("++[번호]++\t++[국어]++\t++[영어]++\t++[수학]++\t++[총점]++\t++[평균]++");
		System.out.print("+[ 0번 ]+ \t +["+stu2a.getKor()+"]+ \t +["+stu2a.getEng()+"]+ \t +["+stu2a.getMath()+"]+ \t +["+stu2a.getSum()+"]+ \t +["+stu2a.getAvg()+"]+\r\n");
		System.out.print("+[ 1번 ]+ \t +["+stu2b.getKor()+"]+ \t +["+stu2b.getEng()+"]+ \t +["+stu2b.getMath()+"]+ \t +["+stu2b.getSum()+"]+ \t +["+stu2b.getAvg()+"]+\r\n");
		System.out.print("+[ 2번 ]+ \t +["+stu2c.getKor()+"]+ \t +["+stu2c.getEng()+"]+ \t +["+stu2c.getMath()+"]+ \t +["+stu2c.getSum()+"]+ \t +["+stu2c.getAvg()+"]+\r\n");
        System.out.println("======================================================");
	
	}
	
	//출력 인덱스//
	
	public void printStuIdx() {
		System.out.print("Input Index : ");
		this.idx=sc.nextInt();	
		sc.skip("\r\n");
		printStu(stuArr[getIdx()], getIdx());
	}
	
}
