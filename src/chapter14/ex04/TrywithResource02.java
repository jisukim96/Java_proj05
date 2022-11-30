package chapter14.ex04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TrywithResource02 {

	public static void main(String[] args) {
	/* Try with Resource : java 1.7
		 일반적인 try 구문 : try{ } catch (Exception e) { }
		 Try with Resource :
			 try( 객체선언[Resource] ) { } catch (Exception e) { }
			 자동으로 객체를 close()
			 자동으로 객체를 제거하기 위해서는 AutoCloseable()인터페이스를 구현한 클래스만이 자동으로 제거됨 */
		
		
//		1. 자동으로 객체를 제거하는 예제
			// try(Resource : 객체를 선언)		<== 객체를 자동 close() 하게 된다.
			// InputStreamReader 은 AutoCloseable 인터페이스를 구현하고 있다.
		System.out.println(" 한글자를 입력하세요 >>> ");
		try(InputStreamReader ir1 = new InputStreamReader(System.in);){
			
			char input = (char)ir1.read();		// 일반 예외(IOException) 가 발생함 
			// 한글자읽어서 인풋변수에 넣는다.
			
			System.out.println("입력한 글자 : "+input);
			
		}catch (IOException e) {
			System.out.println("IOException이 발생되었습니다. ");
		}
		
		// try ( 객체선언 및 생성 ) 
		// finally블락에 close() 메소드를 사용하지 않더라도 자동으로 close()됨.
		// try () 안에 객체선언하면 finally 블락에 close() 하지않아도 됨.
		
	}

}
