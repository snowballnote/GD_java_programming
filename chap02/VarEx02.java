package chap02;
/*
 * 문자형 char => 기본자료형. 한 개의 문자만 저장 가능함. 작은 따옴표로 표현.
 * 문자열형 String => 참조자료형. 0개 이상의 문자들을 저장 가능함. 큰 따옴표로 표현.
 */
public class VarEx02 {

	public static void main(String[] args) {
		//char: 문자형 변수(한 글자만 저장 가능)
		char c1 = 'A'; //'A' 저장
		//char c2 = 'AB'; //두 글자 이상 저장 불가 -> 에러
		//char c3 = ''; //최소 한 글자는 필요 -> 에러
		
		//String: 문자열(여러 글자) 저장 가능
		String s1 = "A"; //문자열 "A" 저장
		System.out.println("c1=" + c1); //c1=A
		System.out.println("s1=" + s1); //s1=A
		
		String s2 = "ABCDEFGI"; //여러개의 문자저장 가능
		System.out.println("s2=" + s2); //s2=ABCDEFGI
		
		String s3 = ""; //빈문자열도 가능
		System.out.println("s3=" + s3); //s3=
		
		//예약어는 변수명으로 사용 불가
		//char true = '참'; //에러(예약어 사용불가)
		
		//대문자로 시작하면 변수명으로 사용 가능하지만 권장 X
		char True = '참'; //변수명은 소문자로 시작하는 것이 권장
		
		//식별자 규칙
		int max_num = 100; //가능하지만 카멜 표기법(int maxNum)이 권장됨
		//int max-num = 10000; //불가능('-'사용불가)/'_','$'만 특수문자 가능
		
		//숫자로 시작하는 변수명 불가
		//int 7up = 7; //에러
		int top10 = 10; //숫자 포함 가능(단, 첫 글자만 아니면됨)
		
		//'_','$'로 시작하는 변수명 가능
		char $harp = 'S'; //가능
	}

}
