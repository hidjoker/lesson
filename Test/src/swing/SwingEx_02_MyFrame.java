package swing;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class SwingEx_02_MyFrame extends JFrame{

	private SwingEx_02_MyFrame() {
		// 제목표시줄 설정
		setTitle("GUI Program");
		
		setLocation(100, 100); //위치 설정
		setSize(500, 500); //크기 설정
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //닫기 설정
		
		setLayout(new GridLayout(2,2)); //배치관리자 설정
		
		initFrame(); //컴포넌트 설정
		initEvent(); //이벤트 설정
		
		setVisible(true); //보이기 설정
		
	}
		
	private void initEvent() {
		
		
	}

	private void initFrame() {
		
		
	}

	public static void main(String[] args) {
		new SwingEx_02_MyFrame(); //프레임 생성
		
	}
}
