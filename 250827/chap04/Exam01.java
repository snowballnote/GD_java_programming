package chap04;
/*
 * ch 문자가 대문자인 경우는 "대문자", 
 * 			소문자인 경우는 "소문자"
 * 			숫자인 경우는 "숫자"
 * 			그 외는 "기타문자"
 * 			로 출력하기
 */
public class Exam01 {

	public static void main(String[] args) {
		char ch = '6';
		if('A' <= ch && ch <= 'Z' ) {
			System.out.println("대문자");
		} else if('a' <= ch && ch <= 'z') {
			System.out.println("소문자");
		} else if('0' <= ch && ch <= '9') { //ch가 char로 선언되었기 때문에 숫자를 나타내려면 아스키코드로 작성.
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
	}

}
