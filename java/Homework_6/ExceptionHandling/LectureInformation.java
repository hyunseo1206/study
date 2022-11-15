package ExceptionHandling;

public class LectureInformation {
	int order;
	int balance;
	String[] lecturearr = {"프로그래밍입문", "IT기술의이해", "기초프로그래밍", "서버운영및보안", "객체지향프로그래밍"};
	int[] pricearr= {65000, 70000, 50000, 90000, 40000};
	
	//시스템 및 메뉴 안내
	public void menu() {
		System.out.println("반갑습니다. 행복을 추구하는 숙명 패스트푸드 자바점 입니다.");
		System.out.println("원하시는 메뉴의 번호를 선택하고 결제가 완료되면 음식을 준비해 드리겠습니다.");
		System.out.println("\n1번 메뉴 : 프로그래밍입문 (65000원)");
		System.out.println("2번 메뉴 : IT기술의이해 (70000원)");
		System.out.println("3번 메뉴 : 기초프로그래밍 (50000원)");
		System.out.println("4번 메뉴 : 서버운영및보안 (90000원)");
		System.out.println("5번 메뉴 : 객체지향프로그래밍 (40000원)");
	}
	
	//강의에 댜한 번호를 입력 받는 메소드
	public void decision(int menunum) throws MalformedData {
		//범위의 수는 1번~5번이어야 함
		//음수 및 0 이 입력되면 예외 처리
		if (menunum <= 0) { 
			throw new MalformedData();
		}
		//5보다 큰 값이 입력되면 예외 처리
		if (menunum > 6) {
			throw new MalformedData();
		}
		//배열에 미리 저장, 인덱스 번호임을 고려하여 -1
		order = menunum - 1;
		System.out.println("\n수강 강의 : " + lecturearr[order] + "\t수강료 : " + pricearr[order]);
	}
	
	//강의료 지불을 하는 메소드
	public void pay(int total) {
		//지불해야 하는 금액을 출력
		System.out.println("\n지불 금액 : " + total);
		//지불하는 돈이 강의료보다 적을 경우 예외 처리 
		if (total < pricearr[order]) {
			throw new LackMoney();
		}
		//지불하는 돈이 강의료보다 많을 경우 출력
		if (total > pricearr[order]) {
			//거스름돈 계산 및 안내
			balance = total - pricearr[order];
			System.out.println("거스름돈 " + balance + "원이 반환됩니다.");
		}
		//지불하는 돈이 강의료와 일치할 때 출력
		if (total == pricearr[order]) {
			System.out.println("수강료와 지불 금액이 일치합니다.");
		}
		//수행 정상 처리 안내 메세지 출력
		System.out.println("\n결제가 정상적으로 처리되었습니다. 즐거운 학습 시간이 되시기를 바랍니다.");
	}
}
