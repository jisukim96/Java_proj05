package chapter10.ex08;
class A{
	A(){
		this(3);	// 자신 객체의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	A(int a){
		System.out.println("A 생성자 2");
	}
}
class B extends A{ // 자식 클래스는 생성자 첫라인에 super()/this() 반드시 와야함 ( 생략되었다? = super() ) 
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	B(int a){
	//	super();
		System.out.println("B 생성자 2");
	}
}
public class Super_Method03 {

	public static void main(String[] args) {

		// 1. 객체 생성 후 출력
		A aa1 = new A();	// A 생성자 2 먼저 출력 후, 생성자 1 출력
		System.out.println("================");
		
		// 2. A 매개변수 1개인 생성자 호출
		A aa2 = new A(3);	// A 생성자 2
		System.out.println("================");
		
		// 3. B 기본 생성자 호출
		B bb1 = new B();	// A 생성자 2 , A 생성자 1 , B 생성자 2 , B 생성자 1
		System.out.println("================");
		
		// 4. B 매개변수 1개인 생성자 호출 
		B bb2 = new B(3);	//A 생성자 2 , A 생성자 1 , B 생성자 2

	}
}
