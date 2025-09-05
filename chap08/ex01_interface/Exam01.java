package ex01_interface;
/*추상 인터페이스 사용.
 * Dove, Monkey, Flyable 구현하기
 * [결과]
 * 비둘기는 벌레를 잡아 먹는다.
 * 비둘기는 날아다닌다.
 * 원숭이는 나무에서 열매를 따먹는다.
 */
abstract class Animal{
	String name;
	Animal(String name){
		this.name = name;
	}
	abstract void eat(); //모든 동물은 먹어야하는데 Animal은 구현 못하니깐 추상 클래스로 만든 것.
}
class Dove extends Animal implements Flyable{ //비둘기가 날아다니니깐 인터페이스 플라이어블을 임플리먼츠로 불러옴.
	Dove() {
		super("비둘기");
	}
	@Override
	void eat() {
		System.out.println(name + "는 벌레를 잡아 먹는다.");
	}
	@Override
	public void fly() {
		System.out.println(name + "는 날아 다닌다.");
	}
}
class Monkey extends Animal{
	Monkey() {
		super("원숭이");
	}
	@Override
	void eat() {
		System.out.println(name + "는 나무에서 열매를 따먹는다.");
	}
}
interface Flyable {
	void fly();
}

public class Exam01 {

	public static void main(String[] args) {
		Animal[] arr = new Animal[2];
		
		arr[0] = new Dove();
		arr[1] = new Monkey(); //객체화되기때문에 클래스로 형변환 즉, 상속.
		for(Animal a : arr) {
			a.eat();
			if(a instanceof Flyable) {
				Flyable f = (Flyable)a;
				f.fly();
			}
		}
	}

}
