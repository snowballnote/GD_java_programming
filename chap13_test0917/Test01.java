package chap13_test0917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 화면에서 파일명을 입력받고, 출력을 시작할 시작라인,출력 라인수를 입력받아서
 * 시작라인부터 라인수까지의 내용을 화면에 출력하기
 * Scanner 클래스 사용하지 않기.
 * BufferedReader 스트림 사용하기 
 [결과]
 파일명을 입력하세요
 src/ex01_inputstream/MainEx01_inputstream.java 
 시작라인 
 1
 라인수
 3
 
1:package ex01_inputstream;
2:
3:import java.io.IOException;
 */
public class Test01 {
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new FileReader("src/ex01_inputstream/MainEx01_inputstream.java "));
		int cnt = 0;
		while(true) {
			for(int i = 1; i <= 3; i++) {
				System.out.print(i + ":");
				String data = br.readLine();
				cnt++;
				System.out.println(data);
			}
			if(cnt > 2) break;
		}
	}
}