package chap05_test;

import java.util.Scanner;
/*
삼각형의 높이를 홀수로 입력하세요
5 i= 행, j= 열
		i	j
*****	0	0 1 2 3 4 j: 0~h-i-1 i가 0일때 j는 4 즉, 높이 마이너스 아이 마이너스 1, *: i<=j
 ***	1	1 2 3
  *		2	2
 ***	3	1 2 3	j:0~i, *:
*****	4	0 1 2 3 4
 
 i	j
 3	1:h-i-1
 4	0:h-i-1
 */
public class Test08 {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이: ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		for(int i = 0; i <= h/2; i++) {
			for(int j = 0; j < h-i; j++)
				if(i <= j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			System.out.println();
		}
		
		for(int i = h/2+1; i < h; i++) {
			for(int j = 0; j <= i; j++) {
				if(j >= h-i-1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				System.out.println();
			}
		}
		/*
		int h = sc.nextInt();
		int mid = h / 2;
		int i = 0;
		int j;
		int count = h - 2 * i;
		
		//위쪽 삼각형
		for(i = 0; i <= mid; i++) {
			//공백
			for(j = 0; j < i; j++){
				System.out.print(" ");
			}
			//별
			for(j = 0; j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//아래쪽 삼각형
		for(i = mid - 1; i >= 0; i--) {
			//공백
			for(j = 0; j < i; j++){
				System.out.print(" ");
			}
			//별
			for(j = 0; j < count ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
		*/
	}
}
