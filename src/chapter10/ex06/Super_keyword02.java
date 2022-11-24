package chapter10.ex06;

class Aa{
	void abc() {
		System.out.println(" Aa 클래스의 abc() ");
	}
	void ab() {
		System.out.println(" Aa 클래스의 ab()");
	}
}
class Bb extends Aa{
	@Override
	void abc() {
		System.out.println(" Bb 클래스의 abc()");
	}
	void bcd() {
		abc();		//this.abc(); 자신의 클래스의 abc()
	}				// `생략됨 자기자신 메소드 . super.abc(); 부모클래스 메소드
	void cde() {
		super.abc();	// 부모 클래스의 abc()
	}
	void def() {
		super.ab();		// 부모 클래스의 ab()
	}
	
}

public class Super_keyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 객체 생성
		// bb : Aa, Bb가 내포되어있고,Bb 타입으로 지정
		Bb bb = new Bb();
		
		// 2. 메소드 호출
		bb.bcd();		//Bb 클래스의 abc()
		bb.cde();		//Aa 클래스의 abc()
		bb.def();		//Aa 클래스의 ab()
		
		
		
		
	}

}
