package chapter11.ex04;

abstract class Car { // 트럭, 자가용, 굴삭기 <== 추상 메소드를 구현한 클래스 생성
	abstract void run();
	abstract void eat();

}

class Truck extends Car {
	@Override
	void run() {
		System.out.println("트럭이 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("전기를 먹습니다.");
	}

}

class Mini extends Car {
	@Override
	void run() {
		System.out.println("자가용이 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("휘발유를 먹습니다.");
	}
}

class Dig extends Car {
	@Override
	void run() {
		System.out.println("굴삭기가 달립니다.");
	}

	@Override
	void eat() {
		System.out.println("경유를 먹습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {

//		Car c1 = new Car();
		Truck c2 = new Truck();
		Mini c3 = new Mini();
		Dig c4 = new Dig();

		c2.run();
		c2.eat();
		System.out.println("============");
		c3.run();
		c3.eat();
		System.out.println("============");
		c4.run();
		c4.eat();
		System.out.println("============");

	}

}
