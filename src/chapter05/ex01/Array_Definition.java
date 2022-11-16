package chapter05.ex01;

public class Array_Definition {

	public static void main(String[] args) {
		/*
		 자료형 : 변수 선언 시 변수에 할당할 값을 정의
		  	- 기본 자료형 : boolean , byte , short , int , long , float , double , char
		  		- 메모리의 Stack 공간에 변수와 값이 저장됨
		  	- 참조 자료형 : 배열 , 열거 , 클래스/인터페이스
		  	 	- 메모리의 Stack 공간에 변수명과 참조주소 (Heap 영역의 주소)
		  	 	-  변수에 들어갈 값은 Heap 영역에 저장됨 
		  변수 - 변수에는 하나의 값만 저장됨
		  	  - 초기값을 할당 후 변수를 사용. > 오류
		  배열 - 하나의 배열 변수에 많은 값을 저장할 수 있음.
		  	  - 배열의 특징 :1. 배열변수의 동일한 자료형의 값만 저장할 수 있음.( int, long, double )
		  	  		 	  2. 배열은 방의 갯수가 정의되면 수정 불가
		  	  - 배열의 초기값을 할당하지 않더라도 강제로 초기값이 할당됨.
		  	  - Heap 공간에는 값이 반드시 할당되어야 됨.
		  	  초기값 boolean (false), 정수[byte,short,int,long](0),실수[float,double](0.0) 
		  	  
		 */
		System.out.println("============== 변수 ================");
		// 1. 변수 - 선언과 동시에 값 할당
		int a = 10 ;
		
		// 2. 변수 - 선언 이후 값 할당
		int b; 			// 선언
		b = 20 ;		// 값 할당
		
		// 변수를 선언 후 초기 값을 할당하지않고 사용하면 오류
		int c;
		int d;
		//int sum = c+ d;		//오류 발생 : c, d 변수에 초기값을 넣지않고 사용
		
		System.out.println("======== 배열 : 1. 선언 방법 ==========");
		
		// 1. 배열 선언 방법 1
		int[] array1 = new int[3];		// 배열을 선언과 동시에 방의 크기를 지정
		// int[] : 정수값만 배열에 저장 가능 '뒤에 오는 변수 : 배열변수'
		//array1 : 배열 변수, array1변수 명은 stack공간에 저장됨 ,array1에 Heap 영역의 주소값이 저장
		//new : Heap 영역에 값을 저장하라.
		// int[3] : Heap영역에 저장할 방의 갯수를 지정
		// 			index : 방의 번호, 0 ,1,2,3, ...
		
			// 배열에 값 할당. 
			array1[0] = 55;		// array1 의 Heap 영역의 주소 0번째 방에 55를 넣어라.
			array1[1] = 66;
			array1[2] = 77;
			
			// 배열의 값 출력
			System.out.println(" 0번째 방의 값 : "+array1[0]);
			System.out.println(" 1번째 방의 값 : "+array1[1]);
			System.out.println(" 2번째 방의 값 : "+array1[2]);

		
		 int[] array2;			 // 배열 변수 선언
		 array2 = new int[5];	 // 배열 변수의 들어갈 방의 갯수 지정, index : 0 ~ 4
		 	// array2 배열 변수에 값을 넣고 출력
		 
		 array2[0] = 12;
		 array2[1] = 13;
		 array2[2] = 14;
		 array2[3] = 15;
		 array2[4] = 16;
		 System.out.println(" 0번째 방의 값 : "+array2[0]);
		 System.out.println(" 1번째 방의 값 : "+array2[1]);
		 System.out.println(" 2번째 방의 값 : "+array2[2]);
		 System.out.println(" 3번째 방의 값 : "+array2[3]);
		 System.out.println(" 4번째 방의 값 : "+array2[4]);
		 
		System.out.println("======== 배열 : 1. 선언 방법 2 ==========");
			
		// 배열 선언과 방 크기 할당하기
		int array3[] = new int[4];		// index : 0,1,2,3
		
		// 배열 방에 값 넣기
		array3[0] = 10;
		array3[1] = 20;
		array3[2] = 30;
		array3[3] = 40;
		//array3[4] = 50;	// 오류 발생 : 예외 발생 ( 실행 시 오류)
								// - 컴파일 시 오류 발생 : 이클립스에서 자동으로 오류 출력 
								// - 실행 시 오류 발생 : 예외 처리 
		
		// 배열의 값 출력하기
		System.out.println(array3[0]);
		System.out.println(array3[1]);
		System.out.println(array3[2]);
		System.out.println(array3[3]);
		//System.out.println(array3[4]);	오류 발생 : 실행 시 오류 방생
		
		
		// 선언과 방 크기를 분리해서 정의
		int array4[];
		array4 = new int[5];
		
		System.out.println("======== 배열 : 1. 선언 방법 3 ==========");		
		
		// 배열 선언과 동시에 값 할당
		int [] array5 = new int [] { 10,20,30,40,50 }; 
		// int [] array6 = new int[5] { 10,20,30,40,50);
			// 오류 발생 : 선언과 동시에 배열 변수에 값을 할당, 방크기를 지정하면 오류발생
		
		array5[3] = 77;
		
		System.out.println(array5[0]);
		System.out.println(array5[1]);
		System.out.println(array5[2]);
		System.out.println(array5[3]);
		System.out.println(array5[4]);
		
		// 배열을 선언 후 값 할당
		
		int[] array7 ;
		array7 = new int[] {100,200,300,400,500,600};
		
		System.out.println(array7[0]);
		System.out.println(array7[1]);
		System.out.println(array7[2]);
		System.out.println(array7[3]);
		System.out.println(array7[4]);
		System.out.println(array7[5]);
		// System.out.println(array7[6]); 오류 발생 
			//ArrayIndexOutOfBoundsExceptoin : 배열의 방의 크기를 넘어가면 발생되는 오류
		
		System.out.println("======== 배열 : 1. 선언 방법 4 ==========");
		
		// 배열 선언과 동시에 값 할당 : 선언과 값 할당 분리 시 오류 발생
		int[] array8 = {11,22,33,44,55}; 	//new int[] 생략 > 권장사항 <
		
		System.out.println(array8[0]);
		System.out.println(array8[1]);
		System.out.println(array8[2]);
		System.out.println(array8[3]);
		System.out.println(array8[4]);
		
		// 선언과 값을 분리 시 오류 발생
		int [] array9;
	//  array9 = {111,222,333,444,555}; 	오류 발생 
		
	}

}
