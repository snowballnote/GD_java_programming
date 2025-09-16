package chap04_test0827;
/*
 * 1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합을 구하기 
 */
public class Test07 {
	public static void main(String[] args) {
		int total = 0;
		for(int i = 1; i <= 100; i++) {
			if(i % 2 == 0 || i % 3 == 0) {
				total += i;
			}
		}
		System.out.println("1부터 100까지의 숫자 중 2의 배수이거나, 3의 배수의 합 " + total);
		/*
		 * System.out.println("for 구문 =======");
		for(int i=1;i<=100;i++) {
			if(i%2==0 || i%3==0) sum += i;
		}
		System.out.println(sum);
		
		System.out.println("while 구문 ======");
		int i = 1;
		sum = 0;
		while(i<=100) {
			if(i%2==0 || i%3==0) sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("do while 구문 =======");
		i = 1;
		sum = 0;
		do {
			if(i%2==0 || i%3==0) sum += i;
			i++;
		}while(i<=100);
		System.out.println(sum);
		 */
	}
}