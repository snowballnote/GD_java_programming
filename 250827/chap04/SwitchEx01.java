package chap04;
/*
 * switch(조건값){ //조건값은 진짜 값으로 들어감, 정수형이 많이 들어감. 즉, 1,2,3 이런식으로 들어감. 범위 아님.
 * 	case 값1 : 문장들1;break; //문장들은 중괄호 없이 들어감.
 * 	case 값2 : 문장들2;break;
 * 	...
 * 	default : 문장들; //default에는 break넣어줄 필요없음
 * }
 */
public class SwitchEx01 {

	public static void main(String[] args) {
		int score = 95;
		switch(score/10) { //
			case 9 : System.out.println("A학점"); break;
			case 8 : System.out.println("B학점"); break;
			case 7 : System.out.println("C학점"); break;
			case 6 : System.out.println("D학점"); break;
			default : System.out.println("F학점");
		}
	}

}
