package ex07_properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/*
 * Properties 클래스
 * 	- Hashtable의 하위 클래스. Map 객체
 * 	- <String, String> 인클래스 => 제네릭표현 불가.
 * 	- load(FileInputStream): FileInputStream의 파일에서 key=value의 데이터를 Map객체로 생성
 * 	- store(FileOutputStream, String): Properties 객체의 내용을 FileOutputStream의 파일에 저장
 * 										String의 데이터는 첫줄 주석으로 출력함
 * properties 파일
 * 	- 환경설정에 사용되는 파일.
 * 	- #으로 시작하는 이후 데이터는 주석임	
 */
public class MainEx01 {
	public static void main(String[] args) throws IOException {
		Properties pr = new Properties();
		FileInputStream fis = new FileInputStream("a.properties");
		pr.load(fis); //fis 파일을 key=value인 값을 Map의 요소로 저장.
		System.out.println(pr); //{grade=1, name=test, math=90, kor=100, eng=80}
		System.out.println("name= " + pr.get("name")); //getProperty도 가능 //name= test
		for(Object k : pr.keySet()) {
			System.out.println(k + "=" + pr.get(k));
		}
		/*
grade=1
name=test
math=90
kor=100
eng=80

		 */
		pr.put("총점", "300");
		pr.store(new FileOutputStream("b.properties"), "#save");
	}
}
