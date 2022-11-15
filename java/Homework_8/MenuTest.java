import java.awt.*;

public class MenuTest extends Frame {
	MenuBar mb;
	
	public MenuTest() {
		super("MenuBar Test");
		
		mb = new MenuBar();
		setMenuBar(mb);			//Frame 상단에 MenuBar 설정

		
		Menu file = new Menu("File");
		// Menu item 추가
		MenuItem fileNew = new MenuItem("New");
		MenuItem fileOpen = new MenuItem("Open");
		MenuItem fileExit = new MenuItem("Exit");
		file.add(fileNew); 		file.addSeparator();
		file.add(fileOpen);		file.addSeparator();
		file.add(fileExit);
		
		Menu edit = new Menu("Edit");
		//다른 메뉴를 메뉴에 추가
		Menu sort = new Menu("Sort");
		CheckboxMenuItem byname = new CheckboxMenuItem("by Name");
		CheckboxMenuItem bysize = new CheckboxMenuItem("by Size");
		sort.add(byname);	sort.addSeparator();
		sort.add(bysize);
		edit.add(sort);

		Menu help = new Menu("Help");
		
		mb.add(file);
		mb.add(edit);
		mb.add(help);
		mb.setHelpMenu(help);	// 확인
		setSize(250,250);
		setVisible(true);
		
	}

}
