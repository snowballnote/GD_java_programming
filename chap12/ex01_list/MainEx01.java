package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
 * Collection 인터페이스: 여러개의 객체를 저장할 수 있는 기능
 * 하위인터페이스	
 * 	List 인터페이스: 순서 유지. => 인덱스(첨자) 사용가능. get(인덱스)
 * 					가변배열 객체라고도 함
 * 		구현클래스
 * 			ArrayList: 대표적인 List 클래스
 * 			Vector: Collection 프레이미워크 이전에 사용된 클래스
 * 					기존함수와 List인터페이스의 함수가 혼합됨
 * 			LinkedList: Queue 인터페이스의 구현 클래스임.
 * 	Set 인터페이스: 객체 중복 불가
 * 		구현클래스: HashSet, TreeSet, LinkedHashSet
 */
public class MainEx01 {
	public static void main(String[] args) {
		/*
		 * <Integer>: 제네릭(=유전자라는뜻).요소의 자료형을 미리 설정.
		 * 				List객체의 요소는 Integer(객체형)만 가능함. =>int는 불가능
		 * 				자료형이 틀린 객체가 저장시 컴파일 오류 발생
		 * 제네릭 표현이 없으면 기본적으로 Object형임. => warning(경고) 발생
		 * 제네릭에서 사용되는 자료형은 참조자료형이어야함. 기본 자료형 불가.
		 * 기본 자료형은 자동으로 Boxing 되어 Wrapper 클래스의 객체로 저장
		 */
		List<Integer> list = new ArrayList<Integer>();
//		List list = new ArrayList(); //<>이부분 없어도 사용가능하긴함. 그리고 없으면 기본적으로 Object타입으로 설정됨.=> 그래도 써주는게 안정적인 프로그램임.
//		List<Object> list = new ArrayList<Object>(); //Object로 변경하면 실수형, 문자형 전부 가능. 아래 에러도 사라짐.
		list.add(1);list.add(2);list.add(5); //실제로 int형이 맞지만 자동으로 Integer가 되는거임.
		list.add(4);list.add(3);list.add(0);
//		list.add("1"); //에러이유: list는 Integer 객체만 저장. String 객체는 저장 불가.
		System.out.println(list); //[1, 2, 5, 4, 3, 0]
		
		//List는 순서유지가 됨. 인덱스 사용 가능
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)); //125430
		}
		System.out.println();
		/*
		 * Collection: 인터페이스. List, Set의 상위 인터페이스
		 * Collections: 클래스. Collection 객체의 보조 기능을 담당.
		 * 						정렬, 섞기 등등
		 */
		//정렬하기
		Collections.sort(list);
		System.out.println(list); //[0, 1, 2, 3, 4, 5]
	}
}
