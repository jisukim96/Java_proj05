package chapter12.ex04;

interface Animal{}

interface Animal1 extends Animal{
	void cry();
}
interface Animal2 extends Animal{
	void run();
}
interface Animal3 extends Animal{
	void eat();
}

class Cat implements Animal1,Animal2 {
	@Override
	public void cry() {	System.out.println("야옹");	}
	@Override
	public void run() {	System.out.println("야옹이가 달린다.");	}
}

class Tiger implements Animal1,Animal2 {
	@Override
	public void cry() {	System.out.println("어흥");	}
	@Override
	public void run() {	System.out.println("호랑이 달린다");}
}

class Dog implements Animal2,Animal3 {
	@Override
	public void run() {	System.out.println("멍멍이가 달린다.");	}
	@Override
	public void eat() {	System.out.println("멍멍이가 먹는다.");	}
}

class Lion implements Animal2,Animal3 {
	@Override
	public void run() {	System.out.println("사자가 달린다.");}
	@Override
	public void eat() {	System.out.println("사자가 먹는다.");	}
}

class Eagle implements Animal1,Animal2,Animal3 {
	@Override
	public void cry() {	System.out.println("끼이오");	}
	@Override
	public void run() {	System.out.println("독수리가 난다.");	}
	@Override
	public void eat() {	System.out.println("독수리가 먹는다.");	}
}
// 5시 45분까지  메일발송
//	Cat , Tiger  <- cry() ,run() 구현
//	Dog , Lion   <- run(), eat() 구현
//	Eagle			<- cry(),run(),eat()

// 	배열에 넣어서 오버라이딩된 메소드 출력
//		instanceof를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 cry() , run()
//		instanceof를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat() , run()
//		instanceof를 사용해서 객체 내부에 Eagle 타입이 존재하면 cry() , run() , eat()
//	다운캐스팅해서 출력

public class Ex01 {

	public static void main(String[] args) {
		
			Animal c1 = new Cat();
			Animal t1 = new Tiger();
			Animal d1 = new Dog();
			Animal l1 = new Lion();
			Animal e1 = new Eagle();
			
		Animal[] arr = new Animal[] {c1,t1,d1,l1,e1};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Cat || arr[i] instanceof Tiger) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
			}
			if(arr[i] instanceof Dog || arr[i] instanceof Lion) {
				((Animal3)arr[i]).eat();
				((Animal2)arr[i]).run();
			}
			if(arr[i] instanceof Eagle) {
				((Animal1)arr[i]).cry();
				((Animal2)arr[i]).run();
				((Animal3)arr[i]).eat();
				
				
			}
		}
	}
}
