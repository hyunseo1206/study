import java.awt.*;

public class ButtonTest {
	ButtonTest() {
		Frame f = new Frame("ButtonTest: Choi");
		
		Button b = new Button("OK");
		
		f.add(b);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
