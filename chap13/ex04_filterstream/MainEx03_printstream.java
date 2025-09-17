package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * PrintStream
 * 1. OutputStream의 하위 클래스 => 바이트형 출력스트림
 * 2. write기능을 다양하게 확장함 => print, println, printf
 * 		=> 모든 자료형 출력가능
 * 		=> 예외처리 생략 기능 추가
 * 3. 포준출력(Syste.out), 표준오류(System.out) 자료형임
 * 4. 객체 생성시 바이트형 출력스트림(OutputStream)을 매개변수로 받음
 * 
 */
public class MainEx03_printstream {

	public static void main(String[] args) throws FileNotFoundException { //ps 출력의 다양한 기능을 만들어 처리. IOException 안해도됨.
		FileOutputStream fos = new FileOutputStream("print.txt"); //객체생성
		PrintStream ps = new PrintStream(fos); //ps는 outputStream해줘야함. FileOutputStream도  outputStream이여서 사용 가능.
		ps.println("홍길동");
		ps.println(1234);
		ps.println(true);
		ps.println(65); //65는 A이지만 우리가 보는 그대로 찍으려면 println으로 찍고 A로 찍으려면 write사용.
		ps.write(65); //A : 65의 코드값인 A가 출려됨
		ps.write(97); //a
		ps.flush();
		ps.close();
	}
}
