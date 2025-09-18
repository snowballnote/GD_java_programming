package ex08_sequencestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Vector;

public class MainEx02 {
	public static void main(String[] args) throws IOException {
		File f = new File("src/ex06_file"); //폴더설정
		Vector<InputStream> v = new Vector<>();
		//f.list(): f 파일의 하위 파일이름 목록을 배열로 리턴
		for(String file : f.list()) {
			File f2 = new File(f,file);
			if(f2.isFile()) { //f2파일이 파일? 폴더 안니경우
				v.add(new FileInputStream(f2)); //Vector에 데이터 추가
			}
		}
		//v 객체: ex06_file 패키지에 속한 모든 파일의 정보 저장
		//v.elements(): InputStream 객체 들
		//new SequenceInputStream(v.elements())
		SequenceInputStream s = new SequenceInputStream(v.elements());
		FileOutputStream fos = new FileOutputStream("File 예제.txt"); //"File 예제.txt"파일 참조
		int data = 0;
		byte[] buf = new byte[8096]; //8k씩 읽어냄
		//data = s.read(buf) : s 입력스트림에서 데이터를 읽어서 buf에 저장. 읽은 바이트수를 리턴.
		//data: 실제로 읽은 바이트 수를 정수로 저장
		//buf: 파일로 읽은 내용 저장
		while((data=s.read(buf)) != -1) {
			fos.write(buf,0,data); //File 예제.txt파일에 buf의 내용을 출력
		}
		fos.flush(); fos.close(); s.close(); //프로그램 종료
	}
}
