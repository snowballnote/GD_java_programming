package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date 클래스의 날짜 설정
 */
public class MainEx02 {

	public static void main(String[] args) {
		//현재 날짜와 시간을 가지는 Date 객체 생성
		Date now = new Date();
		
		
		//now.getTime(): 1970년 1월 1일 0시 0분 0초(GMT) 이후 현재까지 경과한 간(밀리초 단위)
		System.out.println(now.getTime()); //1757944614840
		
		//System.currentTimeMillis(): 현재 시스템 시간을 밀리초 단위로 변환
		System.out.println(System.currentTimeMillis()); //1757944614841
		
		//문자열 "2025-10-01)"을 Date 객체로 변환하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		String sday = "2025-10-01";
		Date day = null;
		try{
			//문자열 -> Date 객체 변환(파싱)
			day = sf.parse(sday);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		//변환된 날짜의 요일 출력(E요일 형식) -> 2025-10-01 수요일
		System.out.println(sday + " " + new SimpleDateFormat("E요일").format(day));
		//2025-10-01 수요일
		
		//변환된 날짜의 밀리초 값 출력
		System.out.println("밀리초: " + day.getTime());
		//밀리초: 1759244400000
		
		//오늘(now) 기준으로 하루 뒤 날짜 구하기(밀리초 + 24시간)
		now.setTime(now.getTime() + (1000L * 60 * 60 * 24));
		
		//하루 뒤 날짜를 yyyy-MM-dd 요일 형식으로 출력
		System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(now));
		//2025-09-16 화요일
	}
}
