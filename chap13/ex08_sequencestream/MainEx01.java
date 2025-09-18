package ex08_sequencestream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
 * SequenceInputStream: 여러개의 InputStream을 하나의 InputStream으로 연결하여 
 * 						처리할 수 있는 Stream
 * 	new SequenceInputStream(InputStream, InputStrem)
 * 		=> 2개의 InputStream을 연결
 * 	new SequenceInputStream(Enumeration)
 * 		=> 여러개의 InputStream을 연결
 */
public class MainEx01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = new FileInputStream("buffered.txt");
		FileInputStream fis2 = new FileInputStream("print.txt");
		SequenceInputStream si = new SequenceInputStream(fis1, fis2);
		byte[] buf = new byte[fis1.available() + fis2.available()];
		int len = 0;
		while((len=si.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		si.close();
		fis1.close();
		fis2.close();
	}
}
