package ex03_stringbuffer;
/*
 * StringBuffer/ StringBuilder: 동적문자열. 문자열 객체 변경 가능함.
 * 	- 같은 메서드를 멤버로 가짐.
 * 
 * StringBuffer: 스레드에 동기화된 메서드를 멤버로 가짐
 * StringBuilder: 스레드에 동기화 되지않은(비동기화) 메서드를 멤버로 가짐
 * 					JDK5 이후에 추가됨 클래스
 * 
 * equals 메서드를 오버라이딩 하지 않음 => 내용비교 안됨.
 * 내용 비교시 문자열로 변경(toString())해서 내용 비교
 */
public class MainEx01 {

	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("abc");
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println(sb1 == sb2); //
		System.out.println(sb1.equals(sb2)); //
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		StringBuffer sb3 = new StringBuffer("abc");
		StringBuffer sb4 = new StringBuffer("abc");
		System.out.println(sb1 == sb2); //
		System.out.println(sb1.equals(sb2)); //
		System.out.println(sb1.toString().equals(sb2.toString()));
		
	}

}
