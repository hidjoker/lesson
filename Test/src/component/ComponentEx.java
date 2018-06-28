package component;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class ComponentEx extends JFrame{
	
	public ComponentEx() {
		setBounds(100,100,100,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
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
				case KeyEvent.VK_8: jComboBoxEx(); break;
			    }
		    }
			
	    });
		setVisible(true);
    }
	
	
	private void newJFrame(JComponent c) {
		JFrame frame = new JFrame("������Ʈ �׽�Ʈ");
		frame.setBounds(200, 150, 500, 500);
		frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("./src/component/mi.jpg");
		JPanel panel = new JPanel() { 
			//�͸�ü ������ ���ÿ� �ڵ����� �żҵ� ȣ��
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

	
	//VK_8
	private void jComboBoxEx() {
		
		String[] data = {"�Ŷ��", "�����", "��¡��«��", "�նѲ�"};
		JComboBox<String> combo = new JComboBox<>(data);
		
		JTextField txt = new JTextField();
		txt.setColumns(20);
		txt.setEditable(true);
		txt.setBackground(Color.white);
		txt.setForeground(Color.BLACK);


		
		
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(combo.getSelectedItem().equals("�Ŷ��")) {
					txt.setText("�Ŷ��");
				}
				
				if(combo.getSelectedItem().equals("�����")) {
					txt.setText("�����");
				}
				
				if(combo.getSelectedItem().equals("��¡��«��")) {
					txt.setText("��¡��«��");
				}
				
				if(combo.getSelectedItem().equals("�նѲ�")) {
					txt.setText("�նѲ�");
				}
				
				
			}
		});
		
		txt.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					String str = txt.getText();
					if(combo.getSelectedIndex()==0) {
						combo.removeItemAt(0);
						combo.insertItemAt(str, 0);
						combo.setSelectedIndex(0);
						validate();
						repaint();
					}
					if(combo.getSelectedIndex()==1) {
						data[1] = txt.getText()+str;
						combo.removeItemAt(1);
						combo.insertItemAt(str, 1);
						combo.setSelectedIndex(1);
						validate();
						repaint();
					}
					if(combo.getSelectedIndex()==2) {
						data[2] = txt.getText()+str;
						combo.removeItemAt(2);
						combo.insertItemAt(str, 2);
						combo.setSelectedIndex(2);
						validate();
						repaint();
					}
					if(combo.getSelectedIndex()==3) {
						data[3] = txt.getText()+str;
						combo.removeItemAt(3);
						combo.insertItemAt(str, 3);
						combo.setSelectedIndex(3);
						validate();
						repaint();
					}
					txt.setText("");
				}
			}
		});
		
		JPanel paneSub = new JPanel();
		paneSub.add(combo);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0));
		panel.add(paneSub);
		panel.add(txt);
		
		newJFrame(panel);
		
	}
	
	//VK_7
	private void jListEx() {
		//JList ��ü
		String[] data = {"�Ŷ��","�����","��¡��«��","�նѲ�"};
		JList<String> list = new JList<>(data);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//�ؽ�Ʈ �ʵ�
		JTextField txt = new JTextField();
		txt.setColumns(20);
		txt.setEditable(false);
		txt.setBackground(Color.white);
		txt.setForeground(Color.BLACK);
		
		//������
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				if(list.getSelectedValue().equals("�Ŷ��")) {
					txt.setText("�Ŷ��");
				}
				if(list.getSelectedValue().equals("�����")) {
					txt.setText("�����");
				}
				if(list.getSelectedValue().equals("��¡��«��")) {
					txt.setText("��¡��«��");
				}
				if(list.getSelectedValue().equals("�նѲ�")) {
					txt.setText("�նѲ�");
				}
				
			}
		});
		
		//�ǳ�
		JPanel paneSub = new JPanel();
		paneSub.add(list);
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0));
		panel.add(paneSub);
		panel.add(txt);
	
		newJFrame(panel);
		
	}
	
	//VK_6
	private void jRadioButtonEx() {
		
		//��ư
		JRadioButton iceA = new JRadioButton("���̽� �Ƹ޸�ī��");
		JRadioButton wmJ = new JRadioButton("�����ֽ�");
		JRadioButton iceC = new JRadioButton("���̽� ����");
		
		//�ؽ�Ʈ
		JTextField txt = new JTextField();
		txt.setEditable(false);
		txt.setColumns(20);
		txt.setBackground(Color.white);
		txt.setForeground(Color.black);
		
		//������
        iceA.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("���̽� �Ƹ޸�ī��");
			}
		});
		wmJ.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText("�����ֽ�");
			}
		});
		iceC.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText("���̽� ����");
			}
		});

		
		JPanel paneSub = new JPanel();
		paneSub.add(iceA);
		paneSub.add(wmJ);
		paneSub.add(iceC);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0));
		panel.add(paneSub);
		panel.add(txt);
		
		newJFrame(panel);
		
	}
	
	
	
	//VK_5
	private void jCheckBoxEx() {
		//��ư
		JCheckBox iceA = new JCheckBox("���̽� �Ƹ޸�ī��");
		JCheckBox wmJ = new JCheckBox("�����ֽ�");
		JCheckBox iceC = new JCheckBox("���̽� ����");
		iceA.setSelected(false);
		wmJ.setSelected(false);
		iceC.setSelected(false);
		
		//�ؽ�Ʈ�ʵ�
		JTextField txt = new JTextField();
		txt.setEditable(false);
		txt.setBackground(Color.white);
		txt.setForeground(Color.BLACK);
		txt.setColumns(20);
		
		//�׼� ������
        iceA.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txt.setText("���̽� �Ƹ޸�ī��");				
			}
		});
		wmJ.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText("�����ֽ�");				
			}
		});
		iceC.addItemListener(new ItemListener() {	
			@Override
			public void itemStateChanged(ItemEvent e) {
				txt.setText("���̽� ����");				
			}
		});
		

		
		JPanel paneSub = new JPanel();
		paneSub.add(iceA);
		paneSub.add(wmJ);
		paneSub.add(iceC);
	
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(2, 0));
		panel.add(paneSub);
		panel.add(txt);
		
		newJFrame(panel);
		
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
	
	//VK_3
	private void jPasswordField() {
		JPasswordField pass = new JPasswordField("TEST",20);
		
//		System.out.println(pass.getText()); //deprecated ���� �����ϴ� �޼ҵ�
		System.out.println(pass.getPassword());
		
		newJFrame(pass);
		
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
	public static void main(String[] args) {
		new ComponentEx();
	}
	
}
