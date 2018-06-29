package frame;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MainFrame extends JFrame {

	//��Ʈ �����̳� ������ �ʿ��� ����
	private Container root; // ��Ʈ �����̳�
	
	//ù ��° �ǳ�
	

	//�޴��� ����
	private JMenuBar menuBar;
	
	//�޴��� - File
	private JMenu file;
	private JMenuItem file_LogInOut;
	private JMenuItem file_Import;
	private JMenuItem file_Export;
	private JMenuItem file_Config;
	private JMenuItem file_Close;
	//�޴��� - Record
	private JMenu record;
	private JMenuItem record_NewEmployee;
	private JMenuItem record_NewTeamManage;
	//�޴��� - View
	private JMenu view;
	private JMenuItem view_3View;
	private JMenuItem view_PhotoView;
	private JMenuItem view_WholeView;
	private JMenuItem view_TeamView;
	//�޴��� - Calendar
	private JMenu calendar;
	private JMenuItem calendar_PersonView;
	private JMenuItem calendar_TeamView;
	private JMenuItem calendar_WholeView;
	//�޴��� - Help
	private JMenu help;
	private JMenuItem help_Quiz;
	private JMenuItem help_Help;
	private JMenuItem help_Credit;
	private JMenuItem help_About;
	
	public MainFrame() {
		
		//���� ������ ����
		setTitle("���� ������");
		setBounds(300, 100, 1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�޴��� ����
		initMenu();
		
		//��Ʈ�����̳� ����
		initRootContainer();

		
		setVisible(true);
		
	}
	
	private void initMenu() {
		
		menuBar = new JMenuBar();
		
		
		//file �޴�
		file = new JMenu("File");
		
		file_LogInOut = new JMenuItem("Log-in / Log-out");
		file_Import = new JMenuItem("Import");
		file_Export = new JMenuItem("Export");
		file_Config = new JMenuItem("ȯ�漳��");
		file_Close = new JMenuItem("����");

		file.add(file_LogInOut);
		file.addSeparator(); //��輱�߰�
		file.add(file_Import);
		file.add(file_Export);
		file.addSeparator(); //��輱�߰�
		file.add(file_Config);
		file.addSeparator(); //��輱�߰�
		file.add(file_Close);
		
		menuBar.add(file);
		
		
		//Record �޴�
		record = new JMenu("Record");
		
		record_NewEmployee = new JMenuItem("�űԵ��");
		record_NewTeamManage = new JMenuItem("��������");
		
		record.add(record_NewEmployee);
		record.addSeparator(); //��輱�߰�
		record.add(record_NewTeamManage);
		
		menuBar.add(record);
		
		
		//View �޴�
		view = new JMenu("View");
		
		view_3View = new JMenuItem("3�� ����");
		view_PhotoView = new JMenuItem("���� ����");
		view_WholeView = new JMenuItem("��ü����Ʈ ����");
		view_TeamView = new JMenuItem("���� ����");
	    
		view.add(view_3View);
		view.add(view_PhotoView);
		view.add(view_WholeView);
		view.add(view_TeamView);
		
		
		menuBar.add(view);
		
		
		// Calendar �޴�
		calendar = new JMenu("Calendar");
		
		calendar_PersonView = new JMenuItem("���� ��������");
		calendar_TeamView = new JMenuItem("�� ��������");
		calendar_WholeView = new JMenuItem("��� ��������");
		
		calendar.add(calendar_PersonView);
		calendar.add(calendar_TeamView);
		calendar.addSeparator(); //��輱�߰�
		calendar.add(calendar_WholeView);
		
		menuBar.add(calendar);
		
	
		// Help �޴�
		help = new JMenu("Help");
		
		help_Quiz = new JMenuItem("����!");
		help_Help = new JMenuItem("����");
		help_Credit = new JMenuItem("ũ����");
		help_About = new JMenuItem("����?�������� ���Ͽ�");
		
		help.add(help_Quiz);
		help.addSeparator(); //��輱�߰�
		help.add(help_Help);
		help.add(help_Credit);
		help.add(help_About);
		
		menuBar.add(help);
		
		setJMenuBar(menuBar); //�����ӿ� �޴��� �����ϱ�
		
		
		
		
	}
	
	private void initRootContainer() {
		
		
	}
	
	
	public static void main(String[] args) {
		MainFrame main = new MainFrame();
		
	}
			
	

}