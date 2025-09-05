package ex08_modifier;

public class Modifier1 {
	private int v1 = 100;
			int v2 = 200; //접근제한자 생략.=> default접근제한자표현임. 없는게 아니라 있는데 생략되어있는거임 무조건 붙음.
	protected int v3 = 300;
	public int v4 = 400;
	public void method() {
		System.out.println("exo8_modifier.Modifier1 클래스의 method()");
		System.out.println("v1=" + v1);
		System.out.println("v2=" + v2);
		System.out.println("v3=" + v3);
		System.out.println("v4=" + v4);
	}
}
