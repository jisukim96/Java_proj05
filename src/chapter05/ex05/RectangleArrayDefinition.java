package chapter05.ex05;

public class RectangleArrayDefinition {

	public static void main(String[] args) {
		// 다차원 배열 ( 2차원 배열 )
		// - 정방형 배열		: row(행) 에 대해서 열(column,filed)이 동일한 배열
		// - 비정방형 배열		: row(행) 에 대해서 열(column,filed)이 동일하지않는 배열
		
		// 1. 정방형 배열 선언 방법
		int [][] arr1 = new int[3][4];		// 3 : 행의 개수 ( 0, 1, 2)  
											// 4 : 열의 개수 ( 0, 1, 2, 3)
		
			// 배열의 각 방의 값을 넣기
			arr1[0][0] = 10;
			arr1[0][1] = 20;
			arr1[0][2] = 30;
			arr1[0][3] = 40;
			
			arr1[1][0] = 50;
			arr1[1][1] = 60;
			arr1[1][2] = 70;
			arr1[1][3] = 80;
			
			arr1[2][0] = 90;
			arr1[2][1] = 100;
			arr1[2][2] = 110;
			arr1[2][3] = 120;
			
			//	2차원 배열의 방의 값 출력하기
			System.out.println( arr1[0][1] );
			
			// 선언 후 사용하기
			int[][] arr2;
			arr2 = new int[3][4];
			
			
			// 2. 정방형 배열 선언 방법 2
			int arr3[][] = new int[3][4];
			
			int arr4[][];
			arr4 = new int[3][4];
			
			// 3. 정방형 배열 선언 방법 3
			int[] arr5[] = new int [3][4];
			
			int []arr6[];
			arr6 = new int[3][4];
			
			// 4. 정방형 배열 선언과 동시에 값 넣기 : <주의> 방크기 지정하면 오류 발생
			System.out.println("===================");
			int [][] arr11 = new int[][] { { 1,2,3},{4,5,6} };
		//	int [][] arr11 = new int[2][3] { { 1,2,3},{4,5,6} }; 오류
										
			System.out.println(arr11[0][0]);		// 1
			System.out.println(arr11[1][1]);		// 5
			System.out.println(arr11[1][2]);		// 6
			
			int[][]arr12;
			arr12 = new int[][] {{ 11,12,13,14},{21,22,23,24},{31,32,33,34}};
			
			System.out.println(arr12[1][2]);		// 23
						
			// 5. 정방형 배열 선언과 동시에 값 넣기 2		: 선언과 값을 분리할 수 없다.
			int[][]arr13 = {{100,110,120},{210,220,230}};
			
			
			// 선언과 값을 분리해서 넣을 수 없다.
			int[][] arr14;
		//	arr14 = {{1,2,3},{4,5,6}}; 오류
			arr14 = new int[][]{{1,2,3},{4,5,6}};	
			
							
			// 6. 다양한 타입의 배열 변수 선언
			boolean [][] arr7 = new boolean[3][4];
			int [][]arr8 = new int [2][6];
			double[][]arr9 = new double [3][5];
			String[][]arr10 = new String[2][6];
			
				

	}

}
