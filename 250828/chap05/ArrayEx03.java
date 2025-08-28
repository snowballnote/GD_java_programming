package chap05;

import java.util.Arrays;

/*
 * 로또 번호 자동 생성
 * 1. 1 ~ 45까지의 값을 저장하는 배열 생성
 * 2. 배열의 값을 섞기
 * 3. 정렬하기(sort)
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		int[] balls = new int[45]; //45개의 정수값을 저장할 수 있는 balls, 배열의 생성, 선언, 초기화
		int[] lotto = new int[6];
		//1~45까지의 값을 저장
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		//배열의 값을 섞기. swap알고리즘
		for(int i = 0; i < 1000; i++) { //1000번 섞기.
			int f = (int)(Math.random() * 45); //0~44임의의 수 10
			int t = (int)(Math.random() * 45); //0~44임의의 수 1
			int tmp = balls[f]; //balls[10], tmp:11
			balls[f] = balls[t];//balls[10]: 2
			balls[t] = tmp; //balls[1] : 11
		}
		//Arrays : 배열의 보조 클래스.
		System.out.println(Arrays.toString(balls));
		//lotto 배열에 0~5번까지의 요소를 저장
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}
		//lotto 번호 출력
		System.out.println(Arrays.toString(lotto)); //toString메서드 : 객체를 문자열로 변경시킴.
		//정렬하기sort
		Arrays.sort(lotto); //sort : 정렬해주는 메서드
		System.out.println(Arrays.toString(lotto));
		
	}
}
