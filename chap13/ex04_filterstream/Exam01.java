package ex04_filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import java.text.SimpleDateFormat;
import java.util.Date;



/*
 * 발생된 예외의 내용을 error.log 파일에 출력하기
 * [결과]
 * 2025-09-17 10:15:00 => For input string: "a"
 */
public class Exam01 {
	public static void main(String[] args) throws FileNotFoundException {
//		FileOutputStream fos = new FileOutputStream("error.log");
//		PrintStream ps = new PrintStream(fos);
		PrintStream ps = new PrintStream(new FileOutputStream("error.log", true)); //true를 이용해서 기존에 있는 내용 유지시키면서 에러 작성할 수 있음.
		//없으면 지워지고 계속 새로운 에러가 작성됨.
		try {
			String str = "a";
			System.out.println(Integer.parseInt(str));
		}catch(Exception e) {
			//Date now = new Date();		
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			ps.printf("%s => %s\n",sf.format(new Date()), e.getMessage());
			e.printStackTrace(ps); //오류메세지를 ps에 출력
		}finally{
			ps.flush();
			ps.close();
		}
	}
}
