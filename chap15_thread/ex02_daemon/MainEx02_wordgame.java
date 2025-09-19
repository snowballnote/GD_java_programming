package ex02_daemon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class DataAddThread extends Thread{
	List<String> words;
	String[] data; //비티에스 이름각지고 있음
	int interval; //3000
	public DataAddThread(List<String> words, String[] data, int interval) {
		this.words = words;
		this.data = data;
		this.interval = interval;
	}
	public void run() {
		while(true) {
			words.add(data[(int)(Math.random() * data.length)]);
			try {
				sleep(interval); //3초대기
			}catch (InterruptedException e) {}
		}
	}
}
public class MainEx02_wordgame {

	public static void main(String[] args) {
		//삭제: 화면에서 입력을 받아서 사용자가 데이터 삭제
		//입력: DataAddThread객체에서 추가.
		List<String> words = new ArrayList<>(); //삭제 대상 문자열
		//words에 추가될 데이터 목록
		String[] data = {"뷔", "슈가", "제이홉", "알앰", "정국", "지민", "진"};
		int interval = 3 * 1000; //데이터 생성 시간조절
		Scanner sc = new Scanner(System.in);
		words.add(data[0]);
		DataAddThread t1 = new DataAddThread(words, data, interval);
		t1.setDaemon(true); //데몬스레드로 설정
		t1.start(); //3초에 한번씩 BTS이름을 words에 추가 기능 수행
		while(true) {
			System.out.println(words);
			System.out.print(">>");
			String input = sc.next().trim();
			words.remove(input); //words에서 입력된 문자열 삭제
			if(words.size() == 0)break;
		}
		System.out.println("프로그램 종료"); //main 스레드 종료.
	}

}
