package chapter12.ex07;

interface A {
//	static 메소드 : public 생략됨, 객체 생성없이 바로 호출해서 사용
//		구현 코드(구현부)가 있는 메소드
	static void abc() {
		System.out.println("인터페이스의 static 메소드");
	}
}

public class Interface_Static_Method {

	public static void main(String[] args) {
/*		 interface 블락에서 구현된 메소드 : default , static
			  메소드 이름앞에 static 메소드 : 인터페이스 이름으로 바로 호출 가능
		
		그래픽카드 교체(, 프로그램 설계 및 병행작업(오탈자 확인)
		
		interface : 모든 필드와 메소드에 public 모두 생략되어있음.
			1. 필드 : public static final
			2. 메소드 :
				1.1 추상 메소드 : public abstract 생략되어있음, 선언만 된 메소드 ,
				1.2 default 메소드 : [public] default 메소드 , 구현부가 있는 메소드
					- 모든 자식 클래스에 상속되는 메소드, 1.8버전부터 기능지원
				1.3 static 메소드 : [public] static 메소드 , 구현구가 있는 메소드
					- 1.8 버전부터 기능지원, 객체 생성없이 인터페이스 이름으로 호출
*/
//		객체 생성없이 인터페이스 이름으로 바로 호출해서 사용 가능
		A.abc();
		
		
	}

}
