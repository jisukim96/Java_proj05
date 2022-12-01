package chapter14.ex06;

// 예외 처리 : 1. 직접처리(Try ~ catch)
// 			2. 예외 전가 (throws) : 예외를 내가 처리하지않고 호출하는 곳으로 미루는 것.
			// 호출하는 곳에서 예외를 처리해야 한다.

// 1. 하위 메소드에서 직접 예외를 처리하는 방법 : Try ~ catch
class A {
	
	void abc() {
		bcd(); 		//bcd(); 메소드 호출됨
	}
	void bcd() {	//bcd 메소드 내부에서 thread 예외 직접 처리 됨
		try { // 쓰레드를 1초 뒤에 잠재워라. 일반예외 - 1. 직접 처리
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
	}
}

// 2. 예외를 호출하는 메소드로 전가 : throws
class B{
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}					// Exception 도 가능
	void bcd() throws InterruptedException { //bcd() 메소드를 호출하는 곳에서 예외를 처리하도록 미룬다.
		Thread.sleep(1000); 	// 일반예외 - 2. 전가 
	}
}


public class ThrowsException01 {

	public static void main(String[] args) {

	}
}
