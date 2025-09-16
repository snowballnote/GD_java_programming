package chap05;

import java.util.Scanner;
/*
 * 정수값 5개 입력받아서 입력받은 수의 합계, 평균, 최대값, 최소값, 최대값의 인덱스, 최소값의 인덱스를 출력하기
 */
public class Exam01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		//int[] arr = {10, 20, 30, 40, 50};
		int sum = 0, maxidx = 0, minidx = 0;
		System.out.println("정수를 5개 입력하세요: ");
		for(int i : arr) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[maxidx] < arr[i]) {
				maxidx = i;
			}
			if(arr[minidx] > arr[i]) {
				minidx = i;
			}
			
		}
		/*for(int i = 0; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(arr[maxidx] < arr[i]) {
				maxidx = i;
			}
			if(arr[minidx] > arr[i]) {
				minidx = i;
			}
		}
		*/
		
		
		System.out.println("합계: " + sum);
		System.out.println("평균: " + (double)sum/arr.length);
		System.out.println("최대값: " + arr[maxidx]);
		System.out.println("최소값: " + arr[minidx]);
		System.out.println("최대값 인덱스: " + maxidx);
		System.out.println("최소값 인덱스: " + minidx);

	}

}
