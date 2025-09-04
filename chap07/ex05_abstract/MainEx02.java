package ex05_abstract;
/*
 * 추상클래스간의 상속
 */
abstract class Abs1{
	int a = 10;
	abstract int getA();
}
abstract class Abs2 extends Abs1{ //getA() 추상메서드를 오러라이딩 하지않은 이유: Abs2도 추상메서드이기대문에.
	int b = 20;
	abstract int getB();
}
class Normal extends Abs2{ //기본 클래스는 오버라이딩을 두개해야함.
	@Override
	int getB() {
		return b;
	}
	@Override
	int getA() { //부모꺼를 가져옴.
		return a;
	}	
}
public class MainEx02 {
	public static void main(String[] args) {
		Normal n = new Normal();
		//n참조변수가 형변환 될 수 있는 자료형
		//Normal, Abs2, Abs1, Object
		System.out.println("Normal 클래스의 멤버");
		System.out.println(n.a);
		System.out.println(n.b);
		System.out.println(n.getA());
		System.out.println(n.getB());
		System.out.println("Abs2 클래스의 멤버");
		Abs2 a2 = n;
		System.out.println(a2.a);
		System.out.println(a2.b);
		System.out.println(a2.getA());
		System.out.println(a2.getB());
		System.out.println("Abs1 클래스의 멤버");
		Abs2 a1 = a2;
		System.out.println(a1.a);
		System.out.println(a1.getA());
		//System.out.println(a1.b); //접근 불가능 나의 하위 클래스이기때문에.
		//System.out.println(a2.getB());
		System.out.println("Object 클래스의 멤버");
		Object obj = a1;
		//System.out.println(obj.a); //하위 클래스이기 때문에
		//System.out.println(obj.b);
		//System.out.println(obj.getA());
		//System.out.println(obj.getB());
	}
}
