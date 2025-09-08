package chap09_test0908;
/*
 * 
 * LambdaInterface1 인터페이스의 함수 객체와 
 * 인터페이스를 사용한 calc 함수 구현하기
 * [결과]
 * 두수 (5,2)의 합:7
 * 두수 (5,2)의 곱:10
 * arr 배열의 최대값:10
 * arr 배열의 최소값:1
 */
interface LambdaInterface1 {
	int method(int x, int y);
}
public class Test02 {
	static int calc(int x, int y, LambdaInterface1 f) {
		return f.method(x, y);
	}
	public static void main(String[] args) {
		LambdaInterface1 f;
		f=(x,y)-> x+y;	
		System.out.println("두수 (5,2)의 합:" + calc(5,2,f));//7
		f=(x,y)-> x*y;	
		System.out.println("두수 (5,2)의 곱:" + calc(5,2,f));//10
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		f=(x,y)->x>y?x:y;
		int max = arr[0];
		for(int i = 1; i < arr.length; i++) {
			max = calc(max, arr[i], f);
		}
		System.out.println("arr 배열의 최대값:" + max);//10
		f=(x,y)->x<y?x:y;
		int min = arr[0];
		for(int i = 1; i < arr.length; i++) {
			min = calc(min, arr[i], f);
		}
		System.out.println("arr 배열의 최소값:" + min);//1
	}
}