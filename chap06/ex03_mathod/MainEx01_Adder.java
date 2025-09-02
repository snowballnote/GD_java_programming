package ex03_mathod;
public class MainEx01_Adder {

	public static void main(String[] args) {
		Adder a1 = new Adder();
		int i1 = a1.add1(10, 20);
		System.out.println(i1);
		long l1 = a1.add2(10, 20);//int l1 = a1.add2(10, 20); long으로 받아야함.
		System.out.println(l1);
//add3함수의 리턴타입 : void이므로 값을 전달 받지 못함.		
//		int v1 = a1.add3(10, 20);
//		System.out.println(v1);
		a1.add3(10, 20);
	}

}
