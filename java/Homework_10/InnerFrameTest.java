import java.awt.BorderLayout;
import javax.swing.*;

//ũ�⸦ �����ؼ� â 4~5�� ���� �����
//�׸��带 ����ؼ� ��ġ ���� (���� ũ��� ���̱�)
//tab ����� �͵� pane�� ���� �� ����

public class InnerFrameTest {
	JFrame jf;
	JInternalFrame inframe1, inframe2;
	JDesktopPane desktop;				//Inner Frame�� ���� Panel
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
		
		//Inner Frame ���̱�
		desktop.add(inframe1);
		desktop.add(inframe2);
		
		//JFrame setting
		jf.getContentPane().add(desktop);
		jf.setSize(600, 600);
		jf.setVisible(true);
	}
}
