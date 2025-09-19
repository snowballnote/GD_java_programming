package ex03_synchronized;
/*
 * 동기화 블럭
 * 1. synchronized 예약어 사용
 * 2. lock은 객체만 가능함. 기본형은 lock으로 사용 불가
 * 3. lock 객체는 유일한 객체여야 함 => 동기화 효과가 있음
 */
class PrintThread2 extends Thread{
	char ch;
	static Object lock = new Object(); //static 없으면 안됨.
//	static int lock = 0; //기본형은 lock으로 사용 불가
	PrintThread2(char ch){
		this.ch = ch;
	}
	public void run() { //t1.run
		for(int i = 0; i < 20; i++){ //i:0
			synchronized(lock){ //동기화블럭 lock:t2
				for(int j = 0; j < 80; j++) {
					System.out.print(ch); //20
				}
				System.out.println();
			}
		}
	}
}
public class MainEx02_synchronized {

	public static void main(String[] args) {
		PrintThread2 t1 = new PrintThread2('A'); //대기
		PrintThread2 t2 = new PrintThread2('B'); //r
		PrintThread2 t3 = new PrintThread2('C'); //대기
		t1.start(); t2.start(); t3.start();
	}

}
