package ex02_set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Student 클래스 구현하기
 * 멤버변수: 학번(studno), 이름,(name), 전공(major)
 * 멤버메서듸 toString(): 학생정보를 출력
 */
class Student{
	int studno;
	String name, major;
	public Student(int studno, String name, String major) {
		super();
		this.studno = studno;
		this.name = name;
		this.major = major;
	}
	@Override
	public String toString() {
		return name + ": " + studno + ", " + major;
	}
	@Override
	public int hashCode() {
		//return Objects.hash(name, studno);
		return studno + name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
		if(obj instanceof Student) {
			Student other = (Student) obj;
			return studno == other.studno &&name.equals(other.name);
		}else return false;
	}
}
public class Exam01 {
	public static void main(String[] args) {
		Set<Student> set =  new HashSet<>();
		set.add(new Student(1, "홍길동", "경영"));
		set.add(new Student(2, "홍길순", "경영"));
		set.add(new Student(2, "홍길순", "컴공"));
		set.add(new Student(1, "홍길동", "통계"));
		set.add(new Student(3, "홍길동", "컴공"));
		System.out.println(set);
	}
}
