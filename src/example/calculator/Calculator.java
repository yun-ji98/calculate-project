package example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 속성
    private List<Integer> results = new ArrayList<>();


    // 생성자
    public Calculator() {

    }

    //기능
    public int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;

        if (operator == '+') {
            result = firstNumber + secondNumber;
        } else if (operator == '-') {
            result = firstNumber - secondNumber;
        } else if (operator == '*') {
            result = firstNumber * secondNumber;
        } else if (operator == '/') {
            result = firstNumber / secondNumber;
        }

        // 리스트 저장 코드
        results.add(result);

        return result;

    }


    }

