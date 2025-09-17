package ex06_file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

/*
 * File클래스의 주요 메서드 //파일안에 내용은 절대 못바꿈.
 * - String getAbsolutePath(): 절대경로 리턴
 * - boolean mkdir(): 폴더 생성. 한단계의 폴더만 생성
 * - boolean mkdirs(): 폴더 생성. 여러 단계의 폴더만 생성
 * - boolean f2.createnewFile(): 파일 생성. 내용을 집어넣지는 못함. IOException예외처리해야함.
 * - String getName(): 파일의 이름리턴
 * - long length(): 파일의 크기. 바이트 단위
 * - boolean renameTo(File): 파일명을 변경
 * - long lastModified(): 파일 수정일자. 밀리초로 리턴
 * - boolean delete(): 파일 삭제
 */
public class MainEx02_filemethod {

	public static void main(String[] args) throws IOException {
		File f1 = new File("c:/temp1"); //temp1 폴더 없음
		System.out.printf("%s 폴더 생성:%b\n", f1.getAbsolutePath(), f1.mkdir());
		
		File f2 = new File("c:/temp1/test.txt"); //test.txt 파일 없음
		System.out.printf("%s 파일 생성:%b\n", f2.getAbsolutePath(), f2.createNewFile());
		//IOException
		System.out.printf("파일 이름:%s, 파일 크기:%d\n", f2.getName(), f2.length());
		
		//없는 파일 관리
		File f3 = new File("c:/temp1/test2.txt"); //test2.txt 파일없음
		if(f3.exists()) { //f3 파일이 존재?
			System.out.println(f3.getName() + "파일은 존재함");
		}else {
			System.out.println(f3.getName() + "파일은 없음");
		}
		
		System.out.printf("%s -> %s 이름변경:%b\n", f2.getName(),f3.getName(), f2.renameTo(f3));
		System.out.println("test.txt:" + f2.exists()); //false
		System.out.println("test2.txt:" + f3.exists()); //true
		System.out.println("파일의 최종 수정시간:" + f3.lastModified());
		String lastday = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(f3.lastModified());
		System.out.println("파일의 최종 수정시간: " + lastday);
		System.out.printf("%s 파일 삭제:%b\n", f3.getName(), f3.delete());
	}
	/*
c:\temp1 폴더 생성:true
c:\temp1\test.txt 파일 생성:true
파일 이름:test.txt, 파일 크기:0
test2.txt파일은 없음
test.txt -> test2.txt 이름변경:true
test.txt:false
test2.txt:true
파일의 최종 수정시간:1758087458326
파일의 최종 수정시간: 2025-09-17 14:37:38
test2.txt 파일 삭제:true

	 */

}
