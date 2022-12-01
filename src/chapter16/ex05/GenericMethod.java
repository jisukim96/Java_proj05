package chapter16.ex05;

// 제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드
class GenericMethods {
	
		// <>가 클래스 뒤에 있으면 제너릭 클래스
//	제너릭 메소드 : 일반 클래스 내부에 제너릭 타입의 메소드
		// 접근지정자 뒤에 정의된 타입 변수는 외부에서 지정해서 들어온 타입 외부에서 타입변수가 지정되면 T에 들어감
		// 일반 메소드 블락내에 위치함 메소드에는 꺽쇠블락<> 없음
//	접근제어자 <외부에서타입지정> 리턴타입 메소드명(타입 변수)
//	다양한 타입의 값을 리턴으로 되돌려주는 메소드
	public <T> T method1 (T t) {
		return t;
	}
	
//	동일한 타입의 두 값을 인풋받아서 같으면 true, 다르면 false를 리턴시켜줌
//	제너릭에 넣는 타입변수 T에 올 수 있는 것은 기본 타입은 넣을 수 없다.wrapper 클래스만 올 수 있다.
	public <T> boolean method2 ( T t1,T t2){	//t1과 t2의 값이 같고 다름을 boolean 으로  
		return t1.equals(t2);
	}
	
	//<>를 생략하고 값 넣어도 됨
	public <K,V> void method3(K k, V v) {
		System.out.println(k+" : "+ v);
	}
}

public class GenericMethod {

	public static void main(String[] args) {
		// 제너릭 메소드 사용하기
		// 일반 클래스의 객체 생성
		GenericMethods gm = new GenericMethods();
		
	//	gm.<String>method1("안녕");	//메소드 출력하기 전에 <> 타입지정
		String str1 = gm.<String>method1("안녕");
		String str2 = gm.method1("하세요"); // 뒤의 인풋값으로 타입을 유추 할(알)수 있는 경우 생략가능
		System.out.println(str1);
		System.out.println(str2);
		
		Integer int1 = gm.<Integer>method1(100);
		Integer int2 = gm.method1(200);
		System.out.println(int1);
		System.out.println(int2);
		

		System.out.println(gm.<Double>method1(100.11));
		System.out.println(gm.method1(200.22));
		
		System.out.println("==============================");
		//2. method 호출
		
		// 리턴타입은 일반 타입 //인풋타입은 제너릭타입
		boolean bool1 = gm.<Double>method2(2.5,2.5);	//Double 타입으로 지정
		boolean bool2 = gm.method2(2.4, 2.5);			//Double 타입으로 식별됨
		
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("===============================");
		System.out.println(gm.<String>method2("안녕","안녕"));
		System.out.println(gm.method2("안녕", "하세요"));
		
		System.out.println("===============================");
		//method3 출력
		
		gm.<String,Integer> method3("국어",88);
		gm.method3("영어", 88);
		
		System.out.println("===============================");
		gm.method3("아바타2", "롯데시네마");
		gm.method3(100, 2000);
		gm.<Integer,Double>method3(1000,30.33);
		
//		gm.<String,Void>method3("안녕",);
		
		//유추할수 있는 경우에는 제너릭 생략 가능 = Void?
	}

}
