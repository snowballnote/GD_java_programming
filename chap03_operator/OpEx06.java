package chap03;

import java.util.Scanner;

/*
 * 삼항연산자
 * 	조건연산자 : 조건문으로 변경 가능
 * 		(조건문) ?참:거짓
 * 		
 * 		조건문(조건식) : 경과가 boolean인 문장
 */
public class OpEx06 {

	public static void main(String[] args) {
		System.out.print("점수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		//System.out.println(score + "점: " + ((score>=60)?"합격":"불합격"));
		//70점이상은 합격, 60점대는 재시험, 60점 미만 불합격
		String result = (score>=70)?"합격":(score>=60)?"재시험":"불합격";
		System.out.println(score + "점: " + result);
	}

}
