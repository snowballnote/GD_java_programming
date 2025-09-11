package ex06_random;

import java.util.Random;

/*
 * true/false 값을 난수로 발생하여 시슨템과 사용자 중 3번 연속 true가 나오는 한쪽이 승리
 * 하는 프로그램 구현하기
 * 
 * [결과]
 * 시스템 false	사용자 false
	시스템 true	사용자 false
	시스템 false	사용자 true
	시스템 false	사용자 true
	시스템 false	사용자 true
	사용자 승리
 */
public class Exam01 {
	public static void main(String[] args) {
		Random com = new Random();
		Random user = new Random();
		int comCnt = 0;
		int userCnt = 0;
		while(true) {
			//System.out.println("시스템: " + com.nextBoolean() + ", 사용자: " + user.nextBoolean());			
			if(com.nextBoolean()) { //ture인경우
				comCnt++;
				System.out.print("시스템 true\t");
			}else {
				comCnt = 0;
				System.out.print("시스템 false\t");
			}
			if(user.nextBoolean()) { //true
				userCnt++;
				System.out.println("사용자 true");
			}else {
				userCnt = 0;
				System.out.println("사용자 false");
			}		
			if(comCnt == 3 || userCnt == 3)
				break;
		}
		if(comCnt == userCnt) {
			System.out.println("비김");
		}else {
			System.out.println(userCnt == 3?"사용자 승리":"시스템 승리");
		}
	}
}
