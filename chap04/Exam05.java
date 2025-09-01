package chap04;
import java.util.Scanner;
/*
 * 화면에서 숫자형 문자열을 입력받아서 자리수의 합을 출력하기.
 * str.length() : 문자열의 길이
 * str.charAt(i) : 문자열의 i 인덱스에 해당하는 char 문자. 인덱스는 0부터 시작함.
 */
public class Exam05 {

	public static void main(String[] args) {
		System.out.print("숫자형 문자열을 입력 받아서 자리수의 합 출력");
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //숫자인데 큰 데이터를 가지고 오고 싶으면 문자형으로 바꿔서 받기, int형은 에러남.
		//String str = 555 + ""; //숫자를 문자형으로 만듬.
		int sum = 0; //합계를 저장할 변수 초기화
		//str.length() : 문자열의 길이 리턴. "555":3, "12345":5
		//str.charAt(i) : i 인덱스에 해당하는 문자 리턴
		// "123" : charAt(0) => '1' 문자열 중 첫번째 문자 리턴
		//			charAt(1) => '2'
		//			charAt(2) => '2'
		for(int i = 0; i < str.length(); i++) {
			sum += str.charAt(i) - '0'; //-'0'을 통해 문자형 '1'을 숫자형1로 변경.
			System.out.print(str.charAt(i) + ((i==str.length()-1)?"=":"+"));
			//1
		}
		System.out.println(sum);
	}

}
