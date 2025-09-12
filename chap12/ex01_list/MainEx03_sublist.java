package ex01_list;

import java.util.ArrayList;
import java.util.List;
//subList(): 부분리스트
public class MainEx03_sublist {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);list.add(3);
		
		//list.sublist(1, 4) : list에서 1번 인덱스부터 (4-1)3번 인덱스까지를 부분리스트로 리턴
		List<Integer> list2 = list.subList(1,  4); //얕은 복사
		System.out.println(list); //[1, 2, 5, 4, 3, 0, 3]
		System.out.println(list2); //[2, 5, 4]
		list2.add(100);
		System.out.println(list); //[1, 2, 5, 4, 100, 3, 0, 3]
		System.out.println(list2); //[2, 5, 4, 100]
		
		//깊은복사 별도의 객체에 만들어져 list와 list3은 다름.
		List<Integer> list3 = new ArrayList<>(list.subList(1, 4));
		System.out.println(list); //[1, 2, 5, 4, 100, 3, 0, 3]
		System.out.println(list3); //[2, 5, 4]
		list3.add(200);
		System.out.println(list); //[1, 2, 5, 4, 100, 3, 0, 3]
		System.out.println(list3); //[2, 5, 4, 200]
		
		//remove(0)
		System.out.println(list.remove(0)); //1=> 0번인덱스의 1이 제거됐다는 뜻. 주의 숫자 0이 지워지는 게 아님.
		//remove(int index)
		//숫자 0을 지우는 법
		Integer n = 0;
		System.out.println(list.remove(n)); //remove(int index)
		System.out.println(list); //[2, 5, 4, 100, 3, 3]
	}

}
