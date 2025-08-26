package chap03;
/*
 * 단항연산자
 * 	부호연산자 : +, -
 * 		+ : 더하기가 아니고 피연산자의 부호 유지
 * 		- : 피연산자의 부호 변셩. 음 => 음,  양 =>양
 * 	논리부정연산자 : !(not)
 * 		boolean에서 사용함
 * 		!true => false
 * 		!false => true
 */
public class OpEx02 {

	public static void main(String[] args) {
		//부호연산자
		int x = -10;
		System.out.println("x=" + +x); //-10
		System.out.println("x=" + -x); //10
		
		x = 10;
		System.out.println("x=" + +x); //10
		System.out.println("x=" + -x); //-10
		
		System.out.println(!true);
		System.out.println(!false);
		
		System.out.println(5 != 4); //5와4는 같지 않다는것은 true니깐 true출력.
		System.out.println(!(5 == 4)); //5와4는 같지않으니 false인데 그것의 부정이므로 true출력.
	}

}
