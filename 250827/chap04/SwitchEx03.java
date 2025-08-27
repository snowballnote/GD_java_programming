package chap04;
/*
 * 조건값으로 사용이 가능한 자료형
 * byte, short, int, char, String
 * 조건값으로 사용이 불가능한 자료형
 * boolean, long, float, double
 */
public class SwitchEx03 {

	public static void main(String[] args) {
		String str = "2";
		switch(str) {
			case "1" : System.out.println(str); break;
			default: System.out.println("default 구문 실행");
		}
		char ch = 'A'; //가능
		//int ch = 'A'; //가능
		//byte ch = 'A'; //가능
		//short ch = 'A'; //가능
		//long ch = 'A'; //불가
		//double ch = 'A'; //불가
		switch(ch) {
			case 'A' : System.out.println(ch); break;
			default: System.out.println("default 구문 실행");
		}
		
		//중첩 switch 구문 가능
		int a = 1, b = 2;
		switch(a) {
			case 1: switch(b){
				case 2 : System.out.println("a=" + a + " ,b=" + b); break;
				}
				break;
			default : System.out.println("default 구문 실행");
		}
	}

}
