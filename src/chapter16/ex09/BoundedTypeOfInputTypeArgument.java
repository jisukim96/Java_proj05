package chapter16.ex09;


//메소드에 인풋으로 들어오는 타입을 제한
class A {}
class B extends A{}
class C extends B{}
class D extends C{}

//제너릭 클래스
class Goods<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}	
}

class Test{
	void method1 (Goods<A> g) {}			//case 1 method의 매개변수(g)로 A타입만 가능
	void method2 (Goods<?> g) {}			//case 2 ? : 모든 클래스가 가능 A,B,C,D
	void method3 (Goods<? extends B> g) {} 	//case 3 B,C,D타입만 가능		B아래로 
	void method4 (Goods<? super B> g) {}	//case 4 B,A타입만 가능	 		B위로
}


public class BoundedTypeOfInputTypeArgument {

	public static void main(String[] args) {
		// 메소드로 인풋되는 제너릭 타입의 제한
		Test t = new Test();

		//1. case 1 메소드의 매개변수로 타입 제한 A타입만 가능
		t.method1(new Goods<A>());	//g에 인풋되는 값이 Goods에 A타입 객체만 가능
//		t.method1(new Goods<B>());	
//		t.method1(new Goods<C>());	
//		t.method1(new Goods<D>());	
		
		//2. case 2	메소드 매개변수로 모든 타입 가능
		t.method2(new Goods<A>());
		t.method2(new Goods<B>());
		t.method2(new Goods<C>());
		t.method2(new Goods<D>());
		
		//3. case 3	메소드 매개변수로 B 타입 아래로만 가능
//		t.method3(new Goods<A>());
		t.method3(new Goods<B>());
		t.method3(new Goods<C>());
		t.method3(new Goods<D>());
		
		//4. case 4	메소드 매개변수로 B 타입 위로만 가능
		t.method4(new Goods<A>());
		t.method4(new Goods<B>());
//		t.method4(new Goods<C>());
//		t.method4(new Goods<D>());
		

	}
}
