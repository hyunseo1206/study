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
		
		JLabel label2 = new JLabel("���� �����ϴ� ���Ǵ� �� 7���Դϴ�.");
		JLabel label3 = new JLabel("������ 3��, ȭ���� 2��, ������ 3��, ����� 3��, �ݿ��� 1���Դϴ�.");
		JLabel label4 = new JLabel("������ �����ϰ� �������� 3��, ȭ���ϰ� ������� 2���Դϴ�.");
		JLabel label5 = new JLabel("�� �ܿ� �˹�, �, �л�ȸ�� �ϰ� �ֽ��ϴ�.");
		JLabel label6 = new JLabel("�̷��� ���� ����, ����, ����, �׸���Ʈ�� �����");
		JLabel label7 = new JLabel("������ ��Ʈ�� ����ϴ�.");
		
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
