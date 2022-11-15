import java.awt.*;

public class LabelTest {
	public static void main(String[] args) {
		Frame f = new Frame("Label Test: CHS");
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		f.add(lb);					//라벨을 프린터에 붙이는 것.
		f.setSize(500, 500); 		//사이즈 지정
		f.setVisible(true); 
	}
}
