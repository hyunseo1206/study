import javax.swing.*;
import java.awt.event.*;

public class EventTestMyListener implements ActionListener{
	JLabel label;
	
	EventTestMyListener(JLabel l){
		label = l;
	}
	
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		label.setText("Clicked the Button");
	}
	
}