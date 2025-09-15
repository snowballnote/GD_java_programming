package chap12_test0915;
/*
 * 1 ~ 99까지의 정수를 입력받아서 TreeSet에 저장하고, 0 을 입력하면 입력을 종료한다. 
 * 입력된 값을 정렬하여 출력하기.
   1 ~ 99 까지의 숫자가 아닌 경우 TreeSet에 저장하지 말것.
 * 
 * set1 오름차순 정렬되도록 출력.
 * set2 내림차순 정렬되도록 출력하기.
 * 
 *[결과]
1부터 99까지의 숫자를 입력하세요 (종료 : 0)
1 2 5 9 1 100 12 3 2 5 64 123 4 5 0
set1:[1, 2, 3, 4, 5, 9, 12, 64]
set2:[64, 12, 9, 5, 4, 3, 2, 1]
 */

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		//오름차순 정렬(기본)
		Set<Integer> set1 = new TreeSet<>();
		//내림차순 정렬
		Set<Integer> set2 = new TreeSet<>((a, b) -> b - a);
		//1-99사이의 숫자가 아닌 것
		Set<Integer> set3 = new TreeSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 99까지의 숫자를 입력하세요 (종료 : 0)");
		while(true) {
			int num = sc.nextInt();
			if(num == 0) {
				break; //0입력시 종료
			}
			if(num >= 1 && num <= 99) { //1-99사이만 저장
				set1.add(num);
				set2.add(num);
			}else if(num != 0){
				 set3.add(num);
			}
		}
		System.out.println("set1: " + set1); //오름차순
		System.out.println("set2: " + set2); //내림차순
		System.out.println(set3 + "은 1-99사이의 숫자가 아닙니다.");
	}
}
