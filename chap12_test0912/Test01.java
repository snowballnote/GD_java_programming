package chap12_test0912;
/*
 * 찾고자 하는 번호의 일부를 입력받아 번호를 출력하기
 * [결과]
 * 찾는 번호의 일부를 입력하세요:
 * 3456
 * 012-3456-7890
 * 013-3456-7890
 */

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/***************
public class Test01 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		//String phoneP = "(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})";
		Pattern phoneP = Pattern.compile("(0[0-9]{1,2})-([0-9]{3,4})-([0-9]{4})");
		for(String s : phoneNumArr) {
			Matcher m = phoneP.matcher(s);
			if(m.matches()) {
				System.out.println(s);
			}
		}
		
		System.out.println("찾는 번호의 일부를 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num == s) {
			System.out.println();
		}
		
	}
}
**************************/
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
		String[] phoneNumArr = {
				"012-3456-7890","099-2456-7980", 
				"088-2346-9870","013-3456-7890" };
		Scanner s = new Scanner(System.in);
		System.out.println("찾고자 하는 번호를 입력하세요:");
		String input = s.nextLine().trim();
		String pattern = input;
		Pattern p = Pattern.compile(pattern);
		int cnt = 0;
		for (int i = 0; i < phoneNumArr.length; i++) {
			String phoneNum = phoneNumArr[i];
			String tmp = phoneNum.replace("-", ""); //- 제외시켜, -사이의 숫자 검색
			Matcher m = p.matcher(tmp);
			if (m.find()) { 
				cnt++;
				System.out.println(cnt + ":" + phoneNum);
			}
		}
		if(cnt == 0)
	     	System.out.println("찾는 번호가 없습니다.");
	}
}
