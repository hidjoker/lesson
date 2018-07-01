import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TeamRecordPanel extends JPanel{

	//첫번째 판넬
	private JPanel teamRecord_Pane1;
    private JLabel teamRecord_Label_Title1;
    private JLabel teamRecord_Label_Title2;
    
    public TeamRecordPanel() {
	
    	
    	//첫번째 판넬
    	teamRecord_Pane1 = new JPanel();
    	teamRecord_Pane1.setLayout(null);
    	teamRecord_Pane1.setBounds(320, 120, 900, 400);
    	teamRecord_Pane1.setBorder(BorderFactory.createLineBorder(Color.BLUE));
    	
    	teamRecord_Label_Title1 = new JLabel("부서");
    	teamRecord_Label_Title1.setBounds(400, 150, 150, 50);
    	teamRecord_Label_Title1.setHorizontalAlignment(JLabel.CENTER);
    	teamRecord_Label_Title1.setBorder(BorderFactory.createLineBorder(Color.BLUE));

    	teamRecord_Label_Title2 = new JLabel("내용");
    	teamRecord_Label_Title1.setBounds(800, 150, 150, 50);
    	teamRecord_Label_Title2.setHorizontalAlignment(JLabel.CENTER);
    	
    	teamRecord_Pane1.add(teamRecord_Label_Title1);
    	teamRecord_Pane1.add(teamRecord_Label_Title2);
    	
    	add(teamRecord_Pane1);
    	
   	
    	
	}
	
	
}
