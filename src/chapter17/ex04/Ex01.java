package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개 정도 생성해서 ArrayList안에 저장 후 객체를 출력할 때 자동으로 필드의 값 출력하도록
//For, Enhanced For ,컬렉션 객체자체를 출력
//완료시간 : 6시 20분까지
class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	//생성자
	public Car(String company, String carModel, String color, int maxSpeed) {
		super();
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// ArrayList 생성
		ArrayList<Car> a1 = new ArrayList();
		
		//Car객체 3개정도 생성
		Car c1 = new Car("르노","QM6","Gray",200);
		Car c2 = new Car("KIA","K9","Whith",200);
		Car c3 = new Car("현대자동차","캐스퍼","Green",160);
		
		//ArrayList에 저장
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);

		//ArrayList 저장된 값 출력
		//For
		System.out.println("================ For ===================");
		for(int i=0;i<a1.size();i++) {
			Car cc1 = a1.get(i);
			System.out.println(cc1);
		}
		
		//Enhanced For
		System.out.println("============ Enhanced For ==============");
		for(Car k : a1) {
			System.out.println(k);
		}
		
		// 컬렉션 객체자체
		System.out.println("============ 컬렉션 객체 자체 출력 ============");
		System.out.println(a1);
		
		
	}

}
