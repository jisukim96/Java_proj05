package chapter07.ex03;

public class Ex01 {

	public static void main(String[] args) {
		/* 가변 길이 배열 문제 < 6시 10분까지 완료, 메일발송>
		
			values[0] : 값이 정수 1 ~ 9 이 들어올 때 " 파워레벨 1~9 입니다. "
			values[1] : 값이 정수 1 ~ 9 이 들어올 때 " 스피드 레벨 1 ~ 9 입니다. "
			
		*/

		
		arrayFlexible(10,2);

	}
	
	public static void arrayFlexible (int...values) {
		
			if(values[0]>0 &&values[0]<10) {
				System.out.printf("파워레벨 %d입니다.",values[0]);
				} else {
				System.out.println("잘못된 입력입니다.");
			}
			
			if(values[1]>0 && values[1]<10) {
				System.out.printf("스피드레벨 %d 입니다.",values[1]);
				} else {
					System.out.println("잘못된 입력입니다.");
				}
				
	}
	
}
