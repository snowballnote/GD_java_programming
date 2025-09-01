package chap03;
/*
 * 이항연산자
 * 	관계연산자(비교연산자) : ==, !=, >, <, ... => 결과가 boolean
 * 	수학 : x = 10 => x는 10이다.
 * 			0 <= x <= 9
 * 	자바 : x = 10 => x변수에 10값을 대입.
 * 			x == 10 => x는 값이 10인경우 true반환, 아니면 false값을 반환
 * 			0 <= x && x <= 9
 * 	논리연산자 : 피연산자의 자료형이 boolean, &&(AND), ||(OR), ^(XOR), 순서가 중요.
 * 					&&(AND)
 * 				true && true : true //앞에가 true면 뒤에 문장을 무조건 실행
 * 				true && false : false
 * 				false && true : false //앞에가 false면 결과는 무조건 false이므로 뒤에 문장 실행하지 않음
 * 				false && false : false
 * 					||(OR)
 * 				true || true : true //앞에가 true인 경우 뒤에가 무엇이 나와도 결과는 true이기때문에 뒤에 문장 실행 안함.
 * 				true || false : true
 * 				false || true : true //앞에서 false인 경우 뒤에 문장에 따라 true, false가 될 수 있어서 뒤에 문장 꼭 실행.
 * 				false || false : false
 * 					^(XOR) : 배타적 OR
 * 				true ^ true : false
 * 				true ^ false : true
 * 				false ^ true : true
 * 				false ^ false : false
 */
public class OpEx04 {

	public static void main(String[] args) {
		System.out.println("1 == 1 : " + (1 == 1));
		System.out.println("1 == 2 : " + (1 == 2));
		System.out.println("1 != 2 : " + (1 != 2));
		System.out.println("1 < 2 : " + (1 < 2));
		System.out.println("1 <= 2 : " + (1 <= 2));
		System.out.println("2 > 1: " + (2 > 1));
		System.out.println("2 >= 1: " + (2 >= 1));
		System.out.println("2 >= 2: " + (2 >= 2));
		//논리연산자
		int x = 1, y = 1;
		System.out.println("x==2 && y==1=>" + (x == 2 && y == 1)); //false
		System.out.println("x==2 || y==1=>" + (x == 2 || y == 1)); //true
		System.out.println("x==2 ^ y==1=>" + (x == 2 ^ y == 1)); //true		
	}

}
