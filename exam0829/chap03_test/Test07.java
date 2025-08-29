package chap03_test;

import java.util.Scanner;
/*
*  키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기한 몫을 출력하세요.
* 
* [결과]
* 첫 번째 정수를 입력하세요 : 23
* 두 번째 정수를 입력하세요 : 7
* 더하기 결과 : 30
* 빼기 결과 : 16
* 곱하기 결과 : 161
* 나누기 몫 결과 : 3
* 
* 단 빼기의 결과는 양수여야한다.
*/
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		System.out.print("첫번째 정수를 입력하세요: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요: ");
		int num2 = sc.nextInt();
		
		int add = num1 + num2;
		int diff = num1 - num2;
		if(num1 > num2) {
			diff = num1 - num2;
		}else {
			diff = num2 - num1;
		}
		//diff = ((num1>num2)?(num1-num2):(num2-num1));
		//diff = (((num1-num2)<0)?(num2-num1):(num1-num2));
		int multiple = num1 * num2;
		double div = num1 / num2;
		System.out.println("더하기 결과 : " + add);
		System.out.println("빼기 결과 : " + diff);
		System.out.println("곱하기 결과 : " + multiple);
		System.out.println("나누기 몫 결과 : " + div);
		
		sc.close();
	}
}