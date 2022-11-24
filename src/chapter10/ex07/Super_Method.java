package chapter10.ex07;

class A{
	A(){System.out.println("A 생성자");}
}
class B extends A {
	B(){
	//	super(); // 생략되어있다. 컴파일러가 자동으로 추가해줌 `자식클래스에서는 기본생성자 외에 super 생성자 호출 가능 
		System.out.println("B 생성자");
	}
}
class C{
	C(int a){
		System.out.println("C 생성자");
	}
}
class D extends C{ //부모클래스(C)에 기본생성자 없음 (오류) > 매개변수 1개인 생성자 호출 (오류없음)
	
	D(){
		super(3);	// 부모클래스(C)에 매개변수 3
		System.out.println("D 생성자");
	}
}


public class Super_Method {

	public static void main(String[] args) {
		// super Method : 부모 클래스의 생성자 호출
		// 		- 자식 클래스 생성자는 기본적으로 super()(부모클래스의 기본생성자 호출 ) 생략되어있음 

		// 1. A 객체 생성
		A aa = new A();		//A클래스의 기본 생성자 호출
		System.out.println("==============");
		
		// 2. B 객체 생성
		B bb = new B();		// A클래스의 기본생성자(생략해도 출력됨) + B클래스의 기본 생성자
		
		System.out.println("==============");
		// 3. D 객체 생성
		D dd = new D();		// C클래스의 매개변수 1개인 생성자 + D클래스 기본 생성자
		
	}

}
