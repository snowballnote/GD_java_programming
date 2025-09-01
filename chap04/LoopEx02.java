package chap04;
/*
 * 중첩반복문 : 반복문 내에 반복문 존재
 */
public class LoopEx02 {

	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			System.out.println("\n" + i + "단");
			for(int j = 2; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}

	}

}
