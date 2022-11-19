package chapter07;

class Student{
	
	//필드선언
	String stuName;		//학생이름
	int stuNum;		//학번
	String stuAddr;		//학생의 주소
	String stuPhone;	//학생의 전화번호
	double weight;		//학생의 몸무게
	
	// 생성자 오버로딩
	// 		기본 생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	Student(){}
	
	 Student(String stuName,String stuAddr,String stuPhone){
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName,String stuAddr,String stuPhone,int stuNum,double weight){
		this.stuName = stuName;
		this.stuAddr = stuAddr;
		this.stuPhone = stuPhone;
		this.stuNum = stuNum;
		this.weight = weight;
	}
	
	// 필드의 값을 출력하는 메소드 void print(){필드의 값을 출력}
	void print() {
		System.out.println("학생 이름 : " + stuName);
		System.out.println("학생 주소 : " + stuAddr);
		System.out.println("학생 전화번호 : " + stuPhone);
		System.out.println("학생 번호 : " + stuNum);
		System.out.println("학생 몸무게 : " + weight);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1.
		System.out.println("=========== 기본 생성자 =============");
		Student student = new Student();
		student.print();

		
		//2.
		System.out.println("======== 매개변수 3개인 생성자 =========");
		Student student2 = new Student("홍길동","서울시 중구","010-1234-5678");
		student2.print();

		
		//3.
		System.out.println("======= 매개변수 5개인 생성자 ===========");
		Student student3 = new Student("홍길동","서울시 중구","010-1234-5678",13,70.8);
		student3.print();


	}

}
