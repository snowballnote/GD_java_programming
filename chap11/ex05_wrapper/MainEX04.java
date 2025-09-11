package ex05_wrapper;
/*
 * switch 구문의 조건값으로 사용할 수 있는 자료형 //자동형변환이 되기떄문에 사용 가능.
 * 	byte, short, int, char, String
 * 	Byte, Short, Integer, Character
 */
public class MainEX04 {
	public static void main(String[] args) {
		Byte num = 0;
		switch(num) {
			case 0:
			default: System.out.println("switch 조건값 테스트");
		}
	}
}
