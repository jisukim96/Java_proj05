package chapter13.ex07;

// 3. 매개변수로 받아서 처리 : 인터페이스를 구현한 클래스 (X) 
// 메소드의 인풋 매개변수로 인터페이스를 전송 후 출력

// 인터페이스
interface A {
	void abc();
}


class C {
	// 메소드의 인풋 매개변수의 타입 : 인터페이스 A
	void cde(A a) {
		a.abc();
	}
}

public class AnonymousClass03 {
	public static void main(String[] args) {

//		호출하기위해 C객체 생성
		C c = new C();
		
//	 3. 인터페이스를 구현한 클래스는 없고, 참조변수를 생성 후 참조변수를 매개변수로 입력 후 출력
//		참조 변수 생성 : 인터페이스를 구현한 익명클래스를 생성 
		A a = new A() {	//인터페이스를 오버라이딩하며 객체에 구현부를 바로 입력(인터페이스는 객체생성 불가)
			@Override
			public void abc() {
				System.out.println("3. 참조변수를 사용해서 메소드 매개변수로 입력 후 출력");
			}
		};
		
		//c 객체의 cde() 메소드의 매개변수 : 인터페이스 A 타입의 a객체를 매개변수로 입력 
		c.cde(a);
		
		System.out.println("=====================================");
		
		
//		제일 많이 사용됨.
//	 4. 인터페이스를 구현한 클래스가 존재하지 않는다.참조변수 생성도 하지않음.	
		c.cde(new A() {	
			@Override
			public void abc() {
				System.out.println("4. 참조변수없이 메소드 매개변수로 입력 후 출력");
			}
		});
		
		// 인터페이스 A a 참조변수를 생성하는 구문을 메소드에 매개변수로 입력 후 출력 
		
	}

}
