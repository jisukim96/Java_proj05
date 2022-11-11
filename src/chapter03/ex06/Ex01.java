package chapter03.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 	<문제> 스캐너로 정수 값을 인풋받고, 
		// 	인풋받은 정수값이 홀수이면 "홀수"라고 출력하고, 인풋받은 값이 짝수이면 "짝수"라고 출력  
		//  <<3항 연산자를 사용>>
		// 11시 20분까지 완료.
		
		Scanner sc = new Scanner(System.in);
		
		int a;

		System.out.println(" 정수 입력 ");
		a = sc.nextInt();
		
	   String b = (a%2 == 1) ? "홀수" : "짝수";
		
		System.out.println(b);
		
		
		//System.out.println(a + "은" + (a % 2==0 ? "짝수입니다" : "홀수입니다"));
		
		
	}

}
