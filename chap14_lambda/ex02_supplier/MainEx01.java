package ex02_supplier;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/*
 * Supplier 관련 인터페이스
 * 매개변수 없고, 리턴값 존재: T getXXX()
 * 
 * Supplier<T>: T get()
 * IntSupplier: int getAsInt()
 * DoubleSupplier: double getAsDouble()
 * LongSupplier: long getAsLong()
 * BooleanSupplier: Boolean getAsBoolean()
 */
public class MainEx01 {

	public static void main(String[] args) {
		Supplier<String> s1 = ()->"java";
		System.out.println(s1.get()); //java
		IntSupplier s2 = ()->(int)(Math.random() * 6) + 1; //1~6임의의 수 리턴
		System.out.println(s2.getAsInt());
		double[] arr = {1, 1.2, 5.3, 10, 3.5};
		//arr배열의 합
		DoubleSupplier s3 = ()-> {
			double sum = 0;
			for(double d : arr) {
				sum += d;
			}
			return sum;
		};
		System.out.println(s3.getAsDouble()); //21.0
	}

}
