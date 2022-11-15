import javax.swing.*;

public class JLabelTest {
	JLabel label1, label2;
	
	public JLabelTest(String msg) {
		JFrame jf = new JFrame(msg);
		jf.setTitle("Image Label Test :");
		jf.setSize(500, 500);
		
		label1 = new JLabel("우리대학교 로고");
		jf.getContentPane().add("North", label1);
		
		// image label
		ImageIcon logo = new ImageIcon("sm_logo.png");
		label2 = new JLabel("숙명여자대학교", logo, JLabel.CENTER);
		
		jf.getContentPane().add("South", label2);
		
		jf.setVisible(true);
	}
}
