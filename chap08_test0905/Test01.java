package chap08_test0905;
/*
* 회사의 직원(Employee)은 여러 유형으로 나뉜다
* 1. 직원 (Employee) : 직원구분, 이름, 주소, 소속부서
*               모든 직원은 급여를 받아야 하므로 getPay() 메서드를 멤버 메서드로 가진다. 
*               단 직원 구분을 모르므로 getPay() 메서드를 구현할 수 없으므로 
*               추상 메서드로 구현한다.
* 2. 정규직원(FormalEmployee) : 직원번호,직급, 연봉을 가진다.
*             급여는 연봉 /12
* 3. 비정규직원(InformalEmployee) : 계약 만료일(Date),기본임금을 가진다.
*             급여는 기본임금을 지급한다
* 4. 임시직원(TempEmployee) : 시간당임금(timepay), 근무시간(emptime)을 가진다.
*             급여는 시간당 임금 * 근무시간으로 지급한다.
*
* 모든직원은 급여를 받아야 한다 . 각각의 클래스에 getPay() 메서드를 구현하기
* 모든 직원들은 자신의 멤버변수의 내용을 입력받아 객체로 생성한다.
* 구동 클래스를 실행시 다음 결과가 나오도록 모든 클래스를 구현하기
* 
* [결과]
정규직=>박정규:4166666
비정규직=>유비정:1000000
임시직=>손임시:250000
전체 직원 급여합:5416666
*/
import java.util.Date;
abstract class Employee{
	String type, name, addr, dep; //직원구분, 이름, 주소, 소속부서
	
	public Employee(String type, String name, String addr, String dep) {
		this.type = type;
		this.name = name;
		this.addr = addr;
		this.dep = dep;
	}//생성자

	abstract long getPay(); //abstract public long getPay(); 부모가 public이면 자손도 public으로 변경해줘야 오류안남.
	//부모와 자식의 선언이 같아야함. 그러나 부모의 접근제한자(public...)가 자식의 접근제한자보다 넓은 의미이면 이건 가능.
	//추상 메소드는 자손에 무조건 Override해줘야함.
}
class FormalEmployee extends Employee{
	String empNo; //직원 번호
	String position; //직금
	int saraly; //연봉
	FormalEmployee(String name, String addr, String dep, String empNo
					,String position, int saraly) {
		super("정규직", name, addr, dep);
		this.empNo = empNo;
		this.position = position;
		this.saraly = saraly;
	}
	@Override
	long getPay() {
		return saraly / 12;
	}
}
class InformalEmployee extends Employee{
	Date exDate; //계약 만료일
	int primaryPay; //기본임금
	InformalEmployee(String name, String addr, String dep
					, Date exDate, int primaryPay) {
		super("비정규직", name, addr, dep);
		this.exDate = exDate;
		this.primaryPay = primaryPay;
	}
	@Override
	long getPay() {
		return primaryPay;
	}
}
class TempEmployee extends Employee{
	int timePay; //시간당임금
	int empTime; //근무시간
	TempEmployee(String name, String addr, String dep
					, int timePay, int empTime) {
		super("임시직원", name, addr, dep);
		this.timePay = timePay;
		this.empTime = empTime;
	}
	@Override
	long getPay() {
		return timePay * empTime;
	}
}
public class Test01 {
	public static void main(String[] args) {
		Employee[] emps = new Employee[3];
		emps[0] = new FormalEmployee("박정규","서울","총무부","001","과장",50000000);
		Date exDate = new Date(); 
		exDate.setTime(exDate.getTime() + (1000L*60*60*24*365));
		System.out.println(exDate);
		emps[1] = new InformalEmployee("유비정","서울","기획부",exDate,1000000);
		emps[2] = new TempEmployee("손임시","서울","영업부", 25000,10);
		long total = 0;
		for(Employee e : emps) {
			System.out.println(e.type + "=>" + e.name + ":"  + e.getPay());
			total += e.getPay();
		}				
		System.out.println("전체 직원 급여:" + total);
	}
}
