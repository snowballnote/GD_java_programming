package ex04_filterstream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * BufferedReader 보조스트림
 * 보조스트림이란
 * 1. 기존 스트림에 새로운 기능을 추가
 * 2. 객체 생성시 다른 스트림을 생성자의 매개변수로 입력한다.
 * 
 * BufferedReader.readLine() 기능 추가
 * BufferedReader 객체 생성시
 * 	new BufferedReader(Reader)
 * 
 */
public class MainEx01_bufferedreader {

	public static void main(String[] args) throws IOException {
		//키보드로 부터 한줄 씩 입력받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //reader로 바꾸는 코드
		System.out.println("저장할 내용을 입력사에요(종료:ctrl+z)");
		FileWriter fw = new FileWriter("buffered.txt"); //filewriter로 저장
		String data = null;
		while((data = br.readLine()) != null) { //readLine:bufferedreader에만 있음.
			System.out.println(data);
			fw.write(data + "\n");
		}
		br.close();
		fw.flush();
		fw.close();	
	}
}
