import java.awt.*;

public class PanelTest{
	public PanelTest() {
		Frame f = new Frame("PanelTest");
		
		f.setLayout(null); 
		
		Panel p = new Panel();
		p.setSize(100,100);
		p.setBackground(Color.blue);
		p.setLocation(1, 100);
		
		f.add(p);
		f.setSize(300, 200);
		f.setVisible(true);
	}
} 