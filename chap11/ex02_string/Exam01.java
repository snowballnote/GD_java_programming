package ex02_string;
/*
 * count 함수 구현하기
 * count(문자열, 찾는 문자열)=> 문자열에서 찾는 문자열의 갯수 리턴
 */
public class Exam01 {
	public static void main(String[] args) {
//		System.out.println("123".indexOf("1")); //0
//		System.out.println("123".indexOf("5")); //-1=>없다는 뜻
		System.out.println(count("12345AB12AB45AB", "12")); //2
		System.out.println(count("12345AB12AB45AB", "AB")); //3
		System.out.println((count("12345", "AB"))); //0
	}

	private static int count(String s1, String s2) {
		int cnt= 0, index = 0;
		while(true) {
			index = s1.indexOf(s2, index);
			if(index < 0) break;
			cnt++;
			index++;
		}
		return cnt;
	}
}
