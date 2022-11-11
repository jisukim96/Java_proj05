package chapter04.ex02;

public class Switch_Control_Statement {

	public static void main(String[] args) {
		// Switch 문
		//	-- if 문은 참일 경우 실행 블락을 실행 후 break; 가 자동으로 작동
		//  -- switch 문은 실행 후 해당 블락을 빠져나오지 않는다. 강제로 빠져나오도록 break;를 넣어야한다.
		
		// 1. switch 문에서 break를 사용하지 않는 경우
		int value1 = 2;
		
		switch(value1) {
		case 1:
			System.out.println("A");
		case 2:
			System.out.println("B");
		case 3:
			System.out.println("C");
		case 4:
			System.out.println("D");
		default :
			System.out.println("F");
		}
		System.out.println("==========switch 문==============");
		
		// 2.switch 문에서 break를 포함해서 출력 <== 기본적으로 사용
		int value2 = 4;
		
		switch(value2) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default :						// If문의 else와 같다. <case에 존재하지 않는 모든 것.>>
			System.out.println("F");
			break;
		}
		
		// 3. switch 문은 if ... else if.. else if .. else .. 문으로 변환
		System.out.println("==========if 문으로 변환============");
		if(value2 == 1) {
			System.out.println("A");
		} else if (value2 == 2) {
			System.out.println("B");
		} else if (value2 == 3) {
			System.out.println("C");
		} else if (value2 == 4) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
