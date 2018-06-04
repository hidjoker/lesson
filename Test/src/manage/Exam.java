package manage;

import overloading.StudentService;

public class Exam {

	public static void main(String[] args) {
		
		
		//ClassStudent를 관리하는 기능제공 클래스
		
		StudentService ss;
		
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();
		
		ss.printStu();

	}

}


