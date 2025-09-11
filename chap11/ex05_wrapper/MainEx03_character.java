package ex05_wrapper;
/*
 * Character 클래스
 */
public class MainEx03_character {

	public static void main(String[] args) {
		char[] arr = "Aa&가0".toCharArray();
		for(char c : arr) {
			if(Character.isUpperCase(c)) {
				System.out.println(c + ":대문자");
			}
			if(Character.isLowerCase(c)) {
				System.out.println(c + ":소문자");
			}
			if(Character.isDigit(c)) {
				System.out.println(c + ":숫자");
			}
			if(Character.isAlphabetic(c)) { //숫자, 특수문자외의 한글, 영문, 일본어...
				System.out.println(c + ":문자");
			}
			else {
				System.out.println(c + ":문자 아님");
			}
		}

	}

}
