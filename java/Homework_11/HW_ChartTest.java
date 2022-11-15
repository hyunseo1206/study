import java.awt.*;
import javax.swing.*;

public class HW_ChartTest extends JFrame {
	public HW_ChartTest() {
		setSize(1200, 600);
		setTitle("HW_Chart : 2115411 ÃÖÇö¼­");
		setLayout(new GridLayout(2,3));
		
		JPanel panel0 = new HW_ChartPanel0();
		add(panel0);
		
		JPanel panel1 = new HW_ChartPanel1();
		add(panel1);
		
		JPanel panel2 = new HW_ChartPanel2();
		add(panel2);
		
		JPanel panel3 = new HW_ChartPanel3();
		add(panel3);
		
		JPanel panel4 = new HW_ChartPanel4();
		add(panel4);
		
		JPanel panel5 = new HW_ChartPanel5();
		add(panel5);
		
		setVisible(true);
	}

}
