package ex08_calendar;

import java.util.Calendar;

/*
 * Calendar 객체에 날짜 설정하기
 */
public class MainEx02 {

	public static void main(String[] args) {
		//현재 시간을 기준으로 Calendar 객체 생성
		Calendar cal = Calendar.getInstance();
		
		//날짜 직접 설정(2025년 9월 30일)
		//Calendar.MONTH는 0부터 시작하므로 9월은 (9-1)로 지정
		cal.set(2025, (9-1), 30);
		
		//Calendar.DAY_OF_WEEK: 1( 일)-7(토)로 변환
		System.out.printf("날짜:%04d-% 02d-%02d %d요일\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				cal.get(Calendar.DAY_OF_WEEK));
		//날짜: 2025-09-30 3요일
		
		//요일을 한글로 변환하기
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-% 02d-%02d %c요일\\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK)-1));
		//날짜: 2025-09-30 화요일
		
		//1970년1월1일0시부터 Calendar 객체까지의 시간을 밀리초 단위로 출력
		System.out.println(cal.getTimeInMillis()); //1759210220879
		
		//하루 뒤로 이동(1000ms * 60s * 60m * 24h = 하루);
		cal.setTimeInMillis(cal.getTimeInMillis() + (1000L * 60 * 60 * 24));
		
		System.out.printf("날짜:%04d-% 02d-%02d %c요일\\n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH) + 1,
				cal.get(Calendar.DATE),
				week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		//날짜: 2025-10-01 수요일
	}

}
