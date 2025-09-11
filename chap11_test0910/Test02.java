package chap11_test0910;
/*
 * 다음 결과가 나오도록 프로그램 수정하기
 * [결과]
 * basket
 * basketball
 */
public class Test02 {
	public static void main(String[] args) {
		String str = "base"; 
		System.out.println(str=str.replace('e','k')+"et"); //basket
		str += "ball"; 
		System.out.println(str); //basketball
	}
}
