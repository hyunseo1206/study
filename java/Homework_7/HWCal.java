import java.awt.*;

public class HWCal extends Frame{
	Frame f;
	Panel p1, p2;
	GridBagLayout gridbag;
	GridBagConstraints constraint;
	TextField tf;
	Button b1;
	
	public HWCal() {
		f = new Frame("GridBagCal : CHS");
		f.setLayout(new BorderLayout());
		
		gridbag = new GridBagLayout();
		constraint = new GridBagConstraints();
		
		p1 = new Panel();
		tf = new TextField("0", 10);
		tf.setFont(new Font ("Serif", Font.BOLD, 50));
		p1.add(tf);
		
		p2 = new Panel();
		constraint.fill = GridBagConstraints.BOTH;
		p2.setLayout(gridbag);
		
		Button b1 = new Button("C");
		Button b2 = new Button("CE");
		Button b3 = new Button("1/x");
		Button b4 = new Button("DEL");
		Button b5 = new Button("%");
		Button b6 = new Button("/");
		Button b7 = new Button("X");
		Button b8 = new Button("-");
		Button b9 = new Button("7");
		Button b10 = new Button("8");
		Button b11 = new Button("9");
		Button b12 = new Button("+");
		Button b13 = new Button("4");
		Button b14 = new Button("5");
		Button b15 = new Button("6");
		Button b16 = new Button("0");
		Button b17 = new Button("1");
		Button b18 = new Button("2");
		Button b19 = new Button("3");
		Button b20 = new Button("+/-");
		Button b21 = new Button("0");
		Button b22 = new Button(".");
		Button b23 = new Button("=");
		
		constraint.weightx = 1.0;
		constraint.weighty = 1.0;
		
		Move (b1, 0, 0, 1, 1);
		Move (b2, 1, 0, 1, 1);
		Move (b3, 2, 0, 1, 1);
		Move (b4, 3, 0, 1, 1);
		
		Move (b5, 0, 1, 1, 1);
		Move (b6, 1, 1, 1, 1);
		Move (b7, 2, 1, 1, 1);
		Move (b8, 3, 1, 1, 1);
		
		Move (b9, 0, 2, 1, 1);
		Move (b10, 1, 2, 1, 1);
		Move (b11, 2, 2, 1, 1);
		Move (b12, 3, 2, 1, 1);
		
		Move (b13, 0, 3, 1, 1);
		Move (b14, 1, 3, 1, 1);
		Move (b15, 2, 3, 1, 1);
		Move (b16, 3, 3, 1, 1);
		
		Move (b17, 0, 4, 1, 1);
		Move (b18, 1, 4, 1, 1);
		Move (b19, 2, 4, 1, 1);
		Move (b20, 3, 4, 1, 1);
		
		Move (b21, 0, 5, 1, 1);
		Move (b22, 1, 5, 1, 1);
		Move (b23, 2, 5, 2, 1);
		
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		p2.add(b17);
		p2.add(b18);
		p2.add(b19);
		p2.add(b20);
		p2.add(b21);
		p2.add(b22);
		p2.add(b23);

		f.add("North", p1);
		f.add(p2);
		f.setSize(400, 500);
		f.setVisible(true);
	}

	public void Move(Component b, int x, int y, int width, int height) {
		constraint.gridx = x;
		constraint.gridy = y;
		constraint.gridwidth = width;
		constraint.gridheight = height;
		
		gridbag.setConstraints(b, constraint);
	}
}
