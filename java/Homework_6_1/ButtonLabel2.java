import java.awt.*;

public class ButtonLabel2 {
	Button ok;
	Label label;
	
	public ButtonLabel2() {
		Frame f = new Frame("ButtonLabel0");
		f.setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("���� ���Դϴ�.");
		
		f.add(ok);
		f.add(label);
		
		f.setSize(300, 200);
		f.setVisible(true);
	}
}