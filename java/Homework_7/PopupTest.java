import java.awt.*;
import java.awt.event.*;

public class PopupTest implements ActionListener { //Event ó�� interface ���
	Frame 		f;
	PopupMenu 	pm;
	Button 		b;
	Menu		col;
	
	public PopupTest() {
		
		f = new Frame("Popup Test : CHS");
		pm = new PopupMenu("Pop-up");
		b = new Button("Pop-up Test");
		
		//Event�� ���� �غ�
		b.addActionListener(this);
		
		pm.add(new MenuItem("copy"));
		pm.add(new MenuItem("patse"));
		
		col = new Menu("color");
		col.add(new MenuItem("red"));
		col.add(new MenuItem("blue"));		
		
		pm.add(col);
		b.add(pm);
		
		f.add("Center", b);
		f.setSize(400, 400);
		f.setVisible(true);
	}
	// implementation for ActionListener
	// overriding fir method that defined in ActionListener interface
	public void actionPerformed(ActionEvent e) { // Event ����
	pm.show(b, 10,10);
	}
}