import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Float;

import javax.swing.*;

public class HW_ChartPanel3 extends JPanel {
	JLabel label;
	JButton button;
	Color color;
	Font font;
	
	public HW_ChartPanel3() {
		setLayout(new BorderLayout());
		font = new Font("", Font.BOLD, 15);
		label = new JLabel("<쉬는 시간에 대한 선형 차트>");
		label.setFont(font);
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.NORTH);
		setSize(300, 300);
		setVisible(true);
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		font = new Font("serif", Font.PLAIN, 10);
		g2.setFont(font);
		g2.setColor(Color.black);
		g2.drawString("월요일 (2)", 70, 150);
		g2.drawString("화요일 (3)", 110, 130);
		g2.drawString("수요일 (3)", 180, 130);
		g2.drawString("목요일 (6)", 230, 70);
		g2.drawString("금요일 (6)", 280, 70);
		
		g2.drawLine(60, 50, 60, 200);
		g2.drawLine(60, 200, 330, 200);
		
		g2.drawLine(132, 142, 192, 142);
		g2.drawLine(242, 82, 292, 82);
		
		g2.setColor(Color.BLUE);
		g2.drawLine(60, 200, 82, 162);
		g2.drawLine(82, 162, 132, 142);
		g2.drawLine(192, 142, 242, 82);
		
		g2.setColor(Color.black);
		g2.fill(new Ellipse2D.Float(80, 160, 4, 4));
		g2.fill(new Ellipse2D.Float(130, 140, 4, 4));
		g2.fill(new Ellipse2D.Float(190, 140, 4, 4));
		g2.fill(new Ellipse2D.Float(240, 80, 4, 4));
		g2.fill(new Ellipse2D.Float(290, 80, 4, 4));
	}
}
