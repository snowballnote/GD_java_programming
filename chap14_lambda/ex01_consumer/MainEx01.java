package ex01_consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

//프로젝트: chap14_lambda
/*
 * java API에서 제공되는 함수적 인터페이스
 * - java.util.function 패키지의 인터페이스
 * - 람다를 이용하기 위한 함수적 인터페이스
 * 
 * Consumer 관련 인터페이스
 * 	매개변수는 있고, 리턴값은 없는 메서드
 * 	void accept(매개변수)
 * 
 * 	인터페이스 종류 //특징: 매개변수는 있고 리턴타입은 없음.
 * 	Consumer<T> : void accept(T) //T라는 매개변수
 * 	BiConsumer<T,U> : void accept(T,U)
 * 	IntConsumer: void accept(int)
 * 	LongConsumer: void accept(long)
 * 	DoubleConsumer: void accept(double)
 * 	ObjIntConsumer<T>: void accept(T,int)
 * 	ObjLongConsumer<T>: void accept(T,long)
 * 	ObjDoubleConsumer<T>: void accept(T,double)
 */
public class MainEx01 {

	public static void main(String[] args) {
		Consumer<String> c1 = t->System.out.println(t+8);
		c1.accept("Java"); //Java8
		BiConsumer<String,String> c2 = (t,u)->System.out.println(t+u);
		c2.accept("Java", "8.0"); //Java8.0
		int sum = 0;
		IntConsumer c3 = i->System.out.println(i*100);
		c3.accept(10); //1000

	}

}
