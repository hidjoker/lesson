package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class SwingEx_03_LayoutManager extends JFrame{

//	 + ��ġ������, LayoutManager
//	   - �����̳��� ���̾ƿ��� �����ϴ� ���
//	   - ���̾ƿ� : ������Ʈ���� ��� ��ġ�� �������� ���� ����
//	   - ��ġ�����ڴ� �����ڿ��� ���� ������ �ϱ⶧����
//	     �����ڸ� �� ���ƾ��Ѵ�

	
	private SwingEx_03_LayoutManager() {
		setTitle("LayoutManager Example"); //������ ����
		
		setLocation(100, 100); //��ġ ����
		setSize(500, 500); //ũ�� ����
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�ݱ� ����
		
		
		//---- ������ ���� �۾� ----
//		flowLayoutEx();
//		borderLayoutEx();
		gridLayoutEx();
		
		//--------------------
		
		setVisible(true); //���̱� ����(�޸𸮿� ����� ���� ����Ϳ� ǥ��)
		
		
		
	}
	
//	 + GridLayout
//	    - ��� ���� ������ ǥ(���̺�) ������ ��ġ
//	    - �����ڿ��� �� �Ǵ� ���� ������ �����ؼ� ����Ѵ�
//	        new GridLayout(x, 0) ��> ����� x�� ����
//	        new GridLayout(0, x) ��> ������ x�� ����
//	       ��� ���� �Ѵ� �������� �ʰ� �ϳ��� �����ϴ� ���� ����
//	       (������Ű���� ���� ����ְ� �ٸ� ���� ����0���� ä���)
//	    - �����̳��� ũ�� ���濡 ������Ʈ�� ������ ����
//	    - ������Ʈ�� ��� ���� ũ�⸦ ������
//	    - hgap, vgap ���� ����


	private void gridLayoutEx() {
//		setLayout(new GridLayout());
//		setLayout(new GridLayout(3, 0));
//		setLayout(new GridLayout(0, 3));
		setLayout(new GridLayout(0, 3, 10, 20));

		
		JButton[] btn = new JButton[8];
		for(int i=0 ; i<btn.length ; i++)
			btn[i] = new JButton("��ư"+(i+1));	
		
		for(int i=0 ; i<btn.length ; i++)
			add(btn[i]);
		
	}
	
//	+ BorderLayout
//	   - �����̳��� ������ ��, ��, ��, ��, �߾� ���� ������ ��ġ
//	   - hgap, vgap ���� ����
//	   - �����̳��� ũ�Ⱑ ����Ǹ� ������Ʈ�� ũ�⵵ ����ȴ�
//	       North, South�� �����̳��� �ʺ� �������
//	       East, West�� �����̳��� ���� �������
//	       Center �ʺ�, ���� ��� �������
	

	private void borderLayoutEx() {
//		setLayout( new BorderLayout()); //�⺻(default) ���̾ƿ� �Ŵ���
		setLayout( new BorderLayout(30,15));
		
		
		JButton[] btn = new JButton[5];
		for(int i=0 ; i<btn.length ; i++)
			btn[i] = new JButton("��ư"+(i+1));
		
//		add(btn[0]);
		
		add(btn[0], "East");
		add(btn[1], "West");
		add("Center", btn[2]);
		add(btn[3], BorderLayout.NORTH);
		add(BorderLayout.SOUTH, btn[4]);
		
	}

//	 + FlowLayout
//	   - ������Ʈ�� �߰��Ǵ� ������ ���� ���� ��> ���������� �̾ ��ġ
//	   - �����̳��� �� �ٿ� ��ġ�� ������ �����ϸ� ���� �ٿ� ��ġ
//	   - �����̳��� ũ�Ⱑ ������Ʈ�� ũ�⿡ ������ ���� �ʴ´�
//	   - ���ĵǴ� ��ġ ���� ����
//	   - hgap, vgap ���� ����

	
	
	private void flowLayoutEx() {
//		setLayout(new FlowLayout()); 
//		setLayout(new FlowLayout(FlowLayout.RIGHT));	
		setLayout(new FlowLayout(FlowLayout.CENTER,20 ,40));
		
		add(new JButton("��ư1"));
		add(new JButton("��ư3"));
		add(new JButton("��ư2"));
		add(new JButton("��ư4"));
		add(new JButton("��ư5"));
		add(new JButton("��ư7"));
		add(new JButton("��ư66666666666666666666666666666666666666666"));
		
		JButton btn = new JButton("��ư8");

		//		btn.setSize(200,200); 
		//���̾ƿ� �Ŵ����� �켱�ǿ� ���� ��ư ����� ������
		
		//�켱���� �ο��ϰ� ����� �ٲ��ָ� �ٲ�
		btn.setPreferredSize(new Dimension(200, 200));
		add(btn);
	}

	public static void main(String[] args) {
		new SwingEx_03_LayoutManager();
	}
	
}

