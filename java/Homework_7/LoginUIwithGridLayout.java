import java.awt.*;
public class LoginUIwithGridLayout {
	Frame f;
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;
	Panel p1, p2, p3;
	
	public LoginUIwithGridLayout(String msg) {
		f = new Frame(msg);
		f.setLayout(new GridLayout(3,1));
		
		llg = new Label("Login");
		lpw = new Label("Password");
		lpress = new Label("Press");
		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');
		ok = new Button("OK");
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		p1.add(llg);
		p1.add(login);
		p2.add(lpw);
		p2.add(passwd);
		p3.add(lpress);
		p3.add(ok);
		
		f.add(p1, new Button("north"));
		f.add(p2, new Button("center"));
		f.add(p3, new Button("south"));
		
		f.setSize(500, 400);
		f.setVisible(true);
	}
}