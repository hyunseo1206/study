package ExceptionHandling;

public class MalformedData extends RuntimeException{
	public MalformedData() {
		super ("데이터 포맷이 잘못되었습니다.");
		//없는 번호의 강의를 고르거나, 잘못된 형식의 값을 받았을 때에 발생하게 됨.
	}
}