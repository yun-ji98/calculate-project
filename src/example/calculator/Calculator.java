package example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

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

        return result;

    }


    }

