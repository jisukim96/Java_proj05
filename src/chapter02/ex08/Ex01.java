package chapter02.ex08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//  <문제3> 스캐너를 등록하고, 
		//	어머님 이름, 아버님 이름, 형제 이름, 자신 이름		sc.next();
		//	어머님 나이, 아버님 나이, 형제 나이, 자신 나이		sc.nextint();
		
		// 콘솔에서 인풋받은 이름은 모두 출력
		// 나이의 합계와 평균을 출력
		Scanner sc = new Scanner(System.in);
		
		
		String mamaname;
		String papaname;
		String broname;
		String myname;
		int mamaage;
		int papaage;
		int broage;
		int myage;
		
		System.out.println("어머님의 이름을 입력하세요. >>>");
		mamaname = sc.next();
		System.out.println("아버님의 이름을 입력하세요. >>>");
		papaname = sc.next();
		System.out.println("형제의 이름을 입력하세요. >>>");
		broname = sc.next();
		System.out.println("본인의 이름을 입력하세요. >>>");
		myname = sc.next();
		System.out.println("어머님의 나이를 입력하세요. >>>");
		mamaage = sc.nextInt();
		System.out.println("아버님의 나이를 입력하세요. >>>");
		papaage = sc.nextInt();
		System.out.println("형제의 나이를 입력하세요. >>>");
		broage = sc.nextInt();
		System.out.println("본인의 나이를 입력하세요. >>>");
		myage = sc.nextInt();
		
		int sum;
			sum = mamaage + papaage + broage + myage ;
			
		double avg;
			   avg = sum / 4.0;
			
			System.out.println("===============================");
			System.out.println("어머님의 이름은 "+ mamaname + "입니다. ");
			//System.out.println("나이는 "+ mamaage + "입니다.");
			System.out.println("아버님의 이름은 "+ papaname + "입니다. ");
			//System.out.println("나이는 " + papaage + "입니다.");
			System.out.println("당신 형제의 이름은 "+ broname +"입니다. ");
			//System.out.println("나이는 "+broage+"입니다.");
			System.out.println("당신의 이름은 "+myname+"입니다. ");
			//System.out.println("당신은 현재 "+ myage+" 입니다");
			System.out.println("당신 가족의 나이 합은 "+sum+"이고");
			System.out.println("평균 나이는 "+avg+"입니다.");
			

	}

}
