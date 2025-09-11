package chap11_test0911;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test03 {
	public static void main(String[] args) {
		System.out.println("첫번째 날짜를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		Calendar cal = Calendar.getInstance();
		try {
			
		}catch(InputMismatchException e) {
			
		}
	}
}
