import java.awt.*;

public class GridTestDemo {
	Frame f;
	
	public GridTestDemo() {
		f = new Frame();
		f.setLayout(new GridLayout(2,3));
		
		f.add(new Button("1"));
		f.add(new Button("2"));
		f.add(new Button("3"));
		f.add(new Button("4"));
		f.add(new Button("5"));
		f.add(new Button("6"));
		
		f.setSize(200, 300);
		f.setVisible(true);
	}
}
