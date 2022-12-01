package chapter14.ex01;

import java.io.FileInputStream;
import java.io.InputStreamReader;

class A {		// A 객체를 복사 , throws : 예외를 전가함 , 메소드를 호출하는 곳에서 예외를 처리하라
			// 메소드() throws CloneNotSupportedException : 예외에 대한 전가 
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

public class CheckedExceptin {

	public static void main(String[] args) {
		/* 예외 (Exception) : 
		 	프로그램 작성 중 문제가 발생되었을 때 프로그램이 종료되지 않도록 처리
		 	1. 일반 예외 (Checked Exception) - 컴파일 단계에서 체크, 
		 			이클립스에서 예외를 처리하라고 알려줌
		 			
		 	2. 실행 예외 (Unchecked Exception,RunTime Exception)
		 			컴파일 단계에서 체크가 안되고 실행하면 발생되는 예외
		 	*/
		
//		 일반예외 : 컴파일 단계에서 예외처리하라고 알려줌.
//		 1-1. InterrupedException : 인터럽트가 발생했을 때 예외 처리	
//		 Thread.sleep(1000); 	// 쓰레드를 멈춘다.
		 
//		 1-2. ClassNotFoundException : 클래스를 찾지 못했을 때 발생하는 예외
//		 Class cls = Class.forName("java.lang.Object");	///커넥션개체찾는(호출하는)클래스

//		 1-3. IOException : Input,Output 시 발생되는 예외
		 InputStreamReader in = new InputStreamReader(System.in);
		 //예외 발생
//		 in.read();
		 
//		 1-4. FileNotFoundException : 파일을 찾을 수 없을 때 발생되는 예외
//		 FileInputStream fis = new FileInputStream("test.txt");
		 
//		 1-5. CloneNotSupportedException : 객체를 클론(복사)할 수 없는 예외
		 A a1 = new A();
//		 A a2 = (A)a1.clone();	// a1 객체를 복사해서 a2객체로 생성
		 
	}

}
