package chapter14.ex07;

// 사용자 정의 예외 : 일반 예외 2개를 생성

// 1. 점수가 음수이면 예외를 발생시키는 사용자 정의 예외

class MinusException extends Exception {
	public MinusException() {
		super();	//Exception의 메소드 사용
	}
	public MinusException(String message) {
		super(message);
	}
	
}


// 2. 점수가 100점을 초과하는 경우, 사용자 정의 예외를 강제로 발생시킴

class OverException extends Exception {
	public OverException() {
		super();	//Exception의 메소드 사용
	}
	public OverException(String message) {
		super(message);
	}
	
}

// 사용자 정의 예외를 처리한 클래스 
class Aa {
	void checkScore(int score) throws MinusException, OverException {
		if (score < 0 ) {	//0보다 작으면 마이너스예외 발생시킴
			throw new MinusException("예외 발생 : 음수값 입력 불가");	//일반 예외	
			//위에서 객체를 만들어 throw + 객체변수 해도 되고 if 블락내에서 바로 만들어도 됨.
		} else if (score > 100) {	// 100보다 크면 오버예외 발생 시킴 
			throw new OverException("예외 발생 : 100이상의 값은 입력 불가");	//일반 예외
		} else {
			System.out.println("정상 값입니다.");
		}
	}
}


public class UseUserException {

	public static void main(String[] args) {

		Aa a1 = new Aa();
		try {
			a1.checkScore(100);
		} catch (MinusException | OverException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
