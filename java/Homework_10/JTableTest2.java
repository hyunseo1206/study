import javax.swing.*;

public class JTableTest2 {
	JTable table;
	
	public JTableTest2(String msg) {
		JFrame jf = new JFrame(msg);
		Object [][] data = {
				{"Yoon", new Integer(30), "Yoon@sm.ac.kr"},
				{"Choi", new Integer(30), "Choi@sm.ac.kr"},
				{"Lee", new Integer(30), "Lee@sm.ac.kr"}
		};
		
		String[] columnName = {"Name", "Age", "E-mail"};
		
		table = new JTable(data, columnName);
		jf.getContentPane().add(new JScrollPane(table), "Center");
		jf.setSize(300, 200);
		jf.setVisible(true);
	}
}
