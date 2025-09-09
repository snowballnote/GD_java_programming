package chap10_test0909;

import java.util.*;

class NumberInputException extends Exception {
    public NumberInputException(String message) {
        super(message);
    }
}

public class Test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1~9까지 배열 만들기
        int[] num = new int[9];
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        // 섞기
        for (int i = 0; i < 1000; i++) {
            int f = (int) (Math.random() * 9);
            int t = (int) (Math.random() * 9);
            int tmp = num[f];
            num[f] = num[t];
            num[t] = tmp;
        }

        // 앞의 4개가 컴퓨터 정답
        int[] com = new int[4];
        for (int i = 0; i < 4; i++) {
            com[i] = num[i];
        }

        // 디버깅용 정답 출력
        System.out.println("정답(디버깅용): " + Arrays.toString(com));

        int tryCnt = 0;

        while (true) {
            try {
                System.out.print("서로 다른 4자리 정수를 입력하세요: ");
                int input = sc.nextInt();

                // 4자리 확인
                if (input < 1000 || input > 9999) {
                    throw new NumberInputException("4자리 숫자를 입력하세요.");
                }

                // 입력값 → 배열 변환
                int[] user = new int[4];
                for (int i = 3; i >= 0; i--) {
                    user[i] = input % 10;
                    input /= 10;
                }

                // 중복 확인
                for (int i = 0; i < user.length; i++) {
                    for (int j = i + 1; j < user.length; j++) {
                        if (user[i] == user[j]) {
                            throw new NumberInputException("중복된 숫자가 입력되었습니다.");
                        }
                    }
                }

                // strike, ball 계산
                int strike = 0, ball = 0;
                for (int i = 0; i < 4; i++) {
                    if (user[i] == com[i]) {
                        strike++;
                    } else if (contains(com, user[i])) {
                        ball++;
                    }
                }

                tryCnt++;
                if (strike == 4) {
                    System.out.println(Arrays.toString(user) + " 정답입니다.");
                    System.out.println(tryCnt + "번 만에 맞추셨습니다. 게임을 종료합니다.");
                    break;
                } else {
                    System.out.println(Arrays.toString(user) + ": " + strike + "스트라이크, " + ball + "볼");
                }

            } catch (NumberInputException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("숫자만 가능합니다.");
                sc.nextLine(); // 잘못된 입력 버퍼 비우기
            }
        }

        sc.close();
    }

    private static boolean contains(int[] arr, int target) {
        for (int n : arr) {
            if (n == target) return true;
        }
        return false;
    }
}