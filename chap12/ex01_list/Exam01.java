package ex01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
/*
 * 화면에서 정수를 입력받아, 입력받은 숫자의 합계, 평균, 중간값 출력하기
 * 999 숫자가 입력되면 반복 종료. 999는 계산에서 제외함.
 * 
 * 합계 : 전체숫자의합
 * 평균: 합계/요소의 갯수
 * 중간값: 
 * 		갯수가 홀수인 경우 정렬하여 가운데 인덱스의 값이 중간값
 * 		객수가 짝수인 경우 정렬해서 가운데 2개값의 평균값.
 */
public class Exam01 {

	public static void main(String[] args) {
		//System.out.print("정수를 입력하세요(종료:999)");
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
		while(true) { //언제끝날지 몰라서 true로
			System.out.print("정수를 입력하세요(종료:999)");
			int num = sc.nextInt();
			
			if(num == 999) break;
			list.add(num); //num이 list로 들어갈떄 자동으로 형변환됨.
		}
		
		int sum = 0;
		for(int n : list) {
			sum += n;
		}
		System.out.println(list + "=>합계: " + sum);
		System.out.println(list + "=>평균: " + (double)(sum/list.size()));
		//중간값;
		Collections.sort(list);
		//1 2 3 => 3/2 => 1 list.get(1) => 중간값
		//1 2 3 4 => 4/2 => 2 (list.get(1) + list.get(2))/2 => 중간값
		int m = list.size() / 2;
		if(list.size() % 2 == 0) {
			System.out.println(list + "=>중간값:" + (list.get(m-1) + list.get(m)) / 2.0);
		}else {
			System.out.println(list + "=>중간값:" + list.get(m));
		}

	}

}
