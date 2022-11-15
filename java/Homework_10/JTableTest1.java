import javax.swing.*;
import java.awt.*;

public class JTableTest1 {
	public JTableTest1(String msg) {
		JFrame jf = new JFrame(msg);
		
		//Table column 설정
		String columnName[] = {"Name", "Phone", "E-mail"};
		
		//Data 설정
		String data[][] = {
				{"최현서1", "02-000-000", "chss0520@sm.ac.kr"},
				{"최현서2", "010-9004-0521", "chss0520@naver.com"}
		};
		
		//Table 생성
		JTable table = new JTable(data, columnName);
		//Table의 내용이 많은 경우 ScrollPane 사용
		JScrollPane sp = new JScrollPane(table);
		
		//Table 붙이기
		jf.getContentPane().add(sp, BorderLayout.CENTER);
		jf.setSize(400, 200);
		jf.setVisible(true);
	}
}
