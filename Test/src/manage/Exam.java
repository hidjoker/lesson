package manage;

import overloading.StudentService;

public class Exam {

	public static void main(String[] args) {
		
		StudentService ss;
		
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();
		
		ss.printStu();

	}

}


