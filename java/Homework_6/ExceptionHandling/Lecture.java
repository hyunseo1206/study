package ExceptionHandling;

public class Lecture {
	public static void main(String args[]) {
		LectureInformation guest = new LectureInformation();
		
		guest.menu();              
		
		try {
			guest.decision(5);      //5�� - ��ü�������α׷��� (40000��)
			//guest.decision(-1) 	//��ȿ���� ���� ������ �� (���� �߻�) _ ������ �ùٸ� ���� ������ �ƴ�.
			//guest.decision(6);    //��ȿ���� ���� ������ �� (���� �߻�) _ 6�� ���� �׸��� ��ȣ��.
			
		}catch(MalformedData me){
			me.printStackTrace();   //���� �޼����� �߻� �ٿ����� ã�Ƽ� �ܰ躰�� ������ ���
			System.exit(0); 		//���� �߻� �� ���α׷��� ����.
		}
		
		try {
			//guest.pay(30000);    	//�����ؾ� �ϴ� �ݾ׺��� ���� �ݾ� ���� �� ���� �߻� (10000�� ����)
			guest.pay(100000);     	
		}catch(LackMoney s) {
			s.printStackTrace();	//�ݾ� ���� �ÿ� ���� �߻�
		}
	}
}
