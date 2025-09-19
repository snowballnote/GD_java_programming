package chap03;
/*
 * 단항연산자
 * 	증감연산자 : ++, --
 * 		++ : 정수값을 1 증가
 * 		-- : 정수값을 1 감소
 */
public class OpEx01 {

	public static void main(String[] args) {
		int x = 5, y = 5;
		//후치형
		x++; //6
		y--; //4
		System.out.println("x=" + x + ", y=" + y);
		//전치형
		++x; //6 +1 = 7
		--y; //4 -1 = 3
		System.out.println("x=" + x + ", y=" + y);
		
		x = y = 5;
		y = ++x; //x = 6, y = 6
		System.out.println("x=" + x + ", y=" + y);
		
		x = y = 5;
		y = x++; //x = 6, y = 5 x값은 먼저 y에 넣고(y=5) x값이 +1증감. 순서대로 (y=x)먼저 실행 (x++)이 나중에 실행됨
		System.out.println("x=" + x + ", y=" + y);
		
		x = 5; //초기화
		System.out.println("x=" + x++); //x=5
		System.out.println("x=" + x); //x=6
		System.out.println("x=" + ++x); //x=7
		
		y = 5;
		System.out.println("y=" + y--); //y=5
		System.out.println("y=" + --y);	//y=3
	}

}
