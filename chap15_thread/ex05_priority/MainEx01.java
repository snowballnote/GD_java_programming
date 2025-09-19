package ex05_priority;
/*
 * 스레드의 우선순위
 * setPriority()
 */
class ThreadPriority extends Thread{
	ThreadPriority(String name){
		this(name, Thread.NORM_PRIORITY);
	}
	ThreadPriority(String name, int p){
		super(name);
		this.setPriority(p);
	}
	public void run() {
		try {
			sleep(200);
		}catch(InterruptedException e) {}
		for(int i = 0; i < 5; i++) {
			System.out.println(this.toString());
		}
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Thread t1 = new ThreadPriority("First", Thread.MIN_PRIORITY);
		Thread t2 = new ThreadPriority("Second");
		Thread t3 = new ThreadPriority("Third", Thread.MAX_PRIORITY);
		t1.start(); t2.start(); t3.start();
	}
}
