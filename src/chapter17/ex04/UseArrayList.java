package chapter17.ex04;

import java.util.ArrayList;

class Student{
	String name;
	int stuID;
	
	//생성자를 사용해서 값을 인풋받아 메모리에 할당.
	public Student(String name, int stuID) {
		this.name = name;
		this.stuID = stuID;
	}

	//toString() 재정의(오버라이딩) : 객체 자체를 출력할 때 객체의 주소가 출력되지않고 메모리의 값 출력
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
}

public class UseArrayList {

	public static void main(String[] args) {
		
		//ArrayList에 저장될 객체는 Student 객체가 저장됨.
		ArrayList<Student> a1 = new ArrayList();
		
		//Student 객체를 생성
		Student s1 = new Student("홍길동",1111);
		Student s2 = new Student("이순신",2222);
		Student s3 = new Student("강감찬",3333);
		
		//Student 객체를 ArrayList 컬렉션에 저장
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		
		// 컬렉션의 내용을 순환하면서 출력
		//For
		for (int i = 0 ;i<a1.size();i++) { //방의 개수 - 배열 : .length 컬렉션 : .size
			Student ss1 = a1.get(i);	//방의 (메모리) 값 가져오기 : .get()
			System.out.println(ss1);
		}
		System.out.println("========== Enhanced For ============");
		//Enhanced For문
		for(Student k : a1) {
			System.out.println(k);
		}
		System.out.println("====================================");
		//모든 컬렉션은 컬렉션 객체를 출력시 컬렉션의 들어가는 값을 출력한다. toString()메소드를 오버라이딩(재정의)해서 []안에 출력됨.
		// 모든 컬렉션은 toString()값이 재정의 되어있음.
		System.out.println(a1); //컬렉션 안의 값 출력
		System.out.println(a1.toString());
	}
}
