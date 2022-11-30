package chapter14.ex05;

// 우리가 생성한 객체를 자동으로 리소스 해제하기
	//AutoCloseable 인터페이스를 구현해야 한다.
		// close() 메소드를 재정의 해야 한다.

class A implements AutoCloseable{
	String resource;
	A (String resource){
		this.resource = resource;
	}
	@Override
	public void close() throws Exception {	//close()메소드 호출하는 곳에서 예외 처리가 필요함. 전가
		
		if(resource != null) {
			resource = null;		//리소스의 값이 null 이 아니면 null값을 입력*
			System.out.println("리소스가 해제되었습니다.");
		}
	}
}
public class TrywithResource03 {

	public static void main(String[] args) {
		// 1. 리소스를 수동으로 제거하기
		A a1 = null; // 기본생성자가 없어서 객체 생성하면 오류남. 값부터 넣어줌
		
		try {
			a1 = new A("문자열 입력");
			System.out.println(a1.resource);		// " 문자열 입력 "
			System.out.println("====================");
			
		}catch (Exception e) {
			System.out.println("예외가 발생었습니다.");
			e.printStackTrace();
		}finally {
			
			// 객체의 
			if(a1.resource != null) {
			try {	//try ~ catch로 객체 제거
				a1.close();					// close()메소드 호출하면서 resource에 null값 입력*
			} catch (Exception e) {
				e.printStackTrace();
			}
			}
		}
		System.out.println(a1.resource);		// null
		
		
		System.out.println("=========== 2. 자동으로 객체 리소스 제거 ============");
		// 1. 그 객체가 AutoCloseable 인터페이스의 close()메소드 재정의가 필요함
		// 2. try (객체를 선언, 생성) 경우 : finally에 호출하지않아도 자동으로 close()
		
		try (A a2 = new A("생성자 필드에 값 입력");){
			
			System.out.println(a2.resource); 		// "생성자 필드에 값 입력"
			
		} catch (Exception e){
			
		}
	}
}
