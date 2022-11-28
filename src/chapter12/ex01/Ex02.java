package chapter12.ex01;

abstract class Calc2 {	// 사칙연산을 계산하는 계산기 클래스
	abstract void add (int a, int b);	// 덧셈 연산
	abstract void diff (int a, int b);	// 뺄셈 연산
	abstract void mul (int a, int b);	// 곱셈 연산
	abstract void div (int a, int b);	// 나누기 연산
	
}

class Calc_Impl2 extends Calc2 {		// 추상클래스 Calc 를 구현한 클래스
	@Override
	void add(int a, int b) {
		System.out.println(a+b);
	}
	@Override
	void diff(int a, int b) {
		System.out.println(a-b);
	}
	@Override
		void mul(int a, int b) {
		System.out.println(a*b);
	}
	@Override
	void div(int a, int b) {
		System.out.println((double)a/(double)b);
	}
}
public class Ex02 {

	public static void main(String[] args) {

		int a = 4;
		int b = 5;
		
		//구현클래스
		Calc2 c1= new Calc_Impl2();
		c1.add(a, b);
		c1.diff(a, b);
		c1.mul(a, b);
		c1.div(a, b);
		
		System.out.println("======");
		//익명클래스
		Calc2 c2 = new Calc2() {
			@Override
			void add(int a, int b) {
				System.out.println(a+b);
			}
			@Override
			void diff(int a, int b) {
				System.out.println(a-b);
			}
			@Override
				void mul(int a, int b) {
				System.out.println(a*b);
					
				}
			@Override
			void div(int a, int b) {
				System.out.println((double)a/(double)b);
			}
		};
		
		c2.add(a, b);
		c2.diff(a, b);
		c2.mul(a, b);
		c2.div(a, b);
		
		
	}

}
