package ex03_function;

import java.util.function.Function;
import java.util.function.ToIntFunction;

/*
 * Function 계열 인터페이스
 * 	매개변수, 리턴값 모두 존재: applyXXX
 * 
 * 	Function<T,R>: R apply(T)
 * 	BiFunction<T,U,R>: R apply(T,U)
 * 	IntFunction<R>: R apply(int)
 * 	DoubleFunction<R>: R apply(double)
 * 	ToIntFunction<T>: int applyAsInt(T)
 * 	ToDoubleFunction<T>: double applyAsDouble(T)
 * 	...
 */
public class MainEx01 {
	public static Student[] list= {
			new Student("홍길동", 90, 80, "경영"),
			new Student("김삿갓", 95, 70, "컴공"),
			new Student("이몽룡", 85, 75, "통계")
	};
	public static void main(String[] args) {
		System.out.print("학생의 이름: ");
		for(Student s : list)System.out.print(s.getName() + ","); //학생의 이름: 홍길동,김삿갓,이몽룡,
		System.out.println();
		/**/
		System.out.print("학생의 이름: ");
		Function<Student,String> f1 = s->s.getName();
		for(Student s : list)
			System.out.print(f1.apply(s) + ","); //학생의 이름: 홍길동,김삿갓,이몽룡,
		System.out.println();
		/**/
		System.out.print("학생의 이름: ");
		printStudent(s->s.getName()); //학생의 이름: 홍길동,김삿갓,이몽룡,
		System.out.println();
		System.out.print("영어 점수: ");
		printStudent(s->s.getEng() + ""); //Function에 String이여서 (+ "")를 붙여 String 타입으로 변경해줌.//영어 점수: 90,95,85,
		System.out.println();
		System.out.print("수학 점수: ");
		printStudent(s->s.getMath() + ""); //수학 점수: 80,70,75,
		System.out.println();
		System.out.print("전공명: ");
		printStudent(s->s.getMajor() + ""); //전공명: 경영,컴공,통계,
		System.out.println();
		System.out.print("학생명(영어점수): ");
		printStudent(s->s.getName() + "(" + s.getEng() + ")"); //학생명(영어점수): 홍길동(90),김삿갓(95),이몽룡(85),
		System.out.println();
		
		//(+ "")를 붙여 String 타입으로 변경하는거 말고 다른 방법으로 찍는 법
		System.out.print("수학 점수: ");
		printInt(s->s.getMath()); //수학 점수: 80,70,75,
		System.out.println();
	}
	//printInt(s->s.getMath()); 이렇게 표시하기 위한
	private static void printInt(ToIntFunction<Student> f) {
		for(Student s : list) {
			System.out.print(f.applyAsInt(s) + ",");
		}
	}
	
	//printStudent(s->s.getEng() + ""); 이렇게 표시하기 위한
	private static void printStudent(Function<Student,String> f) {
		for(Student s : list) {
			System.out.print(f.apply(s) + ","); //s는 Student타입.
		}

	}
}
