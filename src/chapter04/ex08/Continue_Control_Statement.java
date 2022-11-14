package chapter04.ex08;

public class Continue_Control_Statement {

	public static void main(String[] args) {
		// continue : 제어문 내에서 사용되는 break와 비슷하게 사용되는 키워드
		//		-- 반복문 내에서 continue를 만나면 continue 아래 실행블락을 실행하지않고 증감식을 작동
		
		// 1. 단일 loop에서 continue
		for(int i = 0 ; i < 10 ; i++) {
			continue ; 					
			//System.out.println(i);    //도달할 수 없는 코드 블락
		}
		
		for ( int i = 0 ; i < 10 ; i++) {
			System.out.println(i + " ");
			continue;
		}
		System.out.println("=========================");
		
		// continue도 if 조건과 같이 일반적으로 사용됨.
		
		for ( int i = 0 ; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i+" ");
		}	// 0 1 2 3 4 6 7 8 9 
		
		System.out.println();
		System.out.println("=========================");
		
		// 2. 다중 loop문에서 continue 
			// 2-1 단일 단계만 적용
		
		for ( int i= 0; i < 5 ; i++) {
			for (int j = 0 ; j < 5 ; j++) {
				if (j==3) {
					continue;
				}
				System.out.println(i + " , "+ j);
			}
			System.out.println();
		}
		
		System.out.println("==========================");
			// 2-2 점프해서 이동 (LABLE을 사용)
		
	pos2 : for (int i = 0; i < 5; i++) {
			for ( int j = 0; j<5 ; j++) {
				if (j == 2) {
					continue pos2;
				}
				System.out.println(i+" , " +j);
			}
			System.out.println();
		}
		
		
		
		

	}

}
