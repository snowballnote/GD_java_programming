package ex08_modifier;

import ex08_modifier.test.Modifier2; //같은 패키지가 아니기때문에 import 해줘야함.

public class Modifier3 extends Modifier2 {
	//오버라이딩 조건중 접근제한자는 넓은 범위로 가능
	public void method() { //부모가 public이면 자식도 public이여야함. 그래서 public을 안쓰면 에러남.
		System.out.println("ex08_modifier.test.Modifier3 클래스의 method()");
//		System.out.println("v1=" + v1); //private.다른클래스에서 접근
//		System.out.println("v2=" + v2); //다른 패키지에서 접근
		System.out.println("v3=" + v3); //두개가 다른패키지이긴하지만 v3가 modifier2에있고 modi3와 상속관계이므로 접근이 가능함
		System.out.println("v4=" + v4); //어디서든 다 됨.
	}
}
