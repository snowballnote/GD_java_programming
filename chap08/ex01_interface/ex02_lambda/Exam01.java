package ex02_lambda;
/*
 * LambdaInterface2 인터페이스를 이용하여 입력된 값까지의 합을 구하는 
 * 프로그램을 람다 방식으로 구현하기
 */
public class Exam01 {
	public static void main(String[] args) {
		LambdaInterface2 f = null;
		f = n->{
			int sum = 0;
			for(int i=1;i<=n;i++) sum += i;
			System.out.println("1 ~" + n+"까지의 합:" + sum);
		};
		f.method(10);
		f.method(100);
		total(f,5);
		//n! 출력하기
		total(n->{
			int factorial = 1;
			for(int i=n;i>=1;i--) factorial *= i;
			System.out.println(n + "!=" + factorial);
		},4);
	}
	static void total(LambdaInterface2 f,int n) {
		f.method(n);
	}
}