package chap03;

/*
 * 단항연산자
 * 	부호연산자: +, -
 * 		+: 피연산자의 부호를 그대로 유지
 * 		-: 피연산자의 부호로 반대로 변경
 * 
 * 	논리부정연산자: !(not)
 * 		boolean 타입에서 사용
 * 		!true => false
 * 		!false => true
 */
public class OpEx02 {

	public static void main(String[] args) {
		//부호 연산자 예제
		int x = -10;
		System.out.println("x=" + +x); // -10 (부호 그대로 유지)
		System.out.println("x=" + -x); // 10  (부호 반전: -10 → 10)
		
		x = 10;
		System.out.println("x=" + +x); // 10  (부호 그대로 유지)
		System.out.println("x=" + -x); // -10 (부호 반전: 10 → -10)
		
		// 논리 부정 연산자 예제
		System.out.println(!true);   // false
		System.out.println(!false);  // true
		
		// 비교 연산과 함께 사용
		System.out.println(5 != 4);    // true (5는 4와 같지 않다 → true)
		System.out.println(!(5 == 4)); // true (5==4 → false, 부정하면 true)
	}

}

