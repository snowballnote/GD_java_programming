package chap04_test;
import java.util.Scanner;
/*
삼각형의 높이를 입력받아서 *로 삼각형 출력하기 //규칙성 찾기
 [결과]
 삼각형의 높이
 3
 		
  *	 
 ***
*****
--------------------------
	  i높이인덱스		j	=> m-i ~ m+i
--------------------------
	  0				2	 => m-0 ~ m+0
	  1			  1 2 3	 => m-1 ~ m+1
  	  2			0 1 2 3 4 => m-2 ~ m+2  

바닥의 *의 갯수 => h * 2 - 1
1 : 1
2 : 3
3 : 5
4 : 7
...

바닥의 *의 중간 인덱스 : 2

1. b변수 : 바닥의 *의 갯수
2. m변수 : 중간 인덱스
*/
public class Test03 {
	
	public static void main(String[] args) {
		System.out.print("삼각형의 높이");
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int b = h * 2 - 1; //바닥의 *의 갯수
		int m = b / 2; //*의 중간 인덱스
		
		for(int i = 0; i < h; i++) { //삼각형의 높이 => 행
			for(int j = 0; j < b; j++) { //=> 열
				if(j >= m - i && j <= m + i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		/*
		for(int i = 1; i <= h; i++) {
			//1. 공백 출력
			for(int j = 1; j <= h - i; j++) {
				System.out.print(" ");
			}
			//2. 별 출력
			for(int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			//줄바꿈
			System.out.println();
		}
		*/	
	}
}

/*
 * public class Test03_A {
	public static void main(String[] args) {
		System.out.println("삼각형의 높이");
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();		
		int b = h*2-1; //바닥의 * 갯수
		int m = b/2;   //* 중간 인덱스. 
		for(int i=0;i<h;i++) {
		   for(int j=0;j<b;j++) {
			   if(j >= m-i && j<= m+i) 
				   System.out.print("*");
			   else
				   System.out.print(" ");
		   }
		   System.out.println();
		}
		
	}
}
*/