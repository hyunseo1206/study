import java.awt.BorderLayout;
import javax.swing.*;

//크기를 조절해서 창 4~5개 정도 만들기
//그리드를 사용해서 배치 관련 (같은 크기로 붙이기)
//tab 만드는 것도 pane에 붙일 수 있음

public class InnerFrameTest {
	JFrame jf;
	JInternalFrame inframe1, inframe2;
	JDesktopPane desktop;				//Inner Frame의 상위 Panel
	JButton ok;
	
	public InnerFrameTest(String msg) {
		jf = new JFrame(msg);
		
		inframe1 = new JInternalFrame("Inner Frame 1");
		inframe2 = new JInternalFrame("Inner Frame 2");
		
		desktop = new JDesktopPane();
		
		//Inner Frame Setting
		ok = new JButton("OK");
		inframe1.getContentPane().add(ok, BorderLayout.SOUTH);
		inframe1.setSize(200, 200);
		inframe1.setVisible(true);
		
		inframe2.setSize(200, 200);
		inframe2.setVisible(true);
		
		//Inner Frame 붙이기
		desktop.add(inframe1);
		desktop.add(inframe2);
		
		//JFrame setting
		jf.getContentPane().add(desktop);
		jf.setSize(600, 600);
		jf.setVisible(true);
	}
}
