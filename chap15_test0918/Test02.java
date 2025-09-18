//람다
package chap15_test0918;
import java.util.Random;
import java.util.function.BooleanSupplier;
import java.util.function.IntBinaryOperator;
import java.util.function.IntPredicate;

/*
 * 1에서 100까지의 임의의 수 10를 저장한 배열에서
 * IntBinaryOperator 인터페이스와 IntPredicate 인터페이스를 이용하여
 * 배열에 저장된 짝수,홀수별 최대 숫자와 최소 숫자를 출력하기
 */
public class Test02 {
	private static int[] arr = new int[10];
	public static void main(String[] args) {
		Random r = new Random();
		for(int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100) + i;
		}
		
		System.out.println("랜덤 배열: ");
		
	}
}
