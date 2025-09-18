package chap05;

import java.util.Arrays;

/*
 * 로또 번호 자동 생성 프로그램
 * 
 * 요구사항:
 * 1. 1 ~ 45까지의 값을 저장하는 배열 생성
 * 2. 배열의 값을 무작위로 섞기 (shuffle)
 * 3. 섞인 배열에서 앞쪽 6개를 로또 번호로 추출
 * 4. 오름차순 정렬하여 최종 로또 번호 출력
 */
public class ArrayEx03 {
	public static void main(String[] args) {
		// 1. 1~45까지의 정수를 저장할 배열 생성
		int[] balls = new int[45]; // 크기가 45인 int 배열
		int[] lotto = new int[6];  // 로또 번호 6개를 저장할 배열
		
		// balls 배열에 1~45까지 값 저장
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1; // 0번째는 1, 1번째는 2, ... 44번째는 45
		}
		
		// 2. 배열의 값을 섞기 (shuffle 알고리즘: swap 활용)
		//    Math.random() : 0.0 이상 1.0 미만의 난수 발생
		//    (int)(Math.random() * 45) → 0 ~ 44 사이의 난수 발생
		for(int i = 0; i < 1000; i++) { // 충분히 많은 횟수(1000번) 섞기
			int f = (int)(Math.random() * 45); // 무작위 인덱스1
			int t = (int)(Math.random() * 45); // 무작위 인덱스2
			
			// 두 위치의 값을 서로 바꾸기 (swap)
			int tmp = balls[f];   
			balls[f] = balls[t];
			balls[t] = tmp;
		}
		
		// 섞인 배열 전체 확인 (디버깅용)
		System.out.println("섞인 balls 배열: " + Arrays.toString(balls));
		
		// 3. 섞인 배열에서 앞쪽 6개를 로또 번호로 사용
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i];
		}
		
		// 정렬 전 로또 번호 출력
		System.out.println("정렬 전 lotto: " + Arrays.toString(lotto));
		
		// 4. 추출한 6개 번호를 오름차순으로 정렬
		Arrays.sort(lotto); 
		
		// 최종 로또 번호 출력
		System.out.println("최종 로또 번호: " + Arrays.toString(lotto));
	}
}