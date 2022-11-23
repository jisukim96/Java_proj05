package chapter10.ex03;

class Fruit{		//Fruit의 메소드를 오버라이딩해서 출력. Apple, Banana , Orange
	void Eat() {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
}
class Apple extends Fruit{
	void Eat() {
		System.out.println(" 사과는 아삭합니다.");
	}
}
class Banana extends Fruit{
	void Eat() {
		System.out.println(" 바나나는 달콤합니다.");
	}
}
class Orange extends Fruit{
	void Eat() {
		System.out.println(" 오렌지는 상큼합니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruit a1 = new Apple();
		Fruit b1 = new Banana();
		Fruit o1 = new Orange();
		
		a1.Eat();
		b1.Eat();
		o1.Eat();
		
	}
}
