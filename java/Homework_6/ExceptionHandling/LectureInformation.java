package ExceptionHandling;

public class LectureInformation {
	int order;
	int balance;
	String[] lecturearr = {"���α׷����Թ�", "IT���������", "�������α׷���", "������׺���", "��ü�������α׷���"};
	int[] pricearr= {65000, 70000, 50000, 90000, 40000};
	
	//�ý��� �� �޴� �ȳ�
	public void menu() {
		System.out.println("�ݰ����ϴ�. �ູ�� �߱��ϴ� ���� �н�ƮǪ�� �ڹ��� �Դϴ�.");
		System.out.println("���Ͻô� �޴��� ��ȣ�� �����ϰ� ������ �Ϸ�Ǹ� ������ �غ��� �帮�ڽ��ϴ�.");
		System.out.println("\n1�� �޴� : ���α׷����Թ� (65000��)");
		System.out.println("2�� �޴� : IT��������� (70000��)");
		System.out.println("3�� �޴� : �������α׷��� (50000��)");
		System.out.println("4�� �޴� : ������׺��� (90000��)");
		System.out.println("5�� �޴� : ��ü�������α׷��� (40000��)");
	}
	
	//���ǿ� ���� ��ȣ�� �Է� �޴� �޼ҵ�
	public void decision(int menunum) throws MalformedData {
		//������ ���� 1��~5���̾�� ��
		//���� �� 0 �� �ԷµǸ� ���� ó��
		if (menunum <= 0) { 
			throw new MalformedData();
		}
		//5���� ū ���� �ԷµǸ� ���� ó��
		if (menunum > 6) {
			throw new MalformedData();
		}
		//�迭�� �̸� ����, �ε��� ��ȣ���� ����Ͽ� -1
		order = menunum - 1;
		System.out.println("\n���� ���� : " + lecturearr[order] + "\t������ : " + pricearr[order]);
	}
	
	//���Ƿ� ������ �ϴ� �޼ҵ�
	public void pay(int total) {
		//�����ؾ� �ϴ� �ݾ��� ���
		System.out.println("\n���� �ݾ� : " + total);
		//�����ϴ� ���� ���ǷẸ�� ���� ��� ���� ó�� 
		if (total < pricearr[order]) {
			throw new LackMoney();
		}
		//�����ϴ� ���� ���ǷẸ�� ���� ��� ���
		if (total > pricearr[order]) {
			//�Ž����� ��� �� �ȳ�
			balance = total - pricearr[order];
			System.out.println("�Ž����� " + balance + "���� ��ȯ�˴ϴ�.");
		}
		//�����ϴ� ���� ���Ƿ�� ��ġ�� �� ���
		if (total == pricearr[order]) {
			System.out.println("������� ���� �ݾ��� ��ġ�մϴ�.");
		}
		//���� ���� ó�� �ȳ� �޼��� ���
		System.out.println("\n������ ���������� ó���Ǿ����ϴ�. ��ſ� �н� �ð��� �ǽñ⸦ �ٶ��ϴ�.");
	}
}
