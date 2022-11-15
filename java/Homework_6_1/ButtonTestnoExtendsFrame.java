import java.awt.*;

public class ButtonTestnoExtendsFrame {
	Frame f;
	Button ok;
	Label label;
	
	ButtonTestnoExtendsFrame() {
		f = new Frame("Button Test no-extends Frame : CHS");
		
		f.setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		f.add(ok);
		f.add(label);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	ButtonTestnoExtendsFrame(String title) {
		f = new Frame(title);
		
		f.setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
		
		f.add(ok);
		f.add(label);
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
