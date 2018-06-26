package swing;

import javax.swing.JFrame;


// + ����, Swing
//  - AWT�� �̿��Ͽ� �ۼ��� �ڹ��� GUI ���̺귯��
//  - AWT�� ��� ����� ������ �ִ�
//  - ��κ��� ���� Ŭ������ �տ� J�� �پ��ִ�
//      ex)  AWT         ->      Swing
//           Component ->   JComponent
//           Frame        ->     JFrame
//           Button       ->     JButon
//           Label         ->     JLabel
//  - javax.swing ��Ű���� ����
//  - ������ �ֻ��� Ŭ���� : JComponent
          



public class SwingEx_01_Basic {

	public static void main(String[] args) {
		
		//������ ����
		JFrame frame = new JFrame("����GUI");
		
//		 + �⺻ �����̳�(���� ������)�� �����ϴ� ���
//		  1. JFrame ��ü�� �����ؼ� ������ ����
//		     JFrame jfr = new JFrame();
//		     jfr.setVisible(true);
//
//		  2. JFrame Ŭ������ ��ӹ޾Ƽ� ������ ����
//		     public class MyFrame extends JFrame{        
//		       public MyFrame() {
//		          setvisible(true);
//		       }
//		    }

		
		//������ ��ġ�� ũ�� ����
		frame.setLocation(100, 100);
		frame.setSize(500, 500);
		
		//������ ���̱� ����
		frame.setVisible(true);
		
		//������ closing �̺�Ʈ ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//EXIT_ON_CLOSE : ���α׷� ����
		//DISPOSE_ON_CLOSE : ������ ����(������ ������� ���α׷� ����)
		//HIDE_ON_CLOSE : �������� �ʰ� �ݱ�
		//DO_NOTHING_ON_CLOSE : �ƹ��͵� ���ϱ�
		
		
		
	}
}
