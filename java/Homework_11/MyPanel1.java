import javax.swing.*;
import java.awt.*;

class MyPanel1 extends JPanel 
{
	public MyPanel1() {
		//�ʿ��� �ʱ�ȭ ��� ����
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	//�׸��� �Լ��� ����
	public void paintComponent(Graphics g) {
		g.drawRect(50, 50, 50, 100);
		g.drawOval(200, 200, 50, 50);
	}
}