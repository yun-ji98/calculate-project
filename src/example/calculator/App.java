package example.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 양의 정수 입력받기
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int firstNumber = sc.nextInt();
            // System.out.println("첫 번째 숫자 = " + firstNumber);

            // 사칙연산 기호 입력받기
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            // String operator = sc.next();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int secondNumber = sc.nextInt();
            // System.out.println("두 번째 숫자 = " + secondNumber);

            if (operator == '/' && secondNumber == 0) {
                System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                continue;
            }

            // 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
            // int result = 0;
            int result = calculator.calculate(firstNumber, secondNumber, operator);
            System.out.println("Result: " + firstNumber + " " + operator + " " + secondNumber + " = " + result);

//          if (operator == '+') {
//              result = firstNumber + secondNumber;
//              System.out.println("result = " + result);
//          } else if (operator == '-') {
//              result = firstNumber - secondNumber;
//              System.out.println("result = " + result);
//          } else if (operator == '*') {
//              result = firstNumber * secondNumber;
//              System.out.println("result = " + result);
//          } else if (operator == '/') {
//              if (secondNumber == 0) {
//                  System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
//              } else {
//                  result = firstNumber / secondNumber;
//                  System.out.println("result: " + result);
//              }
//          } else {
//              System.out.println("올바른 사칙연산 기호를 입력해주세요.");
//          }

            System.out.print("\n더 계산하시겠습니까? (exit 입력 시 종료): ");
            String answer = sc.next();

            if (answer.equals("exit"))
                break;
            else
                System.out.print("\n");
        }
    }
}

