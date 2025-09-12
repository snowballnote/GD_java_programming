package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainEx02_collections {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);list.add(3); //중복발생시킴.
		System.out.println(list); //[1, 2, 5, 4, 3, 0]
		
		//정렬하기
		Collections.sort(list);
		System.out.println(list); //[0, 1, 2, 3, 4, 5] //[0, 1, 2, 3, 3, 4, 5]
		//내림차순으로 정렬하기
		//Collections.reverseOrder(): 기본정렬방식의 역순으로 정렬
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list); //[5, 4, 3, 2, 1, 0] //[5, 4, 3, 3, 2, 1, 0]
		//요소의 순서를 섞기
		Collections.shuffle(list);
		System.out.println(list); //[4, 5, 2, 1, 3, 0]
		Collections.shuffle(list);
		System.out.println(list); //[4, 2, 3, 0, 1, 5]
	}

}
