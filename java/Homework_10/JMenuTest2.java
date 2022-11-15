import java.awt.event.ActionEvent;
import java.awt.event.*;
import javax.swing.*;

public class JMenuTest2 implements ActionListener {
	JMenuBar bar;
	JMenu file, style;
	JMenuItem fileNew;
	JCheckBoxMenuItem lineNum;
	JRadioButtonMenuItem windows, linux;
	JFrame jf;
	
	public JMenuTest2 (String msg) {
		jf = new JFrame(msg);
		
		makeMenu();
		jf.setSize(500, 500);
		jf.setVisible(true);
	}
	
	void makeMenu() {
		// 메뉴를 위한 객체 생성
		bar = new JMenuBar();
		file = new JMenu("File");
		file.setMnemonic('F');
		fileNew = new JMenuItem("New");
		fileNew.addActionListener(this);
		file.add(fileNew);
		file.addSeparator();
		
		lineNum = new JCheckBoxMenuItem("Line Number");
		lineNum.addActionListener(this);
		style = new JMenu("Style");
		file.add(lineNum);
		file.add(style);
		
		windows = new JRadioButtonMenuItem("Windows Style", true);
		windows.addActionListener(this);
		linux = new JRadioButtonMenuItem("Linux Style");
		linux.addActionListener(this);
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(windows);
		bg.add(linux);
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
