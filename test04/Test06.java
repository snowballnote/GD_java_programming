package test04;

import java.util.Scanner;

/*
점수를 입력받아 
    95점 이상인 경우 A+ 90 ~ 94 : A0  
    89 ~ 85점 이상인 경우 B+ 80 ~ 84 : B0 
    79 ~ 75점 이상인 경우 C+ 70 ~ 74 : C0 
    69 ~ 65점 이상인 경우 D+ 60 ~ 64 : D0 
       그외는 F 로 출력하기.
*/
public class Test06 {
	public static void main(String[] args) {
		System.out.print("점수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(95 <= score) {
			System.out.println("A+");
		} else if(90 <= score && score <= 94) {
			System.out.println("A0");
		} else if(89 <= score && score <= 85) {
			System.out.println("B+");
		} else if(80 <= score && score <= 84) {
			System.out.println("B0");
		} else if(79 <= score && score <= 75) {
			System.out.println("C+");
		} else if(70 <= score && score <= 74) {
			System.out.println("C0");
		} else if(69 <= score && score <= 65) {
			System.out.println("D+");
		} else if(60 <= score && score <= 64) {
			System.out.println("D0");
		} else {
			System.out.println("F학점");
		}
		/*
		 *if (score >= 90 ) {
			grade = "A";
			if(score >= 95) grade += "+";
			else grade += "0";
		} else if (score >= 80) {
			grade = "B";
			if(score >= 85) grade += "+";
			else grade += "0";
		} else if (score >= 70) {
			grade = "C";
			if(score >= 75) grade += "+";
			else grade += "0";
		} else if (score >= 60) {
			grade = "D";
			if(score >= 65) grade += "+";
			else grade += "0";
		} else grade = "F";
		System.out.println(score + "점은 " + grade + "입니다."); 
		 * 
		 */
	}
}