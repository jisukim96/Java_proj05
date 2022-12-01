package chapter16.ex02;

// 모든 객체는 Object를 상속하고 있다..
// 모든 객체는 Object 타입으로 모두 타입변환 할 수 있다.
	//Object 타입으로 저장된 객체를 가져와서 사용하기 위해서는 다운캐스팅이 필요함.

// 모든 클래스는 Object 안에 넣을 수 있다.
// 매번 다운캐스팅이 필요하다.
class Apple{String apple = "애플";}	//extends Object
class Pencil{String pencil = "연필";}
class Banana{String banana = "바나나";}
class Orange {String orange = "오렌지";}


class Goods{
	
	// Object는 자바의 모든 객체를 담을 수 있는 타입이다.
	private Object object = new Object();
	
	public Object getObject() {
		return object;
	}
	public void setObject(Object object) {	//애들을 만들어 set이용해서 오브젝트에 넣게되면 오브젝트타입으로 업캐스팅되어 들어감
		this.object = object;
	}
	
}

public class Using_Object {

	public static void main(String[] args) {
		// 1. goods를 사용해서 Apple 객체를 저장 후 가져오기
		Goods goods1 = new Goods();
		goods1.setObject(new Apple());	//Apple 객체를 생성해서 setter 주입 - setter를 통해서 apple을 goods안에 넣음
		
		// getter를 사용해서 값을 가져올 때는 다운캐스팅해서 가져와야한다.
		Object obj = goods1.getObject();
		Apple app1 = (Apple) obj;	//obj 안에 app1 들어감 Apple 타입으로 가져옴 
		
		Apple app2 = (Apple) goods1.getObject();	//Apple 타입으로 다운캐스팅
		System.out.println(app2.apple);
		
		// 2. Goods를 사용해서 Pencil 객체를 저장 후 가져오기
		goods1.setObject(new Pencil());
		Object obj2 = goods1.getObject();
		
		Pencil pen1 = (Pencil) obj2;
		System.out.println(pen1.pencil); //다운캐스팅했을때펜슬에접근할수있음
		
		// 3. Goods를 사용해서 Banana 객체를 저장 후 가져오기
		goods1.setObject(new Banana());	//새로 생성한 바나나는 오브젝트타입
		
		Banana banana = (Banana)goods1.getObject();	//오브젝트에서 가져오면서 바나나타입으로 다운캐스팅
		System.out.println(banana.banana);
		
		
		
		
		
		
	}

}
