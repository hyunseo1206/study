import java.awt.*;

public class LoginUI {
	Frame f;
	// UI 관련 변수 선언
	Label llg, lpw, lnote;
	TextField login, passwd;
	TextArea note;
	
	public LoginUI(String msg) {
		f = new Frame(msg);
		f.setLayout(new FlowLayout());
		
		// UI 관련 Component의 객체 생성
		llg = new Label("Login");
		lpw = new Label("Password");
		lnote = new Label("주석");
		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');
		note = new TextArea("주석을 다세요",20, 50);
		
		// 생성된 Component 객체의 배치
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(lnote);
		f.add(note);
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
