package chapter07.ex05;

class Student{		// 완료시간 1시 20분까지 메일발송
	//필드 선언
	String stuName;			//학생이름 : "학생이름없음"
	int stuNo;				//학번	: 0
	String stuPhone;		//핸드폰	: 000-0000-0000
	String stuAddr;			//주소	: "서울"
	int stuAge;				//나이	: 0
	double stuWeight;		//몸무게	: 0.0
	
	Student(){	// 기본생성자에서 초기값 할당 : this () 메소드를 사용해서 각 필드의 값을 적용 
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울";
		stuAge = 0;
		stuWeight = 0.0;
	}
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	Student(String stuName,int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}	
	Student(String stuName,int stuNo,String stuPhone){
		this(stuName,stuNo);
		this.stuPhone = stuPhone;
	}	
	Student(String stuName,int stuNo,String stuPhone,String stuAddr){
		this(stuName,stuNo,stuPhone);
		this.stuAddr = stuAddr;
	}	
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge){
		this(stuName,stuNo,stuPhone,stuAddr);
		this.stuAge = stuAge;
	}		
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge,double stuWeight){
		this(stuName,stuNo,stuPhone,stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}	
	void print() {
		// 필드의 내용을 출력
	System.out.println("학생 정보 : "+stuName+" "+stuNo+" "+stuPhone+" "+stuAddr+" "+stuAge+" "+stuWeight);
		
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//생성자 호출
		Student student1 = new Student();
		student1.print();
		
		Student student2 = new Student("홍길동");
		student2.print();
		
		Student student3 = new Student("홍길동",35);
		student3.print();
		
		Student student4 = new Student("홍길동",35,"010-1234-5678");
		student4.print();
		
		Student student5 = new Student("홍길동",35,"010-1234-5678","서울 인사동");
		student5.print();
		
		Student student6 = new Student("홍길동",35,"010-1234-5678","서울 인사동",18);
		student6.print();
		
		Student student7 = new Student("홍길동",35,"010-1234-5678","서울 인사동",18,89.9);
		student7.print();
	}

}
