package ex05_objextstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainEx04_objectinputstream {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream
				(new FileInputStream("object2.ser"));
		User u1 = (User)ois.readObject(); //예외발생 ClassNotFoundException
		User u2 = (User)ois.readObject();
		System.out.println(u1);
		System.out.println(u2);
		
	}
}
