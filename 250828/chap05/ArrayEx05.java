package chap05;
/*
 * 10진수를 16진수로 변경하기
 */
import java.util.Scanner;

public class ArrayEx05 {
	public static void main(String[] args) {
		char[] data = "0123456789ABCDEF".toCharArray();
		//data : 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F
		//		 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
		char[] hex = new char[8];
		System.out.println("16진수로 변경할 10진 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int divnum = num; //26일때
		int index = 0; //배열의 인덱스
		while(true) {
			hex[index++] = data[divnum % 16]; //26%16은  10 즉 data에서 10번째 자리에 있는 A를 대려와 hex에 저장
			divnum /= 16;
			if(divnum == 0) break;
		}
		
		System.out.print(num + "의 16진수: ");
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(hex[i]);
		}
		System.out.println();
	}
}
