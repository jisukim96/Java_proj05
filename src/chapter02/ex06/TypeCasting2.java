package chapter02.ex06;

public class TypeCasting2 {

	public static void main(String[] args) {
		// 자동 타입 변환 (업캐스팅) vs 수동 타입 변환 (다운캐스팅)
		// 1. 자동 타입 변환 (업캐스팅 : 낮은 자료형에서 높은 자료형으로 자동으로 변환)
			// 숫자형 자료형에 해당.
			//byte => short => int => long => float => double
		
		float value1 = 3;	// int => float 으로 자동 업캐스팅되어서 들어감. 명시해도 됨.
		long value2 = 5 ;  //int => long 으로 자동 업캐스팅
		double value3 = 7;  //int => double 으로 자동 업캐스팅
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("===================");
		
		// 2. 수동으로 타입 변환 (다운 캐스팅 : 높은 자료형에서 낮은 자료형으로 변환)
		int value4 = (int)3.5;	//double => int 수동 다운캐스팅 실수 => 정수
		float value5 = (float)7.8; 	//double => float (float)7.8 또는 7.8f 
		
		System.out.println(value4);
		System.out.println(value5);
		
		

	}

}
