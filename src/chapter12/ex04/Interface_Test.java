package chapter12.ex04;

// 인터페이스에서 선언된 메소드를 구현하는 방법 2가지
//	 1. 인터페이스에 선언된 메소드를 구현한 클래스 생성 후 출력.
//		매번 자주 사용하는 경우 
//	 2. 익명 클래스로 바로 출력
//		한번만 사용하고 버리는 경우, 별도의 클래스를 만들지 않고 바로 출력.

interface A {
	void abc();	//public
}

// 1. A 인터페이스의 메소드를 구현하는 클래스를 생성 후 출력
class Aa implements A {
	@Override
	public void abc() {
		System.out.println("객체 생성 후 메소드 완성 : Aa");
	}
}

// 2. 익명 클래스를 사용해서 출력 , 구현한 자식 클래스가 없다.
interface B {
	void bcd();
}


public class Interface_Test {

	public static void main(String[] args) {
		
		
//		1. A 인터페이스의 선언된 메소드를 구현한 클래스를 생성 후 출력 : Aa
//				매번 자주 사용할 경우 구현된 자식 클래스를 생성 후 출력
		A a1 = new Aa();
		a1.abc();
		
		A a2 = new Aa();
		a2.abc();
		
		A a3 = new Aa();
		a3.abc();
		
//		2. 구현된 자식 클래스를 생성하지 않고 익명클래스로 출력
//		B b1 = new B();		B는 인터페이스이기 때문에 객체 생성 불가
		
//		익명 클래스로 출력
		B b1 = new B() {
			@Override
			public void bcd() {
				System.out.println("B 인터페이스의 구현된 메소드 bcd()");
			}
		};
		b1.bcd();
		
		B b2 = new B() {
			@Override
			public void bcd() {
			System.out.println("객체 생성없이 바로 오버라이딩됨");	
			}
		};
		b2.bcd();
	}

}
