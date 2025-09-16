package ex01_inputstream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
/*
 * Reader: 문장형 입력 스트림의 최상위 클래스. 추상 클래스임
 * 			데이터를 읽을 때 2byte(1char)단위로 읽음
 */
public class MainEx02_reader {

	public static void main(String[] args) throws IOException {
		Reader in = new InputStreamReader(System.in);
		int data = 0;
		//in.read(): Reader.read()메서드는 데이터 읽을 때 2byte(1char) 단위로 읽기
		while((data=in.read()) != -1) {
			System.out.print((char)data);
		}
		
	}

}
