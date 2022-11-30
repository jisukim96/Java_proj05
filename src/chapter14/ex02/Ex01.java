package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 12시 45분까지 완료 , 메일발송
		// try ~ catch - finally 구문을 사용해서 예외 처리
		
		int[]arr = new int[] {1,2,3,4};
		
		//실행시 예외 발생 : ArrayIndexOutOfBoundsException
				
		try {
			System.out.println(arr[5]);
			System.out.println(" try 블락의 코드 ");
			
		} catch(ArrayIndexOutOfBoundsException e){ // 객체 지정. 보통 e (Exception) 많이 사용
			// try 블락에서 ArrayIndexOutOfBoundsException 발생이 되면 작동
			System.out.println(" 배열의 범위를 초과하였습니다. ");
			System.out.println(" catch 블락 작동 ");
		} finally {
			// 무조건 작동되는 블락
			System.out.println(" Finally 블락 : 예외와 상관없이 항상 작동됨. ");
			System.out.println(" 프로그램 종료");
		} 
	}
}
