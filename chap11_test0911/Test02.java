package chap11_test0911;
/*
 * 
년도와 월를 입력하세요
2025 02

	   2025년2월
   일  월  화   수  목  금   토
                           1
   2   3   4   5   6   7   8
   9  10  11  12  13  14  15
  16  17  18  19  20  21  22
  23  24  25  26  27  28
 */

import java.util.Calendar;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도와 월을 입력하세요");
		int year = sc.nextInt();
		int month = sc.nextInt();
		System.out.println("\t" + year + "년" + month + "월");
		String[] week = {"일","월", "화", "수", "목", "금", "토"};
		for(int i = 0; i < week.length; i++) {
			System.out.printf("%5s", week[i]);
		}
		System.out.println();
		
		//날짜구현
		Calendar cal = Calendar.getInstance();
		//cal.set(year, (month - 1), 1);
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year,  (month - 1), lastday);
		for(int i = 1; i <= cal.get(Calendar.DATE); i++) {
			System.out.printf("%d", i);
		}
		
		
	}
}