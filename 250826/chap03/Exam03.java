package chap03;
import java.util.Scanner;
/*
 * 1. 정수를 입력받아서 양수인 경우 양수, 음수인 경우 음수, 0인 경우 영으로 출력.
 * 2. 정수가 홀수인지 짝수 여부 출력하기
 * [결과]
 * 정수를 입력하세요
 * 10
 * 10:양수
 * 10:짝수
 */
public class Exam03 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		//양수, 음수
		String result1 = (num > 0)?"양수":(num < 0)?"음수":"영";
		//짝수, 홀수
		String result2 = (num % 2 == 0)?"짝수":"홀수";
		System.out.println(num + ":" + result1);
		System.out.println(num + ":" + result2);

	}

}
