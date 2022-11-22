package chapter07.ex05;

class B{
	
	// 1. 기본 생성자
	B(){
		System.out.println(" 기본 생성자를 호출했습니다.");
	}
	B(int a){
		this();		// 반드시 생성자 내부에 첫라인에 와야한다. - 기본 생성자 호출
		System.out.println(" 매개변수가 하나인 생성자 입니다. ");
	}
	B(int a, int b){
		this(3);	// 매개변수가 정수 1개인 생성자 호출
		System.out.println(" 매개변수가 정수 2개인 생성자 입니다.");
	}
	B(int a, int b, int c){
		this(4,5);
		System.out.println(" 매개변수가 3개인 생성자 호출");
	}
	
}


public class This_Method {

	public static void main(String[] args) {
		// This() : this 메소드	자신의 객체의 다른 생성자를 호출할 때 사용
				// 생성자 내부에서만 this 메소드를 사용할 수 있음.
				// 반드시 생성자 첫 라인에 위치 해야함.(중요)
		
		// 1. 정수 1개인 생성자 호출
		System.out.println("==== 매개변수 1개인 생성자 호출 ====");
		
		B b1 = new B(3);
		
		System.out.println("==== 매개변수 2개인 생성자 호출 ====");
		
		B b2 = new B(3,4);
		
		System.out.println("==== 매개변수 3개인 생성자 호출 ====");
		
		B b3 = new B(3,4,5);
		
		
		
		
	}

}
