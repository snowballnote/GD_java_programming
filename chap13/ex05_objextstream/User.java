package ex05_objextstream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable; //부모가 Ser안했는데 자식이 ser했으면 직렬화에서 제외됨.
/*
 * 1. 부모클래스는 직렬화 대상임
 * 자손클래스는 직렬화 대상아님
 * => 직렬화 가능. 자손클래스도 직렬화 대상임.
 * 
 * 2. 부모클래스는 직렬화 대상이 아님
 * 자손클래스는 직렬화 대상임
 * => 직렬화는 가능. 부모의 멤버값들은 직렬화에서 제외
 * => 자손클래스에서 부모멤버값을 직접 직렬화할 수 있음
 * 		writeObject 메서드, readObject 메서드 구현하기
 * 		
 */
class UserInfo{
	protected String name;
	protected String password;
	public UserInfo() {}
	public UserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
	public String toString() {
		return name + "," + password;
	}
}
public class User extends UserInfo implements Serializable {
	private int age;
	public User(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	@Override
	public String toString() {
		return super.toString() + "," + age;
	}
	private void writeObject(ObjectOutputStream out) throws IOException{
		out.writeUTF(name); //writeUTF문자열 전송할때 사용
		out.writeUTF(password);
		out.defaultWriteObject(); //defaultWriteObject원래가려고했던 일반적인 필드. 자손필드를 다 집어넣는것.
	}
	
	//이코드로 이름과 비번이 전송이 되어 나타남. 이 코드 없으면 안나옴.
	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException{
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
