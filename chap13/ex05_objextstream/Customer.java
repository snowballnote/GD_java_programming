package ex05_objextstream;

import java.io.Serializable;
//NotSerializableException : 멤버가 없다. => implements Serializable 추가하기.
//Serializable 인터페이스의 구현 클래스만 객체를 외부로 전송가능
public class Customer implements Serializable{
	/**
	 * serialVersionUID: 직렬화된 객체의 버전 번호
	 * 역직렬화(직렬화된 객체 복원)될때 버전번호 검증. 일치하지 않으면 오류 발생
	 * 설정해주지 않으면 경고발생. 컴파일러가 private static final long serialVersionUID = 1L; 이런식으로 자동으로 생성해줌.
	 */
	private static final long serialVersionUID = 1L; //implements붙이니 Customer클래스에 경고발생 그래서 serialVersionUID이거 추가하니 에러 없어짐. 이유위에 설명
	//serialVersionUID를 추가하니 MainEx02에서 에러남=>
	private String name;
	//예약어 transient: 직렬화시 제외되는 필드 설정. => age는 복원되지 않음 즉 외부로 나가지 않음.
	//MainEx01에서는 제대로 나오지만 MainEx02에서는 나이가 안나옴.
	private transient int age;
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
}
