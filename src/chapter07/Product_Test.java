package chapter07;

//하나의 Java 파일에서 Public class는 하나만 올 수 있다.

//외부 패키지에서는 접근 불가.
class Product{	// 클래스 : 객체를 생성하기 위한 틀  ===> 객체화를 하기위한 틀.
			// Product P = new Product();	<== 객체화
	// 1. 필드 : 객체가 가지는 속성 값
	String proName;	//제품이름
	int proNo;			//제품번호
	int proPrice;		//제품가격
	int proCount;		//제품의 개수
	
	// 2. 생성자 : 1. 리턴타입이 (없는 메소드) 존재하지 않는다. 2. 클래스이름과 동일해야한다.
			//	클래스 이름과 통일한 이름을 가지고 리턴타입이 없는 메소드
			// 객체를 생성 시 생성자 호출. 필드의 기본 값을 할당.
		// 기본 생성자 : 필드의 기본값을 로드 시킴.
	Product() {}	// 기본 생성자 : 인풋값이 없는 생성자. 생략 가능 
					//			: 다른 생성자가 존재할 경우 반드시 명시해 줘야한다.
	
	// 객체 생성 시 생성자 호출 - 인풋 매개변수 2개
	Product(String proName,int proNo){
		this.proName = proName;
		this.proNo = proNo;
		}
	// 객체 생성 시 생성자 호출 - 인풋 매개변수 4개
	Product(String proName,int proNo,int proPrice,int proCount){
		this.proName = proName;
		this.proNo = proNo;
		this.proPrice = proPrice;
		this.proCount = proCount;
	}
	// 3. 메소드 : 기능 (액션)
		//호출 시 필드의 값을 출력해주는 메소드
	void print() {
		System.out.println("제품이름 : "+proName);
		System.out.println("제품번호 : "+proNo);
		System.out.println("제품가격 : "+proPrice);
		System.out.println("제품수량 : "+proCount);
	}
	
	
	// 4. 이너클래스(Inner class : class 내의 class) 	
}


// 다른 패키지에서 접근이 가능한 클래스  
public class Product_Test {
	/* 클래스 내부 블락에 올 수 있는 3가지
		1. 필드(멤버 필드,멤버 변수, 인스턴스 변수) : 클래스 블락에 오는 변수
				Heap 공간에 필드명과 값이 저장됨 
		
	
	*/
	
	int b = 7;
	
	public static void main(String[] args) {
		//
		
		int a = 3;		// 지역 변수 : Stack 공간에 변수명과 값이 저장
		
		// 1. 객체 생성 ( 클래스 ==> 객체 : 인스턴스화 )
		
		//기본 생성자 호출
		Product p1 = new Product();
		p1.print();
		
		System.out.println("==================");
		
		//매개변수 2개인 생성자 호출
		Product p2 = new Product("샴푸",2022112101);
		p2.print();
		
		System.out.println("==================");
		
		//매개변수 4개인 생성자 호출
		Product p3 = new Product("자동차",2022112102,3000,4);
		p3.print();
		
		System.out.println("==================");
		
		//
		Product p4 = new Product("삼성모니터",2022112103,30,100);
		p4.print();
		
		
		
	}

}
