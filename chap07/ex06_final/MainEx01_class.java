package ex06_final;
/*
 * final 제어자: 변경 불가의 의미
 * final 클래스(종단클래스): 상속불가클래스. 다른 클래스의 부모클래스가 안됨. 상속을 받을수는 있음. 객체화 가능.
 * 
 */
class A {}
final class FinalClass extends A {} //final을 붙이면 9번째줄에 에러남. 이유: final은 상속받는건 가능. 상속주는건 불가능함.=>상속받으려면 final을 지우면 가능.
//class subClass extends FinalClass {} 
public class MainEx01_class {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass(); //final클래스 객체생성 가능
	}
}
