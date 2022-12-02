package chapter16.ex10;

import java.lang.Math;
// 1시 20분까지 , 메일발송
//제너릭 클래스 / 제너릭 메소드를 사용해서 두점의 좌표 값으로 넓이를 구하는 프로그램 작성

// 두 점의 좌표르르 처리하는 클래스 생성 <제너릭 클래스>
class Point < X , Y >{
	X x;
	Y y;
	
	// 생성자를 사용해서 x , y의 값 입력 (값 입력은 setter도 가능)
	Point () {}			// 기본 생성자
	Point (X x , Y y){	// x : x좌표 , y : y좌표 
		this.x = x;
		this.y = y;
	}
	// getter만 생성
	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}	
}

//제너릭 메소드 : 일반 클래스 내부에 제너릭 메소드
class GenericMethod {
	
	//makeRectangle()메소드를 호출 시 
	public static <T,V extends Number>double makeRectangle(Point<T,V> p1,Point<T,V> p2){
		//두점의 좌표를 받고 넓이를 계산하여 리턴으로 돌려줌
		double p1x = ((Number)p1.getX()).doubleValue();
		double p1y = ((Number)p1.getY()).doubleValue();
		double p2x = ((Number)p2.getX()).doubleValue();
		double p2y = ((Number)p2.getY()).doubleValue();
		
		double w = p2x - p1x;
		double h = p2y - p1y;
	/*	
		double w = (Double)p1.getX()-(Double)p2.getX();
		double h = (Double)p1.getY()-(Double)p2.getY();
	*/	
		
		return w*h;// 넓이를 리턴 해주면 됨
	}
}


public class Ex01 {

	public static void main(String[] args) {
		// 두 점의 좌표를 저장하는 p1 , p2 객체 생성
		Point<Integer,Integer> p1 = new Point<>(2,11);
		Point<Integer,Integer> p2 = new Point<>(8,2);

		
		//makeRectangle (p1,p2)를 매개변수로 넣으면 리턴값으로 넓이를 받아옴
		double rect = GenericMethod.<Integer, Integer>makeRectangle(p1, p2);
		System.out.println(Math.abs(rect));
			
	}
}
