package ex05_objextstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainEx03_objectoutputstream {
	public static void main(String[] args) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream //파일의 내부내용은 못건들임.
				(new FileOutputStream("object2.ser"));
		User u1 = new User("홍길동", "1234", 20);
		User u2 = new User("김삿갓", "3456", 30);
		oos.writeObject(u1);
		oos.writeObject(u2);
		System.out.println(u1);
		System.out.println(u2);
	}
}
