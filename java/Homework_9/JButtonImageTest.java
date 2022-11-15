import javax.swing.*;
import java.awt.event.*;

class JButtonImageTest implements ActionListener {
	JFrame jf;
	JPanel jp;
	JLabel jl;
	JButton jb;
	boolean current = false;
	
	public JButtonImageTest(String msg) {
		//Frame ����
		jf = new JFrame(msg);
		jf.setTitle("JButton Event : CHS");
		jf.setSize(800, 600);
		
		//Label�� button �����Ͽ� Panel�� �߰�
		jl = new JLabel("Click JButton to see Image");
		jb = new JButton("See Image!");
		
		//jb�� ���Ͽ� Event ������ ��� : click �̺�Ʈ�� ���� �غ�
		jb.addActionListener(this);		//�̺�Ʈ ��� ����
		
		jp = new JPanel();
		jp.add(jl);
		jp.add(jb);
		
		//Frame�� panel�� ����
		jf.add(jp);
		jf.setVisible(true);
	}
		//ActionListener ���� ���ǵ� method�� implement�� ��
		//overriding
		//button�� ������ label�� ���뿡 �̹��� + ������ ������ ����
		@Override
		public void actionPerformed(ActionEvent e) {
			ImageIcon dog = new ImageIcon("dog.png");
			jl.setIcon(dog);
			jl.setText("My dog name is Tan");
			jb.setText("Good Luck");
		}
}
