package ex07_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
 * 년도와 월을 입력받아서 입력월의 마지막 일자와 마지막 일자의 요일을 출력하자
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println("년도와 월을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int mon = sc.nextInt();
		//String dateStr = year + "-" + (mon + 1) + "-01"; //dateStr: 입력받은 날짜의 한달 후의 1일
		String dateStr = year + "-" + (mon + 1) + "-00"; //전달의 마지막 일자구하기 이렇게 해도됨
		System.out.println(dateStr);
		
		//dateStr에서 -1일해서 입력받은 날짜의 마지막 일자와 요일 구하기
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date day = null;
		try {
			day = sf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		day.setTime(day.getTime() - (1000L * 60 * 60 * 24)); //*60=> 1qns *60 =>1시간 *24=> 하루
		//System.out.println(new SimpleDateFormat("yyyy-MM-dd E요일").format(day));
	}
}
