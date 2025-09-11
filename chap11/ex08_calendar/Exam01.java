package ex08_calendar;

import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;
/*
 * 년도와 월일 입력받아서 해당월의 마지막 일자와 요일 출력하기
 * Calemndar 클래스 이용하기
 */

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		Calendar cal = Calendar.getInstance();
		
		cal.set(year, (month - 1), 1); //입력한 월의 1일
		int lastday = cal.getActualMaximum(Calendar.DATE);
		cal.set(year,  month - 1, lastday); //입력 월의 마지막일
		
		//cal.set(year, mon, 0); //입력한 월의 다음달 0일, 이번달 마지막 일자 위 세줄말고 이 한줄로도 가능.
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일", cal.get(Calendar.YEAR),
													cal.get(Calendar.MONTH)+1,
													cal.get(Calendar.DATE),
													week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		/*
		 * System.out.printf("날짜:%04d-%02d-%02d %c요일", year, mon, lastday, week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		 */
		/*
		 * System.out.printf("날짜:%04d-%02d-%02d %c요일", year, mon, cal.hetActualMaximum(Calendar.DATE),
		 * 						week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1)); //이것도 가능
		 */

	}


}
