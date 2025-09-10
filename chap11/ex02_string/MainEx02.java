package ex02_string;
/*
 * String 클래스의 주요 메서드
 */
public class MainEx02 {

	public static void main(String[] args) {
		String s = new String("ABCDEFGH");
		//s.charAt(4): s문자열중 4번 인덱스 (5번재)에 해당하는 문자(char)를 리턴
		System.out.println(s.charAt(4)); //E
		//s.compareTo("abc") : s와 "abc"의 차이를 비교: 결과가 음수인 경우(숫자는 중요하지 않음): s 문자열이 "abd"보다 앞에 위치하는 문자
		//						정렬에 관련된 메서드
		System.out.println(s.compareTo("abc")); //-32: 음수이기때문에 s가 앞에 위치한다는 것을 알수 있음.
		//s.compareToIgnoreCase("abcdefgh"): 대소문자 상관없이 정렬
		//								결과가 0: 2개의 문자열의 내용이 같다는 뜻. 같은 위치다.
		System.out.println(s.compareToIgnoreCase("abcdefgh")); //0
		//s.endsWith("GH"): s 문자열의 끝이 GH? 맞으니깐 true 출력
		System.out.println(s.endsWith("GH")); //true
		//s.startsWith("AB"): s 문자열의 시작이 AB? 맞음=> true
		System.out.println(s.startsWith("AB")); //true
		//s.equals("ABCDEFGH"): s문자열과 "ABCDEFGH"이 같나? 맞음
		System.out.println(s.equals("ABCDEFGH")); //true
		//s.equalsIgnoreCase("abcdefgh"): 대소문자 상관없이 문자열 비교
		System.out.println(s.equalsIgnoreCase("abcdefgh")); //true
		System.out.println();
		s = "this is a string"; //인덱스번호: 012345678910111213141516
		//s.indexOf('i'): s문자열에서 첫번째로 만나는 i'문자'의 인덱스값 리턴
		System.out.println(s.indexOf('i')); //2 <=> charAt과 반대됨
		//s.indexOf("is"): s문자열에서 is'문자열'의 인덱스값 리턴
		System.out.println(s.indexOf("is")); //2
		//s.lastIndexOf('i'): s문자열에서 i를 뒤에서 첫번째 인덱스를 리턴.
		//						인덱스는 앞에서부터 0으로 시작함. 그래서 뒤에서 부터 찾았어도 인덱스는 앞에서부터 0으로 시작하니깐 13이 맞음.
		System.out.println(s.lastIndexOf('i')); //13
		//s.indexOf("i", 3): s문자열에서 3번인덱스 부터 첫번째로 만나는 i문자의 인덱스를 리턴
		System.out.println(s.indexOf("i", 3)); //5
		//s.length(): 문자열의 길이
		System.out.println(s.length()); //16
		
		//replace: 문자열 치환
		System.out.println(s.replace("is", "QR")); //thQR QR a string
		//replaceAll: 문자열 치환. 정규식 활용가능.
		System.out.println(s.replaceAll("is", "QR")); //thQR QR a string
		//=> 다른점? 
	}

}
