package chap11_test0911;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 두개의 날짜를 입력받아서 두날짜사이의 일수를 출력하기
  [결과]
첫번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-01
두번째 날짜를 입력하세요(yyyy-MM-dd)
2025-01-03
2025-01-03 -2025-01-01 일자의 차이 : 2  
 */
public class Test03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 첫 번째 날짜 입력
            System.out.println("첫번째 날짜를 입력하세요(yyyy-MM-dd)");
            String first = sc.nextLine();
            String[] arr1 = first.split("-");
            int year1 = Integer.parseInt(arr1[0]);
            int month1 = Integer.parseInt(arr1[1]);
            int day1 = Integer.parseInt(arr1[2]);

            Calendar cal1 = Calendar.getInstance();
            cal1.set(year1, month1 - 1, day1);

            // 두 번째 날짜 입력
            System.out.println("두번째 날짜를 입력하세요(yyyy-MM-dd)");
            String second = sc.nextLine();
            String[] arr2 = second.split("-");
            int year2 = Integer.parseInt(arr2[0]);
            int month2 = Integer.parseInt(arr2[1]);
            int day2 = Integer.parseInt(arr2[2]);

            Calendar cal2 = Calendar.getInstance();
            cal2.set(year2, month2 - 1, day2);

            // 날짜 차이 계산 (밀리초 → 일수)
            long diff = (cal2.getTimeInMillis() - cal1.getTimeInMillis()) / (1000 * 60 * 60 * 24);

            System.out.printf("%s - %s 일자의 차이 : %d\n", second, first, diff);

        } catch (Exception e) {
            System.out.println("입력 형식이 올바르지 않습니다. yyyy-MM-dd 형식으로 입력하세요.");
        }
    }
}
