package ex01_interface;
/*
 * 리턴타입으로 사용되는 인터페이스
 */
class Lazerzet implements Printerable{
	String name = "레이저젯";
	@Override
	public void print() {
		System.out.println("레이저 프린터로 프린트 합니다.");
	}
}
class Inkzet implements Printerable{
	String name = "잉크젯";
	@Override
	public void print() {
		System.out.println("잉크젯 프린터로 프린트 합니다.");
	}
}

class PrinterManager{
	public static Printerable getPrint(String type) {
		if(type.equals("INK")) {
			return new Inkzet(); //Inkzet 객체로 리턴.Inkzet객체 타입이 Printable타입으로 형변환되어 넘어감.
		}
		else {
			return new Lazerzet();
		}
	}
}
public class MainEx02 {
	public static void main(String[] args) {
		Printerable p = PrinterManager.getPrint("INK");
		//Inkzet p = PrinterManager.getPrint("INK"); //Inkzet객체가 들어오는 건 맞지만 
		p.print();
		//System.out.println(p.name); //p.name은 에러발생=>객체안에 분명 p가있는데 에러 발생하는 이유
		//=>printable에는 name이라는 객체가 없어서.=>쓰고싶으면.System.out.println((Inkzet)p).name);으로 사용가능. 근데 리턴타입이 다르면 에러발생하므로 주의해야함.
	}
}