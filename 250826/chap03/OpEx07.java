package chap03;
/*
 * 대입연산자 : =, +=, -=, ...
 * 	a = 10; => a변수에 10을 저장(대입)
 * 	lvalue = rvalue : 왼쪽변수는 오른쪽 변수다.
 * 	lvalue : 무조건 변수여야함.
 * 	rvalue : 변수, 상수, 수식 가능.
 * 
 * 	a + b = 10; (x) //왼쪽에 수식이 올 수 없음.
 * 	10 = 20; (X)
 * 	a = a + b; (o) //a+b해서 a에 집어넣기
 * 	a = b + 10; (o) //위와 같음.
 */
public class OpEx07 {

	public static void main(String[] args) {
		int num = 100;
		System.out.println(num); //100
		num += 10; //num + 10의 값을 num에 넣기
		System.out.println(num); // 110
		num -= 10; //num = num - 10
		System.out.println(num); //100
		num *= 5; //num = num * 5
		System.out.println(num); //500
		num /= 10; //num = num / 10
		System.out.println(num); //50
		num %= 3; //num = num % 3
		System.out.println(num); //2
		num += 2 + 3; //num = num + (2 + 3)
		System.out.println(num); //7
		
		byte b = 1;
		b *= 2; //아래식과 같은건 아님. 의미적으로만 같음. 많은 수를 계산하면 위에 식이 시간이 덜 걸림.
		//b = b * 2; //error! 
		System.out.println(b); //2
		b *= 2;
		System.out.println(b); //4
		
	}

}
