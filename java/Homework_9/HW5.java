import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW5 implements ActionListener {
	JFrame jf;
	JPanel jp;
	JLabel jl, jl2;
	JButton jb;
	boolean current = false;
	
	public HW5(String msg) {
		jf = new JFrame(msg);
		jf.setTitle("JButton Event Back : CHS");
		jf.setSize(700, 550);
		
		jp = new JPanel();
		jl = new JLabel("MY DOG를 보고 싶으면 아래 버틴을 누르시오.");
		jl2 = new JLabel("");
		jb = new JButton("See lmage!");
		
		jb.addActionListener(this);
		
		jp.add(jl);
		jp.add(jl2);
		jp.add(jb);
		
		jf.add(jp);
		jf.setVisible(true);	
	}
	public void actionPerformed(ActionEvent e) {
		if(current) {
			jl2.setIcon(null);
			jl.setText("MY DOG을 보고 싶으면 아래 버튼을 누르세요.");
			current = false;
		} else {
			ImageIcon dog = new ImageIcon("dog.png");
			jl2.setIcon(dog);
			jl.setText("Good Luck : 초기화면으로 가려면 버튼을 누르세요");
			current = true;
		}
	}
}
