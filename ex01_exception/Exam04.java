package ex01_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 화면에서 1~10사이의 숫자를 입력받아, 숫자만큼 * 출력하기
 * 1. 입력값이 숫자가 아닌 경우숫자만 입력하게요 출력하고 다시 숫자를 입력받기
 * 2. 1~10사이가 아닌 경우 NumberInputException 클래스로 예외를 강제로 발생하고, 다시 숫자를 입력받기
 */
class NumberInputException extends Exception{
	NumberInputException(String msg){
		super(msg);
	}
}
public class Exam04 {
	public static void main(String[] args){
		System.out.println("1~10사이의 숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				int num = sc.nextInt();
				if(num < 1 || num > 10)
					throw new NumberInputException("1~10사이의 숫자만을 입력하세요");
				//1~10사이의 숫자인 경우만 실행되는 영역
				for(int i = 0; i < num; i++) {
					System.out.print("*");
				}
				System.out.println();
				break;
			} catch(InputMismatchException e) {
				System.out.println("숫자만 입력하세요");
				sc.next(); //무한반복 안돌도록 해줌.
			}catch(NumberInputException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}