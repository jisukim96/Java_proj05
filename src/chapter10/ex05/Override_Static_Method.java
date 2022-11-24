package chapter10.ex05;

class Aaa{
	static void print() {
		System.out.println("Aaa 클래스의 static 메소드");
	}
}
class Bbb extends Aaa {
	static void print() {
		System.out.println("Bbb 클래스의 static 메소드");
	}
}

public class Override_Static_Method {

	public static void main(String[] args) {
		// static method : 오버라이딩 되지않는다.
			// 클래스 영역에 메소드가 저장되어있음. 객체의 Heap영역에 주소(위치)값만 가진다.
			
		// 1. 객체 생성없이 클래스이름으로 접근
		Aaa.print();
		Bbb.print();
		System.out.println("======================");
		
		// 2. 객체 생성 후 출력
		Aaa a = new Aaa();
		Bbb b = new Bbb();
		Aaa ab = new Bbb();
		
		a.print();		//Aaa
		b.print();		//Bbb
		ab.print();		//Aaa	오버라이딩 되었다면 Bbb 출력
		
		

	}

}
