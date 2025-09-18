package chap03;
/*
 * 이항연산자
 *  산술연산자 : 
 *    + (더하기), - (빼기), * (곱하기), / (나누기), % (나머지)
 */
public class OpEx03 {

	public static void main(String[] args) {
		// 나누기(/) 연산자
		// 정수 / 정수 = 결과도 정수 (소수점 이하 버려짐)
		System.out.println("10/8=" + (10/8));   // 1
		System.out.println("-10/8=" + (-10/8)); // -1
		System.out.println("10/-8=" + (10/-8)); // -1
		System.out.println("-10/-8=" + (-10/-8)); // 1
		
		// 나머지(%) 연산자
		// 나머지의 부호는 '피제수(앞의 수)'를 따른다.
		System.out.println("10%8=" + (10%8));     //  2  (10 ÷ 8 → 몫:1, 나머지:2)
		System.out.println("-10%8=" + (-10%8));   // -2  (-10 ÷ 8 → 몫:-1, 나머지:-2)
		System.out.println("10%-8=" + (10%-8));   //  2  (10 ÷ -8 → 몫:-1, 나머지:2)
		System.out.println("-10%-8=" + (-10%-8)); // -2  (-10 ÷ -8 → 몫:1,  나머지:-2)
	}
}
