import java.awt.*;

public class HWLoginUISol {
	Frame f;
	Panel plg, ppw, pp;
	Label llg, lpw, lpress;
	TextField login, passwd;
	Button ok;
	
	public HWLoginUISol(String msg) {
		f = new Frame(msg);
		f.setLayout(new FlowLayout());
		
		plg = new Panel();
		ppw = new Panel();
		pp = new Panel();
		
		llg = new Label("Login");
		lpw = new Label("Password");
		lpress = new Label("Press");
		login = new TextField(50);
		passwd = new TextField(50);
		passwd.setEchoChar('*');
		ok = new Button("OK");

		plg.add(llg);
		plg.add(login);
		ppw.add(lpw);
		ppw.add(passwd);
		pp.add(lpress);
		pp.add(ok);
		
		f.setLayout(null);
		plg.setBounds(100,30,300,100);
		ppw.setBounds(100,130,300,100);
		pp.setBounds(100,230,300,100);
		
		f.add(plg);
		f.add(ppw);
		f.add(pp);
		
		f.setSize(500, 400);
		f.setVisible(true);
	}
}
