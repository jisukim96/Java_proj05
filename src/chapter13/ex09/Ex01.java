package chapter13.ex09;

interface Car {
	void run();
	void stop();
	void start();
	
}

class CarPlay{
	void abc(Car c1) {	// *
		c1.run();
		c1.stop();
		c1.start();
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 4번째 방법으로 출력  
		// Car 클래스의 abc() 메소드의 매개변수에 구현한 코드 만들어서 호출
		
		// 1. 메소드 호출을 위한 객체 생성
		CarPlay c = new CarPlay();
		
		// 2. 메소드 호출 시 Car 인터페이스의 메소드를 구현해서 매개변수로 인풋 말이안되는코드구조
		// 자식클래스 (익명클래스) Car라는 인터페이스를 구현한 코드를 바로 출력 JVM에서 자동으로 이름생성
		c.abc(new Car() {	// * 넣는 것과 같은 결과
			@Override
			public void run() {	System.out.println("자동차가 달립니다.");		}
			@Override
			public void stop() { System.out.println("자동차가 멈춥니다.");		}
			@Override
			public void start() { System.out.println("자동차가 출발합니다.");	}
		});
	}
}
