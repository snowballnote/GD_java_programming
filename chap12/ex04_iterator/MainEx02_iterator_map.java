package ex04_iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*
 * Map 객체는 직접 Iterator 객체 변환 불가
 * Map.keySet()
 * Map.values()
 * Map.entrySet() 함수를 이용하여 Iterator 객체로 변환이 가능함.
 */
public class MainEx02_iterator_map {

	public static void main(String[] args) {
		Map<Object, Object> map = new HashMap<>();
		map.put(101, "홍길동");
		map.put(102, "김삿갓");
		map.put(103, "이몽룡");
		map.put(104, "임꺽정");
		Iterator<Object> it = map.keySet().iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o + ":" + map.get(o)); //101:홍길동102:김삿갓103:이몽룡104:임꺽정
		}
		it = map.values().iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //홍길동김삿갓이몽룡임꺽정
		}
		Iterator<Map.Entry<Object, Object>> it2 = map.entrySet().iterator();
		while(it2.hasNext()) {
			Map.Entry<Object, Object> e = it2.next();
			System.out.println(e.getKey() + ":" + e.getValue()); //101:홍길동102:김삿갓103:이몽룡104:임꺽정
		}
	}
}