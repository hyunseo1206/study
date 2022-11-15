import java.awt.*;

public class FileDialogTest extends Frame {
	
	FileDialog fd;
	
	public FileDialogTest(String title) {
		super(title);
		fd = new FileDialog(this, "Filedialog");
		
		setSize(300,200);
		setVisible(true);
		fd.setSize(600,600);
		fd.setVisible(true);
	}

}
