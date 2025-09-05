package ex08_modifier;

import ex08_modifier.test.Modifier2;
//import ex08_modifier.*; //test가 들어간다고 생각할 수 있지만 그건 아님. 별도의 패키지로 생각하는게 좋음.
public class MainEx02 {
	public static void main(String[] args) {
		Modifier2 m2 = new Modifier2();
		m2.method();
		System.out.println("ex08_modifier.MainEx02.main()에서 m2의 멤버 호출");
		//m1.v1: Modefier2 클래스내에서만 접근 가능한 private이므로 호출 불가
		//System.out.println("m2.v1=" + m2.v1);
		
		//m1.v2: Modefier2 클래스와 같은 패키지 내에서만 접근 가능한 default이므로 호출 불가
		//System.out.println("m2.v2=" + m2.v2);
		
		//m1.v3: Modefier2 클래스와 상속 관계가 아니므로 호출 불가.protected
		//System.out.println("m2.v3=" + m2.v3);
		System.out.println("m2.v4=" + m2.v4); //public은 아무나 다 가능.
	}
}
