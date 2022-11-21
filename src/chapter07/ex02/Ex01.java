package chapter07.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개변수로 배열을 Argument 인풋 ( 배열, 정수 )
		
		// 1 ~ 100 까지 3의 배수의 배열을 생성 후 메소드 호출 , 정수 : 5 호출 (3의 배수 곱하기 5)
				// 주의 : 100번 방까지 X, 값이 100까지
		int[]a = new int[100/3];
		for ( int i = 0,j =3;i< a.length;i++,j+=3) { //i = 방번호 , j = 3의 배수 저장
			a[i] = j;
		}
		//3의 배수 출력
		System.out.println("========= 3의 배수 출력 ==========");
		System.out.println(a.length);
		for(int i = 0; i<a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("===============================");
		
		//메소드 호출
		System.out.println("== 3의 배수 배열에 각 방에 값을 * 5 ==");
		printArray(a,5);
		
		
		// 1 ~ 100 까지 7의 배수 배열을 생성 후 , 정수 : 2 호출 (7의 배수 곱하기 2)
		
		int[]b = new int[100/7];
		for ( int i = 0,j =7;i< b.length;i++,j+=7) { //i = 방번호 , j = 3의 배수 저장
			a[i] = j;
			
		System.out.println("========= 7의 배수 출력 ==========");
		for( int i1 = 0; i1<b.length;i1++) {
			System.out.print(b[i1]+" ");
		}
		System.out.println();
		
		//메소드 호출
		printArray(b,2);
		
		
		System.out.println("1부터 200까지 9의 배수만 저장 후 출력");
		int[] c = MultiArray(200,9);
		System.out.println("======= 200까지 9의 배수 출력 =======");
		for(int k = 0;k<c.length;k++) {
			System.out.print(c[k] + " ");
		 }
		}
	}		
	
	//메소드 : static , 매개변수로 정수 1개, 배열 1개 인풋받아 
	//		각 방의 배열의 값을 인풋받은 정수로 곱해서 출력하는 배열
	

	public static void printArray (int[] a,int b) {
		for( int i=0;i<a.length;i++) {
			System.out.print(a[i]*b+" ");	// 배열의 각 방에 들어오는 정수를 곱해서 출력
			}
		System.out.println();	
			
	}
	
	//방의 개수에 따라 배수를 저장하는 배열을 리턴 시켜주는 메소드
		//maxCount : 값이 100까지
		//multi : 배수를 저장하는 변수
	public static int[] MultiArray (int maxCount,int multi) {
		int[] a = new int[maxCount/multi];
		for (int i = 0,j = 1; i<a.length;j++) {	// j : 배수를 저장하는 변수
			if(j%multi == 0) {		// j / multi == 0 : multi 배수일 때만 j 값을 배열 a에 저장
				a[i] = j;
				i++;
			}
		}
		return a;
	}
}
