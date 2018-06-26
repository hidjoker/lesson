package awt;

// + GUI , Graphic User Interface
// <��> CLI , Command Line Interface
//
// + �ڹ��� GUI 
//  - JDK API�� ���ԵǾ�����
//  - AWT
//  - Swing
//  - JavaFX
//
// + �ڹ� GUI ���α׷��� �������
// 1. �����̳�, Container
//     ������(â, window) ������ �ϴ� ���
//     ���α׷��� ���� ��ҵ��� �ö󰡴� ��
//     ex) Frame, Window, Panel, Dialog, Applet
// 2. ������Ʈ, Component
//     �����̳� ���� �÷����� ȭ�� ���� ���
//     ex)Button, TextField, Label, List, CheckBox ���
// 3. ��ġ������, LayoutManager
//     �����̳ʿ� ������Ʈ�� ��ġ�� ũ��� ��ġ�� �����ϴ� ���
//     ex) BoarderLayout, GridLayout, FlowLayout, CardLayout ���
// 4. �̺�Ʈ, Event
//     ������� ����(�Է�)�� ���� ������ �����ϴ� ���
//     (�ַ� ������Ʈ�� ����) 



import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// + AWT, Abstract Window Toolkit
// - �߻� ������(â) ���ߵ���
// - java.awt ��Ű���� ����
// - �ü���� ������ �ִ� GUI(�׷���) ǥ������ ����Ѵ�
// - �ü���� ���� ���(�׸�)�� �ٲ��
// - �ܼ��� �ü���� ���α׷��� ����ִ� GUI ���̺귯���̴�


public class AwtEx {
	
	// �����̳� Frame
	private Frame fr;
	
	// ������Ʈ Button
	private Button btn1;
	private Button btn2;
	
	// ������Ʈ Label
	private Label lbl;

	
	private AwtEx() {
		
		// ------ ������ ���� --------
		fr = new Frame("myFrame"); // ������ Ÿ��Ʋ ����
		fr.setVisible(true);  // ������ ���̱� ����
		//------------------------
		
		//------- ������ ���� --------
		fr.setLayout(new GridLayout(3,1)); // ��ġ������ ����
		fr.setLocation(100, 100); // ������ ��ġ
		fr.setSize(500, 500);  // ������ ũ��
		//------------------------
		
		//------- �������̺�Ʈ ����------
		windowEvent();
		//-------------------------
		
		//-------- ������Ʈ ���� -------
		showLabel();
		showButton();
		//-------------------------
		
			
			
	}
	
	//������ �̺�Ʈ ���
	
	private void showButton() {
		// ��ư ����
		btn1 = new Button("�ȳ��ϼ���");
		btn2 = new Button();
		btn2.setLabel("�ݰ�����");
		
		// ��ư �̺�Ʈ �߰�
		buttonEvent();
		
		// �����ӿ� ��ư �߰�
		fr.add(btn1);
		fr.add(btn2);
		
	}

	private void buttonEvent() {
		
		//��ư1�� �̺�Ʈ ������ ���
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(e);
				lbl.setText("��ư1�� �۵���(����)");
			}
		});
		
		//��ư2�� �̺�Ʈ ������ ���
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lbl.setText("��ư2 �۵�!!");
			}
		});
	}

	
	
	private void showLabel() {
		lbl = new Label(); //���̺� ����
		lbl.setText("���̺��Դϴ�"); //���̺��ؽ�Ʈ ����
		
		lbl.setAlignment(Label.CENTER); //���̺� ��� ����
		lbl.setBackground(Color.GRAY); //���� ȸ��
		
		fr.add(lbl); //�����ӿ� ���̺� �߰�
	}

	private void windowEvent() {
		
		//------ ������ �̺�Ʈ ��� ------------------------------------
				WindowListener l; //WindowListener interface
				
				//WindowListener���� Ŭ���� windowAdapter ��ü
				l = new WindowAdapter() { 
					
					@Override
					public void windowClosing(WindowEvent e) {
						System.out.println(e);
						System.exit(0); //�������� �Ű����� 0
					}
					
				};
				
				fr.addWindowListener(l);//������ �߰� �޼ҵ�
				
//				fr.addWindowListener(new WindowAdapter() {
//					
//					@Override
//					public void windowClosing(WindowEvent e) {
//					
//						
//					}
//					
//				}); // �͸�ü �����Ͽ� �Ű������� �ٷ� �ֱ�
		
		//---------------------------------------------------------------
		
		
	}
	
	public static void main(String[] args) {
		
		new AwtEx();
		
		
		
		
	}
	
	
}
