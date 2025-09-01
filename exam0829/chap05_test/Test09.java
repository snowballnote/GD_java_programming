package test05;
import java.util.Scanner;
/*
 * 대칭수 구하는 프로그램을 작성하기
   대칭수란 숫자를 거꾸로 읽어도 앞으로 읽는 것과  같은 수를 말한다.
   12321 : 대칭수
   12345 : 대칭수 아님
   
   12321 x: x % 10, x /= 10
   거꾸로수 y: (1 * 10 + 2) * 10 + 3..., => 12321
   
   123 x: x % 10, x /= 10
   거꾸로수 y: ((3 * 10 + 2) * 10) + 1 => 321
 */

public class Test09 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int tmp = num;
		int result = 0;
		while(tmp > 0) {
			result *= 10;
			result += tmp % 10;
			tmp /= 10;
		}
		if(num == result) {
			System.out.println(num + ": 대칭수");
		}else{
			System.out.println(num + ": 대칭수 아님");
		}
	}
}
