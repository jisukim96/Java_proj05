package chapter05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>  배열 변수 : arr1 , 배열의 방의 갯수 : 500 개
		// 배열 방에 3의 배수 와 5의 배수를 저장 (OR ||)
		// 출력 : 1. for , 2. Enhanced For 3. Arrays.toString()를 사용해서 출력
		//   arr1.length  : 배열의 방의 개수를 자동으로 알아옴.
		// <완료시간 : 2시 45분까지 > 메일 제출
		
		//1.
		
		/*int[] arr1 = new int[500];
		
		
		for(int i=0 ,j=1 ;i<1500;i++, j++) {
			
				if(j%3==0||j%5==0) {
					arr1[i] = j;
					
				System.out.print(arr1[i]+" ");
				
				break;
				}
		}
		System.out.println();
		System.out.println("==========enhanced for문============");
		
		
		//2.
		for( int k : arr1 ){
			
			System.out.print( k +" ");
			
		}
		System.out.println();
		System.out.println("========Arrays.toString==============");
		
		//3.
		System.out.println(Arrays.toString(arr1));
			
		*/
		
		// 강사님
		  int i = 0;
		int[] arr1 = new int[500];
		
		for (int a = 1; a< 3000; a++) {
			if (a %3 == 0 || a%5==0) {
				arr1[i] = a;
				i++;
			}
			if(i>499) {
				break;
			}
		}
		
		for ( i =0;i<500;i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		for (int k : arr1) {
			System.out.printf("%d ",k);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		

	}

}
