package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제1> switch 문을 사용하여 프로그램하세요.
		//			
		//		스캐너로 정수 1을 인풋받으면 "금메달입니다." 출력
		//				  2를 인풋받으면 "은메달입니다." 출력
		//				  3을 인풋받으면 "동메달입니다." 출력
		//		     그 외 값을 인풋받으면 "메달이 없습니다." 출력
	
		Scanner sc = new Scanner(System.in);
		
		
		int medal;
		
		System.out.println("숫자를 입력해주세요");
		medal = sc.nextInt();
		
		
		switch(medal) {
			case 1 : 
				System.out.println("금메달입니다.");
				break;
			case 2 :
				System.out.println("은메달입니다.");
				break;
			case 3 :
				System.out.println("동메달입니다.");
				break;
			default :
				System.out.println("메달이 없습니다.");
				break;
		}
		System.out.println("========================================");
		
		// <문제2> switch 문을 사용하여 프로그램 하세요.
		//스캐너로 정수 gold를 인풋받으면 "금메달입니다"
		//			silver를 인풋받으면 "은메달입니다." 출력
		//			bronze를 인풋받으면 "동메달입니다." 출력
		//		     그 외 값을 인풋받으면 "메달이 없습니다." 출력	
		
		String medal2;
		
		System.out.println("gold , silver , bronze 등 색깔을 입력해주세요");
		medal2 = sc.next();
		
		switch(medal2) {
		case "gold" : case "Gold": case "GOLD":
			System.out.println("금메달입니다.");
			break;
		case "silver" :case "Silver" : case "SLIVER":
			System.out.println("은메달입니다.");
			break;
		case "bronze" :case " Bronze" : case " BRONZE":
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		
		}
		
		sc.close();
	}

}
