package ex08_calendar;

import java.util.Calendar;

/*
 * Calendar 객체에 날짜 설정하기
 */
public class MainEx02 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2025,(9 - 1), 30); //날짜 설정
		System.out.printf("날짜:%04d-%02d-%02d %d요일\n", cal.get(Calendar.YEAR),
													cal.get(Calendar.MONTH)+1,
													cal.get(Calendar.DATE),
													cal.get(Calendar.DAY_OF_WEEK));
													//날짜:2025-09-30 3요일
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일", cal.get(Calendar.YEAR),
													cal.get(Calendar.MONTH)+1,
													cal.get(Calendar.DATE),
													week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
													//날짜:2025-09-30 화요일
		//1970년부터 Calandar까지 시간을 밀리초 리턴
		System.out.println(cal.getTimeInMillis()); //1759210220879
		cal.setTimeInMillis(cal.getTimeInMillis() + (1000* 60 * 80 * 24));
		System.out.printf("날짜:%04d-%02d-%02d %c요일", cal.get(Calendar.YEAR),
													cal.get(Calendar.MONTH)+1,
													cal.get(Calendar.DATE),
													week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
													//날짜:2025-10-01 수요일
		/*
		 * System.out.printf("날짜:%04d-%02d-%02d %c요일", year, mon, lastday, week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		 */
	}
}
