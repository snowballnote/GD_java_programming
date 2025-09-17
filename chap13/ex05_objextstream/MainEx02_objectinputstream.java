package ex05_objextstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
/*
 * Object.ser 파일에 저장된 Customer 객체를 복원 예제
 * 있는그대로 가져올 수 있음 :직렬화.
 */
public class MainEx02_objectinputstream {
	public static void main(String[] args) throws  ClassNotFoundException, IOException {
		ObjectInputStream ois = new ObjectInputStream //예외발생 IOException
				(new FileInputStream("object.ser")); //예외발생 IOException
		Customer c1 = (Customer)ois.readObject(); //예외발생 ClassNotFoundException
		Customer c2 = (Customer)ois.readObject();
//		Object c1 = ois.readObject(); //Object형으로 리턴
//		Object c2 = ois.readObject();
		System.out.println(c1); //정확하게는 c1.toString()을 호출한거임. 그러나 생략가능해서 안써줌.
		System.out.println(c2);
	}
}