import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

import javax.swing.*;

public class HW_ChartPanel4 extends JPanel implements ActionListener {
	JLabel label;
	JButton button;
	Color[] color = {new Color(0,0,0), new Color(0,0,0)};
	Font font;
	
	public HW_ChartPanel4() {
		setLayout(new BorderLayout());
		font = new Font("", Font.BOLD, 15);
		label = new JLabel("<좋아하는 취미 활동에 대한 모양 그래프>");
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
		
		font = new Font ("serif", Font.PLAIN, 12);
		g2.setFont(font);
		
		g2.setColor(color[0]);
		g2.fill(new Arc2D.Float(200, 80, 100, 80, 0, 180, Arc2D.CHORD));
		g2.fill(new Arc2D.Float(100, 80, 100, 80, 0, 180, Arc2D.CHORD));
		g2.fill(new Arc2D.Float(100, 20, 200, 200, 270, 90, Arc2D.PIE));
		g2.fill(new Arc2D.Float(100, 20, 200, 200, 180, 90, Arc2D.PIE));
		
		g2.setColor(color[1]);
		g2.drawLine(100, 120, 300, 120);
		g2.drawLine(107, 155, 293, 155);
		g2.drawLine(129, 190, 270, 190);
		
		g2.setColor(Color.black);
		g2.drawString("배드민턴", 125, 110);
		g2.drawString("음악감상", 230, 110);
		g2.drawString("예능보기", 175, 140);
		g2.drawString("드라마보기", 170, 178);
		g2.drawString("산책하기", 175, 209);
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 5; i++) {
			color[i] = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
			repaint();
		}
	}
}
