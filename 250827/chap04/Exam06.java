package chap04;

import java.util.Scanner;

/*
 * 삼각형의 높이를 입력받아서 *로 삼각형을 출력하기
 * i와 j의 규칙성이 중요
 [결과]
 삼각형의 높이:3
 -----------------
 1.		i	j
 -----------------
 *		1	1
 **		2	1 2
 ***	3	1 2 3
 -----------------
 2.		i	j
 -----------------
 ***	3	1 2 3
 **		2	1 2
 * 		1	1
-------------------------
3.		i	j
-------------------------
	  * 3		3|1, 2공백
	 ** 2	  2 3| 1공백
	*** 1	1 2 3
-------------------------
4.		i	j
-------------------------
	 *** 3	1 2 3
	  ** 2	  2 3| 1공백
	   * 1		3|1, 2공백
 */
public class Exam06 {

	public static void main(String[] args) {
		System.out.print("삼각형의 높이: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("=== 1번 삼각형 출력 ===\n");
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.print("=== 2번 삼각형 출력 ===");
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.print("=== 3번 삼각형 출력 ===\n");
		for(int i = num; i >= 1; i--) {
			for(int j = 1; j <= num; j++) {
				if(i <= j)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.print("=== 4번 삼각형 출력 ===\n");
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= num; j++) {
				if(i >= j)
					System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}
