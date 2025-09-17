package ex06_file;

import java.io.File;

/*
 * c:\windows 폴더의 하위 폴더의 갯수와 파일의 갯수, 파일의 총크기를 출력.
 */
public class Exam01 {

	public static void main(String[] args) {
		String filepath = "c:/windows";
		File f = new File(filepath); 
		//File f1 = new File("c:/windows");
		int DCnt = 0; //폴더갯수
		int FCnt = 0; //파일갯수
		int total = 0; //전체파일크기
		String[] files = f.list(); //윈도우즈 밑에 파일들이 files로 들어옴
		for(String fl : files) {
			File f2 = new File(f, fl); //부모f, 자식f1
			if(f2.isFile()) { //isDirectory()도가능
				FCnt++;
				total += f2.length();
			}	
			else {
				DCnt++;
			}	
		}
		System.out.println("폴더 갯수: " + DCnt);
		System.out.println("파일 갯수: " + FCnt);
		System.out.printf("전체파일의 크기: %,d", total);

	}

}
