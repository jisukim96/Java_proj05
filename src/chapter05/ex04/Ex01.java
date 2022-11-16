package chapter05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 오늘까지 : 12시까지 제출
		
		
		Scanner sc = new Scanner(System.in);

		int a; //번호 선택
		int b = 0; //인풋값 방크기
		
		do {
		System.out.println("==============================================================================");
		System.out.println("1.인풋값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수를 저장 후 출력");
		System.out.println("2.인풋값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장 후 출력");
		System.out.println("3.인풋값을 받아서 방의 크기를 지정하고 값이 3의 배수만 저장하는데 그중 6의 배수는 제외하여 저장 후 출력");
		System.out.println("4.프로그램 종료");
		System.out.println("===============================================================================");
	
		int[] arr1;
		
		System.out.println("번호를 선택해주세요");
		a = sc.nextInt();
				
		
		if(a==1) {
			System.out.println("방의 크기 값을 입력해주세요");
			b = sc.nextInt();
			arr1 = new int[b];
			
			//1
			for(int c = 1,i = 0;i<arr1.length;c++,i++) {
				arr1[i]=c;
					if(c%7==0 || c%8==0) {
				System.out.print(arr1[i]+" ");}
			} 
			System.out.println();
		
			//2
		}	else if(a==2) {
			
			System.out.println("방의 크기 값을 입력해주세요");
			b = sc.nextInt();
			arr1 = new int[b];
			
			for(int i=0,c=1;c<arr1.length;i++,c++ ) {
					arr1[i] = c;
					if(c%4!=0) {
						System.out.print(arr1[i]+" ");
					}
					 }
			
			System.out.println();

			//3
		}	else if(a==3) {
			
			System.out.println("방의 크기 값을 입력해주세요");
			b = sc.nextInt();
			arr1 = new int[b];
			
			for(int i=0,c=3;c<arr1.length;i++,c+=3) {
					arr1[i]=c;
				if(c%6!=0) {
					System.out.print(arr1[i]+" ");
				}
			}
			System.out.println();
			
			//4
		}	else if (a==4){
				System.out.println("프로그램이 종료되었습니다.");
		}	else {
			System.out.println("잘못된 번호 입니다. 다시 선택해주세요");
		}
		}while(a!=4);
		
		sc.close();
		}
		}
