import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class JMenuTest implements ActionListener {
	JMenuBar bar;
	JMenu file, style;
	JMenuItem fileNew;
	JCheckBoxMenuItem lineNum;
	JRadioButtonMenuItem windows, linux;
	JFrame jf;
	
	public JMenuTest (String msg) {
		jf = new JFrame(msg);
		
		makeMenu();
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
	
	void makeMenu() {
		// 메뉴를 위한 객체 생성
		bar = new JMenuBar();
		file = new JMenu("File");
		style = new JMenu("Style");
		fileNew = new JMenuItem("New");
		lineNum = new JCheckBoxMenuItem("Line Number");
		windows = new JRadioButtonMenuItem("Windows");
		linux = new JRadioButtonMenuItem("Linux");
		
		// 메뉴를 위한 구성
		file.add(fileNew); file.addSeparator();
		file.add(lineNum);
		file.add(style);
		
		style.add(windows);
		style.add(linux);
		
		bar.add(file);
		jf.setJMenuBar(bar);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		if (o == file) {
			System.out.println("File");
		} else if (o==fileNew) {
			System.out.println("New");
		} else if (o == lineNum) {
			if(lineNum.isSelected())
				System.out.println("Line Number");
		} else if (o == windows) {
			System.out.println("Windows");
		} else if (o == linux) {
			System.out.println("Linux");
		}
	}
}
