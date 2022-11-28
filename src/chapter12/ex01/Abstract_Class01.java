package chapter12.ex01;

abstract class Animal{	// 추상 클래스 (추상메소드를 1개라도 포함하고 있다면.)
	String name;
	int age;
	
	Animal(){}


	//추상 메소드 : {} 실행 블락이 없고 , 선언만 되어있는 메소드
		//하위 클래스에서 추상 메소드를 반드시 구현해야 한다. 메소드이름을 고정하여 일할 때
	abstract void cry();	//인풋만 선언되고, { }실행부(구현부)가 없음
	abstract void run();
	
	//toString 메소드 재정의 : 상위 클래스에서 정의 해놓으면 자식 클래스에게 상속되어 내려감
	//	Object 클래스의 메소드 : 객체를 출력했을 때 객체의 Heap의 참조주소(메모리 영역)을 출력하지않고 필드의 값 출력

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
	}
}

class Cat extends Animal {	// 콘크리트 클래스 또는 추상 클래스가 되어야 함
	//생성자를 사용해서 필드의 값 입력

	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
		void cry() {
		System.out.println("야옹");
		}
	@Override
		void run() {
		System.out.println("고양이가 뜁니다.");
		}
}

class Dog extends Animal{
	
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	void cry() {
		System.out.println("멍멍");
	}
	@Override
	void run() {
		System.out.println("개는 달립니다.");
	}
}


public class Abstract_Class01 {

	public static void main(String[] args) {
		// 객체 생성 후 값 입력
		
		Animal a1 = new Cat("고양이",10);
		Animal a2 = new Dog("개",20);

		// 객체를 배열에 저장
		Animal [] arr = new Animal[] {a1,a2};
		
		//for문을 사용해서 객체의 정보를 출력
		for(int i = 0;i<arr.length;i++) {
			//객체 자체를 출력 : toString() : 객체의 메모리의 정보를 출력
			System.out.println(arr[i]);
			// 오버라이딩된 배열 객체 출력
			arr[i].cry();
			arr[i].run();
		}
	}

}
