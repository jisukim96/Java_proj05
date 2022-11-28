package chapter12.ex02;

// Cat 클래스는 Animal 인터페이스의 메소드를 구현한 클래스
public class Cat implements	Animal {
	
	@Override
	public void cry() {
		System.out.println("야옹");
		
	}
	@Override
	public void run() {
		System.out.println("고양이는 달립니다. ");
		
	}
	// Animal의 메소드를 구현한 클래스
	// Cat 클래스는 Animal 인터페이스의 구현되지않는 메소드를 구현한 클래스
	//public 클래스는 패키지당 하나만
	
}
