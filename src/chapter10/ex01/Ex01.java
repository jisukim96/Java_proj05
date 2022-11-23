package chapter10.ex01;

class Animal{			//Animal 클래스를 상속해서 Tiger,Eagle,Lion 클래스를 생성 
							// 자식 클래스에서는 필드 1,메소드 1 정의
							// LionChild 클래스는 Lion 클래스를 상속해서 필드 1,메소드 1
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}

class Tiger extends Animal{
	int tigerNo;	//서열
	void tigerchar() {
		System.out.println("호랑이는 줄무늬가 있습니다.");
	}
}

class Eagle extends Animal{
	int eagleNo;
	void eaglechar() {
		System.out.println("독수리는 하늘을 납니다. ");
	}
}

class Lion extends Animal{
	int lionNo;
	void lionchar() {
		System.out.println("사자는 갈기가 있습니다.");
	}
}
class LionChild extends Lion{
	String birthMonth;	//탄생월
	void lionchildchar() {
		System.out.println("아기사자는 갈기가 없습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		
		// 호랑이
		Tiger t1 =new Tiger();
		//부모
		t1.age = 15;
		t1.name = "호돌이";
		System.out.println(t1.age);
		System.out.println(t1.name);
		// 자식
		t1.tigerNo = 1;
		System.out.println(t1.tigerNo);
		t1.tigerchar();

		System.out.println("===========================");
		
		//독수리
		Eagle e1 = new Eagle();
		//부모
		e1.age = 13;
		e1.name = "독도";
		System.out.println(e1.age);
		System.out.println(e1.name);
		//자식
		e1.eagleNo = 4;
		System.out.println(e1.eagleNo);
		e1.eaglechar();

		System.out.println("===========================");
		
		//사자
		Lion l1 = new Lion();
		//부모
		l1.age = 19;
		l1.name = "대장";
		System.out.println(l1.age);
		System.out.println(l1.name);
		//자식
		l1.lionNo = 1;
		System.out.println(l1.lionNo);
		l1.lionchar();
		
		System.out.println("===========================");
		
		//새끼 사자
		LionChild lc = new LionChild();
		//Animal
		lc.age = 2;
		lc.name = "아기사자";
		System.out.println(lc.age);
		System.out.println(lc.name);
		//Lion
		lc.lionNo = 20;
		System.out.println(lc.lionNo);
		//자식
		lc.birthMonth = "2월";
		System.out.println(lc.birthMonth);
		lc.lionchildchar();
		
		lc.eat();
		lc.sleep();
		
	}

}
