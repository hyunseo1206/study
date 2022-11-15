import javax.swing.*;
import java.awt.event.*;

class JButtonImageTest implements ActionListener {
	JFrame jf;
	JPanel jp;
	JLabel jl;
	JButton jb;
	boolean current = false;
	
	public JButtonImageTest(String msg) {
		//Frame 생성
		jf = new JFrame(msg);
		jf.setTitle("JButton Event : CHS");
		jf.setSize(800, 600);
		
		//Label과 button 생성하여 Panel에 추가
		jl = new JLabel("Click JButton to see Image");
		jb = new JButton("See Image!");
		
		//jb에 대하여 Event 리스너 등록 : click 이벤트를 받을 준비
		jb.addActionListener(this);		//이벤트 대기 상태
		
		jp = new JPanel();
		jp.add(jl);
		jp.add(jb);
		
		//Frame에 panel을 부착
		jf.add(jp);
		jf.setVisible(true);
	}
		//ActionListener 내의 정의된 method에 implement를 함
		//overriding
		//button을 누르면 label의 내용에 이미지 + 설명이 들어가도록 수정
		@Override
		public void actionPerformed(ActionEvent e) {
			ImageIcon dog = new ImageIcon("dog.png");
			jl.setIcon(dog);
			jl.setText("My dog name is Tan");
			jb.setText("Good Luck");
		}
}
