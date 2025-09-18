package chap13_test0917;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		//stdin : 출발지는 키보드. 표준입력
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("파일명을 입력하세요");
		String filename = stdin.readLine(); //키보드에서 한줄 입력
		System.out.println("시작라인");
		String stl = stdin.readLine(); //시작라인의 값을 문자열로 입력
		System.out.println("라인수");
		String snum = stdin.readLine(); //라인수의 값을 문자열로 입력
		//시작라인과 라인수 정수형 변경하기
		int start = Integer.parseInt(stl);  //시작라인
		int len = Integer.parseInt(snum);   //출력할 라인수
		//파일 읽기
		BufferedReader br = new BufferedReader(new FileReader(filename));
		String data = null; //파일에서 읽은 한줄 데이터.
		int line=0,cnt=0; //line:라인수, cnt:출력한 라인수
		while((data=br.readLine()) != null) {
			++line;
			if(line < start) continue;
			if(cnt >= len) break;
			++cnt;
			System.out.println(line+":" + data);
		}
		br.close();
		stdin.close();
		
	}
}
/*
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
*/
