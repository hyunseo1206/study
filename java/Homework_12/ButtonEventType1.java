import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;

public class ButtonEventType1{
	JFrame jf;
	JPanel panel;
	JButton button1, button2;
	
	MyListener listener = new MyListener();
	
	public ButtonEventType1(String msg) {
		jf = new JFrame(msg);
		jf.setSize(200, 200);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setTitle("이벤트 예제 : 2115411 최현서");
		panel = new JPanel();
		
		button1 = new JButton("노란색");
		button1.addActionListener(listener);
		panel.add(button1);
		
		button2 = new JButton("핑크색");
		button2.addActionListener(listener);
		panel.add(button2);
		
		jf.add(panel);
		jf.setVisible(true);
	}
	
	class MyListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				panel.setBackground(Color.yellow);
			}else if(e.getSource() == button2) {
				panel.setBackground(Color.pink);
			}
		}
	}
}