package ExceptionHandling;

public class LackMoney extends RuntimeException{
	public LackMoney() {
		super("�����ϰ� �ִ� �ݾ��� �����մϴ�. �ֹ��ϰ��� �ϴ� å�� ���ݰ� �����ϰ� ��� ���� �ݾ��� Ȯ�� �� ���ֹ����ּ���.");
		//���Ǹ� �� �Ŀ�, �Ա��ϰ��� �ϴ� �ݾ��� ���ǷẸ�� ���� �� (���ڸ� ��) �߻��ϴ� ����.
	}

}
