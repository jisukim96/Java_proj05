package chapter05.ex09;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		// String 클래스에서 사용되는 주요 메소드(함수)
			// 기본자료형 : boolean , byte , short , int , long , float , double , char
			// 참조자료형 : 배열 / 열거 / 객체 / 인터페이스   <== 첫글자 대문자로 시작
		
		
		// 1. 문자열의 길이 ( length())
		// [참조]자료형   [참조] 변수
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length());	// 글자의 개수 : 11자
		System.out.println(str2.length());	// 글자의 개수 : 13자

		// 2. 문자열 검색 ( charAt(), indexOf(), lastIndexOf() )
		System.out.println(str1.charAt(1)); 	//str1 1번 방의 문자 출력 : e
		System.out.println(str1.charAt(5)); 	//str1 5번 방의 문자 출력 : ' '
		
		System.out.println(str1.charAt(6)); 	//str1 6번 방의 문자 출력 : j
		System.out.println(str2.charAt(1)); 	//str2 1번 방의 문자 출력 : 녕
		
		System.out.println();
		
			//indexOf(), lastIndexOf();		<<<한 문자의 방번호를 검색>>>
		System.out.println(str1.indexOf('a')); //문자 a 가 저장된 방 번호를 출력 : 7
		System.out.println(str1.lastIndexOf('a')); //문자 a 가 저장된 방 번호를 뒤부터 출력 : 9
		
		System.out.println(str1.indexOf('a',8)); // 8번 방부터 a를 검색 : 9 			-->
		System.out.println(str1.lastIndexOf('a',8)); // 8번 방부터 a를 검색 : 7 		<--
		
		System.out.println("======================");
			// 문자열을 검색해서 방번호를 출력
		
		System.out.println(str1.indexOf("Java"));	//6
		System.out.println(str2.indexOf("하세요"));	//2
		System.out.println(str1.lastIndexOf("ello"));	//1
		
			// 문자열 검색에 실패시 : -1 값을 출력
		System.out.println(str1.indexOf("bye"));	//-1
		
		// 3. 문자열 변환 및 문자열 연결 : String.valueOf(), concat()
		// String.valueOf() : 기본 자료형을 ==> String 자료형으로 변환
		
	//	String str3 = 2.3;		// 오류발생 : (2.3=실수) double 타입의 데이터를 String타입에 저장)
		String str3 = String.valueOf(2.3);
	//	String str4 = true;		// 오류발생 : boolean 타입을 String 변수에 저장
		String str4 = String.valueOf(true);
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println("======================");
		
		//concat() : + 연산자와 같은 문자열과 문자열을 연결 시켜주는 메소드
		
		String str5 = str3.concat(str4);	// 2.3true
		String str6 = str3 + str4;			// 2.3true
		System.out.println(str5);
		System.out.println(str6);
		
		// String.valueOf() + concat() ==> + 
		String str7 = "안녕" + 3; 	// 안녕3		,3이 String형으로 자동 변환
		String str8 = "안녕".concat(String.valueOf(3));	// 안녕3 내부적으로 작동됨
		
		System.out.println(str7);
		System.out.println(str8);
		
		// 4. 문자열 ==> byte[]( getBytes() )
		//	  문자열 ==> char[]( toChatArray() )
		
		String str10 = "Hello Java!";
		String str11 = "안녕하세요! 반갑습니다.";
		
		
		//getBytes() : 문자열을 한글자씩 잘라서 byte 배열에 저장 , 아스키 코드값이 출력  
		byte[] arr1 = str10.getBytes();		
		byte[] arr2 = str11.getBytes();		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("=====================");
		
		//toCharArray() :
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
				
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr3[0]); 	// H
		
		// 5. 문자열 수정 , 대문자로 출력 toUpperCase(), 소문자로 변환 : toLowerCase();
		System.out.println(str10.toLowerCase()); 	// 소문자
		System.out.println(str10.toUpperCase()); 	// 소문자
		
		System.out.println("=====================");
		
		// 6. 문자열 수정 : replace("수정할 원본", "수정할 내용");
						// substring ( 시작 방번호, 잘라올 방번호);
		String str13 = "안녕 자바 World";
		
		System.out.println(str1.replace("Hello", "안녕"));
		System.out.println(str13.replace("World", "월드"));
		
		//substring(0,5) : 0번 방에서부터 5번 방까지 잘라서 출력
		System.out.println(str13.substring(0,4));	// 안녕 자  0번에서 시작해서 4번 앞에서 짤림
			//모든 프로그램에서 시작은 포함이고, 끝은 미포함
		System.out.println(str13.substring(3,5));  // 자바  3번에서 시작해서 5번 앞에서 짤림
		
		//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");  // '/','-',' ' 기준으로 잘라서 순서대로 방에 저장해라
						//    0   1   2   3
		System.out.println(Arrays.toString(strArray));
		
		 System.out.println("======================");
		 
		 //trim() : 문자열 앞, 뒤의 공백을 제거하는 메소드
		 
		 System.out.println("              abc              ".trim());
		 
		 System.out.println("=======================");
		 
		 // 7. 문자열의 내용비교 ( equals(), equalsIgnoreCase())
		 
		 	// equals() : Heap의 값을 비교 , 대문자 소문자까지 체크
		 	//equalsIgnoreCase() : Heap의 값비교, 대,소문자를 체크하지않고 비교
		 String str20 = new String("Java");
		 String str21 = new String("Java");
		 String str22 = new String("java");
		 
		 
		 //== : stack 메모리의 참조 주소 비교.
		 System.out.println(str20==str21);		//false
		 System.out.println(str20==str22);		//false
		 System.out.println(str22==str21);		//false
		 System.out.println("========================");
		 
		 //equals() : 대소문자를 체크하면서 Heap영역의 값을 비교.
		 System.out.println(str20.equals(str21));		//true
		 System.out.println(str21.equals(str22));		//false
		 System.out.println(str21.equalsIgnoreCase(str22));		//true
		 
		 
		
		
		
		
		
		
		
	}

}
