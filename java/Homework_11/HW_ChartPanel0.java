import java.awt.*;
import javax.swing.*;

public class HW_ChartPanel0 extends JPanel {
	public HW_ChartPanel0() {
		setLayout(new BorderLayout());
		
		JPanel panelnorth = new JPanel();
		
		ImageIcon me = new ImageIcon("my.jpg");
		JLabel label1 = new JLabel(me, JLabel.CENTER);
		panelnorth.add(label1);
		
		JPanel panelsouth = new JPanel();
		Font font = new Font("", Font.PLAIN, 10);
		
		JLabel label2 = new JLabel("제가 수강하는 강의는 총 7개입니다.");
		JLabel label3 = new JLabel("월요일 3개, 화요일 2개, 수요일 3개, 목요일 3개, 금요일 1개입니다.");
		JLabel label4 = new JLabel("전공은 월요일과 수요일은 3개, 화요일과 목요일은 2개입니다.");
		JLabel label5 = new JLabel("그 외에 알바, 운동, 학생회를 하고 있습니다.");
		JLabel label6 = new JLabel("이러한 값을 원형, 막대, 선형, 그림차트로 만들어");
		JLabel label7 = new JLabel("나만의 차트를 만듭니다.");
		
		label2.setFont(font);
		label3.setFont(font);
		label4.setFont(font);
		label5.setFont(font);
		label6.setFont(font);
		label7.setFont(font);
		
		panelsouth.add(label2);
		panelsouth.add(label3);
		panelsouth.add(label4);
		panelsouth.add(label5);
		panelsouth.add(label6);
		panelsouth.add(label7);
		
		setLayout(new GridLayout(2,1));
		add(panelnorth);
		add(panelsouth);
		
		setSize(300, 300);
		setVisible(true);
	}
}
