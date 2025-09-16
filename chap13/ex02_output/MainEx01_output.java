package ex02_output;

import java.io.IOException;
import java.io.OutputStream;
/*
 * OutputStrea: 바이트형 출력스트림. 데이터를 1byte 단위로 출력함
 */
public class MainEx01_output {
	public static void main(String[] args) throws IOException {
		OutputStream out = System.out;
		out.write('1'); out.write('2'); out.write('3');
		out.write('a'); out.write('b'); out.write('c');
		out.write('가'); out.write('나'); out.write('다'); //한글은 2바이트여서 out은 1바이트만 출력하니 2바이트짜리 한글은 깨짐.
		out.flush(); //출력 스트림의 데이터를 강제로 목적지로 전송
	}
}
