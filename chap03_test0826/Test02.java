package chap03_test0826;

import java.util.Scanner;

/*
1.  화면에서 한개의 문자를 입력받아
     대문자인 경우는 소문자로, 
     소문자인 경우는 대문자로 
     숫자인 경우는 20을 더한 값을   출력하기
     그외의 문자는 기타 문자 를 출력하세요 
     
     소문자 = 대문자 + 32
     대문자 = 소문자 - 32
     
     '0'  : 48 => 20
     '1' : 49 => 21
     ('1'-'0')+20 = 21
     ('5'-'0')+20 = 25
*/
public class Test02 {
	public static void main(String[] args) {
		System.out.print("한개의 문자 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		char ch = (char) sc.nextInt();
		if('A' <= ch && ch <= 'Z') {
			System.out.println(ch + 32);
		} else if('a' <= ch && ch <= 'z') {
			System.out.println(ch - 32);
		}else if ('0' <= ch && ch <= '9') {
			System.out.println(ch + 20);
		}else {
			System.out.println(ch);
		}
			
	}
}