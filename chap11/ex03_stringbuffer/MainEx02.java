package ex03_stringbuffer;
/*
 * StringBuffer의 주요 메서드
 * 
 */
public class MainEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(); //이렇게만 객체생성 가능.
		sb.append("abc").append(123).append('A').append(false);
		System.out.println(sb);
		sb.delete(2,  4);
		System.out.println(sb);
		sb.deleteCharAt(4);
		System.out.println(sb);
		sb.insert(5, "==");
		System.out.println(sb);
		
		sb = new StringBuffer("ABCDEFG");
		sb.replace(0, 3, "abc");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
