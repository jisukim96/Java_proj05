package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		// 1. 같은 자료형 간의 연산
		int value1 = 3+5;	// 8 int(정수)+ int(정수)
		int value2 = 8/5 ;	// 1 : 몫만 출력 int(정수)/int(정수)=int(정수)
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0f + 5.0f;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0 ;
		System.out.println(data2);		//1.6
		
		double data3 = 8/5;				//int(정수)/정수 => int(정수) 결과값 업캐스팅되어 double(실수) 
		System.out.println(data3);		//1.0
		
		double data4 = 8/5.0;			//int(정수)/double(실수) , 정수 => 실수 double형으로 업캐스팅되어 연산
		System.out.println(data4); 		// 1.6
		
		//주의 : 평균을 계산할 때 double 형으로 해야 함.
		
		System.out.println("====================");
		
		// 2. 다른 자료형 간의 연산 (낮은 자료형은 상위 자료형으로 자동 업캐스팅되어 연산)
		
		// int data5 = 5 + 3.5;		//오류 발생   `정수 + 실수 =  정수 > 실수로 바뀜 , 실수 + 실수
		double data6 = 5 + 3.5;		// 5.0 + 3.5
		
		int data7 = 5 + (int)3.5;	// 8
		
		int data8 = (int)(5+3.5);	// 8    `int(8.5) > 8
		
		double data9 = 5/2.0;		// 정수 5 > double 로 업캐스팅되어 연산
		
		System.out.println(data9);
		
		double data10 = 5/2;		// `정수/정수 = 정수 결과값만 실수로 업캐스팅되어 변함
		System.out.println(data10); //2.0
		
		System.out.println("=====================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) ==> data (double)
		System.out.println(data11+data12);  // 50(int) ==> 50(double)
		//업캐스팅 : data11 (int) ==> data (double)
		System.out.println(data11/data12);  //
		//다운캐스팅 : data12 (double) ==> data12 (int)
		System.out.println(data11/(int)data12); // `정수/정수 > 결과값 정수
		
		
		// <문제>
		// 국어 : 90 , 수학 : 88 , 영어 : 77 , 음악 : 90 , 과학 : 99
		// 각 과목의 점수를 정수형(int) 변수를 만들어서 저장 후 : 합계(sum), 평균(avg) 값을 출력
		
		int 국어 = 90;
		int 수학 = 88;
		int 영어 = 77;
		int 음악 = 90;
		int 과학 = 99;
		
		int sum = 국어+수학+영어+음악+과학 ;
		System.out.println("합계 : "+ sum);
		
		double avg = sum/5.0 ;  //double로 지정 후 계산하고자 하는 값은 실수형으로 입력  
		System.out.println("평균 : " + avg);
		
		
		

	}

}
