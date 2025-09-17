package ex03_filestream;

import java.io.FileInputStream;
import java.io.IOException;

/*
 * FileInputStream 예제
 * 	파일을 읽어 내용을 화면에 출력하기
 * 	주요메서드
 * 	int read(): 1바이트를 읽어 리턴
 * 	int read(byte[] buf): buf의 크기만큼 읽어서, buf에 저장하고, 실제 읽은 바이트수 리턴
 * 	int read(byte[] buf, int start, int len):
 * 			len 크기만큼 읽어서 buf start 인덱스부터 buf에 저장. 실제읽은 바이트 수 리턴
 * 	int available(): 읽기 가능 바이트 수 리턴
 */
public class MainEx01_fileinputstream {

	public static void main(String[] args) throws IOException {
		String filename = "src/ex01_inputstream/MainEx01_inputstream.java";
		FileInputStream fis = new FileInputStream(filename);
		int data = 0;
		System.out.println("=== read() 메서드를 이용하여 파일 읽기 ===");
		while((data=fis.read()) != -1) {
			System.out.println((char)data);
		}
		fis.close();
		
		System.out.println("=== read(byte[]) 메서드를 이용하여 파일 읽기 ===");
		fis = new FileInputStream(filename);
		//fis.available(): 읽을 수 있는 바이트 리턴
		// 100byte 파일을 읽지 않은 경우: 100
		// 100byte 파일을 10바이트를 읽은 경우: 90
		byte[] buf = new byte[fis.available()];
		while((data = fis.read(buf)) != -1) {
			//new String(buf, 0, data)
			// byf의 0번 인덱스 부터 data의 크기만큼 문자열 객체로 생성
			System.out.println(new String(buf, 0, data));
		}
		fis.close();
		
		System.out.println("=== read(byte[], int, int) 메서드를 이용하여 파일 읽기 ===");
		fis = new FileInputStream(filename);
		buf = new byte[fis.available() + 1];
		buf[0] = 'A';
		while((data=fis.read(buf,1,buf.length-1)) != -1) {
			System.out.println(new String(buf,0,data+1));
		}
		fis.close();
	}

}
