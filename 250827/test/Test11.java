package test;

import java.util.Scanner;

/*
   사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
   단, 2~9 사이의 숫자가 아닌 경우 “2~9 사이의 숫자만 입력해주세요”를 출력하세요
   
   [결과]
   출력 시작 단을 입력하세요 : 5
   === 5단 ===
   5*2=10
   === 6단 ===
   ...
   === 9단 ===
   9*2=18
   ...
 */
public class Test11 {
	public static void main(String[] args) {
		System.out.print("출력 시작 단을 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(2 > num || num > 9) {
			System.out.println("2~9 사이의 숫자만 입력해주세요");
		}else {
			for(int i = num; i <= 9; i++) {
				System.out.println("\n=== " + i + "단 ===");
				for(int j = 2; j <= 9; j++) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
				 
			}
		}
	}

}