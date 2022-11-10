package chapter03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제4>  < 완료시간 : 6시10분  p.jangwoo@gmail.com  Ex01.java >
		// 정수 2개를 Scanner로 인풋 받고 두 값이 같으면 true 를 출력 , 다르면 false 출력
		// 이름 2개를 Scanner로 인풋 받고 두 값이 같으면 true를 출력 , 다르면 false 출력 
			// 등가 연산자 사용.
			// 기본 자료형 : ==
		
		Scanner sc = new Scanner(System.in);
		
		int a ;
		int b ;
				
		System.out.println( "정수 a 입력 " );
		a = sc.nextInt();
		System.out.println( "정수 b 입력 ");
		b = sc.nextInt();
		System.out.println( a==b );
		System.out.println("=======================");
		
			// 참조 자료형 : aName.equals(bName)
		
		String aName ;
		String bName ;
		
		System.out.println(" 이름 a 입력 ");
		aName = sc.next();
		System.out.println(" 이름 b 입력 ");
		bName = sc.next();
		System.out.println(aName.equals(bName));
		
		System.out.println("정수 2개 , 이름 2개를 공백으로 구분해서 넣어주세요 >>>");
		a = sc.nextInt();
		b = sc.nextInt();
		aName = sc.next();
		bName = sc.next();
		
		// 기본 자료형 값비교 : ==	(stack 영역의 값비교)
		// 두 정수의 값을 비교해서 맞으면 true , 아니면 false
		System.out.println(" 두 값이 같으면 true , 다르면 false :" + (a==b));
		
		
		//참조 자료형의 값비교 : aName.equals(bName) (Heap 영역의 값비교)
		System.out.println(" 두 이름이 같으면 true, 다르면 false :" + aName.equals(bName));
		

	}

}
