package chap05;

import java.util.Scanner;

/*
 * 10진수로 입력받아서 2진수로 변경하기
 */
public class ArrayEx04 {

	public static void main(String[] args) {
		//크기가 32인 int 배열을 준비한다.
		//int 자료형은 32비트(4바이트)이므로,
		//10진수를 2진수로 변환했을 때 최대 32자리까지 표현 가능
		int[] binary = new int[32];
		
		//사용자에게 입력 안내
		System.out.println("10진 정수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //사용자로부터 10진수 입력 받기
		
		//입력 받은 값을 divnum에 복사해서 변환 계산에 사용
		int divnum = num;
		int index = 0; //binary 배열의 인덱스(현재 저장 위치)
		
		/*
		 * 10진수를 2진수로 바꾸는 원리:
		 * - 어떤 수를 2로 나눈 나머지를 기록한다.(0 또는 1)
		 * - 몫을 다시 2로 나눈다.
		 * - 몫이 0이 될 때까지 반복한다.
		 * - 나머지를 역순으로 읽으면 2진수가 된다.
		 */
		while(divnum > 0) {
			binary[index++] = divnum % 2; //2로 나눈 나머지를 배열에 저장
			divnum /= 2; //divnum을 몫으로 갱신(다음 반복에 사용)
		}
		
		//변환된 2진수로 출력
		System.out.print(num + "의 2진수: ");
		//index - 1 위치로부터 0까지 거꾸로 출력해야 올바른 2진수
		for(int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
		System.out.println(); //줄바꿈
	}

}
