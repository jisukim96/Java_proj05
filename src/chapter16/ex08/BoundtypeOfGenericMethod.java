package chapter16.ex08;
//제너릭 메소드의 타입 제한

class A {
	//Number : boolean,Charter 를 제외한 정수, 실수를 처리하는
		//Byte , Short,Integer , Long , Float,Double
	
	public <T extends Number> void method1 (T t) {
		//Object 클래스의 메소드 외의 Number의 메소드를 사용할 수 있다.
		System.out.println(t.intValue());	// intValue() : Number의 메소드 - 들어오는 타입의 값을 던져줘라
	}
}
//인터페이스
interface MyInterface {
	void print();	//public abstract
}

class B {
	
	// T : MyInterface 하위의 구현클래스가 올 수 있다. 
	// 주의: 타입을 제한할 때 뒤에 인터페이스가 오더라도 extends를 사용함!
	public <T extends MyInterface> void method1 (T t) {
		t.print();
	}
}

public class BoundtypeOfGenericMethod {

	public static void main(String[] args) {

		A a = new A();
		a.<Double>method1(10.11);
		a.method1(5.8);		//Double 타입
		a.<Integer>method1(100);
		a.method1(200);
		
//		a.<String>method1("HI"); //오류 : Number타입만 올수 있다.
		
		B b =new B();
		b.<MyInterface> method1(new MyInterface() {	//인터페이스를 객체화 할수 없음 : 익명으로 객체 생성 즉시 구현 (익명으로 오버라이딩 중)
			@Override
			public void print() {
				System.out.println("print() 구현됨");
			}
		});
		
		//인풋되는 타입을 생략
		b.method1(new MyInterface() {	
			@Override
			public void print() {
				System.out.println("print() 구현됨2");
			}
		});
		
	}

}
