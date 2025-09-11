package ex05_wrapper;

public class MainEx02 {
	public static void main(String[] args) {
		//int형 <= 문자열
		System.out.println(Integer.parseInt("123")); //123 백이십삼.
		//("123", 8) => 8진수 123을 10진수로 출력
		//				"123" 8진수로 인식하여 정수로 변경
		//1*64 + 2*8 + 3 = 64 + 16 + 3 => 83
		System.out.println(Integer.parseInt("123", 8)); //83
		//("123", 16)=> 123문자열을 16진수로 인식하여 정수로 변경
		//				16진수 숫자를 10진수로 변경
		System.out.println(Integer.parseInt("123", 16)); //291
		System.out.println(Integer.parseInt("FF", 16)); //255: 16진수FF를 10진수로 변경
		
		//double형 <= 문자열
		System.out.println("123.5"); //123.5=>문자열
		System.out.println(Double.parseDouble("123.5")); //123.5 =>double형
		//float형 <= 문자열
		System.out.println(Float.parseFloat("123.5")); //123.5
		
		//10진수(정수)를 8진수값으로 출력
		System.out.println(Integer.toOctalString(255)); //377 =>8진수
		//10진수(정수)를 16진수값으로 출력
		System.out.println(Integer.toHexString(255)); //ff
		//10진수(정수)를 2진수값으로 출력
		System.out.println(Integer.toBinaryString(255)); //11111111
	}
}
