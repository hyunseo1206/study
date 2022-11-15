import javax.swing.*;
import java.awt.event.*;

 class EventTestMyFrame2 extends JFrame{
	 private JButton button;
	 private JLabel label;
	 
	 public EventTestMyFrame2() {
		 this.setSize(300, 200);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		 this.setTitle("Event Programming Style 2 : 2115411 ÃÖÇö¼­");
		 
		 JPanel panel = new JPanel();
		 button = new JButton("Button");
		 label = new JLabel("Please, Click the button");
		 button.addActionListener(new MyListener());
		 panel.add(button);
		 panel.add(label);
		 this.add(panel);
		 this.setVisible(true);
	 }
	 
	 private class MyListener implements ActionListener{
		 public void actionPerformed(ActionEvent e) {
			 if(e.getSource() == button ) {
				 label.setText("Clicked the button");
			 }
		 }
	 }
}