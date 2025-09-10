package ex01_exception;

import java.io.IOException; //import해야함.

/*
 * 오버라이딩에서의 예외처리: 부모 메서드와 같거나, 좁은 범위만 가능함.
 * Exception > ClassNotFoundException => 좁은 범위만 가능
 * Exception > ClassNotFoundException, IOException => 좁은 범위만 가능
 * Exception이 커도 자손에 있으면 부모가 더 크므로.
 * RuntimeException은 가능하다. //오류 그냥 넘어갈떄 사용
 */
class Parent{
//	public void method() throws ClassNotFoundException, IOException{
	public void method() throws NumberFormatException{
		System.out.println("Parent 클래스의 method");
	}
}
class Child extends Parent{
	//public void method() throws Exception{ //throws RuntimeException 으로 예외처리됨.
													//throws Exception으로 바꾸면 자손에서만 에러남.
		System.out.println("Child 클래스의 method");		
	
}
public class MainEx06_override {
	public static void main(String[] args) {
		Child c = new Child();
		c.method(); //에러발생이유. throws로 예외처리해서.
	}
}
