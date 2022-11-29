package chapter13.ex06;


// 자식클래스를 만들어서 new 로 출력 . 자식클래스 생성하지않고 익명클래스로 출력
// 2. 인터페이스를 구현한 클래스를 생성하지 않고 출력하는 경우
	//익명 이너 클래스 사용
interface C {
	void bcd();
}

class A{
	// 익명 이너 클래스
	C c = new C() {
		@Override
		public void bcd() {
			System.out.println("익명클래스를 사용해서 출력");	
		}
	};
	
	void abc() {
		c.bcd();
	}
	
	
}
public class AnonymousClass02 {

	public static void main(String[] args) {
		A a = new A();
		a.abc(); 			// 인터페이스의 오버라이딩된 메소드 출력

	}

}
