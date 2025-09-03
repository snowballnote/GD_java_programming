package ex01_isa;
/*
 * Studnet, Person 클래스 구현하기
 * Studnet 클래스: Person 클래스의 하위클래스. Student is a Person=> Student는 Person을 상속받음.
 * Person 클래스: 구동클래스 eat(), sleep()구현하기
 */
class Person {
	void eat() {
		System.out.println("먹는다.");	
	}
	void sleep() {
		System.out.println("잔다.");
	}
}
class Student extends Person{
	void study(){
		System.out.println("공부한다.");
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Student st = new Student();
		st.eat(); //먹는다.
		st.sleep(); //잔다.
		st.study(); //공부한다.
	}
}
