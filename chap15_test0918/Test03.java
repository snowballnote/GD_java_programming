package chap15_test0918;
/*
1. SumThread 구현하기
1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Thread 클래스를 상속받는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합

main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기 
*/

public class Test03 {
	public static void main(String[] args) {
		SumThread[] arr = new SumThread[5];
		for(int i=0;i<arr.length;i++) {
			arr[i] = new SumThread(i*200+1, (i+1)*200);
			arr[i].start();
		}
		int sum = 0;
		for(SumThread t : arr) {
			try {
				t.join();
				sum += t.sum;
			} catch (InterruptedException e) {}
		}
		System.out.println("1 ~ 1000까지의 합:" + sum);
	}
}