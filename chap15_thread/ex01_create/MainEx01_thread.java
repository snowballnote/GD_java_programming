package ex01_create;
/*
 * Thread 생성
 * 1. Thread 클래스를 상속 <======== MainEx01_thread.java 예제
 * 	- run() 메서드를 오버라이딩함.
 * 2. Runable 인터페이스를 구현하는 방식 <======== MainEx02_runnable.java 예제
 * 	- run 메서드를 오버라이딩함.
 * 
 * Thread 상태(life cycle)
 * 		생성 : new Thread
 * 		 |	sratr()
 * 	--->Runnable
 * 	|	   |	:개게발자의 영역 아님. 스케줄러에서 실행대상이 되는 Thread 선ㄴ택함
 * 대기<---Running
 * 			|
 * 			종료 : reun() 메서드 실행 완료	
 */
class MyThread extends Thread{ //MyThread는 Thread 클래스임
	MyThread(String name){ //생성자
		super(name); //Thread 이름을 설정
	}
	//Thread가 실행 해야할 기능.
	public void run() { //실행중인경우: Running 상태
		for(int i = 1; i <= 5; i++) {
			//getName(): 선언안했는데 에러안나는 이유: 부모(Thread)에 있음.
			System.out.println(i + "=" + getName()); //5번을 화면에 출력.
			try {
				sleep(1000);//static //1000밀리초동안 대기상태 => 1초
			}catch(InterruptedException e) {}
		}
	} //Tread 종료상태
}
public class MainEx01_thread {
	public static void main(String[] argss) {
		System.out.println("main 스레드 시작");
		Thread t1 = new MyThread("First"); //thread 생성 상태.
		Thread t2 = new MyThread("Second"); //thread 생성 상태.
		t1.start(); //Runable 상태. 실행가능상태
		t2.start(); //Runable 상태. 실행가능상태
		/*
		 * start(): 스레드 시작.
		 * 1. 스택영역을 병렬화 시킴
		 * 2. 병렬화된 스택영역에 run() 호출.
		 */
		System.out.println("main 스레드 종료");
	}
}
/*
main 스레드 시작
main 스레드 종료
1=First
1=Second
2=Second
2=First
3=Second
3=First
4=First
4=Second
5=Second
5=First 
 */ //결과가 계속 바뀜. 이유?
