package chap15_test0918;
/*
1. 
1부터 1000까지의 합을 5개의 스레드가 나누어 합을 구하기 : Thread 클래스를 상속받는 방식으로 구현하기
t1 : 1 ~ 200까지 합
t2 : 201 ~400까지 합
t3 : 401 ~ 600까지 합
t4 : 601 ~ 800까지 합
t5 : 801 ~ 1000까지 합

main 스레드 : 모든 스레드가 종료할때 까지 기다렸다가 
모든 스레드의 합을 더해서 1 ~ 1000까지의 합 출력하는 프로그램 구현하기 
*/

class SumThread extends Thread { //Thread 클래스를 상속받아 Thread 구현하기
	int firstNum,lastNum;
	int sum;
	SumThread(int firstNum,int lastNum) {
		this.firstNum = firstNum;
		this.lastNum = lastNum;
	}
	@Override
	public void run() {
		for(int i=firstNum;i <= lastNum;i++) {
			sum += i;
		}
	}
}
public class Test03 {
	public static void main(String[] args) {
		SumThread[] arr = new SumThread[5]; //arr[0] : 참조변수
		for(int i=0;i<arr.length;i++) {
			/*
			 * i=0 : new SumThread(1, 200)
			 * i=1 : new SumThread(201, 400)
			 */
			arr[i] = new SumThread(i*200+1, (i+1)*200); //SumThread 객체 생성
			arr[i].start();
		}
		int sum = 0;
		for(SumThread t : arr) {
			try {
				t.join();
				sum += t.sum;
			} catch (InterruptedException e) {}
		}
		System.out.println("1 ~ 1000까지의 합: " + sum);
	}
}