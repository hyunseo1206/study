package ExceptionHandling;

public class MalformedData extends RuntimeException{
	public MalformedData() {
		super ("������ ������ �߸��Ǿ����ϴ�.");
		//���� ��ȣ�� ���Ǹ� ���ų�, �߸��� ������ ���� �޾��� ���� �߻��ϰ� ��.
	}
}