import javax.swing.*;

public class CheckBoxTestMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		
		CheckBoxTest panel = new CheckBoxTest();
		
		panel.setOpaque(true);
		
		frame.add(panel);
		frame.setSize(500, 200);
		frame.setVisible(true);
	}

}