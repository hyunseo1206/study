import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FileChooserTest extends JFrame implements ActionListener {
	JButton openBtn = new JButton("File Open!");
	JButton saveBtn = new JButton("File Save!");
	JFileChooser fileChooser = new JFileChooser();
	JPanel fcPanel = new JPanel();
	JLabel pathLabel = new JLabel("선택한 파일의 경로 보여주기");
	
	FileChooserTest() {
		setTitle("File Chooser Test");
		setSize(400, 400);
		
		openBtn.addActionListener(this);
		saveBtn.addActionListener(this);
		
		fcPanel.add(openBtn);
		fcPanel.add(saveBtn);
		fcPanel.add(pathLabel);
		
		add(fcPanel, BorderLayout.NORTH);
		add(fileChooser, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		int returnValue;
		
		if(e.getSource() == openBtn) {
			returnValue = fileChooser.showOpenDialog(this);
			
			if(returnValue == JFileChooser.APPROVE_OPTION) {
				String path = fileChooser.getSelectedFile().getPath();
				pathLabel.setText(path);
			} else {
				//cancel...
			}
		} else if (e.getSource() == saveBtn) {
			returnValue = fileChooser.showSaveDialog(this);
			
			if(returnValue == JFileChooser.APPROVE_OPTION) {
				//file saving...
			} else {
				//saving cancel...
			}		
		}
	}
}
