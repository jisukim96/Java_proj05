package chapter10.ex10;

class C {

//	11시 20분까지 , 메일발송
	String stuID;
	String name;
	int age;

//	c1.equals(c2)	: stuID 필드를 재정의 해서 값이 같으면 true , 다르면 false

//	생성자 : 기본생성자1,생성자2(인풋매개변수)
	C() {}

	public C(String stuID, String name, int age) {
		super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this.stuID == ((C) obj).stuID) {
			return true;
		} else {
			return false;
		}
	}

//	toString 메소드 재정의 : 필드의 값을 출력 , 객체
	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C c1 = new C("아이디", "홍길동", 20);
		C c2 = new C("아이디", "이순신", 23);
		C c3 = new C("아이디1", "세종대왕", 21);
		

		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
	}

}
