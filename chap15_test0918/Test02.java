//람다
package chap15_test0918;
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
		BooleanSupplier s = ()-> {
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				int n = (int)(Math.random() * 10) + 1; //1~10임의의 수 리턴
				System.out.print(n + ((i<9)?" + ":" = "));
				sum += n;
			}
			System.out.println(sum);
			return sum % 2 == 0; //boolean이여서 리턴도 불린으로 나오게 찍어야댐.
		};
		System.out.println(s.getAsBoolean()?"짝수":"홀수");
	}
}