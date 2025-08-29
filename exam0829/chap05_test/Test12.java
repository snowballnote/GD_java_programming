package chap05_test;

import java.util.Scanner;

/*
삼각형의 높이를 입력하세요
5
15	14	13	12	11	
	10	9	8	7	
		6	5	4	
			3	2	
				1
 */
public class Test12 {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();

		for(int i=1;i<=h;i++) {
			for(int j=1;j<=h;j++) {
				if(i <= j) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
	}
}