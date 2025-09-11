package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date클래스의 날짜 설정하기
 */
public class MainEx02 {
	public static void main(String[] args) {
		Date now = new Date();
		//now.getTime() : 1970년 이후부터 Date객체까지의 시간을 밀리초로 리턴
		System.out.println(now.getTime()); //1757560107012
		//System.currentTimeMillis(): 1970년 이후부터 현재까지의 시간을 밀리초로 리턴
		System.out.println(System.currentTimeMillis()); //1757560107012
		//2025-10-01의 요일과 밀리초 출력하기
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2025-10-01";
		Date day = null;
		try {
			day = sf.parse(sday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println(sday + " " + new SimpleDateFormat("E요일").format(day)); //2025-10-01 수요일
		System.out.println("밀리초: " + day.getTime()); //밀리초: 1759244400000
		//오늘보다 하루 이후의 날짜를 yyyy-MM-dd 요일의 형식으로 출력하기
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24));
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(now)); //2025-09-12 금요일
	}

}
