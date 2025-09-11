package chap11_test0911;
/*
 * int getRand(f,t) : 함수 구현하기
 *   f ~ t 또는 t~ f 까지  범위에 숫자를 임의의 수로 리턴하는 함수
 *   f, t 값은 포함됨. 
 
[결과]
-2,1,0,-3,-2,1,-1,0,-2,0,0,1,0,-3,0,-1,-1,-2,-2,1,
3,3,0,0,-1,-1,0,3,2,3,0,-1,1,1,-1,3,0,0,1,-1,    
 */

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//Random getRand = new Random();
		
		for(int i=0;i<20;i++) {
			System.out.print(getRand(1,-3)+",");
		}
		System.out.println();
		for(int i=0;i<20;i++) {
			System.out.print(getRand(-1,3)+",");
		}
	}
	private static int getRand(int f, int t) {
		Random r = new Random();
		if(f < t) {
			return r.nextInt(f, t);
		}else {
			return r.nextInt(t, f);
		}	
	}
}