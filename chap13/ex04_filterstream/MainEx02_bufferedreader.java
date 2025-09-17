package ex04_filterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * MainEx01_bufferedreader.java 파일의 10줄만 출력하기
 * 
 */
public class MainEx02_bufferedreader {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader
		(new FileReader("sre/ex04_filterstream/MainEx01_bufferedreader.java"));
		int cnt = 0;
		while(true) {
			String data = br.readLine();
			System.out.println(data);
			cnt++;
			if(cnt > 10) break;
		}
	}

}
