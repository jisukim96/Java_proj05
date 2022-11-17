package chapter05.ex07;

public class NonRectangleArray {

	public static void main(String[] args) {
		// 2차원 비정방형 배열
		//		- 정방형 배열 : 모든 행에 대해서 동일한 열을 가지고 있는 배열
		//		- 비정방형 배열 : 각 행에 대해서 열의 개수가 각각 다른 배열
		
		// 1. 비정방형 배열 선언 : 초기 배열 선언 시 행의 개수만 정의하고 열의 개수는 나중에 각각 다르게 정의
		int[][]arr1 = new int[2][];		// 2 : 행의 개수만 정의
		
		// 2. 각 행에 대해서 열을 정의
		arr1[0] = new int [2];		//arr1 0번 행의 열의 개수를 2개로 지정
			arr1[0][0] = 1;
			arr1[0][1] = 2;
			
		arr1[1] = new int [3];		//arr1 1번 행의 열의 개수를 3개로 지정
			arr1[1][0] = 3;
			arr1[1][1] = 3;
			arr1[1][2] = 3;
		//	arr1[1][3] = 3;			//오류 발생
		
		// 3. 각 행의 값을 출력
			for (int i = 0 ; i < arr1.length;i++) {
				for(int j = 0; j<arr1[i].length;j++) {
					System.out.print( arr1[i][j] + " ");
				}
				System.out.println();
			}

	}

}
