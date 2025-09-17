package chap02;
/*
 * 변수 : 값을 저장하는 공간. 사용 전에 반드시 선언해야 함.
 *   형식) 자료형 변수명;
 */
public class VarEx01 {

	public static void main(String[] args) {
		// 정수형 변수 선언 후 값 저장
		int i;
		i = 10;
		System.out.println(i); //10

		// 논리형 변수 선언 및 초기화
		boolean boo1 = true;
		System.out.println("boo1=" + boo1); //boo1=true

		// 문자형 변수 선언 및 초기화
		char ch1 = 'A'; //문자는 반드시 작은따옴표('')로 감싸야 함
		System.out.println("ch1=" + ch1); //ch1=A

		// 정수형 변수 선언 및 초기화
		byte b1 = 10;    // 1바이트, -128 ~ 127 저장 가능
		short s1 = 20;   // 2바이트, 약 -3만 ~ 3만
		int i1 = 30;     // 4바이트, 기본 정수형
		long l1 = 40L;   // 8바이트, 정수 리터럴 뒤에 L 붙이면 long 타입
		                 // (안 붙이면 int로 취급)

		// 자료형 범위를 벗어나는 값 저장 → 강제형변환 필요
		b1 = (byte)300;  // 300은 byte 범위를 벗어나므로 앞부분이 잘려 44가 저장됨
		s1 = 300;        // short은 300 저장 가능
		System.out.println("b1=" + b1); //44
		System.out.println("s1=" + s1); //300
		System.out.println("i1=" + i1); //30
		System.out.println("l1=" + l1); //40

		// 실수형 변수 선언 및 초기화
		// 실수 리터럴은 기본이 double 타입
		float f1 = 1.0f;   // float로 저장하려면 리터럴 뒤에 f(F) 붙여야 함
		double d1 = 1.0D;  // double은 D 생략 가능 (붙이면 double임을 명시)
		System.out.println("f1=" + f1); //1.0
		System.out.println("d1=" + d1); //1.0

		/*
		 * 리터럴 접미사 정리
		 *   f, F : float형 리터럴
		 *   d, D : double형 리터럴 (기본이 double이라 생략 가능)
		 *   l, L : long형 리터럴 (소문자 l은 숫자 1과 혼동되므로 보통 대문자 L 사용)
		 */
	}
}
