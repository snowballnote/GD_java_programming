package ex10_scanner;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainEx01{
	public static void main(String[] args){
		String str = "100 and 200 and animal and lion and tiger";
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\s*and\\s*");
		while(true) {
			try {
				String token = sc.next();
				System.out.println(token);
			}catch(NoSuchElementException e) {
				break;
			}
		}
	}
}
