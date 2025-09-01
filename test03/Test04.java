package test03;

import java.util.Scanner;

/*
 *  화면에서 두수를 입력받아서 더큰수를 출력하기 
 */
public class Test04 {
	public static void main(String[] args) {
		System.out.println("두수를 입력:");
		Scanner scan = new Scanner(System.in);
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int max;
		if(num1 > num2) {
			max = num1;
			System.out.println(max);				
		} else if (num1 < num2){
			max = num2;
			System.out.println(max);
		} else {
			System.out.println("두 수는 같다.");
		}
		
		scan.close();
	}
}