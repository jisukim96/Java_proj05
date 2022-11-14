package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// <문제 > 이중 for문을 사용하여 1단 ~ 19단 까지 출력  
		// 3의 배수단 출력
				System.out.println("3단의 배수단 출력");
		for (int i = 3; i < 20; i+=3) {
			System.out.println();
			System.out.println(i+" 단 출력");
			for (int j = 1; j < 20 ; j++ ) {
				System.out.println(i+" * " + j +" = "+ i*j);
			}
		}
		//<강사님>
		// 1. 1~ 19단 까지 출력
		//for (int i = 1 ; i < 20 ; i++ ){  // 19번 루프
			 //단을 출력
		//System.out.println(i + " 단 출력");
		//for (int j = 1; j<20 ; j++) {   // i * 19 번 루프
			//System.out.println(i+" * "+ j + " = " + i * j);
			//}
		//System.out.println();
	//}
		// 2. 3배수단 출력
		//for (int i = 3 ; i < 20 ; i+=3 ){  // 19번 루프
		 //단을 출력
	//System.out.println(i + " 단 출력");
	//for (int j = 1; j<20 ; j++) {   // i * 19 번 루프
		//System.out.println(i+" * "+ j + " = " + i * j);
		//}
	//System.out.println();
//}
		
	}

}
