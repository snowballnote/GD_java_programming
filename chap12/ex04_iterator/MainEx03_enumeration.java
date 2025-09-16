package ex04_iterator;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

/*
 * Enumeration 인터페이스: Iterator 의 구버전
 * 						vector와 hashtable에서만 사용이 가능한 반복자
 * 	메서드
 * 		hasMoreElementd(): 조회될 객체 존재?
 * 		nextElement(): 객체 조회하여 리턴
 */
public class MainEx03_enumeration {
	public static void main(String[] args) {
		Vector<Object> vec = new Vector<>();
//		List<Object> vec = new Vector<>();
		vec.add("사과");
		vec.add("바나나");
		vec.add("체리");
		vec.add("망고");
		Iterator<Object> it = vec.iterator(); //List 객체이므로 Iterator객체 변환 가능
		Enumeration<Object> e = vec.elements(); //구버전의 반복자
		while(e.hasMoreElements()){
			System.out.println(e.nextElement()); //사과바나나체리망고
		}
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1,  "사과");
		map.put(2,  "바나나");
		map.put(3,  "체리");
		map.put(4,  "망고");
		Enumeration<Integer> e2 = map.keys(); //키값들만 조회 정렬되는건 아님.
		while(e2.hasMoreElements()) System.out.println(e2.nextElement()); //4321
		Enumeration<String> e3 = map.elements(); //value들만 조회
		while(e3.hasMoreElements()) System.out.println(e3.nextElement()); //망고체리바나나사과
	}
}
