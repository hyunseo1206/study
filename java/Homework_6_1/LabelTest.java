import java.awt.*;

public class LabelTest {
	public static void main(String[] args) {
		Frame f = new Frame("Label Test: CHS");
		Label lb = new Label("IT Dept. Choi Hyun Seo");
		f.add(lb);					//���� �����Ϳ� ���̴� ��.
		f.setSize(500, 500); 		//������ ����
		f.setVisible(true); 
	}
}
