package chapter07;

class Calc{
	
	//<4시 10분>
	// 두 정수의 값을 받아서 더한 값을 던져줌
	int add(int a,int b) {
		
		System.out.print("받은 값 "+a+"와 "+b+"를 더한 합계 >>> ");
		return a+b;
		
	}
	
	//빼기 (diff)
	int diff(int a,int b) {
		System.out.print("받은 값 "+a+"와 "+b+"를 뺀 값 >>> ");
		return a-b;
	}
	
	//곱하기 (mul)
	int mul(int a,int b) {
		System.out.print("받은 값 "+a+"와 "+b+"를 곱한 값 >>> ");
		return a*b;
	}
	
	//나누기 (div) : double
	double div(double a,double b) {
		System.out.print("받은 값 "+a+"와 "+b+"를 나눈 값 >>> ");
		return a/b;
	}
	
	//면적(rec) : double(가로 : x , 세로 : y)
	double rec(double x,double y) {
		System.out.print("구하고자 하는 면적은 ");
		return x*y;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calc i = new Calc();
		System.out.println(i.add(10, 20));
		System.out.println(i.diff(10, 20));
		System.out.println(i.mul(10, 20));
		System.out.println(i.div(10, 20));
		System.out.println(i.rec(10, 20));
		
		
		
		
		int sum = i.add(50,70 );
		System.out.println(sum);
		
		int bbae = i.diff(50, 70);
		System.out.println(bbae);
		
		int gop = i.mul(50, 70);
		System.out.println(gop);
		
		double nanum = i.div(36.6, 3.0);
		System.out.printf("%4.2f",nanum);
		System.out.println();
		
		double rec = i.rec(50.0, 70.0);
		System.out.printf("%4.2f",rec);
		
		
	}

}
