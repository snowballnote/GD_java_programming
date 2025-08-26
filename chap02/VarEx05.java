package chap02;
/*
 * 특수문자 : \
 */
public class VarEx05 {

	public static void main(String[] args) {
		char single = '\''; //문자에 '문자를 저장
		System.out.println(single);
		String str = "홍길동이 말했습니다. \"안녕\"";
		System.out.println(str);
		str = "홍길동이 말했습니다. '안녕'";
		System.out.println(str);
		String dir = "c:\\";
		System.out.println(dir);
		
		System.out.println("서울\t대구\t부산"); //tab 출력
		System.out.println("안녕\n반가워"); //안녕 다음 줄에 반가워출력. \n: new line
		System.out.println('\uD64D'); //유니코드 표현. 2바이트문자 코드값 // \u16진수표현값
	}

}
