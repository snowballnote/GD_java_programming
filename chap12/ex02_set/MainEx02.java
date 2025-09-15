package ex02_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/*
 * 객체 추가시 중복판단의 기준
 *  1. equals 메서드의 결과가 true
 *  2. hashCode 메서드의 결과가 같은 경우
 *  1, 2 모두 만족하는 경우를 중복객체로 판단함
 *  
 *  equals, hashCode 메서드를 동시에 오버라이딩 필요 => 권장사항
 *  
 */
class Person{

	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + "," + age;
	}
	/*
	 * java.util.Objects: 객체(참조형)와 관련된 작업을 편하게 처리하기 위한 클래스
	 * 						비교, 해시코드, 문자열반환 등 을 처리
	 */
	@Override
	public int hashCode() {
		//age, name 데이터를 이용하여 내용이 같으면 같은 값을 가질 수 있게 hashCode값 리턴
//		return Objects.hash(age, name); //이코드로 인해 중복 x, [abc, 홍길동,10] 이렇게 출력됨.
		
		return name.hashCode() + age; //[홍길동,10, abc]
	}
	@Override
	public boolean equals(Object obj) {
//		if (this == obj) //this: 자기참조변수, 현재객체
//			return true; //obj: 비교되는 다른 객체
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass()) //getClass나의 정보, obj.getClass()상대의 정보
//			return false;
		if(obj instanceof Person) {
			Person other = (Person) obj;
			//Objects.equals(obj1, obj2) : null 안정성 처리함.
//			return age == other.age && Objects.equals(name, other.name);
			return age == other.age && name.equals(other.name); //이렇게 써도 되는데 null값을 대비해서 안정성을 위해 위에 있는 코드로 쓰는 것이 좋음.
		}else return false; //[홍길동,10, abc]
	}
}
public class MainEx02 {
	public static void main(String[] args) {
		Set<Object> set = new HashSet<Object>();
		set.add(new String("abc")); set.add(new String("abc"));
		set.add(new Person("홍길동", 10)); set.add(new Person("홍길동", 10));
		System.out.println(set); //[abc, 홍길동,10, 홍길동,10]
	}
}