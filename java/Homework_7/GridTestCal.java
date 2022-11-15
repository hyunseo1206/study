import java.awt.*;
public class GridTestCal{
	Frame f;
	Panel display, board;
	TextField tf;
	
	public GridTestCal() {
		f = new Frame("GridTestCal : CHS");
		f.setLayout(new BorderLayout());
		
		display = new Panel();
		tf = new TextField(60);
		display.add(tf);
		
		board = new Panel();
		board.setLayout(new GridLayout(5,3));
		
		board.add(new Button("C"));
		board.add(new Button("%"));
		board.add(new Button("del"));
		board.add(new Button("/"));
		board.add(new Button("7"));
		board.add(new Button("8"));
		board.add(new Button("9"));
		board.add(new Button("*"));
		board.add(new Button("4"));
		board.add(new Button("5"));
		board.add(new Button("6"));
		board.add(new Button("+"));
		board.add(new Button("1"));
		board.add(new Button("2"));
		board.add(new Button("3"));
		board.add(new Button("-"));
		board.add(new Button("0"));
		board.add(new Button("."));
		board.add(new Button("+/-"));
		board.add(new Button("="));
		
		f.add("North", display);
		f.add(board);
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
