package ex04_waitnotify;
/*
 * 생산자 스레드, 소비자 스레드
 * 
 * mother, son 스레드는 하나의 계좌를 공유한다.
 * 계좌에 잔액이 0이면 son wait 상태
 * 계좌에 잔액이 0보다 크면 mother wait 상태
 * 
 * mother: 1 ~ 3만원 사이의 금액을 계좌에 입금. son 깨움 0 ~ 3초 sleep(랜덤)
 * son: 잔액을 0으로 만들고, mother 스레드 깨움. 0 ~ 1초 sleep
 * 
 * wait(), notify(), notufyAll()
 * 	1. 동기화 영역(동기화 블럭, 동기화 메서드)에서만 실행 가능
 * 		=> 동기화 영역이 아닌 경우 IllegalMonitorStateException 예외발생
 * 	2. Object 멤버임 => 모든 객체들은 호출이 가능함. class Account(스레드아님)가 wait을 쓸 수 있는 이유
 * 	3. wait(): 현재실행중인 스레드를 대기상태로 변경. lock 해제함.
 * 				notify, notifyAll 메서드로만 해제 가능
 * 		notify(): wait()상태인 스레드 한개를 Runnable 상태로 변경
 * 					개발자가 한개의 스레드를 선택불가. 시스템의 선택
 * 		notifyAll(): wait()상태인 스레드 전부를 Runnable 상태로 변경
 */
class Account{ //일반 클래스
	int money;
	synchronized void output() { //동기화메서드. Son스레드호출
		while(money == 0) { //나의 계좌에 0원. => 가져갈 돈 없음 => 엄마가 돈 안넣음
			try {wait(); //기다림.
			}catch(InterruptedException e) {}
		}
		notifyAll(); //wait 상태의 스레드를 깨움. mother 스레드 깨움
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 출금");
		//getName() => 아들이름 나옴.
		money = 0; //출금
	}
	synchronized void input() { //동기화메서드. Mother스레드 호출
		while(money > 0) {
			try {wait();
			}catch(InterruptedException e) {}
		}
		money = ((int)(Math.random() * 3) + 1) * 10000; //머니를 1-30000원사이에 선택
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ":" + money + "원 입금");
		//마더 클래스의 수퍼로 인해 getName이 Mother을 찍음.
	}
}
class Mother extends Thread{
	Account account;
	Mother(Account account){
		super("Mother"); //스레드 이름 설정
		this.account = account;
	}
	public void run() { //엄마스레드의 기능
		for(int i = 0; i < 20; i++) {
			account.input();
			try{
				sleep((int)Math.random() * 3000);//0~2999초 대기. => 랜덤하게 대기.
			}catch(InterruptedException e) {}
		}
	}
}
class Son extends Thread{
	Account account;
	Son(Account account){
		super("Son"); //스레드 이름 설정
		this.account = account;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			account.output(); //돈빼기
			try{
				sleep((int)(Math.random() * 1000)); //0~999밀리초
			}catch(InterruptedException e) {}
		}
	}
}
public class MainEx01 {
	public static void main(String[] args) {
		Account acc = new Account(); //하나의 계좌를 스레드(Mother, Son)가 공유하고 있음=> 공유객체
		Thread m = new Mother(acc);
		Thread s = new Son(acc);
		s.start(); m.start();
	}
}
