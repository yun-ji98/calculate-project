package example.calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //양의 정수 입력받기
        System.out.print("첫 번째 숫자를 입력하세요: ");
        int firstNumber = sc.nextInt();

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int secondNumber = sc.nextInt();

        System.out.println("첫 번째 숫자 = " + firstNumber);
        System.out.println("두 번째 숫자 = " + secondNumber);

        //사칙연산 기호 입력받기
        System.out.print("사칙연산 기호를 입력하세요: ");
        String operator = sc.next();

        //위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
        int result = 0;

        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
            System.out.println("result = " + result);

        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
            System.out.println("result = " + result);

        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
            System.out.println("result = " + result);

        } else if (operator.equals("/")) {
            if (secondNumber == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                result = firstNumber / secondNumber;
                System.out.println("result: " + result);
            }

        }



        }
    }

