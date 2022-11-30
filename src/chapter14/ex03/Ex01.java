package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고
		// 1. 각각의 예외에 대해서 catch 블락 처리
		// 2. 3개의 예외를 한꺼번에 처리

//		완료시간 2시 40분 메일발송
		int[] arr = new int[] {1,2,3};
		
		//1			
		System.out.println(" 1. 각각의 예외에 대해서 catch 블락 처리");
		try {
			System.out.println( 3/0);			
			System.out.println(arr[5]);	
			int num = Integer.parseInt("20A");
			System.out.println("예외 없음");
		} catch ( ArithmeticException e) {
			System.out.println(" ArithmeticException 예외 발생");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException 예외 발생 ");
		} catch ( NumberFormatException e ) {
			System.out.println(" NumberFormatException 예외 발생 ");
		} finally {
			System.out.println("-------------------------------------------");
			System.out.println("                               두번째 방법 종료 ");
			System.out.println("===========================================");
		}
		//2
		System.out.println(" 2. 3개의 예외를 한꺼번에 처리");
		try {
			System.out.println( 3/0);			
			System.out.println(arr[5]);			
			int num = Integer.parseInt("20A");
			
			System.out.println(" 예외 없음 ");
		} catch ( ArithmeticException | ArrayIndexOutOfBoundsException |  NumberFormatException e) {
			System.out.println(" 3개의 예외 한번에 처리");
			System.out.println(e.getMessage());		// 예외의 간단한 정보를 출력할 때 사용. 리턴타입 > print 필요함
			e.printStackTrace();					// 예외의 세부적인 정보를 출력
			
		} finally {			
			System.out.println("-------------------------------------------");
			System.out.println("                               세번째 방법 종료");
			System.out.println("===========================================");
		}
		//3
		System.out.println(" 3. 각각의 try 블락에서 처리");
		try {
			System.out.println( 3/0);			

			System.out.println("예외 없음");
		} catch ( ArithmeticException e) {
			System.out.println(" ArithmeticException 예외 발생");
		} finally {
			System.out.println(" 첫번째 프로그램 실행 종료 ");
			System.out.println("-------------------------------------------");
		}
		
		try {
			System.out.println(arr[5]);					
			System.out.println("예외 없음");
		} catch ( ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException 예외 발생 ");
		} finally {
			System.out.println(" 두번째 프로그램 실행 종료 ");
			System.out.println("-------------------------------------------");
		}
		
		try {		
			int num = Integer.parseInt("20A");		
			System.out.println("예외 없음");
		} catch ( NumberFormatException e ) {
			System.out.println(" NumberFormatException 예외 발생 ");
		} finally {
			System.out.println(" 세번째 프로그램 실행 종료 ");
			System.out.println("-------------------------------------------");
			System.out.println("                               첫번째 방법 종료 ");
			System.out.println("===========================================");
		}
	}
}
