package ex02_string;
/*
 * String 클래스
 * 	- 정적인 문자열: 변경불가 문자열 객체
 * 	- +연산자가 가능한 유일한 클래스 ex)String str = "1" + "2" + "3" + "4";=> 객체가 새롭게 여러개 생기게됨 1, 12, 123, 1234 이런식으로.
 * 	- 대입연산자를 이요하여 객체 생성이 가능한 유일한 클래스
 * 	- final 클래스 => 다른 클래스의 부모클래스는 불가함
 */
public class MainEx01 {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2: " + (s1 == s2)); //같은객체로 나옴 왜?=> 해시코드가 같음 왜?=>대입연산자로 만든건 객체를 상수로보고 상수풀에 만들어짐.
		//=> 상수값을 만들때는 새로 만들지않고 상수풀을 뒤져 같은 객체를 찾아 같은 객체를 참조함(가리킴).그래서 같음.
		System.out.println("s1.equals(s2): " + (s1.equals(s2))); //내용같음 //문자열일땐 왠만하면 equals쓰기.
		String s3 = new String("abc"); //new는 힙영역에 만듬
		String s4 = new String("abc"); //new로 힙역역에 s3와 각자 다른 객체를 만듬.
		System.out.println("s3 == s4: " + (s3 == s4)); //다른객체
		System.out.println("s3.equals(s4): " + (s3.equals(s4))); //내용같음
		System.out.println("System.identityHashCode(s1): " + System.identityHashCode(s1));
		System.out.println("System.identityHashCode(s2): " + System.identityHashCode(s2));
		System.out.println("System.identityHashCode(s3): " + System.identityHashCode(s3));
		System.out.println("System.identityHashCode(s4): " + System.identityHashCode(s4));
	}
}
