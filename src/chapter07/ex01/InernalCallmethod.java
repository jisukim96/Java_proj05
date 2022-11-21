package chapter07.ex01;

public class InernalCallmethod {

	// main : 메소드 <== static이 붙어있는 메소드
	public static void main(String[] args) {
		// 클래스 내부에서 다른 메소드 호출
			// main 메소드는 메소드 이름 앞에 public : 다른 패키지에서 호출 가능하다.
			// static : 인스턴스화 하지않고 사용가능. 객체를 생성하지않고 사용가능

		// print 메소드 호출 ( 객체 생성없이 바로 호출가능 )
		print();
		System.out.println("====================");
		
	//	twice(33);
		int ab = twice(33);		//twice( int k)
		System.out.println(ab);	// 정수에 담아서 출력
		System.out.println(twice(22));	// 호출 후 바로 출력
		
		System.out.println("====================");
		
		double bc = sum(4,5.0);
		System.out.println(bc);
		
		System.out.println(sum(8,11.5));
		
	//	sum2는 바로 호출시 오류 발생 < == 객체화해서 호출
	//	double de = sum2(20,33.3);	객체화하지않아서 오류발생
		
		
	//	sum2 메소드 호출 : 인스턴스 메소드 ( 객체화해야 호출 가능 )
		InernalCallmethod p1 = new InernalCallmethod();
		double cd = p1.sum2(33, 44.4);
		System.out.println(cd);
	}
	// 메소드 이름 앞에 static 키를 넣으면 객체 생성없이 호출 가능.
	
	public static void print() {
		System.out.println("안녕 ");
	}
	
	// 정수를 인풋 받아 2배로 생성해서 리턴
	public static int twice(int k) {
		
		return k * 2;
		
	}
	public static double sum(int m, double n) {
		
		return m + n; // : double 타입으로 값 출력
//				 (int)n; : n을 다운캐스팅하여 값을 int 타입으로 출력
	}
	
	// static 키 없이 메소드 생성 : 인스턴스 메소드 (반드시 객체화 시켜야 호출 가능)
	public double sum2(int m,double n) {
		
		return m + n;
	}
	

}
