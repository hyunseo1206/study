import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class HW_SnowmanPanel extends JPanel {
	public HW_SnowmanPanel() {
	}

	public void paintComponent(Graphics g) {
		//��� �׸���
		g.setColor(Color.green); 
		g.fillRect(1, 470, 1152, 648); //�ܵ� �׸���
		g.setColor(Color.darkGray); 
		g.fillRect(1, 1, 1152, 470); //�ϴ� �׸���
		
		for (int i=10; i<1153;) {
			for (int j=10; j<470;) {
				g.setColor(Color.lightGray);
				g.fillOval(10+i, 10+j, 15, 15);
				j+=100;
			} i+=100;
		}
		//����� �׸���
		g.setColor(Color.white);
		g.fillOval(450, 300, 300, 300);
		g.setColor(Color.black);
		g.drawLine(710, 260, 770, 190); //�� �׸���
		g.drawLine(426, 190, 486, 260);
		g.setColor(Color.white);
		g.fillOval(480, 180, 240, 240);
		g.setColor(Color.black); //�� �׸���
		g.fillOval(530, 40, 50, 50);
		g.fillOval(625, 40, 50, 50);
		g.setColor(Color.white);
		g.fillOval(510, 60, 180, 180);
		g.setColor(Color.black); 
		g.fillOval(565, 110, 10, 15); //�� �׸���
		g.fillOval(625, 110, 10, 15); 
		g.fillOval(595, 140, 15, 10); //�� �׸���
		g.fillRect(600, 143, 5, 30);  //���� �׸���
		g.setColor(Color.red);
		g.fillOval(500, 180, 200, 50); //�񵵸� �׸���
		g.fillRect(620, 190, 50, 130);
		g.setColor(Color.black); 
		g.fillOval(595, 260, 15, 15);
		g.fillOval(595, 300, 15, 15);
		g.fillOval(595, 340, 15, 15);
	}
}
