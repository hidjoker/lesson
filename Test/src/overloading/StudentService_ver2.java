package overloading;

import java.util.Scanner;

public class StudentService_ver2 {
    
	//멤버 필드//
	
	Scanner sc;
	
	ClassStudent_ver2 stu2;
	
	int idx;

	private String[] stuArr;
	private int[] ageArr;
	
	
	//생성자 //
	
	public StudentService_ver2() {
		
		stu2 = new ClassStudent_ver2();
	
		sc=new Scanner(System.in);
		
		stuArr = new String[3];
		ageArr = new int[3];
	}
	
	//학생 정보 입력//
	
	private int getIdx() {
		System.out.print("Input Index : ");
		return sc.nextInt();
	}
	
	private void insertInfo(String[] arr, int index) {
		int[] arr2;
		
		arr = stuArr;
		arr2 = ageArr;
		System.out.print("Input Name : ");
		arr[index]=sc.nextLine();
		System.out.print("Input Age : ");
		arr2[index]=sc.nextInt();	
	}
	
	public void insertinfoAll() {
	  
		
		
	}
	}
	
}
