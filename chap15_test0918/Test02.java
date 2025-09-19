//람다
package chap15_test0918;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * 1에서 100까지의 임의의 수 10개를 저장한 배열 arr에서
 * IntBinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용하여
 * 배열에 저장된 짝수,홀수별 최대 숫자와 최소 숫자를 출력하기
 */
public class Test02 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		//1~100사이의 임의의 수 10개를 arr배열에 저장
		for(int i=0; i<arr.length; i++) {
			arr[i]= (int)(Math.random()*100)+1;
 		    System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("홀수 최대값:"
		+maxOrMin((a,b)->(a>=b)?a:b,a->a%2!=0));
		System.out.println("짝수 최대값:"
		+maxOrMin((a,b)->(a>=b)?a:b,a->a%2==0));
		System.out.println("홀수 최소값:"
		+maxOrMin((a,b)->(a<=b)?a:b,a->a%2!=0));
		System.out.println("짝수 최소값:"
		+maxOrMin((a,b)->(a<=b)?a:b,a->a%2==0));
		System.out.println("최대값:"
		+maxOrMin((a,b)->(a>=b)?a:b,a->true));
		System.out.println("최소값:"
		+maxOrMin((a,b)->(a<=b)?a:b,a->true));
	}
	private static int maxOrMin
	(IntBinaryOperator op, IntPredicate p) {
		int result = 0; //첫번째가 홀수 or 짝수 일수 있어서 arr[0]은 안됨.
		for(int a : arr) {
			if (p.test(a)) //짝수 또는 홀수
				if(result == 0) result = a; //첫번째 홀수
				else result = op.applyAsInt(result, a);
		}
		return result;
	}
}