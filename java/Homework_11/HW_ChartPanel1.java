import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HW_ChartPanel1 extends JPanel implements ActionListener {
	JLabel label;
	JButton button;
	Color[] color = {new Color(0,0,0), new Color(0,0,0), new Color(0,0,0), new Color(0,0,0), new Color(0,0,0)};
	Font font;

	public HW_ChartPanel1() {
		setLayout(new BorderLayout());
		font = new Font("", Font.BOLD, 15);
		label = new JLabel("<내가 일주일에 듣는 강의에 대한 원형차트>");
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
		g2.fillOval(10, 50, 10, 10);
		g2.fillArc(155, 75, 120, 120, 0, 360);
		
		g2.setColor(color[1]);
		g2.fillOval(10, 80, 10, 10);
		g2.fillArc(155, 75, 120, 120, 0, 279);
		
		g2.setColor(color[2]);
		g2.fillOval(10, 110, 10, 10);
		g2.fillArc(155, 75, 120, 120, 0, 198);
		
		g2.setColor(color[3]);
		g2.fillOval(10, 140, 10, 10);
		g2.fillArc(155, 75, 120, 120, 0, 117);
		
		g2.setColor(color[4]);
		g2.fillOval(10, 170, 10, 10);
		g2.fillArc(155, 75, 120, 120, 0, 36);	
		
		g2.setColor(Color.black);
		g2.drawString("월요일 (3)", 40, 60);
		g2.drawString("화요일 (3)", 40, 90);
		g2.drawString("수요일 (3)", 40, 120);
		g2.drawString("목요일 (3)", 40, 150);
		g2.drawString("금요일 (1)", 40, 180);
	}
	
	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < 5; i++) {
			color[i] = new Color((int)(Math.random()*255.0), (int)(Math.random()*255.0), (int)(Math.random()*255.0));
			repaint();
		}
	}
}
