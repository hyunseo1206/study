package ExceptionHandling;

public class LackMoney extends RuntimeException{
	public LackMoney() {
		super("보유하고 있는 금액이 부족합니다. 주문하고자 하는 책의 가격과 소지하고 계신 돈의 금액을 확인 후 재주문해주세요.");
		//강의를 고른 후에, 입급하고자 하는 금액이 강의료보다 적을 때 (모자를 때) 발생하는 예외.
	}

}
