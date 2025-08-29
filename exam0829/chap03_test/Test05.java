package chap03_test;

import java.util.Scanner;
/* 산술연산자
 * 밑변과 높이를 입력받아 삼각형의 넓이를 출력하기. 소숫점을 표시
 * [결과]
 * 밑변의 길이
 * 10
 * 높이의 길이
 * 20
 * 
 * 넓이=100.0
 */
public class Test05 {
	public static void main(String[] args) {
		System.out.println("밑변의 길이");
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		System.out.println("높이의 길이");
		int h = sc.nextInt();
		
		double width = (w * h) / 2.0; //이렇게하면 소수점이 탈락됨. 2.0,2d이렇게 하면 소수점 나옴.
		System.out.println("넓이=" + width);
		
		sc.close();	
	}
}