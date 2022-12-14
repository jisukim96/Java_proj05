package chapter10.ex10;

// java.lang 패키지의 모든 클래스는 Import없이 사용이 가능하다.

class A  {		//extends Object 생략되어있음
				// Object 클래스의 모든 메소드를 상속받는다.
				// 자식 클래스는 하나의 부모만 가질 수 있다.
				// Java는 다중 상속이 불가하다.
				// 인터페이스는 다중 Implements가 가능하다.
	int m = 3;
	int n = 4;
	
	String name;

	
//	toString() : Object 클래스의 메소드, 
//	객체를 출력시 toStirng() 메소드가 작동되고, 오버라이딩하지 않으면 기본적으로는 패키지명.클래스명@hashcode()
//	객체 자체를 출력 시 객체의 필드의 값을 출력하도록 재정의해서 사용
	
	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
	
}

public class Inheritance_Object01 {

	public static void main(String[] args) {
		// 
		A a = new A() ;
		
//		객체 자체를 출력 시 object 클래스의 toString() 
	//		패키지명.클래스명@hashcode()
	//		hashcode ==> 참조주소 : 객체에 저장된 Heap 메모리의 주소값 
		System.out.println(a);				// A라는 객체 생성하여 출력
		System.out.println(a.toString()); 
		
		
		// String 클래스는 toString() 재정의 되어있다.
		String s1 = new String("안녕");
		System.out.println(s1);

		
		
	}

}
