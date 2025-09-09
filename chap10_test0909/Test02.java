package chap10_test0909;
import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;
/*
 * 숫자 맞추기 게임
 * 시스템이 4자리의 서로 다른 수를 저장한 후 사용자가 저장된 수를 맞추는 게임
 *    자리수도 맞는 경우 : 스트라익
 *    자리수는 틀리지만 숫자가 존재하면 : 볼
 *  4스트라익이 되면 정답

 *  NumberInputException을 이용하여 다음의 예외 처리를 할것  
 *  4자리 수가 아닌 경우는 4자리 숫자를 입력하세요. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨 
 *  중복된 숫자가 입력된 경우 중복된 숫자가 입력되었습니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *  InputMismetchException을 이용하여 예외처리
 *  만약 숫자 아닌 값이 입력되면 숫자만 가능합니다. 를 출력하고 다시 입력을 받기. 입력숫자에는 포함됨
 *    
 *  [결과]
서로다른 4자리 정수를 입력하세요
1234
1234:0스트라이크, 1볼
서로다른 4자리 정수를 입력하세요
5678
5678:2스트라이크, 0볼
서로다른 4자리 정수를 입력하세요
2679
2679정답입니다.
3번 만에 맞추셨습니다. 게임을 종료합니다.
 */
public class Test02 {

	public static void main(String[] args) {
		//게임구현
		int strikeCnt = 0; //숫자와 자릿수 둘다 맞으면 스트라이크
		int ballCnt = 0; //자리수는 틀리지만 숫자가 존재하면 볼
		while(true) {
			//com의 4자리 숫자 저장
			int[] num = new int[9]; //9개의 정수값을 저장할 수 있는 num
			int[] com = new int[4]; //컴퓨터에서 생성되는 4개의 랜덤값 저장.
			
			//1~9까지의 값을 저장
			for(int i = 0; i < num.length; i++) {
				num[i] = i + 1;
			}
			//배열의 값을 섞기. swap알고리즘
			for(int i = 0; i < 1000; i++) {
				int f = (int)(Math.random() * 9);
				int t = (int)(Math.random() * 9);
				int tmp = num[f];
				num[f] = num[t];
				num[t] = tmp;
			}
			//System.out.println(Arrays.toString(num)); //섞은 배열 9개
			//num 배열에 0~3번까지의 요소 저장
			for(int i = 0; i < com.length; i++) {
				com[i] = num[i];
			}
			//Arrays.sort(com); //com번호 4개 오름차순으로 정렬
			//System.out.println(Arrays.toString(com));
			Arrays.sort(com); //com번호 4개 오름차순으로 정렬
			System.out.println(Arrays.toString(com));
			
			System.out.println("서로다른 4자리 정수를 입력하세요: ");
			Scanner sc = new Scanner(System.in);
			int[] user = new int[4];
			//int i;
			for(int i : user) {
				user[i] = sc.nextInt();
				if(user[i] == com[i]) {
					strikeCnt++;
				}
				System.out.print(user [i]+ ":" + strikeCnt + "스트라이크");
				//System.out.println(strikeCnt + "스트라이크");
			}
			

	}
}}