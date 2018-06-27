package component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentEx extends JFrame{
	
	public ComponentEx() {
		setBounds(100,100,100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch(e.getKeyCode()) {
				case KeyEvent.VK_0 :
					System.out.println("0����"); break;
				case KeyEvent.VK_1: jTextAreaEx(); break;
				case KeyEvent.VK_2: jTextFieldEx(); break;
				case KeyEvent.VK_3: jPasswordField();break;
				case KeyEvent.VK_4: jButtonEx(); break;
				case KeyEvent.VK_5: jCheckBoxEx(); break;
				case KeyEvent.VK_6: jRadioButtonEx(); break;
				case KeyEvent.VK_7: jListEx(); break;

			    }
		    }
			
	    });
		setVisible(true);
    }
	//VK_7
	private void jListEx() {
		String[] data = {"�Ŷ��","�����","��¡��«��","�նѲ�"};
		JList<String> list = new JList<>(data);
		
		
	}
	
	//VK_6
	private void jRadioButtonEx() {
		JRadioButton iceA = new JRadioButton("���̽� �Ƹ޸�ī��");
		JRadioButton wmJ = new JRadioButton("�����ֽ�");
		JRadioButton iceC = new JRadioButton("���̽� ����");
		
        iceA.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̽� �Ƹ޸�ī��");				
			}
		});
		wmJ.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�����ֽ�");
			}
		});
		iceC.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���̽� ����");
			}
		});

		JPanel panel = new JPanel();
		panel.add(iceA);
		panel.add(wmJ);
		panel.add(iceC);
		newJFrame(panel);
		
	}
	
	
	
	//VK_5
	private void jCheckBoxEx() {
		JCheckBox iceA = new JCheckBox("���̽� �Ƹ޸�ī��");
		JCheckBox wmJ = new JCheckBox("�����ֽ�");
		JCheckBox iceC = new JCheckBox("���̽� ����");
		
        iceA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���̽� �Ƹ޸�ī��");				
			}
		});
		wmJ.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("�����ֽ�");
			}
		});
		iceC.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				System.out.println("���̽� ����");
			}
		});
		
		
		iceA.setSelected(false);
		wmJ.setSelected(false);
		iceC.setSelected(false);
		JPanel panel = new JPanel();
		panel.add(iceA);
		panel.add(wmJ);
		panel.add(iceC);
		newJFrame(panel);
		

		
	}
	
	//VK_1	
	private void jTextAreaEx() {
		JTextArea txtArea = new JTextArea();
		txtArea.setColumns(10); //�ʺ� ����
		txtArea.setRows(20); //���� ����
		
		txtArea.setLineWrap(true); //�ڵ� ����
		
		txtArea.setEditable(false); //�������ɿ��� ����
		txtArea.setText("�ȳ��ϼ���");
		String str = txtArea.getText();
		System.out.println(str);
		
		newJFrame(txtArea);
		
	}
	
	//VK_3
	private void jPasswordField() {
		JPasswordField pass = new JPasswordField("TEST",20);
		
//		System.out.println(pass.getText()); //deprecated ���� �����ϴ� �޼ҵ�
		System.out.println(pass.getPassword());
		
		newJFrame(pass);
		
	}
	
	//VK_4
	private void jButtonEx() {
		JButton btn = new JButton("��ư");
		btn.setToolTipText("�����մϴ�");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button Clicked!!");
			}
		});
		
		btn.setPreferredSize(new Dimension(300, 400));
		
		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick();
		btn.doClick();
		
		newJFrame(btn);
	}
	
	
	private void newJFrame(JComponent c) {
		JFrame frame = new JFrame("������Ʈ �׽�Ʈ");
		frame.setBounds(200, 150, 500, 500);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("./src/component/mi.jpg");
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				
				g.drawImage(img.getImage(), 0, 0, getSize().width, getSize().height, null);
				
				setOpaque(false);
				
				super.paintComponent(g);
			}
		};
		
//		JPanel pane = new JPanel();
//		pane.add(c);	
//		frame.getContentPane().add(pane);
		
		panel.add(c);
		frame.getContentPane().add(panel);
		frame.setVisible(true);
	}

	//VK_2
	private void jTextFieldEx() {
		JTextField txt = new JTextField();
		
		txt.setColumns(20); //�ʺ� ����
		
		//------Placeholder--------
		
		txt.setText("ID�� �Է��ϼ��� :)");
		txt.setForeground(Color.GRAY);
		txt.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				// JTextField���� ��Ŀ���� ������ Placeholder
				if(txt.getText().isEmpty()) {
				txt.setText("ID�� �Է��ϼ��� :)");
				txt.setForeground(Color.GRAY);
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				//JTextField�� ��Ŀ���� �Ѿ�� �ؽ�Ʈ �����
				if(txt.getText().equals("ID�� �Է��ϼ��� :)")) {
				txt.setText("");
				txt.setForeground(Color.black);
				}
			}
		});
		//------------------------------
		JPanel pane = new JPanel();
		pane.add(txt);
		
		JButton btn = new JButton("���Ϥ�");
		pane.add(btn);
		
//		newJFrame(txt);
		newJFrame(pane);
		
		// ȭ���� ����  newJFrame() �޼ҵ� ���Ŀ� ȣ���ؾ� ��
		btn.requestFocus(); // ��ư�� ��Ŀ�� ȹ���ϰ� ����

		
	}

	public static void main(String[] args) {
		new ComponentEx();
	}
	
}
