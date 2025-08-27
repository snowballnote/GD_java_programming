package chap04;
import java.util.Scanner;
/*
 * 1, 2, 3 중 한개의 임의의 수를 생성해서
 * 	1: 가위, 2 : 바위, 3 : 보자기
 * 
 * 시스템이 가위바위보중 한개의 숫자를 생성하여 저장하기
 * 사용자는 화면에서 1,2,3중 한개를 입력받가
 * [결과]
 * 시스템	사용자
 * 가위1	가위1	비김
 * 가위1	바위2 	사용자승리
 * 1 3 사용자패
 * 2 1 사용자패
 * 2 2 비김
 * 2 3 사용자이김
 * 3 1 사용자이김
 * 3 2 사용자패
 * 3 3 비김
 */
public class Exam02 {

	public static void main(String[] args) {
		//컴퓨터 임의의 수 저장하기
		int computer = (int)(Math.random() * 3) + 1; //1~3
		Scanner sc = new Scanner(System.in);
		System.out.print("1.가위, 2.바위, 3.보(숫자만): ");
		int person = sc.nextInt();
		
		System.out.println("시스템\t사용자");
		System.out.print((computer==1)?"가위":(computer==2)?"바위":"보");
		System.out.print("\t" + ((person==1)?"가위":(person==2)?"바위":"보") + '\n');
		if(computer == person) {
			System.out.println("비김.");
		} else {
			switch(computer) {
			case 1: if(person == 2) System.out.println("사용자 승리"); 
					if(person == 3) System.out.println("시스템 승리");
					break;
			case 2: if(person == 2) System.out.println("사용자 승리"); 
					if(person == 1) System.out.println("시스템 승리");
					break;
			case 3: if(person == 1) System.out.println("사용자 승리"); 
					if(person == 2) System.out.println("시스템 승리");
					break;
			}
		}
		
	}

}
