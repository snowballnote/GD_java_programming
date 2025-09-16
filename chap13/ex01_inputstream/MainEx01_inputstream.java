package ex01_inputstream;

import java.io.IOException;
import java.io.InputStream;

//chap13프로젝트생성
//ex01_inputstream 패키지 생성
//MainEx01_inputstream class 생성
/*
 * 입출력 스트림: 데이터의 이동통로. 단방향
 * 	입력스트림
 * 		바이트
 * 			1byte 기준으로 데이터 읽기
 * 		문자
 * 			1char 기준으로 데이터 읽기
 * 	출력스트림
 * 		바이트: OutputStream
 * 			1byte기준으로 데이터 출력.
 * 			동영상, 이미지, 덱스트 등 쓰기
 * 		문자: Writer
 * 			1char(2byte) 기준으로 데이터 출력
 * 			텍스트 데이터 쓰기
 * 	InputStreamReader: 문자형입력스트림 <= 바이트입력스트림. Reader의 하위 클래스
 * 			Reader r = new InputStreamReader(InputStream)
 * OutputStreamWriter: 문자형출력스트림 <= 바이트출력스트림. Writer의 하위 클래스
 * 			Writer w = new OutputStreamWriter(OutputStream)
 * 문자형입출력스트림을 바이트형입출력스트림으로 변경은 불가
 * 
 * 자바에서 제공되는 표준 입출력 스트림
 * 	표준입력스트림: InputStream System.in => 키보드에서 데이터 입력
 * 	표준출력스트림: PrintStream System.out => 콘솔(화면)으로 출력.
 * 	표준요류스트림: PrintStream System.err => 콘솔(화면)으로 출력. 빨강색글자로 출력
 * 	
 */
public class MainEx01_inputstream {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		int data = 0;
		//in.read(): 데이터를 읽을때 1바이트 기준으로 읽기
		while((data=in.read()) != -1) { //ctrl+z(EOF) 강제로 종료시키기.
			System.out.print((char)data);
		}
	}
}
