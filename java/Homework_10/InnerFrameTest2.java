import javax.swing.*;
import java.awt.*;

public class InnerFrameTest2 {
	JDesktopPane desktop;
	JInternalFrame inframe1, inframe2, inframe3, inframe4, inframe5, inframe6;
	JButton ok;
	
	public InnerFrameTest2(String msg) {
		JFrame jf = new JFrame(msg);
		desktop = new JDesktopPane();
		inframe1 = new JInternalFrame("Inner Frame 1", true, true, false, false);
		
		ok = new JButton("OK");
		inframe1.getContentPane().add(ok, BorderLayout.SOUTH);
		inframe1.setSize(200, 200);
		inframe1.setVisible(true);
		
		inframe2 = new JInternalFrame("Inner Frame 2", true, true, false, false);
		JPanel jp = new JPanel();
		ImageIcon logo = new ImageIcon("sm_logo.png");
		JButton icon = new JButton(logo);
		jp.add(icon);
		inframe2.getContentPane().add(jp, BorderLayout.SOUTH);
		inframe2.setSize(200, 200);
		inframe2.setVisible(true);
		
		inframe3 = new JInternalFrame("Inner Frame 3", true, true, false, false);
		JPanel jp1 = new JPanel();
		ImageIcon logo1 = new ImageIcon("dog.png");
		JButton icon1 = new JButton(logo1);
		jp1.add(icon1);
		inframe3.getContentPane().add(jp1, BorderLayout.SOUTH);
		inframe3.setSize(200, 200);
		inframe3.setVisible(true);
		
		inframe4 = new JInternalFrame("Inner Frame 4", true, true, false, false);
		JPanel jp2 = new JPanel();
		ImageIcon logo2 = new ImageIcon("apple.jpeg");
		JButton icon2 = new JButton(logo2);
		jp2.add(icon2);
		inframe4.getContentPane().add(jp2, BorderLayout.SOUTH);
		inframe4.setSize(200, 200);
		inframe4.setVisible(true);
		
		inframe5 = new JInternalFrame("Inner Frame 5", true, true, false, false);
		JPanel jp3 = new JPanel();
		ImageIcon logo3 = new ImageIcon("pear.jpeg");
		JButton icon3 = new JButton(logo3);
		jp3.add(icon3);
		inframe5.getContentPane().add(jp3, BorderLayout.SOUTH);
		inframe5.setSize(200, 200);
		inframe5.setVisible(true);
		
		inframe6 = new JInternalFrame("Inner Frame 6", true, true, false, false);
		JPanel jp4 = new JPanel();
		ImageIcon logo4 = new ImageIcon("grape.jpeg");
		JButton icon4 = new JButton(logo4);
		jp4.add(icon4);
		inframe6.getContentPane().add(jp4, BorderLayout.SOUTH);
		inframe6.setSize(200, 200);
		inframe6.setVisible(true);
		
		desktop.add(inframe1);
		desktop.add(inframe2);
		desktop.add(inframe3);
		desktop.add(inframe4);
		desktop.add(inframe5);
		desktop.add(inframe6);
		
		jf.getContentPane().add(desktop, BorderLayout.CENTER);
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.setSize(800, 800);
		jf.setVisible(true);
	}
}
