package ex02_string;
//String: 정적인 문자열, 변경할 수 없는 문자열
public class MainEx03 {

	public static void main(String[] args) {
		String str = "ABC123";
		System.out.println("main: " + str); //main: ABC123
		change(str); //change: ABC123456 //str = change(str)로 변경하면 change 후 ABC123456로 바뀜.
		System.out.println("change 후: " + str); //change 후: ABC123
	}
	
	private static void change(String str) { //change후 ABC123456으로 바꾸고 싶으면 void=> int
		str += 456;
		System.out.println("change: " + str);
	}
	
}
