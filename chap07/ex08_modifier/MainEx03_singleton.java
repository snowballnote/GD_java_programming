package ex08_modifier;
/*
 * 생성자의 접근 제한자를 private으로 설정: 객체의 갯수를 제한
 */
class SingleObject{
	private static SingleObject obj = new SingleObject(); //obj라는 static변수에 객체생성//현재 클래스내에서 객체 생성
	private SingleObject() {} //생성자의 접근제한자가 private이므로 다른 클래스에서 객체생성불가.
	int value= 100;
	public static SingleObject getObject() {
		return obj;
	}
}
public class MainEx03_singleton {
	public static void main(String[] args) {
		//SingleObject obj = new SingleObject(); //오버라이딩(is not visible) 에러 발생.생성자 접근
		SingleObject o1 = SingleObject.getObject();
		SingleObject o2 = SingleObject.getObject();
		SingleObject o3 = SingleObject.getObject();
		System.out.println(o1.value);
		System.out.println(o2.value);
		System.out.println(o3.value);
		o1.value = 200;
		System.out.println(o1.value); //같은 객체여서 o1만 변경해도 다른 것도 같이 변경되서 출력됨.
		System.out.println(o2.value);
		System.out.println(o3.value);
	}
}
