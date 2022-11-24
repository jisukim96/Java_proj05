package chapter10.ex08;

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}
class Man extends Animal{
	@Override
	void run() {
		System.out.println(" 사람도 달립니다.");
	}
}
class Woman extends Animal{
	@Override
	void run() {
		System.out.println(" 사람들은 달립니다.");
	}
}
class Lion extends Animal{
	@Override
	void run() {
		System.out.println(" 사자가 달립니다.");
	}
}
class Tiger extends Animal{
	@Override
	void run() {
		System.out.println(" 호랑이가 달립니다.");
	}
}
class Cat extends Animal{
	@Override
	void run() {
		System.out.println(" 고양이가 달립니다.");
	}
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println(" 개가 달립니다.");
	}
}
class DogChild extends Dog{
	@Override
	void run() {
		System.out.println(" 강아지가 달립니다.");
	}
}
public class Ex01 {

	// 4시 10분까지 완료 , 메일발송
	public static void main(String[] args) {
		// Animal : 부모 클래스 , run() 정의되어있음
		// 자식 클래스 : Man , Woman , Lion , Tiger , Cat , Dog - DogChild  <==하나의 클래스를 가지고 여러 형태를 가지는 다형성 구형
		//  - 부모의 run 메소드를 재정의 
		// arr 배열에 Animal 타입으로 저장 후 For,Enhanced For 문으로 출력, run()메소드 출력 
		
		// 1. 객체 생성
		Animal a1 = new Man();
		Animal a2 = new Woman();
		Animal a3 = new Lion();
		Animal a4 = new Tiger();
		Animal a5 = new Cat();
		Animal a6 = new Dog();
		Animal a7 = new DogChild();
		
		// 배열에 저장
		Animal[] arr = new Animal[] {a1,a2,a3,a4,a5,a6,a7};
		
		// for 문 출력
		System.out.println("==== For문으로 출력 ====");
		for(int i=0;i<arr.length;i++) {
			Animal a = arr[i];
			a.run();
		}
		
		System.out.println("=== Enhanced For문 ===");
		//Enhanced For문 출력
		for(Animal a : arr) {
			a.run();
		}
	}
}
