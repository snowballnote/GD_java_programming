package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/*
 * List 정렬하기
 * - Collections.sort(List<Comparable>)
 * - Collections.sort(List,Comparator<T>)
 * 
 * 정렬 관련 인터페이스
 * Comparable<T> 인터페이스 => 클래스의 기본정렬 방식 설정시 사용.
 * 	- FunctionalInterface
 * 	- 추상메서드: int compareTo(T, t)
 * 		결과: 음수: 현재 객체 앞. t객체가 뒤쪽
 * 			 양수: 현재 객체 뒤. t객체가 앞쪽
 * 	- 클래스로 직접 구현하여, 클래스의 기본 정렬 방식으로 설정시 사용되는 인터페이스.
 * 
 * Comparator<T> 인터페이스 => 동적으로 정렬방식을 설정시 사용
 * 	- FunctionalInterface, 람다방식으로 사용이 가능함.
 * 	- 추상메서드: int compare(T t1, T t2)
 * 			결과: 음수: t1이 앞, t2가 뒤
 * 				양수: t2가 앞, t1이 뒤
 * 	- 기본정렬방식이 이미 존재하거나, 기본 정렬방식을 설정하지 않은 경우에도 사용 가능
 * 	- 정렬 실행시 동적으로 정렬방식을 설정할 때 사용할 수 있음.
 * 
 * Collections.reverseOrder(): 기본정렬방식의 역순으로 정렬
 * Comparator.reverseOrder(): 기본정렬방식의 역순으로 정렬
 */
class Person implements Comparable<Person>{
	String name;
	int age;
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name + ":" + age;
	}
	@Override
	public int compareTo(Person p) { //기본정렬방식 이름 순으로 지정.
		return name.compareTo(p.name);
	}
}
public class MainEx07_sort {
	public static void main(String[] args) {
		List<Person> list = new ArrayList<>();
		list.add(new Person("홍길동", 30));
		list.add(new Person("이몽룡", 25));
		list.add(new Person("임꺽정", 15));
		list.add(new Person("김삿갓", 20));
		list.add(new Person("김자바", 23));
		System.out.println("데이터 추가 후:");
		System.out.println(list); //[홍길동:30, 이몽룡:25, 임꺽정:15, 김삿갓:20, 김자바:23]
		Collections.sort(list);
		System.out.println("기본 정렬 후: ");
		System.out.println(list); //[김삿갓:20, 김자바:23, 이몽룡:25, 임꺽정:15, 홍길동:30]
		//Collections.sort(list,Comparator.reverseOrder());
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("기본 정렬의 역순: ");
		System.out.println(list); //[홍길동:30, 임꺽정:15, 이몽룡:25, 김자바:23, 김삿갓:20]
		
		Collections.sort(list,(p1,p2)->p1.age - p2.age); //이미 정렬되있는것 다른 기준으로 정렬하고 싶을때 comparator사용.
		//두개를 비교했을 때 음수이면 앞으로 양수면 뒤로간다. 그게 끝날때까지 계속 진행.
		System.out.println("나이 순 정렬: ");
		System.out.println(list); //[임꺽정:15, 김삿갓:20, 김자바:23, 이몽룡:25, 홍길동:30]
		Collections.sort(list,(p1,p2)->p2.age - p1.age);
		System.out.println("나이 역순 정렬: ");
		System.out.println(list);//[홍길동:30, 이몽룡:25, 김자바:23, 김삿갓:20, 임꺽정:15]
	}
}
