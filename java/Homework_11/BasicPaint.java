import javax.swing.*;

public class BasicPaint 
{
	BasicPaint(String msg)
	{
		JFrame jf = new JFrame(msg);
		
		//�׸��� ���� panel ����
		MyPanel1 mypanel1 = new MyPanel1();
		
		//mypanel ���̱�
		jf.add(mypanel1);
		
		//Frame setting
		jf.setSize(600, 600);
		jf.setVisible(true);
	}
}