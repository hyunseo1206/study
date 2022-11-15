import javax.swing.JFrame;
import javax.swing.*;

public class HW_Snowman extends JFrame {
	public HW_Snowman() {
		setSize(1152, 648);
		setTitle("HW_Snowman : 2115411 ÃÖÇö¼­");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new HW_SnowmanPanel();
		add(panel);
		setVisible(true);
	}
}