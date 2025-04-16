package lv1;

import java.util.Scanner;

public class mainlv1 {
    public static void main(String[] agrs) {
        Scanner scanner = new Scanner(System.in);


        String exitA = "";

        while (!exitA.equals("exit")) {

            System.out.print("첫번째 숫자를 입력하세요. : ");
            int num1 = scanner.nextInt();

            System.out.print("두번째 숫자를 입력 하세요. : ");
            int num2 = scanner.nextInt();

            scanner.nextLine(); //줄이 띄어져 없애는 용도로 사용

            System.out.print("사직 연산 기호를 입력하세요.(+, - , *, /) : ");
            String operation = scanner.nextLine();

            Character math = operation.charAt(0);


            int result = 0;


            if (math.equals('+')) {  //더하기
                result = num1 + num2;
            } else if (math.equals('-')) { //빼기
                result = num1 - num2;
            } else if (math.equals('*')) { //곱하기
                result = num1 * num2;
            } else if (math.equals('/')) { //나누기
                if (num2 != 0) {

                    result = num1 / num2;
                } else {
                    System.out.println("나누셈 연산에서 분모에 0이 입력된 수 없습니다. ");

                }
            }
            System.out.println("결과 :  " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료) ");
            exitA = scanner.nextLine();
            if (exitA.equals("exit")) break;
        }
    }
}

