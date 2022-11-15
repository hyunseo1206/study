package ExceptionHandling;

public class Lecture {
	public static void main(String args[]) {
		LectureInformation guest = new LectureInformation();
		
		guest.menu();              
		
		try {
			guest.decision(5);      //5번 - 객체지향프로그래밍 (40000원)
			//guest.decision(-1) 	//유효하지 않은 범위의 수 (예외 발생) _ 음수는 올바른 값의 범위가 아님.
			//guest.decision(6);    //유효하지 않은 범위의 수 (예외 발생) _ 6은 없는 항목의 번호임.
			
		}catch(MalformedData me){
			me.printStackTrace();   //에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력
			System.exit(0); 		//예외 발생 시 프로그램을 종료.
		}
		
		try {
			//guest.pay(30000);    	//지불해야 하는 금액보다 적은 금액 지불 시 오류 발생 (10000원 부족)
			guest.pay(100000);     	
		}catch(LackMoney s) {
			s.printStackTrace();	//금액 부족 시에 예외 발생
		}
	}
}
