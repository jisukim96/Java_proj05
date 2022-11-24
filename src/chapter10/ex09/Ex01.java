package chapter10.ex09;

class Car {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;
	
	// 1. 기본 생성자, 인풋을 받는 생성자,
	Car(){}
	
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}

	// 2. getter, setter 생성
	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

//	   3. toString() 재정의: 전체 메모리 내용 출력.
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 완료시간 6시 30분 메일발송
		// 1. 기본 생성자, 인풋을 받는 생성자,
		// 2. getter, setter 생성
//		   3. toString() 재정의: 전체 메모모리 내용 출력.
		// 4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력
		// 5. setter 를 사용해서 필드의 값을 할당 메모리 전체 내용을 출력
//			 getter 를 사용해서 각 필드의 내용을 출력

		
		// 4. 생성자를 통해서 값을 할당 후 메모리의 전체 내용 출력
		Car c1 = new Car();
		Car c2 = new Car("KIA", "흰색", 200, "K7");
		
		c1.setCarColor("검정");
		c1.setCarModel("SM7");
		c1.setCarName("삼성");
		c1.setMaxSpeed(200);
		
		System.out.println(c1.getCarColor());
		System.out.println(c1.getCarModel()); 
		System.out.println(c1.getCarName()); 
		System.out.println(c1.getMaxSpeed()); 
		
		System.out.println(c2.toString());
	}

}
