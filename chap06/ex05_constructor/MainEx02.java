package ex05_constructor;

public class MainEx02 {
	public static void main(String[] args) {
		//Car c1 = new Car(); //생성자에 매개변수 없어서 오류 발생
		Car c1 = new Car("Blue",5678);
		Car c2 = new Car("Red");
		Car c3 = new Car(4321);
		Car c4 = new Car(c1); //c1과 같은 객체 만들기
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c4.number = 1111; //c4만 다르게 출력. 같은 값을 가지는게 아니라 생성자를 통해 다르게 생성되있어서.
		System.out.println(c1);
		System.out.println(c4);
	}
}
