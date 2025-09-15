package chap12_test0915;

import java.util.Random;
import java.util.Set;
import java.util.LinkedHashSet;

/*
다음 결과가 나오도록 프로그램을 작성하시오
 1 ~ 1000번까지의 번호를 가지는 복권이 있다.
 1등 1장, 2등 2장, 3등 3장 을 추첨하는 프로그램 작성하기
  단 추첨은 3등부터 추첨하고, 당첨번호는 중복되면 안된다.
  추첨된 번호는 임의의 수이므로 숫자 값은 실행 할때 마다 다르다.

  LinkedHashSet : 순서유지, 중복불가
  Random
  new ArrayList(Set) : Set 객체를 List객체로 생성
  
  [결과]
3등 복권 추첨합니다.
369,355,699,
2등 복권 추첨합니다.
280,920,
1등 복권 추첨합니다.
839,
*** 복권 추첨 결과 ***
1등:839
2등:920,280,
3등:699,355,369,
===========
1등:[839]
2등:[280, 920]
3등:[355, 369, 699]
 */
public class Test01 {
	public static void main(String[] args) {
		Set<Integer> lotto = new LinkedHashSet<>();
		boolean third = false;
		boolean second = false;
		boolean first = false;
		Random rand = new Random();
		System.out.println("3등 복권 추첨합니다.");
		while(lotto.size() < 3) {
			 third = lotto.add(rand.nextInt(1000) + 1);
		}System.out.println(third);
		System.out.println("2등 복권 추첨합니다.");
		while(lotto.size() < 2) {
			second = lotto.add(rand.nextInt(1000) + 1);
		}System.out.println(second);
		System.out.println("1등 복권 추첨합니다.");
		while(lotto.size() < 1) {
			first = lotto.add(rand.nextInt(1000) + 1);
		}System.out.println(first);
		System.out.println("*** 복권 추첨 결과 ***");
		System.out.println("1등:" + first);
		System.out.println("2등:" + second);
		System.out.println("3등:" + third);
		System.out.println("==========");
		
		
	}
}