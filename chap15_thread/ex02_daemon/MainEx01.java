package ex02_daemon;
/*
 * Daemon 스레드 예제
 * 1. 일반 스레드의 보조 기능을 담당
 * 2. 일반 스레드가 종료되면 데몬 스레드도 자동 종료됨
 * 3. 가비지콜렉터 대표적인 데몬스레드임
 * 4. 주로 무한 반복 형태로 구현함
 * 5. setDaemon(true) 데몬스레드로 설정함=> 생성상태에서 설정해야함.
 * 
 * FTP: 파일 전송 전문. FTPD: FTP서버.(D:Daemon)
 */
class DaemonThread extends Thread {
	public void run() {
		while(true) {
			System.out.println(this);
			/* Thread.toString
			 * Thread[#21,Thread-0,5,main]
			 * 	#21: 스레드번호
			 * 	Thread-0: 스레드 이름. 스레드 이름을 지정하지 않으면 자동으로 이름 부여 //0:t1, 1:t2의 이름
			 * 	5: 우선순위. 1(낮음) ~ 10(높음), 5: 기본우선순위
			 * 	main: 스레드 그룹의 이름
			 */
			try {
				sleep(100); //0.1초씩 쉬면서 toString호출
			}catch(InterruptedException e) {}
		}
	}
}
public class MainEx01 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("main 스레드 시작");
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true); //t1 스레드를 데몬스레드로 설정. 생성상태에서 설정
		t2.setDaemon(true); //t2 스레드를 데몬스레드로 설정
		t1.start(); t2.start(); //Thread의 시작 => Runnable
		Thread.sleep(2000);
		System.out.println("main 스레드 종료"); //데몬스레드도 종료발생 Daemon에서 break안하는 이유
	}

}
