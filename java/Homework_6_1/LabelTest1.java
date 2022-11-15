import java.awt.*;

public class LabelTest1 {
	
	//생성자를 만들고 그 안에서 다른 것을 만드는 것.
	//생성자 1
	LabelTest1() {
		Frame f = new Frame("Label Test: CHS");
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		
		f.add(lb);
		f.setSize(400, 500);
		f.setVisible(true);
	}
	
	//생성자 2
	LabelTest1(String title) {
		Frame f = new Frame(title);
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		
		f.add(lb);
		f.setSize(400, 500);
		f.setVisible(true);
	}
}
