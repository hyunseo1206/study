import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ColorPanel extends JPanel implements ActionListener {
	JButton button;
	Color color = new Color(0, 0, 0);
	
	public ColorPanel() {
		setLayout(new BorderLayout());
		button = new JButton("Color Change");
		button.addActionListener((ActionListener) this);
		add(button, BorderLayout.SOUTH);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(color);
		g.fillRect(10, 10, 210, 220);
	}
	
	public void actionPerformed(ActionEvent e) {
		color = new Color((int) (Math.random()*255.0), (int) (Math.random()*255.0), (int)(Math.random()*255.0));
				repaint();
	}
}
