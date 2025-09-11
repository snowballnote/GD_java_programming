package ex08_calendar;

import java.util.Calendar;
import java.util.Date;

/*
 * Date객체와 연결
 */
public class MainEx03 {

	public static void main(String[] args) {
		//Calendar <= Date
		Date now = new Date();
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24)); //내일이됨.(오늘은 목요일)
		System.out.println(now); //Fri Sep 12 15:06:11 KST 2025
		Calendar cal = Calendar.getInstance();
		cal.setTime(now); //Date 객체를 이용하여 Calendar객체의 날짜 설정
		String week = "일월화수목금토";
		System.out.printf("날짜:%04d-%02d-%02d %c요일\n", cal.get(Calendar.YEAR),
													cal.get(Calendar.MONTH)+1,
													cal.get(Calendar.DATE),
													week.charAt(cal.get(Calendar.DAY_OF_WEEK) - 1));
													//날짜:2025-09-12 금요일
		
		//Date <= Calendar
		Date day = new Date(); //현재일시
		//Calendar 객체를 이용하여 Date 객체의 날짜 설정하기
		//cal: 내일의 날짜를 가지고 있는 객체
		day.setTime(cal.getTimeInMillis()); //cal 객체의 날짜로 day객체의 날짜 설정
		System.out.println(day); //Fri Sep 12 15:10:18 KST 2025 : cal과 day가 연결되어있어 day도 cal처럼 내일 날짜가 추력됨.
	}

}
