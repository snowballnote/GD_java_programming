package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * List 정렬하기
 * - Collections.sort(List) : List의 요소를 정렬해준다.
 * 								List 요소가 Comparable 객체인 경우만 정렬이 가능. =>Comparable은 인터페이스임.
 * 정렬관련 인터페이스
 * Comparable<T>
 * 	추상메서드: int compareTo(T t)
 * 		음수: 현재객체가 t라는 객체 보다 앞
 * 		양수: 현재객체가 t라는 객체 보다 뒤
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value = value;
	}
	public String toString() {
		return value + "";
	}
	public int compareTo(Data d) {
		return value - d.value;
	}
}
public class MainEx05_sort {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a"); list1.add("c"); list1.add("d");
		list1.add("b"); list1.add("f");
		System.out.println(list1); //[a, c, d, b, f]
		Collections.sort(list1); //오름차순 정렬
		System.out.println(list1); //[a, b, c, d, f]
		
		//내림차순 정렬
		Collections.sort(list1, Collections.reverseOrder());
		System.out.println(list1); //[f, d, c, b, a]
		List<Data> list2 = new ArrayList<>();
		list2.add(new Data(1)); list2.add(new Data(3)); list2.add(new Data(5));
		list2.add(new Data(2)); list2.add(new Data(4));
		System.out.println(list2); //[1, 3, 5, 2, 4]
		Collections.sort(list2);
		System.out.println(list2); //[1, 2, 3, 4, 5]
		Collections.sort(list2, Collections.reverseOrder()); //내림차순 정렬
		System.out.println(list2); //[5, 4, 3, 2, 1]
	}

}
