import javax.swing.*;
import java.awt.*;

public class JComboBoxTest {
	JFrame jf;
	JComboBox fruits;
	
	public JComboBoxTest() {
		jf = new JFrame("JComboBox Test");
		jf.getContentPane().setLayout(new FlowLayout());
		String items[] = {"apple", "grape", "melon", "orange", "banana", "pear"};
		fruits = new JComboBox(items);
		
		jf.getContentPane().add(fruits);
		jf.setSize(200,200);
		jf.setVisible(true);
	}
}