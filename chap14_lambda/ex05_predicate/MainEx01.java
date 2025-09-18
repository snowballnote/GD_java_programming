package ex05_predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import ex03_function.Student;

/*
 * Predicate 인터페이스
 * - 매개변수 존재, 리턴타입이 boolean
 * boolean test(T)
 * 
 * 종류
 * Predicate<T> : boolean test<T>
 * IntPredicate : boolean test(int)
 * LongPredicate : boolean test(long)
 * DoublePredicate : boolean test(double)
 */
public class MainEx01 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("홍길동", 70, 85, "경영"),
				new Student("김삿갓", 75, 100, "경영"),
				new Student("이몽룡", 55, 95, "컴공"),
				new Student("임꺽정", 80, 95, "컴공"));
		System.out.println("영어 점수가 60이상인 학생의 영어 평균:" + avg(list,s->s.getEng() >= 60)); //s->s.getEng() >= 60)여기가 predicat값
		System.out.println("경영학과 학생의 영어 평균:" + avg(list,s->s.getMajor().equals("경영")));
		System.out.println("컴공학과 학생의 영어 평균:" + avg(list,s->s.getMajor().equals("컴공")));
	}

	private static double avg(List<Student> list, Predicate<Student> f) {
		int sum = 0, cnt = 0;
		for(Student s : list) {
			if(f.test(s)) {
				sum += s.getEng();
				cnt++;
			}
		}
		return (double)sum/cnt;
	}
}
