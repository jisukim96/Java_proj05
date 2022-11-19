package chapter06;


class Man {
	// 필드	완료시간 1시 10분까지 메일 발송
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String addr = "서울 종로구 인사동";
	double weight = 70.5;
	int sum=0;
	
	// 기본 생성자는 생략되어 있음. A(){}
	
	// 메소드 : 
	void add1 () {
		// 1 ~ 100까지 2의 배수를 출력하고 더한 값을 출력
		for(int i=1,j=0;i<=100;i++) {
			j = i*2;
			System.out.print(j+" ");
			sum += j;
		}	System.out.println(sum);
	}
	
	void add2 () {
		// 1 ~ 500까지 3의 배수와 4의 배수를 출력하고 더한 값을 출력
		for(int i=1,j=0;i<=500;i++) {
						
			if(j%3==0||j%4==0) {
				System.out.print(j+" ");
			}sum+= j;
			
		}System.out.println(sum);
	}
	
	void add3 () {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력 
		for(int i=1;i<1000;i++) {
			
			if(i%4!=0) {
				System.out.print(i+" ");
				sum += i;
			}
		}System.out.println(sum);
	}
	
	
	
}



public class Ex01 {

	public static void main(String[] args) {
		//  객체 생성 및 객체의 필드의 값이나 메소드 호출

		// 객체 생성
		Man f = new Man();
		
		f.add1();
		f.add2();
		f.add3();
		
	}

}
