package ex05_wrapper;
/*
 * Wrapper 클래스: 8개의 기본자료형을 객체화 하기위한 클래스의 통칭
 * 					기본자료형의 기능, 상수값 등을 처리
 * 
 * 		기본자료형		Wrapper클래스
 * 		boolean		Boolean
 * 		char		Character
 * 		byte		Byte
 *		short		Short
 *		int			Integer
 *		long		Long
 *		float		Float
 *		double		Double
 *
 * 기본자료형과 참조자료형은 형변환 불가
 * String str = 'A';(X) String <= str 형변환 불가
 * 단 Wrapper클래스와 기본자료형 사이는 형변환 가능함(JDK5이후)
 * 	참조형 <= 기본형 auto Boxing
 * 	기본형 <= 참조형 auto UnBoxing
 */
public class MainEx01 {
	public static void main(String[] args) {
		int num = 100;
		Integer i1 = num; //auto Boxing //기본형 num을 참조변수 i1에 넣는것도 가능. 자동으로 형변환된거임.
		Integer i2 = 100;
		System.out.println(i1 == i2); //true
		System.out.println(100 == i2); //true i2객체가 auto UnBoxing됨
		System.out.println(i1.equals(i2)); //true 원래는 equals못씀 근데 자동으로 언박싱되서 equlas도 가능.
		System.out.println(i1.toString()); //100
		//int형 정보
		System.out.println("int형 최대값: " + Integer.MAX_VALUE); //2147483647
		System.out.println("int형 최소값: " + Integer.MIN_VALUE); //-2147483648
		System.out.println("int형 크기(bit): " + Integer.SIZE); //32
		//double형 정보
		System.out.println("double형 최대값: " + Double.MAX_VALUE); //1.7976931348623157E308
		System.out.println("double형 최소값: " + Double.MIN_VALUE); //4.9E-324
		System.out.println("double형 크기(bit): " + Double.SIZE); //64
	
	}
}
