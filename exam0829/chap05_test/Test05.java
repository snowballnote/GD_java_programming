package chap05_test;

import java.util.Scanner;

/*
(1)+(1+2)+(1+2+3)+(1+2+3+4)+(1+2+3+4+5)+(1+2+3+4+5+6)+(1+2+3+4+5+6+7)+(1+2+3+4+5+6+7+8)+(1+2+3+4+5+6+7+8+9)+(1+2+3+4+5+6+7+8+9+10)=220
한줄로 출력하기
*/
public class Test05 {
	public static void main(String[] args) {
		System.out.print("구하고 싶은 정수: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			System.out.print("(");
			for(int j = 1; j <= i; j++) { //밖에 i만큼 더해주는 것.
				System.out.print(j + ((j==i)?"":"+"));
				sum += j;
			}
			System.out.print(")" + ((i==num)?"":"+"));		
		}
		System.out.println("=" + sum);
	}
}