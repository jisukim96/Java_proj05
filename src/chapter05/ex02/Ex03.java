package chapter05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방 개수를 인풋 받습니다.
		// 배열 변수 : arr1 , 2의 배수를 저장 후 출력 , Enhanced For문을 사용해서 출력 
		// 배열 변수 : arr2 , 3의 배수를 출력 , For 문을 사용해서 출력
		//  arr1.length : 배열의 방의 개수를 자동으로 알아옴
		
		//< 3시 50분까지>
		
		Scanner sc = new Scanner(System.in);
		
		int a; //인풋받는 방 개수
		//int b; //방의 크기
		int[] arr1; //배열1
		int[] arr2; //배열2
		System.out.println("방의 개수를 입력해주세요");
		a = sc.nextInt();
		
		arr1 = new int[a];
		arr2 = new int[a];
		
		for(int i = 0,b=2;i<arr1.length;i++,b+=2) {
			arr1[i] = b;
		}
		for(int i = 0,b=3;i<arr2.length;i++,b+=3) {
			arr2[i] = b;
		}
		
		
		System.out.println("== Enhanced For 문을 사용해서 2의 배수 출력 ; arr1 ==");
		
		for(int k : arr1) {
			System.out.print(k+" ");			
	} 
		System.out.println();
		System.out.println("====== For 문을 사용해서 3의 배수 출력 : arr2 =======");
		for(int i = 0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		sc.close();
}
		/*
		 int idx;
		 System.out.println("방의 개수를 넣어주세요");
		 idx = sc.nextInt();
		 */
		 
		 
	}
	
