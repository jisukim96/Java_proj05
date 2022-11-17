package chapter05.ex06;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 2차원 정방형 배열
		
		//1. 배열의 선언
		int[][] arr1 = new int[5][100];		//5 : 행의 개수 , 100 : 열의 개수
		
		System.out.println(arr1.length);	//5 , arr1.length : 행의 개수
		System.out.println(arr1[0].length); //100 , arr1[0].length : 0번 행의 열의 개수
		
		// 2. 2차원 배열의 값 넣기 : 이중 for문 ( for - for )을 사용해서 값 넣기
		// 행 정의 ( i : 행의 방번호(index), arr1.length : 행의 개수 )
		
		int a = 0; //for 문 안쪽에서 초기화와 차이 알아둘 것.
		for ( int i = 0; i < arr1.length; i++) {
			// 열 정의 ( j : 열의 방번호 , arr1[i].length : i번 행의 열의 개수 )
			for ( int j = 0 ; j < arr1[i].length; j++,a++) {
				arr1[i][j] = a + 1;
			}
		}
		
		// 3. 배열의 값을 출력하기 ( for - for )
		for (int i = 0;i < arr1.length;i++) {	// 행 루프
			for(int j=0;j<arr1[i].length;j++) {	// 열 루프
				System.out.print(arr1[i][j]+" ");

			}
			System.out.println();
		}
		
		System.out.println("===== Enhanced For문으로 출력 =====");
		
		// 4. Enhanced For문을 사용해서 출력하기
		for ( int[]k : arr1) {		// 1차원 arr1 의 루프를 돌면서 행을 꺼내와 k변수에 할당
			for(int b: k) {			// 1차원 배열의 각 방(k)의 값을 끄집어 와서 b변수에 할당 
				System.out.print( b + " ");
			}
			System.out.println(); 
		}

		System.out.println("=== Arrays.toString()으로 출력 ===");
		// 5. Arrays.toString() <== 1차원 배열의 값을 출력
			// arr1 : 2차원 배열 
		for (int[]k : arr1) {	// 2차원 arr1 의 한 행씩 끄집어와서 k변수에 할당
			System.out.println(Arrays.toString(k));
		}
		
	}

}
