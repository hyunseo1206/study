import java.awt.*;

public class ButtonLabel1 extends Frame {
	Button ok;
	Label label;
		
	public ButtonLabel1() {
		super("CHS");  						//Class ���� ��� �Լ����� ������ ����.
		setLayout(new FlowLayout());
			
		ok = new Button("OK");
		label = new Label("���� ���Դϴ�.");
			
		setSize(300, 200);
		setVisible(true);
	
	}
}
