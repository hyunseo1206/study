import javax.swing.*;
import java.awt.*;

public class JButtonTest {
	JButton plus, minus, mux, div;
	
	public JButtonTest(String msg) {
		JFrame jf = new JFrame(msg);
		jf.getContentPane().setLayout(new GridLayout(2,2));
		
		//Image Icon
		ImageIcon iplus = new ImageIcon ("plus.png");
		ImageIcon iminus = new ImageIcon ("minus.png");
		ImageIcon imux = new ImageIcon ("mux.png");
		ImageIcon idivid = new ImageIcon ("divide.png");
		
		//Button (with Icon)
		plus = new JButton(iplus);
		minus = new JButton(iminus);
		mux = new JButton(imux);
		div = new JButton(idivid);
		
		//Attach Button
		jf.getContentPane().add(plus);
		jf.getContentPane().add(minus);
		jf.getContentPane().add(mux);
		jf.getContentPane().add(div);
		
		//JFrame Å©±â ¹× Visible
		jf.setSize(400, 400);
		jf.setVisible(true);	
		
	}

}
