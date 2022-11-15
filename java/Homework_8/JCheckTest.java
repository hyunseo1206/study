import javax.swing.*;

public class JCheckTest {
	JFrame jf;
	JCheckBox major, submajor, interdis;
	JRadioButton fre, som, jun, sen;
	JToggleButton onoff;
	
	public JCheckTest(String msg) {
		jf = new JFrame(msg);
		
		major = new JCheckBox("Major", true);
		submajor = new JCheckBox("Sub Major", false);
		interdis = new JCheckBox("Inter Disciplinary", false);
		
		fre = new JRadioButton("Freshman", true);
		som = new JRadioButton("Spphomore", false);
		jun = new JRadioButton("Junior", false);
		sen = new JRadioButton("Senior", false);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(fre); bg.add(som); bg.add(jun); bg.add(sen);
		
		onoff = new JToggleButton("On/Off");
		
		JPanel jp1 = new JPanel();
		jp1.add(major);
		jp1.add(submajor);
		jp1.add(interdis);
		
		JPanel jp2 = new JPanel();
		jp2.add(fre);
		jp2.add(som);
		jp2.add(jun);
		jp2.add(sen);
		
		jf.getContentPane().add("North", jp1);
		jf.getContentPane().add("Center", jp2);
		jf.getContentPane().add("South", onoff);
		
		jf.setSize(600, 600);
		jf.setVisible(true);
	}
}
