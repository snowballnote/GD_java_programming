package chap05_test;

import java.util.Scanner;

/*
삼각형의 높이를 홀수로 입력하세요
5

*****
 ***
  *
 ***
*****
 
 */
public class Test08 {
	public static void main(String[] args) {
		System.out.print("삼각형의 높이: ");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int bottom = h * 2 - 1;
		int num = 0; //숫자의 시작 숫자 //숫자의 시작점을 알아야 1~찍을 수 있음
		
		for(int i = bottom; i >= 1; i -=2) {
			num += i;
		}
		System.out.println("num = " + num); //시작숫자
		
		int m = bottom / 2; //m=5/2=2
		for(int i = 0; i < h-2; i++) {
			for(int j = 0; j < bottom; j++) {
				if(j >= m-i && j <= m+i) { //??????????????????
					System.out.print("*" + ""); //num을 찍고 숫자가 하나씩 빠짐. //별'*'로 생각하면 똑같음.
				
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}