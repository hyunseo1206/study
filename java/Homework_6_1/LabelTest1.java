import java.awt.*;

public class LabelTest1 {
	
	//�����ڸ� ����� �� �ȿ��� �ٸ� ���� ����� ��.
	//������ 1
	LabelTest1() {
		Frame f = new Frame("Label Test: CHS");
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		
		f.add(lb);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	
	//������ 2
	LabelTest1(String title) {
		Frame f = new Frame(title);
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		
		f.add(lb);
		f.setSize(400, 500);
		f.setVisible(true);
	}
}
