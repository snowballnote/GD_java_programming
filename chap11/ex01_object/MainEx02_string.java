package ex01_object;
/*
 * equals 메서드를 대부분의 클래스에서 오버라이딩함.
 * 모든 객체의 내용을 비교 할때 equals메서드를 사용해야함. 대부분은 String
 */
public class MainEx02_string {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		if(str1 == str2) System.out.println("str1과 str2는 같은 객체임");
		else System.out.println("str1과 str2는 다른 객체임");
		if(str1.equals(str2)) System.out.println("str1과 str2는 같은 내용임");
		else System.out.println("str1과 str2는 다른 내용임");
	}

}
