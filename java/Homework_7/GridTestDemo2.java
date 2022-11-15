import java.awt.*;
public class GridTestDemo2 {
	Frame f;
	
	public GridTestDemo2() {
		f = new Frame();
		f.setLayout(new GridLayout(3,2));
		
		f.add(new Button("1"));
		f.add(new TextField("2", 10));
		f.add(new TextArea("3", 5, 10));
		
	
		List list = new List(5, false);
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		f.add(list);
		
		Panel panel = new Panel();
		panel.setLayout(new BorderLayout());
		panel.add("North", new Button("north"));
		panel.add("East", new Button("east"));
		
		f.add(panel);
		f.add(new Label("6"));
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
