package manage;

import overloading.StudentService;

public class Exam {

	public static void main(String[] args) {
		
		
		//ClassStudent�� �����ϴ� ������� Ŭ����
		
		StudentService ss;
		
		ss = new StudentService();
		
		ss.insertInfo();
		
		ss.insertScore();
		
		ss.printStu();

	}

}


