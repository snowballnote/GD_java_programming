package chap09;
/*
 * 내부 클래스의 메서드에서 사용되는 this, super
 */
class ParentOuter{
	int iv = 10;
	int piv = 500;
	/*
	 * 내부클래스의 멤버메서드에서 변수 접근 우선순위
	 * 1. 지역변수
	 * 2. 내부클래스의 멤버변수. this.멤버변수로 호출가능 //지역변수iv50가 없으면 iv40호출될거임.
	 * 		=> this는 내부클래스의 객체.
	 * 3. 외부클래스의 멤버변수: 외부클래스명.this.멤버변수로 호출가능
	 * 4. 외부클래스의 부모클래스의 멤버변수: 외부클래스명.super.멤버변수로 호출가능
	 */
}
class ChildOuter extends ParentOuter{
	int iv = 20;
	int iv2 = 30;
	class InstanceInner{ //객체화 하기위해 ChildOuter가 객체화 먼저 되야함. 객체화 두번하기.
		int iv = 40;
		void method() { //실행하기
			int iv = 50; //지역변수
			System.out.println("iv=" + iv);
			//외부클래스에만 있는 iv2 호출하기
			System.out.println("iv2=" + iv2); //ChildOuter.iv2
			System.out.println("piv=" + piv); //ParentOuter.piv
			System.out.println("this.iv=" + this.iv); //InstanceInner.iv //int iv = 50을 지우면 iv40이 iv40을 지우면 iv20을 출력함. 상속에 맞춰 출력함.
			System.out.println("ChildOuter.this.iv=" + ChildOuter.this.iv); //ChildOuter.iv //외부 iv 가져오기.
																			//int iv = 20;을 지우면 Parent에 iv를 가져옴. 상속관계여서.
//			System.out.println("ParentOuter.this.iv=" + ParentOuter.this.iv); //ParentOuter.iv는 쓸 수 없음.
			System.out.println("ChildOuter.super.iv=" + ChildOuter.super.iv); //Child의 부모클래스인 Parent의 iv값을 가져옴.
			//iv2 변수를 외부클래스명.this.변수명
			System.out.println("ChildOuter.this.iv2=" + ChildOuter.this.iv2); //ChildOuter.iv2
			//piv 변수를 외부클래스명.super.변수명 //두가지 방법으로 다 접근 가능.
			System.out.println("ChildOuter.super.piv=" + ChildOuter.super.piv); //ChildOuter.piv
			System.out.println("ChildOuter.this.piv=" + ChildOuter.this.piv); //ParentOuter.piv : piv가 parent에 하나밖에 없어서(중복x) this로도 접근 가능.
		}
	}
}
public class MainEx04 {
	public static void main(String[] args) {
		ChildOuter.InstanceInner inner = new ChildOuter().new InstanceInner(); //instanceInner 의 참조변수 ChildOuter
		inner.method();
	}
}
