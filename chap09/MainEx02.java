package chap09;
/*
 * 외부 클래스의 멤버
 * 	인스턴스 내부클래스 객체화: 외부클래스의 객체화 필요
 * 						외부클래스의 참조변수.new 내부클래스명(생성자); 
 * 						//Outer1 out = new Outer1(); Outer1.InstanceInner iinner = out.new InstanceInner();
 * 	static 내부클래스 객체화: new 외부클래스명.내부클래스명(생성자);
 */
public class MainEx02 {
	public static void main(String[] args) {
		//Outer1.InstanceInner 클래스의 객체화
		//Outer1.InstanceInner 클래스는 Outer1 클래스의 인스턴스 멤버
		//=> 외부클래스의 객체화 필요. 외부클래스를 중심으로 객체화 필요.Outer1.InstanceInner iiner = new Outer1(). new InstanceInner();
		//Outer1.InstanceInner iinner = new Outer1.InstanceInner//이렇게 객체 생성 불가능.
//		Outer1.InstanceInner iinner = new Outer1().new InstanceInner(); //이렇게 객체화를해서 클래스로 가능.
		Outer1 out = new Outer1();
		Outer1.InstanceInner iinner = out.new InstanceInner(); //이렇게도 객체화 가능.
		System.out.println("iinner.iv=" + iinner.iv);
		System.out.println("Outer1.InstanceInner.cv=" + Outer1.InstanceInner.cv);
		System.out.println("Outer1.InstanceInner.MAX=" + Outer1.InstanceInner.MAX);
		//위처럼 하면 외부에서도 가능해짐.
		
		//Outer1.StaticInner 클래스의 객체화
		//Outer1.StaticInner 클래스는 Outer1 클래스의 클래스 멤버
		Outer1.StaticInner sinner = new Outer1.StaticInner();//외부클래스의 객체화는 필요없음.
		System.out.println("sinner.iv=" + sinner.iv);
		System.out.println("Outer1.StaticInner.cv=" + Outer1.StaticInner.cv);
		System.out.println("Outer1.StaticInner.MAX=" + Outer1.StaticInner.MAX);
		
	}
}
