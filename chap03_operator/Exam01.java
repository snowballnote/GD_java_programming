package chap03;
import java.util.Scanner;
/*
 * 화면에서 초를 입력받아 몇시간, 몇분, 몇초인지 출력하기
 * 1. Scanner 객체 생성
 * 2. 초를 입력받아 변수에 저장
 * 3. 시분초로 변경하기
 * 	시 : sec/3600
 * 	분 : (sec%3600)/60
 * 	초 : sec%60
 * [결과]
 * 3662 = 1시간 1분 2초
 */
public class Exam01 {

	public static void main(String[] args) {
		System.out.print("초를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt(); //키보드에서 정수값 입력
		int h = sec / 3600;
		int m = (sec % 3600) / 60;
		int s = sec % 60;
		System.out.println(sec + " = " + h + "시간 " + m + "분 " + s + "초");
	}

}
