package ex02_set;

import java.util.Set;
import java.util.TreeSet;
/*
 * TreeSet에 사용자 객체 추가하기
 * 1. Comparable 인터페이스를 구현하지 않은 클래스의 객체 추가시 ClassCaseException 예외발생
 * 	=> new TreeSet<T>() => T클래스에 Comparable 인터페이스 구현 필요
 * 2. Comparator 인터페이스의 객체를 이용 => Comparable인터페이스와는 상관없음
 * 	=> new TreeSet<T>(Comparator객체) 방식
 */
class Data implements Comparable<Data>{
	int value;
	Data(int value){
		this.value = value;
	}
	public String toString() {
		return value + "";
	}
	@Override
	public int compareTo(Data d) {
		return this.value - d.value;
	} //[1, 2, 3, 4, 5]
}
class Data2{ //내클래스가 아니여서 마음대로 바꿀수없음 그럼 어떻게 정렬할까
	int value;
	Data2(int value){
		this.value = value;
	}
	public String toString() {
		return value + "";
	}

}
public class MainEx04_treeset {

	public static void main(String[] args) {
		Set<Data> set = new TreeSet<>();
		set.add(new Data(5)); set.add(new Data(4));
		set.add(new Data(1)); set.add(new Data(2));
		set.add(new Data(3));
		System.out.println(set);
		
		Set<Data2> set2 = new TreeSet<>((d1,d2)->d1.value - d2.value); //[1, 2, 3, 4, 5]
		set2.add(new Data2(5)); set2.add(new Data2(4));
		set2.add(new Data2(1)); set2.add(new Data2(2));
		set2.add(new Data2(3));
		System.out.println(set2); 
	}
}
