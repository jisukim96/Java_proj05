package chapter13.ex04.a;

class A {		//외부 클래스
	int a = 3;	// 필드 
	
	// 지역 이너클래스는 메소드 내부에서 객체 생성하고, 객체의 내부 메소드 호출
	void abc() {
		int b = 5;		// 지역 변수 : 메소드 실행 시 만들어지고 메소드가 끝나면 없어짐
			// 메소드 내부의 지역변수가	 지역 이너클래스에서 사용될 경우 상수로 바뀐다. 자동 final 
		
		//지역 이너 클래스 : 메소드 내부에 존재하는 클래스
		class B {
			void cde() {
				System.out.println(a); 	// 3
				System.out.println(b);	// 5		<== 상수로 변경됨 : 값 수정이 불가
				
				a = 10;
//				b = 20;		b라는 지역변수가 지역이너클래스에서 사용되는 순간 값 수정 불가. final 키가 자동으로 등록 됨
				System.out.println(a);	// 10
				System.out.println(b);	// 5
				
			}
		}
		B b1 = new B();
		b1.cde();
	}
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		
		// 1. 객체 생성 후 지역 이너클래스 출력
		A a = new A();
		a.abc();		// 메소드 호출 시 객체생성/ 객체의 메소드 호출

	}	

}
