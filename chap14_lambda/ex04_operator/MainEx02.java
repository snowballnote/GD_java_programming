package ex04_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

import ex03_function.Student;

public class MainEx02 {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("홍길동", 90, 70, "경영"),
				new Student("김삿갓", 80, 75, "컴공"),
				new Student("이몽룡", 85, 60, "통계"));
		System.out.println("영어점수 최고점:" + minOrMax(list, (a,b)->a.getEng() > b.getEng()?a:b));
		//영어점수 최고점:Student [name=홍길동, eng=90, math=70, major=경영]
		System.out.println("수학점수 최고점:" + minOrMax(list, (a,b)->a.getMath() > b.getMath()?a:b));
		//수학점수 최고점:Student [name=김삿갓, eng=95, math=75, major=컴공]
		System.out.println("영어점수 최저점:" + minOrMax(list, (a,b)->a.getEng() < b.getEng()?a:b));
		//영어점수 최저점:Student [name=김삿갓, eng=80, math=75, major=컴공]
		System.out.println("수학점수 최저점:" + minOrMax(list, (a,b)->a.getMath() < b.getMath()?a:b));
		//수학점수 최저점:Student [name=이몽룡, eng=85, math=60, major=통계]
		System.out.println("합계점수 최고점:" + minOrMax(list, (a,b)->(a.getEng() + a.getMath()) > (b.getEng() + b.getMath())?a:b));
		//영어점수 최저점:Student [name=김삿갓, eng=80, math=75, major=컴공]
		System.out.println("합계점수 최저점:" + minOrMax(list, (a,b)->(a.getEng() + a.getMath()) < (b.getEng() + b.getMath())?a:b));
		//수학점수 최저점:Student [name=이몽룡, eng=85, math=60, major=통계]
		
//		System.out.println("합계점수 최저점:" + minTotOrMaxTot(list, (a,b)->a.getEng() < b.getEng()?a:b));		
//		System.out.println("합계점수 최저점:" + minTotOrMaxTot(list, (a,b)->a.getMath() < b.getMath()?a:b));
//	}
//	private static Student minTotOrMaxTot(List<Student> list, BinaryOperator<Studnet> f) {
//		int rslt = list.get[0];
//		int mathTot = 0;
//		int engTot = 0;
//		for(Student s : list) {
//			mathTot += f.apply(rslt, s);
//			
//		}
	}
	private static Student minOrMax(List<Student> list, BinaryOperator<Student> f) {
		Student rslt = list.get(0);
		for(Student s : list) {
			rslt = f.apply(rslt,  s);
		}
		return rslt;
	}

}
