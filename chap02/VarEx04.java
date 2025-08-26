package chap02;
/*
 * 서로다른 자료형의 연산
 * 1. 동일한 자료형끼리의 연산은 자료형 유지
 * 2. 연산의 결과는 큰 자료형임
 * 3. int 보다 작은 자료형(byte, short, char)의 연산의 결과는 int임.
 * 4. String형과 기본자료형은 + 연산이 가능함. 연산의 결과는 String임.
 */
public class VarEx04 {

	public static void main(String[] args) {
		int i1 = 10;
		int i2 = 100;
		int i3 = i1 + i2;
		long l1 = 20;
		long l2= i1 + l1; //long <= int + long
		float f1 = 10L + 1.0f;
		 //<3>
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte)(b1 + b2);
		// <4>
		String str1 = "번호" + 1 + 2 + 3; //처음이 문자열이여서 뒤에도 문자로 인식
		/*
		 * 1. "번호" + 1 => "번호1"
		 * 2. "번호1" + 2 => "번호12"
		 * 3. "번호12" + 3 => "번호123"
		 */
		String str2 = 1 + 2 + 3 + "번"; //정수가 먼저 나와 정수들을 계산하다 마지막에 문자여서 뒤에 붙음
		/*
		 * 1. 1 + 2 => 3
		 * 2. 3 + 3 => 6
		 * 3. 6 + "번" => "6번"
		 */
		System.out.println("str1=" + str1 + ", str2=" + str2);
		System.out.println(5/2); //값은2.5이지만 자바에서는 2 이유: 정수 나누기 정수여서 결과도 정수만 나옴. int/int => int
	}

}
