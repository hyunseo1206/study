import java.awt.*;

public class ButtonLabel1 extends Frame {
	Button ok;
	Label label;
		
	public ButtonLabel1() {
		super("CHS");  						//Class 내의 모든 함수에서 접근이 가능.
		setLayout(new FlowLayout());
			
		ok = new Button("OK");
		label = new Label("저는 라벨입니다.");
			
		setSize(300, 200);
		setVisible(true);
	
	}
}
