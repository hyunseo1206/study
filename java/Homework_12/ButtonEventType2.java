import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class ButtonEventType2 extends JPanel implements ActionListener{
	boolean flag = false;
	private int light_number = 0;
	
	public ButtonEventType2() {
		setLayout(new BorderLayout());
		JButton b = new JButton("traffic light");
		b.addActionListener(this);
		add(b, BorderLayout.SOUTH);
		setSize(300, 200);
		setVisible(true);
	}
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.black);
		g.drawOval(100, 100, 100, 100);
		g.drawOval(100, 200, 100, 100);
		g.drawOval(100, 300, 100, 100);
		if(light_number == 0) {
			g.setColor(Color.red);
			g.fillOval(100,  100,  100, 100);
		}else if(light_number == 1) {
			g.setColor(Color.green);
			g.fillOval(100,  200,  100, 100);
		}else {
			g.setColor(Color.yellow);
			g.fillOval(100,  300,  100, 100);
		}
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(++light_number>=3)
			light_number = 0;
		repaint();
	}
}