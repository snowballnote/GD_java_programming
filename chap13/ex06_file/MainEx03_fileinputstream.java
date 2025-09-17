package ex06_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*
 * File 클래스로 파일 읽어오기
 */
public class MainEx03_fileinputstream {

	public static void main(String[] args) throws IOException {
		File f = new File("data.txt");
		if(!f.exists()) { //파일이 존재안하는 경우
			System.out.println(f.getName() + "파일은 존재하지 않습니다.");
			return;
		}
		//f파일이 존재하는 경우
		FileInputStream fis = new FileInputStream(f);
		int len = 0;
		byte[] buf = new byte[8096];
		while((len=fis.read(buf)) != -1) {
			System.out.println(new String(buf,0,len));
		}
		fis.close();
		f.delete();
	}
}
