package ex03_filestream;

import java.io.FileReader;

/*
 * FileReader 예제
 * - 파일에서 데이터 2byte단위로 읽기
 * - 주요 메서드
 * 		int read(): 파일에서 데이터를 2바이트(1char)단위로 읽어 리턴
 * 		int read(char[] buf): 파일에서 buf의 크기만큼 읽어서 buf에 저장
 * 							실제 읽은 char 수를 리턴
 * 		int read(char[] buf, int start, int len):
 * 						파일에서 len만큼 읽어서 buf에 start 인덱스 부터 저장
 * 						실제 읽은 char 수를 리턴
 * FileInputStream, FileReader의 생성자의 예외처리: FileNotFoundException
 * read()의 예외처리: IOException
 * FileNotFoundException은 IOException의 하위클래스
 * 
 * new FileReader("test.txt"): test.txt 파일은 프로젝트 폴더(chap13)에 있어야 파일을 읽을 수 있음
 * 기본폴더는 프로젝트 폴더임: chap13
 */
public class MainEx02_filereader {

	public static void main(String[] args) {
		String filename = "src/ex01_inputstream/MainEx01_inputstream.java";
		FileReader fr = new FileReader(filename);
		int data = 0;
		System.out.println("=== read() 메서드를 이용하여 파일 읽기 ===");
		while((data=fr.read() != -1)) {
			System.out.println((char)data);
		}
	}

}
