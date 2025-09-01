package chap04;
/*
 * 1~100까지 합을 for, while, do while 계산하여 출력하기
 */
public class Exam03 {

	public static void main(String[] args) {
		int sum = 0, i =1;
		System.out.println("for 구문으로 1~100까지의 합 구하기");
		for(i = 1; i <= 100; i++) {
			sum += i;
		}System.out.println(sum);
		
		System.out.println("while 구문으로 1~100까지의 합 구하기");
		sum = 0;
		i = 1;
		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("do while 구문으로 1~100까지의 합 구하기");
		sum = 0;
		i = 1;
		do{
			sum += i;
			i++;
		} while(i <= 100);
		System.out.println(sum);
		
		System.out.println("for 구문으로 1~100까지의 짝수합 구하기");
		/*
		 for(i = 1; i <= 100; i++) {
		
			if(i % 2 == 0) {
				sum += i;
			}
		}
		 */
		for(i = 2; i <= 100; i = 2) sum += i;
		System.out.println(sum);
		
	}

}
