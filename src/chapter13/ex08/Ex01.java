package chapter13.ex08;

interface Animal {
	void cry();
	void fly();
}

class B {
	
	//1 inner class
	void abc() {
	Animal a = new C();
	a.cry();
	a.fly();
	}
	
	class C implements Animal{
		@Override
		public void cry() {	System.out.println("끼이오");	}
		@Override
		public void fly() {	System.out.println("독수리가 납니다");}
	}
	
	
	// 2 anonymous class
	Animal a2 = new Animal() {
		@Override
		public void cry() {	System.out.println("끼이오~");}
		@Override
		public void fly() {	System.out.println("독수리가 납니다.");	}
	};
	void bcd() {
		a2.cry();
		a2.fly();
	}
	
	
	// 3 메소드에 인풋 매개변수 Animal 타입 인풋
	void cde(Animal a) {
		a.cry();
		a.fly();
	}
	
	

// 완료시간 6시 30분까지 , 메일발송
// 인터페이스를 4가지 형태로 출력
// 1. Animal을 구현한 Inner 클래스를 생성 후 메소드 출력
// 2. Animal을 익명 클래스로 생성해서 출력
// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성
// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력 (메소드 내부에 new라는 키를 넣어 오버라이딩하면 됨.)

	}


public class Ex01 {

	public static void main(String[] args) {
		
		// 1
		System.out.println("1. Animal을 구현한 Inner 클래스를 생성 후 메소드 출력");
		B b = new B();
		b.abc();
		
		// 2
		System.out.println("\n2. Animal을 익명 클래스로 생성해서 출력");
		B b2 = new B();
		b2.bcd();

		
		// 3
		System.out.println("\n3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 생성");
	
		//출력을 위한 객체 생성
		B b3 = new B();
		
		// 
		Animal a = new Animal() {
			@Override
			public void cry() {
				System.out.println("꼬꼬댁");
			}
			@Override
			public void fly() {
				System.out.println("닭이 지붕위를 납니다");
			}		};
		
		// 참조변수 입력하여 출력
		b3.cde(a);
		
		
		// 4 참조변수에 new키 입력하여 출력
		System.out.println("\n4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋받아서 출력 : 참조변수 없이 출력");
		b3.cde(new Animal() {
			@Override
			public void cry() {
				System.out.println("꼬꼬댁~");
			}
			@Override
			public void fly() {
				System.out.println("닭이 지붕위를 납니다.");
			}
		});
			
	}
}
