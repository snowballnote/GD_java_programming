package chap02;
/*
 * 자료형
 * [기본자료형](8가지)
 * 	- 논리형: boolean(1byte, true/false)
 * 	- 문자형: char(2byte, 유니코드 한 글자 저장)
 * 	- 정수형: byte(1), short(2), int(4), long(8)
 * 	- 실수형: float(4), double(8)
 * 
 * [참조자료형] (3가지 대표적인 형태)
 * 	- 배열(array)
 * 	- 클래스(class)
 * 	- 인터페이스(interface)
 * 
 * 형변환(Casting)
 * 1. 기본자료형 <-> 참조자료형: 형변환 불가(단, Wrapper 클래스 사용 시 가능)
 * 2. 기본자료형 중 boolean 제외 7가지는 형변환 가능
 * 3. 자동 형변환: 작은 자료형 -> 큰 자료형(형변환 연산자 생략 가능)
 * 		명시적 형변환: 큰 자료형 -> 작은 자료형(형변환 연산자 반드시 필요)
 * 자동 형변환 : 값이 그대로 보존되고, 형변환 연산자 필요 없음
 * 명시적 형변환 : 큰 자료형에서 작은 자료형으로 변환할 때 데이터 손실 가능 → 반드시 (자료형) 사용
 * 4. byte, shoer <-> char 형변환은 명시적 형변환 필요(잘 사용하지 않음)
 * 
 * 자료형 크기(boolean 제외)
 * byte < short, char < int < long < float < double
 * 
 * 작은 ---> 큰: 자동 형변환
 * 큰 ---> 작은: 명시적 형변환
 */
public class VarEx03 {

	public static void main(String[] args) {
		char ch1 = 'A';
		//String str1 = ch1; //기본형 <-> 참조형 변환 불가 -> 에러
		//ch1 = "A"; //반대도 불가 -> 에러
		
		int i1 = 100;
		long l1 = i1; //int(4byte) -> long(8byte): 자동 형변환
		
		//long(8byte) -> int(4byte): 자동 형변환 불가(데이터 손실 가능)
		//int i2 = l1; //에러
		int i2 = (int)l1; //명시적 형변환(강제 변환)
		
		float f1 = l1; //long(8byte, 정수) -> float(4byte, 실수): 자동 형변환
		long l2 = (long)f1; //float -> long: 명시적 형변환
		
		// char 'A'의 아스키코드 값 : 65
		byte b1 = (byte) ch1; // char(2byte) → byte(1byte) : 명시적 형변환, 결과 65
		char ch2 = (char) b1; // byte → char : 명시적 형변환, 결과 'A'

	}

}
