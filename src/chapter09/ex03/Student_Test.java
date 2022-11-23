package chapter09.ex03;

class Student{
	String stuName;		// 학생이름
	static int stuNo;	// 학생 수 : 모든 객체에서 공유되는 필드 , 객체가 생성될 때마다 학생수가 늘어난다.
						// 객체 생성 시 하나씩 늘어나도록 함.
	String stuAdd;		// 학생 주소
	
	
	// static 필드의 초기값 할당 , 클래스 로딩시 제일 먼저 작동
	static {
		stuNo = 0;
	}
	
	Student(String stuName, String stuAdd){
		this.stuName = stuName;
		this.stuAdd = stuAdd;
		stuNo +=1 ;			// 학생수 모든 객체에서 공유되서 사용 , 기존 변수값 + 1
			//  stuNo 는 객체를 생성할 때 학생수가 늘어남.
	}
	
	void print() {
		System.out.println("학생이름 : "+stuName);
		System.out.println("학생주소 : "+stuAdd);
		System.out.println("학생 수 : "+stuNo);
	}
}

public class Student_Test {

	public static void main(String[] args) {
		// 1. 객체 생성
		Student s1 = new Student("홍길동","서울 종로구");
		s1.print();
		
		System.out.println("=====");
		
		Student s2 = new Student("이순신","서울 강남구");
		s2.print();

		System.out.println("=====");
		Student s3 = new Student("강감찬","서울 성북구");
		s3.print();
		
		System.out.println("==== 인스턴스 필드 : 다른 객체와 공유되지않음 ======");
		System.out.println(s1.stuName);
		System.out.println(s2.stuName);
		System.out.println(s3.stuName);
		
		System.out.println("==== 정적 필드: 다른 객체와 공유됨 ======");
		System.out.println(s1.stuNo);
		System.out.println(s2.stuNo);
		System.out.println(s3.stuNo);
	}

}
