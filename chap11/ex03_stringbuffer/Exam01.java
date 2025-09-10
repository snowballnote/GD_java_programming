package ex03_stringbuffer;
/*
 * delchar함수 구현하기
 * delchar(원본문자열, 삭제대상문자열)
 * => 원본문자열에서 삭제 대상 문자열을 제거하고 나머지 출력하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(delchar("(1!2@3$4~5)","~!@#$%^&*()")); //12345
		System.out.println(delchar("(1!2@3$4~5)","12345")); //(!@$~)
		System.out.println(delchar2("(1!2@3$4~5)","~!@#$%^&*()")); //12345
		System.out.println(delchar2("(1!2@3$4~5)","12345")); //(!@$~)
		
	}
	
	//StringBuffer 사용안하고
	private static String delchar2(String str1, String str2) {
		String s = new String();
		for(int i = 0; i < str1.length(); i++) {
			if(str2.indexOf(str1.charAt(i)) < 0) {
				s += str1.charAt(i);
			}
		}
		return s;
	}

	private static String delchar(String str1, String str2) {
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0; i < str1.length(); i++) {
//			if(str2.indexOf(str1.charAt(i))< 0 ) {
			//s.contains(문자열): s 문자열에 매개변수문자열이 포함?
			if(!str2.contains(str1.charAt(i) + "")) { // + "": 문자열로 만들어줌.
				sb.append(str1.charAt(i));
			}
		}
		return sb.toString();
	}
}
