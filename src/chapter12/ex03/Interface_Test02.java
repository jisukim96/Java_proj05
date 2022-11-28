package chapter12.ex03;

interface Animal1 {
	void cry();
}
interface Animal2 {
	void run();
}
interface Animal3 {
	void eat();
}

// interface extends interface
// 앞에 타입과 뒤의 타입이 동일할 때는 extends
interface K extends Animal1,Animal2,Animal3 {
// cry(),run(),eat()
}

class G implements K{
	@Override
	public void cry() {	}
	@Override
	public void eat() {	}
	@Override
	public void run() {	}
}

class Aa {			// 일반 클래스 : 모든 메소드는 실행부가 존재해야한다.
	void abc() {System.out.println("Aa의 abc()");}
}
abstract class Bb {	// 추상 클래스 : 추상 메소드가 하나라도 존재하면 추상 
	abstract void bcd();
}
	
// extends 키 다음에는 1개의 클래스만 올 수 있다. 클래스는 하나의 부모만 가진다(다중 상속 불가)
//		extends + 일반클래스, 추상클래스 중 하나
// implements 키 다음에는 여러 개의 인터페이스가 올수 있다. 인터페이스는 다중 상속 가능
// extends 키가 먼저 오고 implements 가 다음에 와야한다. 순서 바뀌면 안됨.
class Cc extends Bb implements Animal1,Animal2,Animal3 {
	@Override
	void bcd() { }
	
	@Override
	public void cry() {	}
	@Override
	public void eat() {	}
	@Override
	public void run() {	}
}

public class Interface_Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
