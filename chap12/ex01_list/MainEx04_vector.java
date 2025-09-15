package ex01_list;

import java.util.List;
import java.util.Vector;
/*
 * Vector 클래스
 * 	- Collection 프레임워크 이전의 클래스
 * 	- List 구현클래스
 *  - Stack의 상위 클래스
 */
public class MainEx04_vector {

	public static void main(String[] args) {
		Vector<Double>list = new Vector<>(); //백터형태로 참조변수
		//List<Double> list = new Vector<>();
		list.add(0.3);
		list.add(Math.PI);
		list.addElement(5.0); //List<Double> list = new Vector<>();이렇게 바꿨을때 에러이유: 구버전의 메서드
		System.out.println(list); //[0.3, 3.141592653589793, 5.0]
		
		//indexOf: 요소의 위치 찾기
		int index = list.indexOf(5.0);
		System.out.println("5.0의 위치: " + index); //5.0의 위치: 2
		System.out.println("3.0의 위치: " + list.indexOf(3.0)); //3.0의 위치: -1 :없음.
		
		//contains: 요소가 존재?
		if(list.contains(5.0)) {
			System.out.println("5.0은 list의 요소임");
		}else {
			System.out.println("5.0은 list의 요소가 아님");
		} //5.0은 list의 요소임
		
		//removeObj, remove, removeElement: 요소 제거
		/*
		 * Object(생략가능:기본적으로되어있음안써도됨) remove(int index): index에 해당하는 요소를 제거. 제거된 요소 리턴
		 * int형으로 넣었을 때 첨잦로 들어가고 integer
		 * boolean remove(Object o): o 객체 제거. 제거성공: true, 실패: false => 오버로딩
		 */
		System.out.println("list의 크기: " + list.size()); //list의 크기: 3
		double removeObj = list.remove(0); //0번지의 객체를 제거.
		System.out.println(removeObj + "객체 제거"); //0.3객체 제거
		System.out.println(list); //[3.141592653589793, 5.0]
		
		System.out.println(list.remove(0.3)); //false: 0.3객체가 없어서 지울 수 없어서 false
		System.out.println(list); //[3.141592653589793, 5.0]
		
		list.removeElement(0.3); //에러이유: 구버전의 메서드
		System.out.println(list); //[3.141592653589793, 5.0]
	}

}
