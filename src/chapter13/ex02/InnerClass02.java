package chapter13.ex02;

// 이너클래스에서 외부 클래스의 필드와 메소드 접근

// 메소드 오버라이딩 : 1. 반드시 상속 관계가 있어야 한다.
//				  2. 인스턴스 메소드>만 오버라이딩 가능
//				  3. 인스턴스 필드, 정적 필드, 정적 메소드는 오버라이딩 되지않는다.

class A {		//Outer Class
	//outer class 필드
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;
	
	//outer class 메소드 : 중복 메소드
	void abc() {	//오버라이딩 되지 않는다.
		System.out.println("A 클래스의 메소드 abc()");
	}
	
	void def() {
		System.out.println("A 클래스의 메소드 def()");
	}
	
	//Inner class
	class B {
		//inner class 필드
		int a = 5;
		int b = 6;
		
		//inner class 메소드 : 중복 메소드
		void abc() {	// 오버라이딩 되지 않는다.
			System.out.println("B 클래스의 abc()");
		}
		void bcd() {	
			// 필드의 값 호출
			System.out.println(a);	// this.a 생략 >> 5
			System.out.println(b);	// this.b 생략 >> 6
			System.out.println("=================");
			
			//inner 클래스에서 Outer 클래스의 필드 호출 
			System.out.println(A.this.a);	//Outer class A의 필드 >> 3
			System.out.println(A.this.b);	//Outer class A의 필드 >> 4
			
			//메소드 호출 : << 중복된 메소드 호출 >> 
			abc();			// this.abc() : 이너 클래스의 메소드
			
			A.this.abc();	// Outer class A의 abc() 메소드 >> 
			
//			이너클래스와 아웃터클래스에서 중복되지않는 필드
			System.out.println("=================");
			System.out.println(c);		// 아웃터 클래스의 필드 : 
			System.out.println(d);
			
			//외부에 있는 중복되지 않는 메소드 : 바로 호출 가능
			def();
			
		}
	}
}

public class InnerClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 외부 객체 생성
		A a = new A();
		
		//2. 내부 객체 생성
		A.B b = a.new B();
		
		b.bcd();
						
	}
}
