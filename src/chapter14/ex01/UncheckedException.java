package chapter14.ex01;

class Aa {}				//부모 클래스
class B extends Aa {}	//자식 클래스

public class UncheckedException {

	public static void main(String[] args) {
		// 실행 예외 : 컴파일 단계에서 체크하지 않는다. 실행할 때 예외가 발생됨.
//			Unchecked Exception , RunTimeException
		
//		1. ArithmeticException : 정수를 0으로 나누었을 때 발생하는 예외
//			모든 프로그램에서는 숫자를 0으로 나누면 오류가 발생됨.
//		System.out.println(3/0);

//		2. ClassCastException : 다운 캐스팅 시 타입이 존재하지 않는 경우 발생하는 예외
		Aa a = new Aa();		// 부모 클래스를 객체화 함.
//		B b = (B) a;		// (다운캐스팅)객체 a는 B타입을 포함하지 않는다.
		
//		3. ArrayIndexOutOfBoundException : 배열의 방번호를 넘겼을 때 발생하는 예외
		int [] arr = new int[] {1,2,3};
		
//		System.out.println(arr[3]);			// 배열의 방 번호를 넘김 초과.
		
//		4. NumberFormatException : 문자 타입의 값을 정수(int), 실수(double)를 변환할 때 발생하는 예외
//		int num = Integer.parseInt("10!");
//		double num2 = Double.parseDouble("10.22");
//		System.out.println(num2);
		
//		 제일 많이 발생되는 예외
//		5. NullPointException : 참조 주소의 값이 null인데, 메소드를 호출하는 경우
		String str = null;
//		System.out.println(str.charAt(2));
		
		
		
	}

}
