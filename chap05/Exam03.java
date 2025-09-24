package chap05;
/*
 * str 문자열에 저장된 소문자의 갯수 출력하기
 * a : 3
 * b : 5
 * ...
 * 각각의 소문자를 출력해보자
 * 별표찍기
 * 
 */
public class Exam03 {

	public static void main(String[] args) {
		String str = "abssssc deaaf";
		int[] cntArr = new int[26];

		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if('a' <= ch && ch <= 'z') {
				cntArr[ch - 'a']++; //ch에서 a에 인덱스 숫자를 빼면
			}
		}
		for(int i = 0; i < cntArr.length; i++) {
			System.out.print((char)(i + 'a') + "의 갯수: " +  cntArr[i] + "=>");
			for(int j = 0; j < cntArr[i]; j++) {//cntArr[i]의 개수만큼
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
