package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/*
 * Date클래스 : java.util 패키지의 클래스
 * SimpleDateFormat 클래스: java.text 패키지의 클래스
 * 		String format(Date): Date객체를 지정한 형식에 맞는 문자열로 리턴
 * 		Date parse(String): 형식에 맞는 문자열을 Date타입의 객체로 리턴
 * 							ParseException 예외처리 필수
 * 날짜 format에서 사용되는 문자
 * yyyy: 년도 4자리
 * MM: 월 2자리
 * dd: 일 2자리
 * HH: 시간 2자리(0~24)(소문자 hh도 가능 그러나. 1~12시로 오전 오후를 따로 나눠서 표시해줘야함)
 * mm: 분 2자리
 * ss: 초 2자리
 * E: 요일
 * a: 오전/오후
 */
public class MainEx01 {

	public static void main(String[] args) {
		Date now = new Date(); //현재시간
		System.out.println(now); //System.out.println(now.toString());toStr생략되어있음 //Thu Sep 11 11:30:11 KST 2025
		//날짜 형식을 지정하여 출력하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초 E요일 a"); //형식화된 문자열 출력
		System.out.println(sf.format(now)); //2025년09월11일 11시30분46초 목요일 오전
		/*
		 * String strDate = sf.format(now);
		 * System.out.println(strDate); 이것도 가능.
		 */
		//간단하게 출력.
		SimpleDateFormat sf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatDate = "1996-03-06 10:00:00"; //SimpleDateFormat("yyyy-MM-dd HH:mm:ss");이부분과 "2025/12/25 10:00:00"형식이 맞지 않으면 에러발생함.
		Date day = null;
		try {
			day = sf2.parse(formatDate);//Date타입의 day로 변경.꼭하기 아니면 에러발생함.
		}catch(ParseException e) {
			e.printStackTrace();
			System.out.println("날짜 형식에 맞게 입력하세요"); //이런식으로 형식이 맞지 않는다는 오류메세지 띄우는 것도 좋음.
		}
		System.out.println(sf.format(day));//앞에서 만든 sf형식대로 출력하게함.
		//2025년12월25일 10시00분00초 목요일 오전
	}

}
