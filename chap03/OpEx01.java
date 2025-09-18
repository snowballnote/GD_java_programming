package chap03;
/*
 * 단항연산자
 * 	증감연산자 : ++, --
 * 		++: 정수값을 1 증가
 * 		--: 정수값을 1 감소
 */
public class OpEx01 {

	public static void main(String[] args) {
		int x = 5, y = 5;
		
		//후치형(Postfix): 먼저 사용하고 나중에 1 증가/감소
		x++; //x = 6(5->6)
		y--; //y = 3(5->4)
		
		//전치형(Prefix): 먼저 1증가/감소시키고 사용
		++x; //x = 7(6->7)
		--y; //y = 3(4->3)
		System.out.println("x=" + x + ", y=" + y); //x=7, y=3
		
		//전치형 예시
		x = y = 5; //x=5, y=5
		y = x++; //y에 먼저 x값(5) 대입 -> y=5
					//그 후 x 증가 -> x=6
		System.out.println("x=" + x + ", y=" + y); //x=6, y=5
		
		//출력문 안에서의 전치/후치형 차이
		x = 5;
		System.out.println("x=" + x++); //5 (출력 후 증가 -> x=6)
		System.out.println("x=" + x); //6
		System.out.println("x=" + ++x); //증가 후 출력 -> 7
		
		y = 5;
		System.out.println("y=" + y--); //5 (출력 후 감소-> y=4)
		System.out.println("y=" + y); //4
		System.out.println("y=" + --y); //감소 후 출력-> 3
	}

}
