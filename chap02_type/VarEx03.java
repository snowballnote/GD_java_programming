package chap02;
/*
 * 자료형
 * 기본자료형 : 8가지
 * 	논리형 : boolean(1)
 * 	문자형 : char(2)
 * 	정수형 : byte(1), short(2), int(4), long(8)
 * 	실수형 : float(4), souble(8)
 * 참조자료형 : 3가지
 * 	배열(array)
 * 	클래스(class)
 * 	인터페이스(interface)
 * 
 * 형변환
 * 1. 기본자료형과, 참조자료형은 형변환 불가. (단 Wrapper클래스는 예외)
 * 2. 기본자료형 중 boolean을 제외한 7가지의 자료형은 형변환이 가능함
 * 3. 자동형변환 : 형변환 연산자 생략 가능. 큰자료형 <= 작은자료형
 * 		명시적형변환 : 형변환 연산자 생략 불가. 작은자료형 <= 큰자료형
 * 			형변환연산자 : (자료형)
 * 4. byte, short와 char 사이의 형변환은 명시적형변환임. -> 거의 쓸일이 없음.
 * 
 * 자료형 크기 나열(boolean은 크기없음)
 * byte < short, char < int < long < float < double
 * 작은 <--- 큰 : 명시적형변환
 * 작은 ---> 큰 : 자동형변환
 */
public class VarEx03 {
	public static void main(String[] args) {
		char ch1 = 'A';
		//String str1 = ch1; //기본자료형과 참조자료형은 형변환 불가(반대도 마찬가지임)
		//ch1 = 'A'; //기본자료형과 참조자료형은 형변환 불가(반대도 마찬가지임)
		
		int i1 = 100;
		long l1 = i1; //자동형변환
		//int i2 = l1; //long(8byte)가 int(4byte)로 들어갈 수 없음. 에러발생
		int i2 = (int)l1; //명시적형변환
		float f1 = l1; //자동형변환
		long l2 = (long)f1; //명시적형변환
		byte b1 = (byte)ch1; //출력하면 65. 명시적형변환
		char ch2 = (char)b1; //명시적형변환
	}
}
