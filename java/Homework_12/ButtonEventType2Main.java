import javax.swing.JFrame;

public class ButtonEventType2Main {
	JFrame jf;
	
	public ButtonEventType2Main(String msg) {
		jf = new JFrame(msg);
		jf.add(new ButtonEventType2());
		jf.setSize(300, 500);
		jf.setVisible(true);
	}
	
	public static void main(String[] args) {
		new ButtonEventType2Main("Button Event Type 2 : 2115411 ������");
	}
}