package chap04;
/*
 * num값의 자리수의 합 출력하기
 */
public class Exam04 {

	public static void main(String[] args) {
		int num = 12345, sum = 0;
		System.out.println("======== while =========");
		int tnum = num;
		while(tnum > 0) { //언제끝날지 모를 때 while문 사용
			sum += tnum % 10; 
			tnum /= 10;
		}

		System.out.println(num + "자리수의 합: " + sum);
		System.out.println("========= for ==========");
		for(tnum = num, sum = 0; tnum > 0; tnum /= 10) {
			sum += tnum % 10;
		}
		System.out.println(num + "자리수의 합: " + sum);
	}

}
