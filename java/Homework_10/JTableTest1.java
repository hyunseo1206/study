import javax.swing.*;
import java.awt.*;

public class JTableTest1 {
	public JTableTest1(String msg) {
		JFrame jf = new JFrame(msg);
		
		//Table column ����
		String columnName[] = {"Name", "Phone", "E-mail"};
		
		//Data ����
		String data[][] = {
				{"������1", "02-000-000", "chss0520@sm.ac.kr"},
				{"������2", "010-9004-0521", "chss0520@naver.com"}
		};
		
		//Table ����
		JTable table = new JTable(data, columnName);
		//Table�� ������ ���� ��� ScrollPane ���
		JScrollPane sp = new JScrollPane(table);
		
		//Table ���̱�
		jf.getContentPane().add(sp, BorderLayout.CENTER);
		jf.setSize(400, 200);
		jf.setVisible(true);
	}
}
