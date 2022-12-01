package chapter16.ex03;

class Apple { String apple = "애플";}
class Pencil { String Pencil = "연필";}
class Banana { String banana = "바나나";}

// 제너릭 클래스 : 다양한 타입을 저장할 수 있는 클래스
	// 클래스 이름 뒤 <@>
	// 객체를 생성할 때 <T> 들어오는 타입을 지정해서 객체를 생성함.
	// <T> 에 들어오는 타입은 객체형 타입만 들어와야 한다. , wrapper class 를 사용할 것.
	// wrapper class[래퍼클래스] : 기본 자료형을 객체형 자료형으로 만든 것.
		// boolean : Boolean, char : Charter
		// bite : Bite , short : Short , int : Integer , long : Long
		// float : Float , double : Double , void : Void

class MyClass<T> {		//<T> 는 T라는 타입으로 저장되어있음. 타입변수 지정, 들어오는(인풋되는) 타입변수가 T라는 타입으로 할당됨.
	private T t;
	
	public T get() {	//제너릭 타입 = < @ > @ 다양한 타입으로 넣을 수 있음.
		return t;
	}
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArgument {

	public static void main(String[] args) {
		//  1. 제너릭 타입의 객체 생성하기
		MyClass<Apple> app1 = new MyClass<Apple>(); 	// <Apple> 앞으로 생성되는 제너릭 객체는 Apple 타입으로 들어감
		//Apple 객체를 setter를 사용해서 주입하고 값 가져오기
		app1.set(new Apple());
		System.out.println(app1.get().apple);	//get = 메모리에 있는 값 출력 app1.get(). : Apple 객체
		
		//Pencil 객체를 setter를 사용해서 주입하고 값 가져오기
		MyClass<Pencil> pen1 = new MyClass<>();
		pen1.set(new Pencil());						//setter를 사용해서 Pencil 객체를 주입
		System.out.println(pen1.get().Pencil);		//getter를 사용해서 Pencil 객체를 가져옴
		
		//Banana 객체를 setter로 주입하고 값 가져오기
		MyClass<Banana> ba1 = new MyClass<>(); 
		ba1.set(new Banana());
		System.out.println(ba1.get().banana); 		// getter로 메모리에 있는 바나나 값 가져오고, .필드값
		
		//String 값을 넣고 출력하기
		MyClass <String> str1 = new MyClass<>();
		str1.set("안녕하세요");
		System.out.println(str1.get()); 			//객체 넣었을 때 객체가 가지고 있는 값(기존에 넣은 값 없고, 직전에 넣은 "안녕하세요" 출력
		
		//int 값을 넣고 출력하기 : <integer> 객체타입의 자료형
		MyClass<Integer> int1 = new MyClass <>();
		int1.set(100);
		System.out.println(int1.get());

		//double 값을 넣고 출력하기 : <double> 객체
		MyClass <Double> do1 = new MyClass<>();
		do1.set(10.11);
		System.out.println(do1.get());
		
		
		
		
		
		
		
		
	}

}
