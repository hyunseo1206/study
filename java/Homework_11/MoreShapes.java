import javax.swing.*;

public class MoreShapes extends JFrame {
	public MoreShapes() {
		setSize(600, 140);
		setTitle("Java 2D Shapes : 2115411 ÃÖÇö¼­");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = new MyShapePanel();
		add(panel);
		setVisible(true);
	}
}
