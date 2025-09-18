package ex01_consumer;

import java.util.function.IntConsumer;

/*
 * IntConsumer를 이용해서 매개변수로 입력받은 숫자까지의 합을 구하는 람다식을 구현
 */
public class Exam01 {

	public static void main(String[] args) {
		IntConsumer c = a->{
			int sum = 0;
			for(int i = 1; i <= a; i++) sum += i;
			System.out.println(sum);
		};
		c.accept(10); //55
		c.accept(100); //5050
		c.accept(1000); //500500

	}

}
