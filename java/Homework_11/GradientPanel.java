import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class GradientPanel extends JPanel {
	Ellipse2D.Double circle;
	Rectangle2D.Double rect;
	GradientPaint gradient;
	
	public GradientPanel() {
		gradient = new GradientPaint(10, 10, Color.red, 200, 200, Color.yellow);
		circle = new Ellipse2D.Double(10, 10, 200, 200);
		rect = new Rectangle2D.Double(10, 10, 200, 200);
	}
	
	public void paintComponent (Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		
		g2.draw(rect);
		g2.setPaint(gradient);
		g2.fill(circle);
	}
}
