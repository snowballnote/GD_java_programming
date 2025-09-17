package ex03_filestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
 * 화면에서 exit 값이 입력될때 까지 내용을 입력받아 data.txt 파일에 저장하기
 * FileOutputStream을 이용하기. 한글도 가능하도록 하기
 * [결과]
 * data.txt파일에 저장할 내용을 입력하세요(종료:exit)
 * aaa
 * bbb
 * exit
 */
public class Exam01 {
	public static void main(String[] args) throws IOException {
		System.out.println("data.txt파일에 저장할 내용을 입력하세요(종료:exit)");
		Scanner scan = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("data.txt");
		while(true) {
			String data = scan.next();
			if(data.equals("exit")) break;
			fos.write((data+"\n").getBytes());
		}
		fos.flush();
		fos.close();
	}
}