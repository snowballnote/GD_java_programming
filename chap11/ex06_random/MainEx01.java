package ex06_random;

import java.util.Random;

/*
 * Random 클래스: 난수 발생 클래스
 * 1. 자료형별로 난수를 발생시킬 수 있음
 * 	nextInt(): 정수형 난수
 * 	nextInt(n): 정수형 난수. 0 <= x < n
 * 	nextDouble(): 실수형 난수 0 <= x < 1.0
 * 	nextBoolean(): true, false //동전의 앞면 뒷면
 * 2. seed값 설정 가능
 */
public class MainEx01 {
	public static void main(String[] args) {
		Random rand1 = new Random();
		rand1.setSeed(1);
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand1.nextInt(100)); //0~99사이의 난수
		}
		/*
		 * 0:85
		 * 1:88
		 * 2:47
		 * 3:13
		 * 4:54
		 */
		System.out.println("=====================");
		Random rand2 = new Random();
		rand2.setSeed(1); //seed값이 같아서 위와 같은 난수를 받음. 다르게 해야 다른 난수를 받을 수 있음.
		//seed값이 없어도 난수는 나옴. 그러나 seed값을 이용해서 빅데이터분석에서 데이터를 추출할 수 있음.
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextInt(100));
		}
		for(int i = 0; i < 5; i++) {
			System.out.println(i + ":" + rand2.nextBoolean());
		}
		/*
		 * 0:85
		 * 1:88
		 * 2:47
		 * 3:13
		 * 4:54
		 */
	}
}
