package ex03_map;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/*
 * 도서정보를 책이름으로 정보를 저장하기
 */
class Book{
	String title;
	String author;
	int price;
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	@Override
	public String toString() {
		return "[" + title + "," + author + "," + price + "]";
	}
	
	
}
public class MainEx02 {
	static Map<String, Book> books = new HashMap<>(); //멤버변수 인스턴스멤버	(x) => 클래스 멤버가 되야함.	
	public static void main(String[] args) {
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1.추가, 2.삭제, 3.조회, 4.검색, 0.종료");
			try {
			menu = sc.nextInt();
			if(menu == 0)break;
			switch (menu) {
				case 1: addBook(); break;
				case 2: deleteBook(); break;
				case 3: printBook(); break;
				case 4: findBook(); break;
				default: System.out.println("잘못된 입력입니다. 0,1,2,3,4만 가능합니다.");
			}
			}catch(InputMismatchException e) {
				System.out.println("숫자 0,1,2,4만 가능합니다.");
			}
		}
	}
	private static void deleteBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제하고 싶은 도서를 입력해 주세요");
		String del = sc.next();
		Book book = books.remove(del);
		if(del == null) {
			System.out.println(del + "도서는 없습니다. 제목을 다시 확인해 주세요");
		}else {
			System.out.println("정말로 삭제하시겠습니까?");
			String yn = sc.next();
			if(yn.equalsIgnoreCase("Y")) {
				System.out.println(books + "의 정보가 삭제되었습니다.");
				books.remove(del);
			}
			
		}
		
	}
	
	private static void findBook() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("찾고싶은 도서를 입력해 주세요");
			String find = sc.next();
			Book book = books.get(find);
			if(book == null) {
				System.out.println(find + "도서는 없습니다.");
				
			}else {
				System.out.println("==찾으신 " + find +"의 정보==");
				System.out.println(book);
			}
			break;
		}
				
	}
	private static void printBook() {
		System.out.println("==등록된 도서 목록==");
		for(Book b : books.values()) {
			System.out.println(b);
		}		
	}
	/*
	 * 제목, 저자, 가격을 입력받아서 books map에 저장하기
	 */
	private static void addBook() {
		Scanner sc = new Scanner(System.in);
		System.out.println("등록할 도서의 제목, 저자, 가격을 입력하세요");
		String title = sc.next();
		String author = sc.next();
		int price = sc.nextInt();
		books.put(title, new Book(title, author, price));
		System.out.println(title + " 도서가 추가 되었습니다.");
	}

}
