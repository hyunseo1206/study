import java.awt.*;
import javax.swing.*;

public class HW_ChartPanel5 extends JPanel {
	JButton button;
	JLabel label, no;
	
	public HW_ChartPanel5() {
		setLayout(new GridLayout(4,1));
		no = new JLabel();
		add(no);

		button = new JButton("Click here to get file");
		add(button);
		
		label = new JLabel("���� ���� ����� �������� �ʾҽ��ϴ�.");
		add(label);
		
		setVisible(true);
	}
}
