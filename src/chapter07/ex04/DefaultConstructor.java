package chapter07.ex04;

class A{
	// 필드 : 클래스블락에 선언된 변수 - 인스턴스 필드 : 객체를 생성해야 호출 , static 필드 : 클래스명으로 호출
	int m;
	
	// 기본 생성자 생략 : 다른 생성자가 없을 시 생략 
	// A(){}
	
	// 메소드 
	void work() {
		System.out.println(m);		// 기본값(int) : 0
	}	
}

class B{
	int m;
	B (){}		// 기본 생성자 : 명시
	void work() {
		System.out.println(m);		// 기본값(int) : 0		
	}
}

class C{
	int m;
	// 기본 생성자 생략됨 : 인풋 값이 없는 생성자 
//	C(){}
	C (int m){			// 생성자 : 인풋값 1개를 받는 생성자
		this.m = m;			// 인풋 매개변수 ==> 실행블락의 변수 => 필드의 변수 이름이 모두 동일할 경우
	}					// this 자신의 객체를 필드
	void work(){
	System.out.println(m);
		}
}

public class DefaultConstructor {

	public static void main(String[] args) {
		//  생성자(constructor) : 객체를 생성할 때 호출,
			// 리턴없고 클래스 이름과 동일한 메소드
			// 기본 생성자는 생략 가능 : A () {} , 클래스 내부에 다른 생성자가 존재할 때, 명시	
		
		// 1. A 클래스의 객체를 생성하고 메소드 호출 : 기본 생성자가 생략됨.
		A a = new A();		// new A();		// 기본 생성자 호출 : 생략됨
		a.work();
		
		// 2. B 클래스 : 기본 생성자 명시됨.
		B b = new B();
		b.work();
		
		// 3. C 클래스 : 기본 생성자 생략됨, 인풋값을 1개 받는 다른 생성자 존재.
	//	C c = new C();		// 오류 발생 : 클래스 내의 다른 생성자가 존재할 시 기본 생성자는 명시해줘야함.
		C c1 = new C(3);	// 정수 1개 들어간 객체생성
		c1.work();
	}

}
