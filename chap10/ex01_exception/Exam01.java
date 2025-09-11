package ex01_exception;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 화면에서 정수를 입력받아 숫자만큼 * 출력하기
 * 정수가 아닌 문자가 입력된 경우 숫자만 입력하세요 메세지 출력하rh, 숫자입력이 될때까지
 * 
 * Scanner sc = new Scanner(system.in);
 * int num = sc.nextInt();
 * 					<=정수가 아닌 문자 입력시 InputmatchException 예외 발생
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.print("정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {	
			try {
				num = sc.nextInt();
				int n = num / 10;
				for(int i = 0; i < n; i++) {
					for(int j = 0; j < num; j++) {
						System.out.print("*");
					}
					System.out.println();
				}break;
			}catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요");
				sc.next();
			}
		}
		System.out.println(num);
	}
}