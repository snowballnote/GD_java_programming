package chap04;

import java.util.Scanner;

/*
 * 강아지, 병아리가 있음
 * 강아지, 병아리 전체 마리수 입력받고,
 * 강아지, 병아리 전체 다리수 입력받기
 * 강아지 마리수, 병아리 마리 수 출력
 * [결과]
 * 강아지와 병아리 마리수 입력: 10
 * 강아지, 병 다리수 입력: 30
 * 강: 5마리, 병: 5
 * x+y=10
 * 4x+2y=30
 * x=5, y=5 => 연립방정식도 반복문으로 풀 수 있음
 * [결과]
 * 강아지와 병아리 마리수 입력: 10
 * 강아지, 병 다리수 입력: 10
 * 입력 오류
 */
public class Exam07 {

	public static void main(String[] args) {
		System.out.print("강이지와 병아리 마리수 입력: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("강아지와 병아리 다리수 입력: ");
		int legs = sc.nextInt();
		boolean check = false;
		for(int x = 0; x <= num; x++) {
			for(int y = 0; y <= num; y++) {
				if((x+y == num) && (4*x + 2*y) == legs) {
					System.out.println("강아지: " + x + "마리");
					System.out.println("병아리: " + y + "마리");
					check = true;
				}
			}
		}
		if(!check) {
			System.out.println("입력 오류");
		}
		/*
		int x; //강아지
		int y; //병아리
		//x + y = num;
		//4x + 2y = legs;
		x = num - y;
		x = (legs - 2y);
		*/
	}

}
