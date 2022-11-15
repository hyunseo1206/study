import javax.swing.*;

public class BasicPaint 
{
	BasicPaint(String msg)
	{
		JFrame jf = new JFrame(msg);
		
		//그리기 위한 panel 생성
		MyPanel1 mypanel1 = new MyPanel1();
		
		//mypanel 붙이기
		jf.add(mypanel1);
		
		//Frame setting
		jf.setSize(600, 600);
		jf.setVisible(true);
	}
}