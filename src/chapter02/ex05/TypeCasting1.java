package chapter02.ex05;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (테이터타입변환 : 캐스팅) 
		// 1. 캐스팅 방법 1
		
			//정수의 기본 = int형으로 저장됨
		int value1 = (int)5.3;		//value1 정수 값만 넣을 수 있다. = : 대입연산자 
		long value2 = (long) 10.0000344 ;			//생략하면 int로 들어감 변수값 끝에 L 붙여도 됨
		
			//실수의 기본 = double
		float value3 = (float)5.8;				// 캐스팅 필요 , 변수값 끝에 F,f 붙여도 됨
		double value4 = (double)10.50;
		
		
		System.out.println(value1);	// 5
		System.out.println(value2); // 10
		System.out.println(value3); // 5.8
		System.out.println(value4); // 10.5

		System.out.println("============================");
		
			// 2. 캐스팅 ( l, L / f, F ) : long형 , float형
				//long , float의 정의된 변수에 값을 할당할 때 캐스팅해서 넣어야 한다.
				// 정수 : int , 실수 : double
		
		long value5 = 10L ;
		long value6 = 20l ;
		
		float value7 = 5.8f;
		float value8 = 5.8F;
		
		System.out.println(value5); // 10
		System.out.println(value6); // 20
		System.out.println(value7); // 5.8
		System.out.println(value8); // 5.8
		
				
	}

}
