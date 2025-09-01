package chap03;
/*
 * 이항연산자
 * 	산술연산자 : +(더하기), -(뺴기), *(곱하기), /(나누기), %(나머지)
 * 	
 */
public class OpEx03 {

	public static void main(String[] args) {
		System.out.println("10/8=" + (10/8)); //정수 나누기 정수는 정수출력.
		System.out.println("-10/8=" + (-10/8));
		System.out.println("10/-8=" + (10/-8));
		System.out.println("-10/-8=" + (-10/-8));
		
		//나머지의 부호는 피재수를 따라감. 나누어짐을 당하는 수(10)의 부호.
		System.out.println("10%8=" + (10%8));
		System.out.println("-10%8=" + (-10%8));
		System.out.println("10%-8=" + (10%-8));
		System.out.println("-10%-8=" + (-10%-8));
	}

}
