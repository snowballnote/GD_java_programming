package test;

import java.util.Scanner;

/*
 * 10부터 99사이의 두자리 자연수를 입력받아 입력된 수 보다 크거나 
 * 같은 10의 배수를 구하기
 * 10의 배수에서 입력된 수를 뺀값을 출력하기
 * [결과]
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 24
 *  6  :  30 - 24
 *  
 * 10부터 99사이의 두자리 자연수를 입력하세요
 * 20
 * 0   :  20 - 20
 */
public class Test02 {
	public static void main(String[] args) {
		System.out.println("10부터 99사이의 두자리 자연수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int mul = 0;
		if(10 < num && num <= 20) {
			mul = 20;
			System.out.println(mul);
		} else if(20 < num && num <= 30) {
			mul = 30;
			System.out.println(mul);
		} else if(30 < num && num <= 40) {
			mul = 40;
			System.out.println(mul);
		} else if(40 < num && num <= 50) {
			mul = 50;
			System.out.println(mul);
		} else if(50 < num && num <= 60) {
			mul = 60;
			System.out.println(mul);
		} else if(60 < num && num <= 70) {
			mul = 70;
			System.out.println(mul);
		} else if(70 < num && num <= 80) {
			mul = 80;
			System.out.println(mul);
		} else if(80 < num && num <= 90) {
			mul = 90;
			System.out.println(mul);
		} else if(90 < num && num < 100) {
			mul = 100;
			System.out.println(mul);
		} else {
			System.out.println("10부터 99사이의 두자리 자연수만 가능.");
		}
		int dif = mul - num;
		System.out.println(dif + " : " + mul + " - " + num);
		
		sc.close();
		

		
	}
}