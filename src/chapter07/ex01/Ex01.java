package chapter07.ex01;
	
public class Ex01 {

	public static void main(String[] args) {
		// <완료시간 11:40 까지>
		
		// 객체 생성 , 메소드 호출 : Main method에서 호출
		
		/*sum1 , sum2 객체 생성없이 바로 호출 : static 메소드
		sum1(3,4,5);
		int a = sum1(3,4,5);
		System.out.println(a);
		
		System.out.println(sum1(3,4,5));
		System.out.println("====================");
		double b = sum2(3.0,4.0,5.0);
		System.out.println(b);
		System.out.println(sum2(6.0,7.0,8.0));
		
		
		sum3 : 인스턴스 메소드 ( static 키가 붙어있지 않는 메소드 , 객체화해야 호출 가능)
		String c = sum3("제품이름","제품가격","제품수량");  ==> 오류발생 , 객체화해야 호출 가능
		Ex01 e1 = new Ex01();
		String d = e1.sum3("제품이름","제품가격","제품수량");
		System.out.println(d);
		System.out.println(sum3("제품이름","제품가격","제품수량"));
	*/
		
		int q = sum1(11,12,13);
		System.out.println(q);
		
	
		System.out.println(sum2(11.1,12.2,13.3));
		
		Ex01 str = new Ex01();
		String cd = str.sum3("삼성",33, 44);
		System.out.println(cd);
	
		}
	
	//정수값 3개를 인풋받아 더한 값을 정수로 리턴하는 메소드 ( + static)
	public static int sum1(int a,int b ,int c) {	// 리턴없다면 void
		
		return a + b + c;
	}
	
	//실수 3개를 인풋받아 더한 값을 실수로 리턴하는 메소드 ( + static )
	public static double sum2(double m, double n, double o) {
		return m + n + o;
	}
	
	//문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static을 사용하지 않는 메소드)
	//"제품이름" , "제품수량" , "제품가격" 
	// 객체를 생성해서 매개변수 3개 값을 넣고 호출
	public String sum3(String i, int j,int k) {
		
		return "제품이름 : "+i+" 제품수량 : "+j+"개  제품가격 : "+k+"원";
	}	
}
