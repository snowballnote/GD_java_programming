package test03;

import java.util.Scanner;
//  반지름을 입력받아 원의 둘레와 면적을 구하시오
public class Test06 {
	public static void main(String[] args) {
		System.out.print("반지름을 입력하시오: ");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); //double이나 float로 받으면 둘레와 면적 알아서 소수점으로 나옴.
		//double r = sc.nextDouble()
		double pi = 3.141592;
		
		float circumference = (float) (2 * pi * r);
		float area = (float) (pi * r * r);
		System.out.println("원의 둘레: " + circumference + "원의 면적: " + area);
		
		sc.close();
	}
}