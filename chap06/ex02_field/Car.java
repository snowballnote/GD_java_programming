package ex02_field;

public class Car {
	String color; //인스턴스변수
	int num; //인스턴스
	static int width = 200; //클래스
	static int height = 120; //클래스
	//참조변수명만 출력하면 자동으로 호출되는 메서드
	//객체를 문자열로 표현하기 위한 메서드
	//System.out.println(car1.toString()); //toString이 없어도 자동으로 호출됨.생략가능
	public String toString() {
		return color + ":" + num + "(" + width +"," + height + ")";
	}
}
