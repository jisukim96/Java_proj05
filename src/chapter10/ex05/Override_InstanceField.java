package chapter10.ex05;

class A{
	int m = 3;		// 인스턴스 필드 : 오버라이딩 안됨.
}

class B extends A{
	int m = 4;		// 인스턴스 필드 : 오버라이딩 안됨.
	// A클래스 m과 B클래스 m 은 별개의 공간에 만들어진 값
}

public class Override_InstanceField {

	public static void main(String[] args) {
		// 메소드 오버라이딩 [인스턴스 메소드 오버라이딩]
		//	 -- 인스턴스 필드	: 오버라이딩 안됨	Heap 공간에 값이 저장
		//	 -- 정적 필드		: 오버라이딩 안됨	클래스 영역에 값이 저장
		//	 -- 인스턴스 메소드	: 오버라이딩 됨		인스턴스 메소드 영역에 메소드의 소스코드가 저장
		//	 -- 정적 메소드		: 오버라이딩 안됨	클래스 영역에 메소드 저장

		// 1. 객체 생성
		A aa = new A();
		B bb = new B();
		A ab = new B();
		
		// 2. 인스턴스 필드 정보 출력
		System.out.println(aa.m);		// 3
		System.out.println(bb.m);		// 4
		System.out.println(ab.m);		// 3
		
		
		
		
	}

}
