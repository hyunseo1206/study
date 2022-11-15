import javax.swing.*;
import java.awt.*;

class MyPanel1 extends JPanel 
{
	public MyPanel1() {
		//필요한 초기화 기능 설정
		setBorder(BorderFactory.createLineBorder(Color.black));
	}
	
	//그리는 함수를 정의
	public void paintComponent(Graphics g) {
		g.drawRect(50, 50, 50, 100);
		g.drawOval(200, 200, 50, 50);
	}
}