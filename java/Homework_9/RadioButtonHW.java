import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonHW extends JFrame implements ActionListener {
	String[] c_size = { "Small Size" , "Medium Size" , "Large Size"};
	JLabel label1, text;
	JPanel textPanel, sizePanel, resultPanel;
	JRadioButton[] size = new JRadioButton[3];
	
	public RadioButtonHW() {
		JFrame jf = new JFrame("Radio Button - Coffee");
		jf.getContentPane().setLayout(new BorderLayout(3,1));
		
		textPanel = new JPanel();
		label1 = new JLabel("What size of coffee do you like to order?");
		textPanel.add(label1);
		jf.add(textPanel, BorderLayout.NORTH);
		
		sizePanel = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		
		for(int i = 0; i < 3 ; i++) {
			size[i] = new JRadioButton(c_size[i]);
			bg.add(size[i]);
			size[i].addActionListener(this);
			sizePanel.add(size[i]);
		}
		jf.add(sizePanel, BorderLayout.CENTER);
		
		resultPanel = new JPanel();
		text = new JLabel("Did not select the size");
		resultPanel.add(text);
		text.setForeground(Color.red);
		jf.add(resultPanel, BorderLayout.SOUTH);
		
		jf.setSize(500, 300);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		for(int j = 0; j < size.length; j++) {
			if(e.getSource() == size[j]) {
				text.setText("Ordered " + c_size[j]);
			}
		}
	}	
}