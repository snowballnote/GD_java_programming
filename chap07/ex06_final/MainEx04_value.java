package ex06_final;

import java.util.Arrays;
/*
 * final 참조변수
 */
public class MainEx04_value {
	public static void main(String[] args) {
		final int[] arr = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(arr));
		arr[0] = 100;
		arr[1] = 200;
		System.out.println(Arrays.toString(arr));
//		arr = new int[] {100, 200, 300};
	}
}
