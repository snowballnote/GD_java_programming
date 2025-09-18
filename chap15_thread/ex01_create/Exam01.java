package ex01_create;

import java.util.function.IntBinaryOperator;

/*
 * Runnable 인터페이스는 run() 추상메서드를 한개만 가지고 있는 인터페이스이므로,
 * 람다 방식을 이용할 수 있음.
 * 람다 방식을 이용하여 MainEx02_runnable 클래스와 같은 결과가 나오도록 구현하기
 */
public class Exam01 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable r = ()->{
			for(int i = 1; i <= 5; i++) {
				System.out.println(i + "=" + Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {}	
			} 
		};
		Thread t1 = new Thread(r, "First"); //생성상태
		Thread t2 = new Thread(r, "Second"); //생성상태
		t1.start(); t2.start();
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}
