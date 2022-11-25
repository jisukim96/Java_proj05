package chapter10.ex11;

import java.util.HashMap;

class A { // equals() 메소드만 재정의된 상태, hashcode() 재정의되지 않은 상태
			//
	// 필드
	String name;

	// 생성자
	A(String name) {
		this.name = name;
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((A) obj).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "A [name=" + name + "]";
	}

}

class B { // equals() , hashcode() 메소드 2개를 재정의 함.
	// 필드
	String name;

	// 생성자
	B(String name) {
		this.name = name;
	}

	// equals() 재정의
	@Override
	public boolean equals(Object obj) {
		if (this.name == ((B) obj).name) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return "B [name=" + name + "]";
	}
}

public class Object_Method03 {

	public static void main(String[] args) {
		// HashMap : Key(Integer), Value(String) 타입으로 저장됨 <== 컬렉션 객체를 넣어
//			Key는 중복된 데이터를 넣을 수 없도록 하는 자료구조, 
//				equals(),HashCode(); 재정의해줘야 설정 가능

		HashMap<Integer, String> hm1 = new HashMap<>();
		hm1.put(1, "데이터1");
		hm1.put(1, "데이터2");
		hm1.put(2, "데이터3");

		System.out.println(hm1);

		// Integer 클래스 : quals(),hashCode() 메소드가 재정의 되어있기 때문에
//			Map 자료 구조의 Key로 사용할 수 있다.

//		자신이 만든 객체를 Map에 Key로 사용할 수 있다.
//			equals(),hashCode() 를 재정의 해야 Map에 데이터를 넣을 때 Key로 사용할 수 있다.
		System.out.println("==========================");
//		A 클래스는 equals() 재정의, hashCode() 재정의 안됨 <== Map의 Key로 사용할 수 없다.(중복제거불가)
		HashMap<A, String> hm2 = new HashMap<>();
		hm2.put(new A("첫번째"), "데이터1");
		hm2.put(new A("첫번째"), "데이터2");
		hm2.put(new A("두번째"), "데이터3");

		System.out.println(hm2);

		System.out.println("==========================");
//		B 클래스 : equals(),hashCode() 재정의 <== Map 자료 구조의 Key로 사용 가능하다.(중복제거)
		HashMap<B, String> hm3 = new HashMap<>();
		hm3.put(new B("첫번째"), "데이터1");
		hm3.put(new B("첫번째"), "데이터2");
		hm3.put(new B("첫번째"), "데이터4");
		hm3.put(new B("두번째"), "데이터3");

		System.out.println(hm3);

	}

}
