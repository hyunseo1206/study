import javax.swing.*;
import java.awt.*;

public class TabTest {
	JFrame jf;
	JTabbedPane tp;
	
	public TabTest(String msg){
		jf = new JFrame(msg);
		tp = new JTabbedPane();
		
		//Tab�� ���� ���� Panel ���� : Tab�� �����ϴ� Panel ����
		JPanel one = new JPanel();
		JPanel two = new JPanel();
		JPanel three = new JPanel();
		JPanel four = new JPanel();
		
		tp.addTab("SMU", one);
		tp.addTab("TAN", two); 
		tp.addTab("PEAR", three);
		tp.addTab("APPLE", four);
		
		one.setBackground(Color.red);
		two.setBackground(Color.yellow);
		three.setBackground(Color.blue);
		four.setBackground(Color.green);
		
		// Tab1 ���� �ֱ� (panel�� ����)
		ImageIcon logo = new ImageIcon("sm_logo.png");
		JLabel label=new JLabel("SMU Logo", logo, JLabel.CENTER);
		label.setFont(new Font("����", Font.BOLD, 30));
		one.add(label);
		
		//Tab2 ���� �ֱ�
		ImageIcon dog = new ImageIcon("dog3.png");
		JLabel label2 = new JLabel("Dog", dog, JLabel.RIGHT);
		label2.setFont(new Font("����", Font.BOLD, 30));
		two.add(label2);
		
		//Tab3 ���� �ֱ�
		ImageIcon pear = new ImageIcon("pear.jpeg");
		JLabel label3 = new JLabel("pear", pear, JLabel.RIGHT);
		label3.setFont(new Font("����", Font.BOLD, 30));
		three.add(label3);
	
		//Tab4 ���� �ֱ�
		ImageIcon apple = new ImageIcon("apple.jpeg");
		JLabel label4 = new JLabel("Apple", apple, JLabel.RIGHT);
		label4.setFont(new Font("����", Font.BOLD, 30));
		four.add(label4);
		
		jf.getContentPane().add(tp,BorderLayout.CENTER);
		jf.setSize(600,600);
		jf.setVisible(true);
	}
}