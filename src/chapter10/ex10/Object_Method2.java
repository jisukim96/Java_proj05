package chapter10.ex10;

class Aa { // equals()가 정의되어 있지 않는 클래스
//				Object 클래스의 equals() 메소드는 stack의 참조주소를 비교하도록 되어있다.
	// 필드 1개
	String name;

	// 생성자 : 인풋
	Aa(String name) {
		this.name = name;
	}
}

class Bb { // Object의 equals()를 재정의해서 Heap의 값을 비교하도록 설정
	// 필드 1개
	String name;

	Bb(String name) {
		this.name = name;
	}

	@Override //b1.equals(b2) : b2 equals의 변수로 들어가면서 Bb > object 타입으로 업캐스팅됨
	public boolean equals(Object obj) { // Object 타입으로 업캐스팅되어 들어옴
		if (this.name == ((Bb) obj).name) { 
//	b1 객체의 name필드의 값 == Bb b2의 name 필드에 들어있는 값 
//			b2는 object > Bb타입으로 다운캐스팅해서 name 필드 값을 가져와야함
			return true;
		} else {
			return false;
		}
	}
}

public class Object_Method2 {

	public static void main(String[] args) {
		// Object 클래스의 equals() 메소드 : 기본적으로 == 참조주소를 비교한다
//			객체의 Heap의 값을 비교하는 것이 아니라 Stack 메모리의 참조주소 값을 비교한다
		// String 클래스는 equals() 메소드가 재정의 되어있어서 Heap의 값을 비교하도록 설정되어있다.

		String s1 = new String("안녕");
		String s2 = new String("안녕");

//		 == : 참조 자료형에서는 stack 영역의 참조 주소를 비교
//		equals() : ==
//				String 클래스는 equals() 메소드 재정의 : Heap의 값을 비교하도록 설정
		System.out.println(s1 == s2); // stack의 참조주소를 비교 , false
		System.out.println(s1.equals(s2)); // Heap의 값을 비교, true
//			String 클래스는 Object의 equals() 재정의 되어있다.

		System.out.println("==========================");
		Aa a1 = new Aa("안녕");	// 내가 만든 객체(Aa 클래스)에서는 equals()를 재정의 하지않아서 Heap값 비교 X
		Aa a2 = new Aa("안녕");
		System.out.println(a1 == a2);		// stack 참조주소 비교, false
		System.out.println(a1.equals(a2)); 	// stack 참조주소 비교, false
		
		System.out.println("==========================");
		Bb b1 = new Bb("안녕");
		Bb b2 = new Bb("안녕");
		System.out.println(b1 == b2);		// stack 참조주소 비교, false
			//Bb 클래스는 equals() 메소드를 재정의해서 Heap의 값을 비교하도록 설정되어있다.
		System.out.println(b1.equals(b2));	// Heap, name 필드의 값을 비교하도록 재정의, true
		
		
		
	}
}
