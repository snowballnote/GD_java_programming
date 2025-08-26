package test;

import java.util.Scanner;
/*
키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
  정수 : nextInt()
  실수 : nextDouble()
  String : next()
[결과]
이름 : 김명신
학년(숫자만) : 3
반(숫자만) : 15
번호(숫자만) : 1
성별(M/F) : F
성적(소수점 아래 둘째 자리까지) : 95.75
3학년 15반 1번 김명신 여학생의 성적은 95.75이다.

String 타입의 비교는 equals()메서드를 사용함
 성별 == "M" (X)
 성별.equals("M")
*/
public class Test09 {
	public static void main(String[] args) {
		System.out.print("이름 : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("학년(숫자만) : ");
		int gradeLevel = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int classNum = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int num = sc.nextInt();
		System.out.print("성별(M/F) : ");
		String gender = sc.next();
		System.out.print("성적(소수점 아래 둘때 자리까지) : ");
		double score = sc.nextDouble();
		
		if(gender.equals("M")) {
			gender = "남학생";
		} else {
			gender = "여학생";
		}
		
		System.out.println(gradeLevel + "학년 " + classNum + "반 " + num + "번 " + name + " " + gender + "의 성적은 " + score +"이다.");
		
		sc.close();
	}
}