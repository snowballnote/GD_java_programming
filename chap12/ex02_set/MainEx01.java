package ex02_set;

import java.net.MulticastSocket;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/*
 * Set 인터페이스
 * 	- Collection 인터페이스의 하위 인터페이스
 * 	- 중복 객체를 저장 안함
 *  - 주요 메서드
 *  	boolean add(object): 객체 추가
 *  						true 리턴: 객체 추가 성공
 *  						False 리턴 : 객체 추가 실패
 *  	- 인덱스로 객체 조회안됨. get(index) 함수 없음
 *  	- 구현 클래스
 *  		HashSet: 		중복불가. 순서모름
 *  		TreeSet: 		중복불가. 정렬됨. => 순서 예측 가능
 *  		LinkedHsahSet: 	중복불가. 순서유지.
 */
public class MainEx01 {

	public static void main(String[] args) {
		Object[] arr = {"홍길동",1,"1","김삿갓","이몽룡","홍길동","성춘향","향단이","홍길동","김삿갓"};
		//Set<Object> set1 = new HashSet<>(); //[성춘향, 1, 1, 김삿갓, 홍길동, 향단이, 이몽룡]
		Set<Object> set1 = new LinkedHashSet<>(); //[홍길동, 1, 1, 김삿갓, 이몽룡, 성춘향, 향단이]
		Set<Object> set2 = new HashSet<>();
		Set<Object> set3 = new HashSet<>();
		for(int i = 0; i < arr.length; i++) {
			if(!set1.add(arr[i])) {
				if(!set2.add(arr[i])) {
					set3.add(arr[i]);
				}
			}
		}
		System.out.println(set1);
		System.out.println(set2); //[김삿갓, 홍길동]
		System.out.println(set3); //[홍길동]
		//System.out.println(set1.get(0)); //인덱스 이용 불가
		//개선된 for구문으로 조회가능
		for(Object o : set1) System.out.print(o); //홍길동11김삿갓이몽룡성춘향향단이
		System.out.println();
		for(Object o : set2) System.out.print(o); //김삿갓홍길동
		System.out.println();
		for(Object o : set3) System.out.print(o); //홍길동
		System.out.println();
	}

}
