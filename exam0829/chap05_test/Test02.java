package chap05_test;

import java.util.Scanner;
/*
 * 숫자 맞추기
 * 컴퓨터가 1~100 사이의 임의의 정수를 저장하고,
 * 사용자는 숫자를 입력하여 컴퓨터 저장한 숫자를 맞추기
 * 시스템 : 37 가정
 * [결과]
 * 1~100사이의 숫자를 입력하세요
 * 50
 * 작은수입니다.
 * 25
 * 큰수입니다.
 * 40
 * 작은수입니다.
 * 37
 * 정답입니다. 
 * 프로그램종료합니다.
 * 
 * 최종결과부분 추가
 * 이사람이 몇번의 입력만에 정답을 맞췄는지 입력횟수를 출력하기
 * 	5번미만이면 훌륭합니다.
 * 	10번미만이면 보통이네요.
 * 	10번 이상이면 노력하세요.
 */
public class Test02 {
	public static void main(String[] args) {
		int com = (int)(Math.random() * 100) + 1;
		System.out.println("컴퓨터와 숫자 맞추기 게임");
		System.out.print("1~100사이의 숫자를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			int user = sc.nextInt(); //안에서 받는게 맞음 아니면 무한루프돔
			count++; //++count도 가능.
			if(com > user) {
				System.out.println("큰 수 입니다.");
			} else if(com < user) {
				System.out.println("작은 수 입니다.");
			} else { //정답 부분
				System.out.println(count + "번 만에 맞췄습니다.");
				if(count < 5) {
					System.out.println("훌륭합니다.");
				} else if(count < 10) {
					System.out.println("보통이네요.");
				} else {
					System.out.println("노력하세요...");
				}
				break;
			}
		}
		System.out.println("프로그램을 종료합니다.");
		
		sc.close();
	}
}