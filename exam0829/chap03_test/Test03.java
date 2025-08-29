package chap03_test;

import java.util.Scanner;
/*
 * 화면에서 점수를 입력받아서 
 * 90점 이상이면 A학점,80점 이상이면 B학점
 * 70점 이상이면 C학점,60점 이상이면 D학점
 * 60 점 미만이면 F학점을 출력하기
 */
public class Test03 {
	public static void main(String[] args) {
		//점수입력
		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오: ");
		int score = sc.nextInt();
		//조건연산자
		//가독성 좋음
		String rslt = (score>=90)?"A":
						(score>=80)?"B":
							(score>=70)?"C":
								(score>=60)?"D":"F";
		System.out.println(score + "점: " + rslt + "학점");
		
		//요즘엔 한줄로 쓰는 사람들 많음
		System.out.println(score + "점: " + ((score>=90)?"A학점":(score>=80)?"B학점":(score>=70)?"C학점":(score>=60)?"D학점":"F학점"));
		
		//조건문
		System.out.print(score + "점: ");
		if(90 <= score) {
			System.out.println("A학점");
		} else if(80 <= score && score < 90) {
			System.out.println("B학점");
		} else if(70 <= score && score < 80) {
			System.out.println("C학점");
		} else if(60 <= score && score < 70) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
		
		sc.close();
	}
}