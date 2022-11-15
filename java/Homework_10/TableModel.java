import javax.swing.*;
import javax.swing.table.*;

public class TableModel extends AbstractTableModel {
	Object[][] data = {
			{"Choi", new Integer(19), "Dev.", new Boolean(true)},
			{"Kim", new Integer(20), "Dev.", new Boolean(true)},
			{"Park", new Integer(21), "Reserach", new Boolean(false)}
	};
	
	//Column Á¤ÀÇ
	String[] columnName = {"Name", "Age", "Dept", "Good?"};
	
	//Overriding Methods
	public int getColumnCount() {
		return columnName.length;
		}
	public int getRowCount() {
		return data.length;	
		}
	public String getColumnName(int col) {
		return columnName[col];
		}
	public Object getValueAt(int row, int col) {
		return data[row][col];
		}
	public Class getColumnClass (int c) {
		return getValueAt(0, c).getClass();	
		}
	public boolean isCellEditable(int row, int col) {
		return true;}
	
	public void setValueAt(Object value, int row, int col) {
		if (data[0][col] instanceof Integer) {
			try {
				data[row][col] = new Integer((String)value);
			} catch (NumberFormatException e) {
				System.err.println("User attempted to enter non-interger");	}
		} else {
			data[row][col] = value;
		}
	}
}
