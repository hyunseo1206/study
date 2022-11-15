import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HW_ChartPanel2 extends JPanel implements ActionListener {
	JLabel label;
	JButton button;
	Color[] color = {new Color(0,0,0), new Color(0,0,0), new Color(0,0,0), new Color(0,0,0), new Color(0,0,0)};
	Font font;
	
	public HW_ChartPanel2() {
		setLayout(new BorderLayout());
		font = new Font("", Font.BOLD, 15);
		label = new JLabel("<내가 일주일에 듣는 강의에 대한 막대차트>");
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.NORTH);
		button = new JButton("Color Change");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		g2.setColor(color[0]);
		g2.fill(new Rectangle2D.Float(80, 80, 30, 120));
		
		g2.setColor(color[1]);
		g2.fill(new Rectangle2D.Float(130, 80, 30, 120));
		
		g2.setColor(color[2]);
		g2.fill(new Rectangle2D.Float(180, 80, 30, 120));
		
		g2.setColor(color[3]);
		g2.fill(new Rectangle2D.Float(230, 80, 30, 120));
		
		g2.setColor(color[4]);
		g2.fill(new Rectangle2D.Float(280, 180, 30, 20));
	
		font = new Font ("serif", Font.PLAIN, 10);
		g2.setFont(font);
		g2.setColor(Color.black);
		g2.drawString("월요일 (3)", 75, 220);
		g2.drawString("화요일 (3)", 125, 220);
		g2.drawString("수요일 (3)", 175, 220);
		g2.drawString("목요일 (3)", 225, 220);
		g2.drawString("금요일 (1)", 275, 220);
		
		g2.drawLine(60, 50, 60, 200);
		g2.drawLine(60, 200, 330, 200);
		
		for (int i = 0; i < 7; i++) {
			g2.drawLine(60, 60+20*i, 65, 60+20*i);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 5; i++) {
			color[i] = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
			repaint();
		}
	}
}
