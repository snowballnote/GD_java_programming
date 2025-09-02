package ex03_mathod;
/*
 * 매개 변수
 * 	참조형 매개변수
 * 	기본형 매개변수 차이
 */
class Value{
	int val;
}
public class Main03_Parameter {
	public static void main(String[] args) {
		Value v = new Value();
		v.val = 100;
		change1(v.val);
		System.out.println("change1() 이후:" + v.val);
		change2(v);
		System.out.println("change2() 이후:" + v.val);
	}
	private static void change1(int val) {
		val += 100;
		System.out.println("change1() val:" + val);
	}
	private static void change2(Value v) {
		v.val += 100;
		System.out.println("change2() val:" + v.val);
	}
}