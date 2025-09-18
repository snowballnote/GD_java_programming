package ex02_supplier;

import java.util.function.BooleanSupplier;

/*
 * BooleanSupplier를 이용하여 10개의 1~10사이의 임의의 숫자의 합을 계산하여
 * 합이 짝수인지 홀수인지 출력하기
 */
public class Exam01 {

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
