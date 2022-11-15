import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ColorChooser extends JFrame implements ChangeListener {
	public JColorChooser color ;
	
	public ColorChooser() {
		setTitle("Color Chooser : 2115411 CHS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		color = new JColorChooser();
		color.getSelectionModel().addChangeListener((ChangeListener) this);
		color.setBorder(BorderFactory.createTitledBorder("Color Select"));
		JPanel panel = new JPanel();
		panel.add(color);
		add(panel);
		pack();
		this.setVisible(true);
	}
	
	public void stateChanged(ChangeEvent e) {
		Color newColor = color.getColor();
	}
}
