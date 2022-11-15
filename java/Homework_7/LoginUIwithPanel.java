import java.awt.*;
public class LoginUIwithPanel {
	Frame f;
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;
	Panel p1, p2, p3, p4;
	
	public LoginUIwithPanel(String msg) {
		f = new Frame(msg);
		//f.setLayout(new FlowLayout());
		f.setLayout(new BorderLayout());
		
		llg = new Label("Login");
		lpw = new Label("Password");
		lpress = new Label("Press");
		login = new TextField(30);
		passwd = new TextField(30);
		passwd.setEchoChar('*');
		ok = new Button("OK");
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		p4 = new Panel(new GridLayout(2, 1));
		
		p1.add(llg);
		p1.add(login);
		p2.add(lpw);
		p2.add(passwd);
		p3.add(lpress);
		p3.add(ok);
		
		p4.add(p1);
		p4.add(p2);
		
		f.add(p4, "North");
		f.add(p3, "South");
		
		f.setSize(500, 400);
		f.setVisible(true);
	}
	
	public LoginUIwithPanel() {
		f = new Frame("LoginUI");
		f.setLayout(new FlowLayout());
		
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
		
		f.add(p1);
		f.add(p2);
		f.add(p3);
		
		f.setSize(500, 400);
		f.setVisible(true);
	}
	

}
