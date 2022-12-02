package chapter17.ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;


//java.lang 패키지 하위의 클래스는 생략 가능 (Object,String, Integer,...)

public class CreatListObject {

	public static void main(String[] args) {
		// 참고로 알아두는 몰라도 상관없는 내용
		// 1.
		List<Integer> aList1 = new ArrayList<Integer>();	// 내부적으로 메모리 공간을 10개를 확보함.
//		List<Integer> aList1 = new ArrayList<>();
//		List<Integer> aList1 = new ArrayList();	  같은 명령문 뒤에 <>생략 가능
		List<Integer> aList2 = new ArrayList(30);			// 내부적으로 초기메모리 공간 방 30개를 생성 
		
		// 2. Vector
		List<Integer> aList3 = new Vector();		// capacity 10
		List<Integer> aList4 = new Vector(50);		//capacity 60
		
		//3. LinkedList
		List<Integer> aList5 = new LinkedList();	//capacity 10
//		List<Integer> aList6 = new LinkedList(60);	//오류발생 : 초기설정시 오류 발생
		
		//컬렉션은 자동으로 방크기가 늘어나고 줄어든다. (무한정)
		//Arrays.asList( )를 사용해서 값을 넣을 경우 방크기가 고정되어서 늘어나거나 줄어들지 않는다.
		//고정된 값만 들어가야하는 경우 12달, 요일, 
		List<Integer> aList7 = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		List<String> aList8 = Arrays.asList("월","화","수","목","금","토","일");
		
//		aList7.add(13);		값을 더 추가할 수 없다.
//		aList7.remove(0);	값을 제거할 수 없다.
		
		//값 수정은 가능하다. .set()
		aList7.set(1, 7);	// 1번 방의 값을 7로 수정 
		System.out.println(aList7);
		
		try {
			aList8.add("오늘");
			
		} catch (UnsupportedOperationException e) {
			System.out.println("값을 더 추가는 불가능");
		}
		
		try {
			aList8.remove(0);	// 방번호
		} catch (UnsupportedOperationException e) {
			System.out.println("방의 값을 제거할 수 없습니다.");
		}
		System.out.println(aList7);
		
		//수정은 가능하다.
		aList8.set(0, "오늘");

	}

}
