package chap03;
/*
 * 이항연산자
 * 	관계연산자(비교연산자) : ==, !=, >, <, ... => 결과가 boolean
 * 	수학: x = 10 => x는 10 이다.
 * 		0 <= x <= 9
 * 	자바 : x = 10 => x변수에 10값을 대입.
 * 			x == 10 => x는 값이 10인 경우 true반환, 아니면 false 값을 반환
 * 			0 <= x && x <= 9
 * 
 * 	논리연산자 : 피연산자의 자료형이 boolean
 * 		&&(AND) : 둘 다 true일 때만 true
 * 			true && true => true(앞이 true면 뒤도 반드시 실행)
 * 			true && false => false
 * 			false && true => false(앞이 false면 뒤는 실행하지 않음 -> short-circuit)
 * 			false && false => false
 * 	
 * 		||(OR) : 둘 중 하나라도 true면 true
 * 			true || true => true(앞이 true면 뒤는 실행하지 않음 -> short-circuit)
 * 			true || false => true
 * 			false || true => true(앞이 false면 뒤 확인 필요)
 * 			false || false => false
 * 
 * 		^(XOR) : 서로 다를 때 true, 같으면 false
 * 			true ^ true => false
 * 			true ^ false => true
 * 			false ^ true => true
 * 			false ^ false => false
 */
public class OpEx04 {

	public static void main(String[] args) {
		// 관계연산자
				System.out.println("1 == 1 : " + (1 == 1));   // true
				System.out.println("1 == 2 : " + (1 == 2));   // false
				System.out.println("1 != 2 : " + (1 != 2));   // true
				System.out.println("1 < 2 : " + (1 < 2));     // true
				System.out.println("1 <= 2 : " + (1 <= 2));   // true
				System.out.println("2 > 1: " + (2 > 1));      // true
				System.out.println("2 >= 1: " + (2 >= 1));    // true
				System.out.println("2 >= 2: " + (2 >= 2));    // true
				
				// 논리연산자
				int x = 1, y = 1;
				System.out.println("x==2 && y==1 => " + (x == 2 && y == 1)); // false && true → false
				System.out.println("x==2 || y==1 => " + (x == 2 || y == 1)); // false || true → true
				System.out.println("x==2 ^ y==1 => " + (x == 2 ^ y == 1));   // false ^ true  → true		

	}

}
