import java.awt.*;

public class ButtonTestwithFrame extends Frame {
	Button ok;
	Label label;
	
	ButtonTestwithFrame() {
		super("Button Test extends Frame : CHS");
		
		setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("���� ���Դϴ�.");
		
		add(ok);
		add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	ButtonTestwithFrame(String title) {
		super(title);
		
		setLayout(new FlowLayout());
		
		ok = new Button("OK");
		label = new Label("���� ���Դϴ�.");
		
		add(ok);
		add(label);
		
		setSize(300, 300);
		setVisible(true);
	}
}
