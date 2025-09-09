package chap09_test0908;
/*
 *  LambdaInterface2를 이용하여 1부터 100까지의 임의의 수 10개를
 *  배열에 저장하고, 그중 짝수,홀수를 구분하여 출력하고,
 *  함수 객체에 의해서 짝수의 합 또는 홀수의 합을 출력하는 numSum 메서드를 구현하기
 *  
 *  [결과]
    3,73,83,40,52,45,43,33,26,6,
    홀수 :3,73,83,45,43,33,=280
    짝수 :40,52,26,6,=124
 */

interface LambdaInterface2 {
	boolean method(int a);
}
public class Test03 {
	/*
	static void numSum(LambdaInterface2 f, int[] arr) {
		int sum = 0;
		String rslt = ""; //임의의정수 10개를 출력할 변수
		for(int n : arr) {
			if(f.method(n)) {
				rslt += n + ",";
				sum += n;
			}
		}
		System.out.println(rslt + "=" + sum);
	}
	*/
	private static void numSum(LambdaInterface2 f, int[] arr) {
		int sum = 0;
		for(int a : arr) {
			if(f.method(a)) sum += a;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		int[] arr = new int[10]; //arr: 1~100사이의 임의의 수를 가진 정수 10개 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.print(arr[i] + ",");
		}
		
		System.out.println();
		System.out.print("홀수:");
		numSum(a -> a % 2 != 0, arr); //람다인터페이스2 타입.
		System.out.print("짝수:");
		numSum(a -> a % 2 == 0, arr);
	}
}
