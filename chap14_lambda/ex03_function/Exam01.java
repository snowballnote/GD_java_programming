package ex03_function;

import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/*
 * list 배열에서 영어점수 합계, 수학 점수 합계를 출력하는 printTot함수 구현하기
 */
public class Exam01 {
	public static Student[] list= {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	
	public static void main(String[] args) {
		//방법1
		System.out.print("학생들의 영어 점수 합계: ");
		printTot(s->s.getEng());
		System.out.print("학생들의 수학 점수 합계: ");
		printTot(s->s.getMath());
		//방법2
		System.out.println("학생들의 영어 점수 합계: " + getTot(s->s.getEng()));
		System.out.println("학생들의 수학 점수 합계: " + getTot(s->s.getMath()));
		System.out.println("학생들의 영어 점수 평균: " + getAvg(s->s.getEng())); //학생들의 영어 점수 평균: 90.0
		System.out.println("학생들의 수학 점수 평균: " + getAvg(s->s.getMath())); //학생들의 수학 점수 평균: 75.0
	}
//방법2
	private static double getAvg(ToDoubleFunction<Student> f) {
		double sum = 0;
		for(Student s : list) {
			sum += f.applyAsDouble(s);
		}
		return (double)(sum / list.length);
	}
//방법2
	private static int getTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			sum += f.applyAsInt(s);
		}
		return sum;
	}
//방법1
	private static void printTot(ToIntFunction<Student> f) {
		int sum = 0;
		for(Student s : list) {
			//System.out.print(f.applyAsInt(s) + "+");
			sum += f.applyAsInt(s);
		}
		System.out.println(sum);
		
	}

}
