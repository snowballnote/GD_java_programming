package chap11_test0910;

class Student {
    int studno;   // 학번
    String name;  // 이름
    String major; // 전공

    // 생성자: 학번, 이름, 전공을 받아 Student 객체 생성
    public Student(int studno, String name, String major) {
        this.studno = studno;
        this.name = name;
        this.major = major;
    }

    /*
     * equals 메서드 오버라이딩
     * - Object 클래스의 기본 equals는 '주소값(==)'을 비교함
     * - 여기서는 "학번과 이름이 같으면 같은 학생"으로 간주하도록 재정의
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // 자기 자신과 비교하면 true
        if (o == null || getClass() != o.getClass()) return false; // null이거나 타입 다르면 false

        Student s = (Student) o; // 다운캐스팅
        return studno == s.studno && name.equals(s.name); // 학번과 이름이 모두 같을 때만 true
    }

    /*
     * toString 메서드 오버라이딩
     * - 객체의 정보를 보기 좋게 출력하기 위해 문자열 형태로 반환
     */
    @Override
    public String toString() {
        return "[학번=" + studno + ", 이름=" + name + ", 전공=" + major + "]";
    }
}

public class Test01 {
    public static void main(String[] args) {
        // s1과 s2는 내용은 비슷하지만 서로 다른 객체
        Student s1 = new Student(100,"홍길동","경영");
        Student s2 = new Student(100,"홍길동","컴공");

        // == 연산자는 "주소값" 비교 -> 서로 다른 객체이므로 false
        if(s1 == s2) {
            System.out.println(s1 + "과 " + s2 + "는 같은 객체입니다.");
        } else {
            System.out.println(s1 + "과 " + s2 + "는 다른 객체입니다.");
        }

        // equals 메서드는 "학번과 이름" 비교 -> true
        if(s1.equals(s2)) {
            System.out.println(s1 + "과 " + s2 + "학생은 같은 학생입니다.");
        } else {
            System.out.println(s1 + "과 " + s2 + "학생은 다른 학생입니다.");
        }
    }
}
