package chap12_test0915;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
1.궁합음식의 키를 입력받아 해당되는 음식을 출력하기. 
  종료가 입력될때 까지 계속 출력하기
2.종료 입력시 등록된 내용 출력하기
  등록된음식 :
    떡볶이 : 오뎅
    짜장면 : 단무지
3. 등록이 안된경우 
   등록여부를 입력받아, 등록하는 경우 궁합음식을 입력받기  
   등록하시겠습니까(y)? 
     y입력 : foods객체에 추가.
            궁합음식 입력받아서 foods에 추가함
     y가아닌경우 :
            음식을 다시 입력하기   

[결과]
음식명을 입력하세요(종료:종료)
떡볶이
떡볶이의 궁합음식:오뎅
음식명을 입력하세요(종료:종료)
치킨
치킨의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까?
y
치킨의 궁합음식을 등록하세요
맥주
음식명을 입력하세요(종료:종료)
종료
{치킨=맥주, 떡볶이=오뎅, 라면=김치}
*/
class Menu{
	String food1;
	String food2;
	public Menu(String food1, String food2) {
		super();
		this.food1 = food1;
		this.food2 = food2;
	}
	@Override
	public String toString() {
		return food1 + "=" + food2;
	}
	
	
}
public class Test03 {
	static Map<String, String> menus = new HashMap<>();
	public static void main(String[] args) {
		menus.put("떡볶이", "오뎅");
		menus.put("짜장면", "단무지");

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("음식명을 입력하세요(종료:종료)");
			String food1 = sc.next();
			if(food1.equals("종료")) break;
			
			String food2 = menus.get(food1);
			if(food2 == null) {
				System.out.println(food1 + "의 궁합음식이 등록되어 있지 않습니다. 등록하시겠습니까?(y/n)");
				String yn = sc.next();
				if(yn.equalsIgnoreCase("Y")) {
		               System.out.print(food1 + "의 궁합음식을 등록하세요");
		               food2 = sc.next();
		               menus.put(food1, food2);
		            }
			}else {
				System.out.println(food1 + "의 궁합음식: " + food2);
			}
		}
		System.out.println(menus.entrySet());
		
	}
}