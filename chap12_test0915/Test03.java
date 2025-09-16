package chap12_test0915;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
public class Test03 {
    static Map<String, String> menus = new HashMap<>();

    public static void main(String[] args) {
        // 기본 등록
        menus.put("떡볶이", "오뎅");
        menus.put("짜장면", "단무지");
        menus.put("라면", "김치");

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("음식명을 입력하세요(종료:종료) ");
            String food1 = sc.next();

            if (food1.equals("종료")) break;

            String food2 = menus.get(food1);
            if (food2 == null) {
                System.out.println(food1 + "의 궁합음식이 등록되어 있지 않습니다. 등록하시겠습니까?(y/n)");
                String yn = sc.next();
                if (yn.equalsIgnoreCase("y")) {
                    System.out.print(food1 + "의 궁합음식을 등록하세요: ");
                    food2 = sc.next();
                    menus.put(food1, food2);
                } else {
                    System.out.println("다시 입력하세요.");
                }
            } else {
                System.out.println(food1 + "의 궁합음식: " + food2);
            }
        }

        // 마지막 출력
        System.out.println("등록된 음식 :");
        for (Map.Entry<String, String> entry : menus.entrySet()) {
            System.out.println("  " + entry.getKey() + " : " + entry.getValue());
        }
    }
}*/
public class Test03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String,String> foods = new HashMap<>();
		foods.put("떡볶이", "오뎅");
		foods.put("라면", "김치");
		while(true) {
			System.out.println("음식명을 입력하세요(종료:종료)");
			String food = scan.next();
			if(food.equals("종료")) break;
			String pairFood = foods.get(food);
			if(pairFood == null) {
				System.out.println(food + "의 궁합음식이 등록되어 있지 않습니다.등록하시겠습니까(Y)?");
				String yn = scan.next();
				if(yn.equalsIgnoreCase("Y")) {
					System.out.println(food + "의 궁합음식을 입력하세요");
					pairFood = scan.next();
					foods.put(food, pairFood);
				} else continue;
			} else {
				System.out.println(food + "의 궁합음식 : " + pairFood);
			}
		}
		System.out.println("프로그램 종료");
		System.out.println(foods);
	}
}
