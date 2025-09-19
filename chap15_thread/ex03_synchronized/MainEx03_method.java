package ex03_synchronized;
/*
 * 동기화 메서드 방식
 * 1. 메서드를 동기화 영역으로 사용
 * 2. 메서드의 선언부에 synchronized 예약어 사용
 * 3. 동시화 메서드는 공유 객체의 메서드 여야함.
 * 		공유객체: 모든 스레드가 하나의 객체의 메서드를 이용
 * 4. thread safe 하다.
 * 		StringBuffer, StringBuilder
 * 		Vector, ArrayList
 * 		HashTable, HashMap
 * 
 * 동기화 영역: synchronized 예약어 사용. 임계영역=>한계를 준다는 뜻정도.
 * 	1. 동기화 블럭: synchronized{...}
 * 	2. 동기화 메서드: 메서드의 선언부에 synchronized void method()...
 * 	
 */
class PrintThread3 extends Thread{
	Printer prt;
	char ch;
	PrintThread3(Printer prt, char ch) {
		this.prt = prt;
		this.ch = ch;
	}
	public void run() {
		for(int i = 0; i < 20; i++) {
			prt.printChar(ch);
		}
	}
}
class Printer{
	public synchronized void printChar(char ch) { //동기화 메서드
		for(int i = 0; i < 80; i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
}
public class MainEx03_method {
	public static void main(String[] args) {
		Printer prt = new Printer();
		PrintThread3 t1 = new PrintThread3(prt,'A'); //
		PrintThread3 t2 = new PrintThread3(prt,'B');
		PrintThread3 t3 = new PrintThread3(prt,'C');
		t1.start(); t2.start(); t3.start();
	}
}
