package ex01_create;
/*
 * Runnable 인터페이스를 이용하여 Thread 생성하기
 * 	=> Runnable 인터페이스의 구현객체는 Thread 객체가 아님
 * 	=> Runnable 인터페이스의 구현객체는 run() 추상메서드를 오버라이딩함.
 * 	=> Thread 생성: new Thread(Runable객체)
 */
class MyRunnable implements Runnable{
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			//Thread.currentThread(): 현재 실행 중인 Thread객체 리턴
			System.out.println(i + "=" + Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //static임.
			}catch(InterruptedException e) {}
		}
	} //run 메서드 실행 종료. 종료상태
}
public class MainEx02_runnable {
	public static void main(String[] args) {
		//main도 thread임
		System.out.println(Thread.currentThread().getName() + "스레드 시작");
		Runnable r = new MyRunnable(); //생성상태아님
		Thread t1 = new Thread(r, "First"); //생성상태
		Thread t2 = new Thread(r, "Second"); //생성상태
		t1.start(); t2.start();
		/*
		 * start메서드 기능
		 * 1. 스택 영역을 병렬화 시킴
		 * 2. r 객체의 run() 호출
		 * 
		 */
		System.out.println(Thread.currentThread().getName() + "스레드 종료");
	}
}
