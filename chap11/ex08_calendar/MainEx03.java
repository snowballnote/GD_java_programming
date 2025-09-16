package ex08_calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Date 객체와 연결
 */
public class MainEx03 {
	public static void main(String[] args) {
		//Calendar <= Date
		//현재 일시를 가진 Date 객체 생성
		Date now = new Date();
		
		//하루(24시간) 뒤로 이동
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24));
		System.out.println(now);
		//Fri Sep 12 15:06:11 KST 2025
		
		//Date 객체를 이용해서 Calendar 객체 설정
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); //Date -> Calendar 변환
		
		//요일 한글 변환용 문자열
		String week = "일월화수목금토";
		
		//Calendar 정보를 포맷팅해서 출력
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n",
                cal.get(Calendar.YEAR),
                cal.get(Calendar.MONTH) + 1,   // 0부터 시작이므로 +1
                cal.get(Calendar.DATE),
                week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
		//날짜:2025-09-12 금요일
		
		//Date <= Calendar
		//현재 일시를 가진 Date 객체 생성
		Date day = new Date();
		
		//Calendar객체가 가진 시간 값(ms)을 Date에 설정
		//(즉, Calendar -> Date 변환)
		day.setTime(cal.getTimeInMillis());
		
		System.out.println(day); //Fri Sep 12 15:10:18 KST 2025
		//-> cal이 "내일" 날짜를 갖고 있으므로 day도 동일하게 "내일" 날짜 출력
	}
}
