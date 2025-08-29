package chap05_test;

import java.util.Scanner;

/*
 
10진수를 2,8,10,16 진수로 변경하기
[결과]
10진수 값을 입력하세요
16

16의 2진수 :10000
16의 8진수 :20
16의 10진수 :16
16의 16진수 :A

*/
public class Test11 {
	public static void main(String[] args) {
		char[] data = "0123456789ABCDEF".toCharArray();
		System.out.print("10진수 값을 입력하세요 ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int[] binary = new int[32]; //2진수
		int[] octal = new int[12]; //8진수
		char[] hex = new char[8];//16진수
		
		int divnum = num;
		int index = 0; //배열의 인덱스
		//2진수
		while(divnum > 0) {
			binary[index++] = divnum % 2;
			divnum /= 2;
		}
		System.out.print(num +"의 2진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println();
		
		//8진수
		divnum = num;
		index = 0;
		while(divnum > 0) {
			octal[index++] = divnum % 8;
			divnum /= 8;
		}
		System.out.print(num +"의 8진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(octal[i]);
		}
		System.out.println();
		
		//10진수
		System.out.println(num +"의 8진수: " + num);
		
		//16진수
		divnum = num;
		index = 0;
		while(true) {
			hex[index++] = data[divnum % 16];
			divnum /= 16;
			if(divnum == 0) break;
		}
		System.out.print(num +"의 16진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();	
	}
}