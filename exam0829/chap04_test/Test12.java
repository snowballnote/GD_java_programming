package chap04_test;
/*
 * 가로 구구단 출력하기
   =2단=  	=3단=		=9단= 
 * 2*2=4    3*2=6  ...  9*2=18
 * 2*3=6
 * ...
 * 2*9=18   3*9=27      9*9=81 
 * 
 * println, print 잘 확인하기
 */
public class Test12 {
	public static void main(String[] args) {
		int num;
		for(num = 2; num <=9; num++) {
			System.out.print("=" + num + "단=\t");
		}
		System.out.println();
		for(int i = 2; i <= 9; i++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}		
	}	
}