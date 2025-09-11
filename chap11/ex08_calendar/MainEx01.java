package ex08_calendar;

import java.util.Calendar;

/*
 * Calendar 클래스: 추상클래스임.
 * 					getInstance()메서드 객체 리턴
 */
public class MainEx01 {
	public static void main(String[] args) {
		//Calendar today = new Calendar(); //객체화 시킬수 없어서 이렇게는 에러남.
		Calendar today = Calendar.getInstance();
		System.out.println(today.getClass().getName()); //java.util.GregorianCalendar
		System.out.println(today); //java.util.GregorianCalendar[time=1757562271736,areFieldsSet=true,areAllFieldsSet=true,lenient=tr.....
		System.out.println("년도: " + today.get(Calendar.YEAR));
		System.out.println("월(0~11): " + (today.get(Calendar.MONTH) + 1)); //+1을 해줘야 실제 월로 나옴. //0부터 시작함.
	    //몇번째주
		System.out.println("월기준 몇째주:"+today.get(Calendar.WEEK_OF_MONTH));
		//일자
	    System.out.println("일자:"+today.get(Calendar.DATE));
	    System.out.println("월기준일자:"+today.get(Calendar.DAY_OF_MONTH));
	    //1월1일부터 오늘까지의 일자
	    System.out.println("년기준일자:"+today.get(Calendar.DAY_OF_YEAR));
	    //요일
	    System.out.println("요일(1:일~7:토):"+today.get(Calendar.DAY_OF_WEEK));
	    //몇번째 요일
	    System.out.println("월기준 몇째:"+today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
	    System.out.println("오전(0)/오후(1):"+today.get(Calendar.AM_PM));
	    System.out.println("시간(0~11):"+today.get(Calendar.HOUR));
	    System.out.println("시간(0~23):"+today.get(Calendar.HOUR_OF_DAY));
	    System.out.println("분(0~59):"+today.get(Calendar.MINUTE));
	    System.out.println("초(0~59):"+today.get(Calendar.SECOND));
	    System.out.println("밀리초(0~999):"+today.get(Calendar.MILLISECOND));
	    //today.get(Calendar.ZONE_OFFSET): 밀리초 리턴
	    //						세계표준시에서 현재 지역까지의 시차를 밀리초로 리턴
	    System.out.println("TimeZone(-12 ~ 12):" +today.get(Calendar.ZONE_OFFSET)/(1000*60*60)); //1000*60*60한시간에 해당하는 밀리초
	    System.out.println("이번달의 마지막일자:"+today.getActualMaximum(Calendar.DATE));
	
	}
}
