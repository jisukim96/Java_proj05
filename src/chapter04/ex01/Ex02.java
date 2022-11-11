package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 스캐너에서 번호를 입력 받아 아래 내용을 작동시키는 프로그램을 작성해주세요.
		// If문 
		Scanner sc = new Scanner(System.in);
		
		int select ;	//프로그램 선택
		
		int kor;
		int eng;
		int math;
		
		int a ;
		
		String aName;
		String bName;
		
		System.out.println("==============================================");
		System.out.println(" 1. 학점의 합계 / 평균 | 2. 홀수/짝수 | 3.같은 이름 식별");
		System.out.println("==============================================");
		System.out.println("위의 변호를 선택하세요. >>> ");
		
		select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("1번 선택");
			System.out.println("국어 영어 수학 를 공백을 이용해서 넣으세요 >>> ");
			kor = sc.nextInt();
			eng = sc.nextInt();
			math = sc.nextInt();
			int sum = kor + eng + math;
			double avg = sum/3.0;
			System.out.println("합계는"+ sum + ", 평균은 " + avg);
			
		}else if (select == 2) {
			System.out.println("2번 선택");
			System.out.println("정수를 하나 입력하세요 >>>");
			a = sc.nextInt();
			//System.out.println((a%2 == 0)? "짝수":"홀수");
			if(a%2 == 0){System.out.println("짝수");} else {System.out.println("홀수");}
			
		}else if (select == 3) {
			System.out.println("3번 선택");
			System.out.println("이름 2개를 공백으로 구분해서 넣으세요 >>>");
			aName = sc.next();
			bName = sc.next();	
			if(aName.equals(bName)) {		// 참조변수이므로 equals()를 사용해서 값비교
				System.out.println("두 값은 동일합니다");
			}else {
				System.out.println("두 값은 다릅니다.");
			}
		}
		

		
		//제출
		
		if (select == 1) {
			System.out.println("kor 학점을 입력하여 주십시오");
			kor = sc.nextInt();
			System.out.println("eng 학점을 입력하여 주십시오");
			eng = sc.nextInt();
			System.out.println("math 학점을 입력하여 주십시오");
			math = sc.nextInt();
			
			int sum = kor+eng+math;
			double avg = sum/3.0;
			
			System.out.print("학점의 합계는"+sum+"점 이고,");
			System.out.println("평균은"+avg+"입니다.");
			
		}	else if (select == 2) {
			System.out.println(" 정수를 입력하여 주십시오.");
			a = sc.nextInt();
			
			String b = (a%2 == 1)? "홀수":"짝수";
			System.out.println(b);
			
		}	else if (select == 3) {
			System.out.println("A이름을 입력해주세요.");
			aName = sc.next();
			System.out.println("B이름을 입력해주세요");
			bName = sc.next();
			System.out.println((aName).equals(bName)? "같은 이름입니다.":"다른 이름입니다.");
		}

	}

}
