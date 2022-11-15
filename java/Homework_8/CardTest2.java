import java.awt.*;
import java.awt.event.*;

public class CardTest2 {
	Frame f;
	CardLayout card;
	Panel p1, p2, p3;		//Card -- Panel : ī���� ���� �����ֱ� ���� ��ü ���
	Label l1, l2, l3;		//Card�� ������ ���뿡 ���� ��ü ���
	
	public CardTest2() {
		f= new Frame("Card Layout Test");
		
		card = new CardLayout();
		f.setLayout(card);
		
		p1 = new Panel();
		p2 = new Panel(); 
		p3 = new Panel(); 
		
		l1 = new Label("First Label");
		l2 = new Label("Second Label");
		l3 = new Label("Third Label");
		
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.green);
		p3.setBackground(Color.red);
		
		//�̺�Ʈ ó���� ���� ���� Class ���� �� ������ ����
		MouseHandler handler = new MouseHandler();
		p1.add(l1); p1.addMouseListener(handler);
		p2.add(l2); p2.addMouseListener(handler);
		p3.add(l3); p3.addMouseListener(handler);
		
		f.add("First", p1);
		f.add("Second", p2);
		f.add("Third", p3);
		
		//card ���� �����ֱ� ���� ���
		card.show(f, "First");
		
		f.setSize(300,600);
		f.setVisible(true);
	}
	
	public class MouseHandler extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			card.next(f);
		}
	}
}
