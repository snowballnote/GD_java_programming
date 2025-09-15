package ex02_set;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
 * Lotto 번호 생성하기
 * 1. 1~45사이의 임의의 값 중복되지 않는 6개 선택
 * 2. 정렬하여 출력하기
 * 
 * TreeSet클래스 이용하기
 * 
 */
public class Exam02 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>(); //Integer이기떄문에 comparator필요없음
		//이 코드 한 줄로 랜덤 숫자와 정렬까지 알아서 해줌.
		Random rand = new Random();
		while(lotto.size() < 6) {
			lotto.add(rand.nextInt(45) + 1); //1~45사이의 임의의 값
		}
		System.out.println(lotto);
	}
}
