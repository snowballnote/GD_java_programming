package chap04;

import java.util.Scanner;

/*
 * break 구문 예제
 * 
 * 화면에서 숫자를 입력 받아 합계 구하기
 * 999 숫자가 등록될때 까지 입력받기
 */
public class LoopEx03 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요(종료:999)");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) { //무조건 반복시키기 => 무한반복
			int num = sc.nextInt();
			if(num == 999) break; //반복문 강제 중지
			sum += num;
			
		}
		System.out.println("입력한 숫자의 합: " + sum);
	}
}
