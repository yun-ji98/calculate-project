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
    }
}
