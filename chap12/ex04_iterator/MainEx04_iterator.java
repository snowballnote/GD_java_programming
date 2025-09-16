package ex04_iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * Iterator 인터페이스: 반복자 (읽고, 지우고)
 * Collection.iterator(): Collection 객체를 Iterator 객체로 변환
 * Iterator 인터페이스의 메서드
 * 	- boolean hashNext(): 조회될 요소가 존재?
 * 	- Object next(): 조회 대상 요소 리턴
 * 	- void remove(): 조회된 객체를 제거. 반드시 next() 실행 후 실행가능
 */
public class MainEx04_iterator {

	public static void main(String[] args) {
		Iterator<Object> it = null;
		List<Object> list = new ArrayList<>();
		Set<Object> set = new HashSet<>();
		for(int i = 1; i <= 5; i++) {
			list.add(i + 10);
			set.add(i * 10);
		}
		System.out.println("print() 이전의 list: " + list); //print() 이전의 list: [11, 12, 13, 14, 15] //순서대로 나옴.
		System.out.println("print() 이전의 set: " + set); //print() 이전의 set: [50, 20, 40, 10, 30] : 순서 맘대로 나옴.
		it = list.iterator(); //Iterator 객체 <= List 객체
		print(it);
		it = set.iterator();
		print(it);
		System.out.println("print() 이후의 list: " + list);
		System.out.println("print() 이후의 set: " + set);
	}
	private static void print(Iterator<Object> it) {
		while(it.hasNext()) { //11,12,13,14,15, => list객체
			System.out.print(it.next() + ",");
			it.remove();
		}
		System.out.println();
	}
}
