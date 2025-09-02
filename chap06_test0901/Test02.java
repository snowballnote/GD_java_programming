package chap06_test0901;
/*
다음 결과가 출력되도록 구동클래스(Test02)를 구현하기
구동클래스에서 출력은 Animal 클래스를 이용하기       

[결과]
     이름(name):원숭이
     나이(age):20
     맛있게 얌얌   
*/
class Animal {
	String name; //인스턴스변수 => 객체화가 되어야지 메모리가 할당되어 사용가능.
	int age;	//인스턴스변수
	void eat() {
		System.out.println("맛있게 얌얌");
	}
	public String toString() {
		return "이름(name):" + name + "\n나이(age):" + age;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Animal animal = new Animal(); //객체화
		animal.name = "원숭이";
		animal.age = 20;
		System.out.println(animal); //toString()호출
		animal.eat();
		
	}
}