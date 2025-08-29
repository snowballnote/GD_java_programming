package chap03_test;

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
		System.out.print(num1 + "," + num2);
		System.out.println(" : 두 수 중 더 큰수: " + ((num1>num2)?num1:num2));
		System.out.print(num1 + "," + num2);
		System.out.println(" : 두 수 중 더 큰수: " + ((num1>num2)?num1:(num1<num2)?num2:"두 숫자는 같다."));
		
		System.out.print(num1 + "," + num2 + " : 두 수 중 더 큰수: ");
		if(num1 > num2) {
			System.out.println(num1);				
		} else if (num1 < num2){
			System.out.println(num2);
		} else {
			System.out.println("두 수는 같다.");
		}
		
		scan.close();
	}
}