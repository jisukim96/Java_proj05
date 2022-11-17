package chapter05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		/*  완료시간 6시까지	메일발송
		 국어 영어 수학 과학		  국어 영어 수학 과학       국어 영어 수학 과학		국어 영어 수학 과학
	홍길동 70  88  77  99	  이순신 80 68 87 79 		김똘똘 60 86 87 30	 홍길순 77 56 80 99
	
	메인 메소드 args 로 아래와 같은 값이 인풋 되었을 경우 < 출력> 과 같이 출력해보세요
	args : 홍길동 70 80 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
				
	< for문을 사용해서 출력하세요>
	
	<출력>
	  	  국어  영어  수학  과학  	<합계>	<평균>
	===========================================
	홍길동   70  88  77  99
	이순신   80  68  87  79
	김똘똘   60  86  87  30 
	홍길순   77  56  80  99
	===========================================
	<합계>
	<평균>
	
 		 */
		
	System.out.println("<출력>");	
	System.out.println("\t국어\t영어\t수학\t과학\t<합계>\t<평균>");
	System.out.println("==============================================================");
	
	String H1 = args[0];
	String L = args[5];
	String K = args[10];
	String H2 = args[15];
	
	int i;
	int sumh1 = 0;

	System.out.print(H1+"\t");
	for( i=1;i<=4;i++) {
		
		sumh1 += Integer.parseInt(args[i]);
		System.out.print(args[i]+"\t");
	}
	
	double avgh1 = sumh1/4.0;
	System.out.print(sumh1+"\t");
	System.out.println(avgh1);
	
	//이순신
	
	int suml = 0;

	System.out.print(L+"\t");
	for( i=6;i<=9;i++) {
		
		suml += Integer.parseInt(args[i]);
		System.out.print(args[i]+"\t");
	}
	
	double avgl = suml/4.0;
	System.out.print(suml+"\t");
	System.out.println(avgl);
	
	//김똘똘
	
	int sumk = 0;

	System.out.print(K+"\t");
	for( i=11;i<=14;i++) {
		
		sumk += Integer.parseInt(args[i]);
		System.out.print(args[i]+"\t");
	}
	
	double avgk = sumk/4.0;
	System.out.print(sumk+"\t");
	System.out.println(avgk);

	//홍길순
	
	int sumh2 = 0;

	System.out.print(H2+"\t");
	for( i=16;i<=19;i++) {
		
		sumh2 += Integer.parseInt(args[i]);
		System.out.print(args[i]+"\t");
	}
	
	double avgh2 = sumh2/4.0;
	System.out.print(sumh2+"\t");
	System.out.println(avgh2);

	
	System.out.println("==============================================================");
	
		
	//과목 합계 	국어 :1,6,11,16
	int sumkor = 0;
	for(i=1;i<args.length;i+=5) {
		sumkor += Integer.parseInt(args[i]);
	}
	System.out.print("<합계>\t");
	System.out.print(sumkor+"\t");
	
	//
	int sumeng = 0;
	for(i=2;i<args.length;i+=5) {
		sumeng += Integer.parseInt(args[i]);
	}

	System.out.print(sumeng+"\t");

	//
	int summath = 0;
	for(i=3;i<args.length;i+=5) {
		summath += Integer.parseInt(args[i]);
	}

	System.out.print(summath+"\t");

	//
	int sumsci = 0;
	for(i=4;i<args.length;i+=5) {
		sumsci += Integer.parseInt(args[i]);
	}

	System.out.print(sumsci+"\t");
	int e = sumkor+sumeng+summath+sumsci;
	double f = avgh1+avgk+avgl+avgh2;
	System.out.print(e+"\t");
	System.out.println(f);
	
	// 과목 평균
	double a = sumkor/4.0;
	double b = sumeng/4.0;
	double c = summath/4.0;
	double d = sumsci/4.0;
	
	
	double g = (sumh1+sumk+suml+sumh2)/4.0;
	double h = (avgh1+avgk+avgl+avgh2)/4.0;
	
	System.out.print("<평균>\t");
	System.out.print(a+"\t"+b+"\t"+c+"\t"+d+"\t"+g+"\t");
	System.out.printf("%4.2f", h);
	
	}

}
