package chapter10.ex04;

class Animal {
	//Animal 필드 
	String name;
	int age;
	
	//기본 생성자 생략되어있다. Animal (){}

	//Animal 메소드
	void cry() {
		System.out.println("Animal 클래스의 cry()");
	}
}

class Tiger extends Animal {
	//자식 클래스의 생성자에는 기본적으로 super()가 생략되어 있다. super() : 부모클래스의 기본 생성자
	// `자식 클래스에서 생성자를 만들 때 부모클래스의 기본 생성자가 우선 생성되어야한다
	// 기본 생성자가 생략되어있다.
	
	int tigerNo;	//Tiger에서 생성된 필드
	
	void tigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("어흥");
	}
}

class Eagle extends Animal{
	int eagleNo;
	void eagleMethod() {
		System.out.println("Eagle 클래스의 메소드");
	}
	@Override
	void cry() {
		System.out.println("짹짹");
	}
}

class TigerChild extends Tiger{
	int tigerChildNo;
	void togerChildMethod() {
		System.out.println("TigerChild 클래스의 메소드");
	}
	void cry() {
		System.out.println("응애~~");
	}
}
public class MethodOverriding_test {

	public static void main(String[] args) {
		// 메소드 오버라이딩 : 상속 관계에서 부모클래스의 메소드를 자식 클래스에서 재정의

		// 1. 객체의 타입
		//a1 : Animal 을 내포하고 있고 Animal의 필드와 메소드 접근 가능 
		//부모객체를 만들어서 자식객체타입으로 지정할 수 없음(오류발생)		
	//	Tiger a1 = new Animal(); 
		
		Animal a1 = new Animal();
		a1.name = "동물이름";
		a1.age = 10;
		a1.cry();
		
		System.out.println("=======================");
		
		// 2. Tiger 객체를 생성하면서 Tiger 타입으로 지정
		// t1은 Animal,Tiger를 내포하고 있고, Tiger 타입으로 지정(Animal, Tiger 접근)
		Tiger t1 = new Tiger();
		// 부모의 필드와 메소드 호출
		t1.name = "호랑이1";
		t1.age = 5;
		t1.cry();		// 오버라이딩되어 Tiger타입으로 출력
		
		// Tiger의 필드 메소드 호출
		t1.tigerNo = 10;
		t1.tigerMethod();
		
		// 3. Tiger 객체를 생성하면서 Animal 타입으로 지정 (Animal의 필드와 메소드만 접근)
		// a2 : Animal, Tiger 
		Animal a2 = new Tiger();
		// Animal의 필드와 메소드만 접근
		a2.name = "호랑이2";
		a2.age = 5;
		a2.cry();		// 오버라이딩된 Tiger 의 cry ()이 호출.  부모의 객체 위에 자식객체가 생성되기 때문.
		
		// 다운 캐스팅 : a2 : Animal,Tiger을 내포하고 있고 Animal 타입
		
		Tiger t2 = (Tiger)a2;	// 다운 캐스팅할 때는 반드시 instanceof 를 사용해야한다.
		
		if(a2 instanceof TigerChild) {
			TigerChild t3 = (TigerChild) a2;
		} else {
			System.out.println("a2에는 TigerChild를 내포하고 있지않습니다.");
		}
		
		// TigerChild 객체를 생성하면서 Animal 타입으로 지정
		// a4 : Animal, Tiger, TigerChild
		Animal a4 = new TigerChild();
		a4.cry();		// `제일 마지막에 오버라이딩된 TigerChild cry 출력됨.
		
		//다운 캐스팅 : 타입을 명시해야함 Animal > Tiger
		Tiger t10 = (Tiger) a4;
		t10.cry();		// 제일 마지막에 오버라이딩된 TigerChild cry 출력됨.
		
		//다운 캐스팅 Tiger > TigerChild 객체 모두 내포, 업캐스팅 가능
		TigerChild tc10 = (TigerChild) t10;
		tc10.cry();
		
		//업캐스팅
		Animal a20 = tc10;
		
		System.out.println("==========================");
		// 배열에 객체를 저장하고 값을 출력하기 위한 객체 생성, Animal 타입으로 지정
		Animal a29 = new Animal();	// a29 : Animal
		Animal a30 = new Tiger();	// a30 : Animal,Tiger
		Animal a31 = new Eagle();	// a31 : Animal,Eagle
		Animal a32 = new TigerChild();	// a32 : Animal, Tiger, TigerChild
		
		// 배열에 Animal 타입의 객체 저장
		Animal[] arr = new Animal[] {a29, a30 , a31 , a32};
		
		// 배열의 값을 출력 : 향상된 for문을 사용해서 출력
		for (Animal k : arr) {
			k.cry();
		}
		
		System.out.println("========= For문을 사용해서 객체 정보출력 ==========");
		
		// 배열의 값 출력 : For 문을 사용해서 출력, 배열의 값을 Animal 변수에 할당하고(담아서) 출력
		for(int i = 0;i < arr.length;i++) {
			Animal aa = arr[i];
			aa.cry();			
		} 
		
		System.out.println("========================");
		for(int i = 0;i<arr.length;i++) {
			arr[i].cry();		//변수에 할당하지않고 바로 출력
		}
		
		System.out.println("========================");
		// 객체 변수를 블락 외부에서 선언 후 출력
		Animal aaa = null;		// 객체형 변수( Animal )는 초기화 기본값 : null
		for (int i = 0; i < arr.length;i++) {
			aaa = arr[i];
			aaa.cry();
		}
		
	}

}
