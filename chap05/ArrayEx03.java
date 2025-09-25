package chap05;

import java.util.Arrays;

/*
 * 로또 번호 자동 생성 프로그램
 * 
 * 요구사항:
 * 1. 1~45까지의 값을 저장하는 배열 생성
 * 2. 배열의 값을 무작위로 섞기 (shuffle)
 * 3. 섞인 배열에서 앞쪽 6개를 로또 번호로 추출
 * 4. 오름차순 정렬하여 최종 로또 번호 출력
 */
public class ArrayEx03 {

	public static void main(String[] args) {
		//1. 1~45까지의 정수를 저장할 배열 생성
		int[] balls = new int[45]; //크기가 45인 int 배열(로또 공 저장소)
		int[] lotto = new int[6]; //로또 번호 6개를 저장할 배열
		
		//balls 배열에 1~45까지 값 저장
		for(int i = 0; i < balls.length; i++) {
			balls[i] = i + 1; //배열의 각 인덱스에 1부터 45까지 순서대로 저장
								//balls[0]=1, balls[1]=2...balls[44]=45
		}
		
		//2. 배열의 값을 섞기(shuffle 알고리즘: swap활용)
		//Math.random() : 0.0이상 1.0미만의 난수 발생
		//(int)(Math.random() * 45) -> 0 ~ 44 사이의 무작위 인덱스 값 생성
		for(int i = 0; i < 1000; i++) { //충분히 많은 횟수(1000번) 섞어서 랜덤성 확보
			int f = (int)(Math.random() * 45); //무작위 인덱스 f
			int t = (int)(Math.random() * 45); //무작위 인덱스 t
			
			//두 위치의 값을 서로 바꾸기(swap)
			int tmp = balls[f]; //balls[f] 값 임시 저장
			balls[f] = balls[t]; //balls[t] 값을 balls[f]에 덮어
			balls[t] = tmp; //임시 저장한 값을 balls[t]에 넣음
		}
		
		//섞인 배열 전체 확인(디버깅용)
		System.out.println("섞인 balls 배열: " + Arrays.toString(balls));
		
		//3.섞인 배열에서 앞쪽 6개를 로또 번호로 사용
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = balls[i]; //섞인 배열 balls에서 앞 6개 요소를 lotto 배열에 복사
		}
		
		//정렬 전 로또 번호 출력(랜덤 순서 확인용)
		System.out.println("정렬 전 lotto: " + Arrays.toString(lotto));
		
		//4. 추출한 6개 번호를 오름차순으로 정렬
		Arrays.sort(lotto); //작은 값부터 큰 값 순으로 정렬
		
		//최종 로또 번호 출력
		System.out.println("최종 로또 번호: " + Arrays.toString(lotto));
	}

}
