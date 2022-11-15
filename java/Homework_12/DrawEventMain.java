import javax.swing.JFrame;

public class DrawEventMain {
	JFrame jf;
	
	public DrawEventMain(String msg) {
		jf = new JFrame(msg);
		jf.add(new DrawEvent());
		jf.setSize(900, 1000);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new DrawEventMain("Test Mouse Move Event Type : 2115411 ÃÖÇö¼­");
	}
}