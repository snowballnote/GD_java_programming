package ex03_map;

import java.net.MulticastSocket;
import java.util.Collection;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
 * 1. 대한민국: 서울, 캐나다: 오타와, 영국: 런던을 저장하는 HashMap객체 생성하기
 * 2. 화면에서 나라이름을 입력받아 수도 출력하기
 * 		등록된 나라가 아니면 "수도가 등록되지 않은 나라입니다."메세지 출력
 * 		종료가 입력될때 까지 계속 입력받기
 * 3. 프로그램 종료전에 등록된 내용 조회하기
 * 	1) 등록된 나라들 조회하기
 * 	2) 등록된 수도들 조회하기
 * 	3) 등록된 나라:수도 조회하기
 * 4. 등록된 나라가 아닌 경우 수도를 입력받아 map 객체에 추가하기
 */
public class Exam01 {

	public static void main(String[] args) {
		//1.
			Map<String,String> map = new HashMap<>();
			map.put("대한민국", "서울");
			map.put("캐나다", "오타와");
			map.put("영국", "런던");
		//2.
			Scanner sc = new Scanner(System.in);
			while(true) {
				System.out.println("나라이름을 입력하세요(종료:종료)");
				String nat = sc.next();
				if(nat.equals("종료")) break;
				String cap = map.get(nat);
				if(cap == null) {
					System.out.println(nat + " 수도가 등록되지 않은 나라입니다.");
					System.out.println(nat + "의 수도를 등록하기셌습니까?");
					String yn = sc.next();
					if(yn.equalsIgnoreCase("Y")) {
						System.out.println(nat + "의 수도를 입력하세요");
						cap = sc.next();
						map.put(nat, cap);
					}
				}else {
					System.out.println(nat + "의 수도: " + cap);
				}
			}
		//3.
			System.out.println("등록된 나라들: " + map.keySet());
			System.out.println("등록된 수도들: " + map.values());
			System.out.println("등록된 정보: " + map.entrySet());
	}

}
