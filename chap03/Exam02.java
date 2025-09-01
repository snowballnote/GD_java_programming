package chap03;
import java.util.Scanner;

/*
 * 화면에서 3자리 정수를 입력받아 100자리 미만을 버리고 출력하기
 * [결과]
 * 세자리 정수를 입력하세요
 * 321
 * 300
 */
public class Exam02 {

	public static void main(String[] args) {
		System.out.print("세자리 정수를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(num);
		int n = (num / 100) * 100;
		//int n = num - (num % 100); //%가 -보다 우선순위가 높아서 괄호 안넣어도 %먼저 처리됨.그래도 괄호 작성하는게 확실한 코드.
		System.out.println(n);
		

	}

}
