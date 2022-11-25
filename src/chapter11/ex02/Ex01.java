package chapter11.ex02;

class Student {
	//필드
	String name;
	
	//합계와 평균을 출력하는 메소드
	void sum_avg() {
		
	}
}

class Student_Sub extends Student {
	// 자식 필드
	int kor;	// 국어 점수
	int eng;	// 영어 점수
	int math;	// 수학 점수
	
	public Student_Sub(String name,int kor, int eng, int math) {
		super();
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	//부모의 sum_avg()메소드를 오버라이딩해서 객체의 kor,eng,math 의 합계와 평균을 출력하는 메소드
	

	@Override
	public void sum_avg() {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.printf(name+" 합계 : %d  평균 : %4.2f",sum,avg);
//		System.out.printf("%s 합계 : %d 평균 : %4.2f",name,sum,avg);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
	
		/*
		 상속, 업캐스팅, 다운캐스팅, 객체를 배열에 넣어서 배열에 저장된 값을 출력
		 생성자를 사용해서 객체 생성시 필드의 값을 할당하고
		 
		홍길동 70 88 77
		이순신 80 68 87
		김똘똘 60 86 87
		홍길순 77 56 80
		강감찬 55 66 77 
		
		Student 배열변수 arr 변수에 모든 객체를 저장해서 업개스팅 (방 5개 student타입으로 저장)
		배열의 값을 for문으로 출력할 때  
			오버라이딩된 메소드 출력 < 각 학생의 국어 영어 수학의 합계,평균 >
			5명 학생의 국어합계, 평균 출력
			5명 학생의 영어합계, 평균 출력			다운캐스팅으로 각과목 게더링
			5명 학생의 수학합계, 평균 출력
	*/	
		Student stu1 = new Student_Sub("홍길동",70,88,77);
		Student stu2 = new Student_Sub("이순신",80,68,87);
		Student stu3 = new Student_Sub("김똘똘",60,86,87);
		Student stu4 = new Student_Sub("홍길순",77,56,80);
		Student stu5 = new Student_Sub("강감찬",55,66,77);
		
		
		Student[] arr = new Student[] {stu1,stu2,stu3,stu4,stu5};
		
		int[]sum = new int[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i].sum_avg();
			System.out.println();
		
		sum[0] += ((Student_Sub)arr[i]).kor;
		sum[1] += ((Student_Sub)arr[i]).eng;
		sum[2] += ((Student_Sub)arr[i]).math;
		
		}		
		System.out.println("=============================");
		System.out.printf(" 국어 합계 : %d  평균 : %4.2f \n",sum[0],sum[0]/5.0);
		System.out.printf(" 영어 합계 : %d  평균 : %4.2f \n",sum[1],sum[1]/5.0);
		System.out.printf(" 수학 합계 : %d  평균 : %4.2f \n",sum[2],sum[2]/5.0);
		
	}

}
