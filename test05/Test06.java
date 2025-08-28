package test05;

import java.util.Scanner;
/*
 * [결과]
삼각형의 높이를 입력하세요
3
		9			
	8	7	6		
5	4	3	2	1	

5 + 3 + 1 = 9
7 + 5 + 3 + 1 = 16

1 : 1 * 2 - 1
2 : 2 * 2 - 1
 
*/
public class Test06 {
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
			//2. 숫자
			for(int j = 1; j <= 2 * i - 1; j++) {
				count++;
				//System.out.print(count * 2 - 1);//??????????????????????????????
				
			}
			
			//줄바꿈
			System.out.println();
		}
	}
	
		
		
}