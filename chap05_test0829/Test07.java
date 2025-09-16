package chap05_test0829;
/*
삼각형의 높이를 입력하세요
3
*****
 ***
  *
 
 */

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int count = 0;
		for(int i = 1; i <= h; i++) {
			//1. 공백 출력
			for(int j = 1; j <= h - i; j++) {
				System.out.print(" ");
			}
			//2. 별표찍기
			for(int j = 2 * i - 1; j <= 1; j--) {
				System.out.print("*");
			}
			
			//줄바꿈
			System.out.println();
		}
	}
}