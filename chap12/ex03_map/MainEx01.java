package ex03_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Map 인터페이스 구현 객체 => Map객체
 * - (key, value) 쌍인 객체들의 모임
 * - key값은 중복 불가. value는 중복 가능.
 * - 구현클래스
 * 	HashMap		:(key, value(객체))의 쌍인 객체들의 모임
 *  Hashtabale	:(key, value(객체))의 쌍인 객체들의 모임. 이전 클래스
 *  TreeMap		: (key, value(객체))의 쌍이 객체들의 모임. 키값으로 정렬되어 출력
 *  - 주요 메서드 //원하는데로 쓰면됨.
 *  	put(key, value): map에 데이터 추가. 키값이 존재하는 경우 value값을 수정한다.
 *  	get(key): map 객체 중 키값인 value 값 리턴.
 *  	size(): map 객체에 저장된 (key, value)쌍인 객체의 갯수
 *  	Set<key_T> keySet(): map객체 중 key값들만 리턴.
 *  	Collection<Value_T> values(): map 객체 중 value값들만 리턴 //value만 가지고 키값을 조회할 수는 없음
 *  	Set<Map.Entry<Key_T,Value_T>> entrySet(): map객체를 (key,value)쌍인 객체로 리턴
 *  	
 *  	Value_T remove(key): key값의 Map.Entry 객체 제거. value값 리턴
 *  
 *  - Map.Entry<T1,T2>: (key, value)쌍인 객체 자료형. Map인터페이스의 내부인터페이스형
 *  					T1 getKey(): (key, value)쌍인 객체 중 key부분 리턴
 *  					T2 getValue(): (key, value)쌍인 객체 중 value부분 리턴
 * 
 */
public class MainEx01 {

	public static void main(String[] args) {
		String[] names = {"홍길동", "김삿갓", "이몽룡", "임꺽정", "김삿갓"};
		int[] nums = {1234,4567,2350,9870,3456};
		Map<String,Integer> map = new HashMap<>();
		for(int i = 0; i < names.length; i++) {
			map.put(names[i], nums[i]); //put: Map객체에 추가. 쌍인 객체로
		}//{김삿갓=3456, 홍길동=1234, 이몽룡=2350, 임꺽정=9870}
		//김삿갓 중복되어있음. 원래 4567인게 마지막에 3456으로 수정되어 최종적으로 3456으로 출력됨.
		System.out.println("map 객체의 요소의 갯수: " + map.size()); //map 객체의 요소의 갯수: 4
		System.out.println("홍길동의 전화번호: " + map.get("홍길동")); //홍길동의 전화번호: 1234
		System.out.println("map 객체에서 key들만 조회: keySet()" + map.keySet()); //map 객체에서 key들만 조회: keySet()[김삿갓, 홍길동, 이몽룡, 임꺽정]
		System.out.println("map 객체에서 value들만 조회: values()" + map.values()); //map 객체에서 value들만 조회: values()[3456, 1234, 2350, 9870]
		System.out.println("map 객체에서 (key,value)쌍인 객체들 조회: entrySet()" + map.entrySet()); //map 객체에서 (key,value)쌍인 객체들 조회: entrySet()[김삿갓=3456, 홍길동=1234, 이몽룡=2350, 임꺽정=9870]
		System.out.println();
		System.out.println("keySet()으로 조회하기");
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.print(k + "=" + map.get(k) + ","); //keySet()으로 조회하기 김삿갓=3456,홍길동=1234,이몽룡=2350,임꺽정=9870,
		}
		System.out.println();
		System.out.println("values() 조회하기"); //값들만
		Collection<Integer> values = map.values(); //Collection : 순서안맞추고 중복도됨.
		for(Integer v : values) {
			System.out.print(v + ","); //values() 조회하기 3456,1234,2350,9870,
		}
		System.out.println();
		System.out.println("entrySet() 조회하기"); //하나의 객체로
		Set<Map.Entry<String, Integer>> entrys = map.entrySet();
		for(Map.Entry<String, Integer> m : entrys) {
			System.out.print(m.getKey() + "=" + m.getValue() + ",");
		} //entrySet() 조회하기 김삿갓=3456,홍길동=1234,이몽룡=2350,임꺽정=9870,
		System.out.println();
		System.out.println("홍길동 객체 제거");
		System.out.println("제거된 전화번호: " + map.remove("홍길동"));
		System.out.println("map 객체의 요소의 갯수: " + map.size());
		System.out.println(map);
		/*
		 * 홍길동 객체 제거
			제거된 전화번호: 1234
			map 객체의 요소의 갯수: 3
			{김삿갓=3456, 이몽룡=2350, 임꺽정=9870}
		 */
	}
}
