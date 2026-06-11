package example.calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private String secret;

    // Getter
    public String getSecret() {
        return this.secret;
    }

    // Setter
    public void setSecret(String secret) {
        this.secret = secret;
    }

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

    public void removeResult() {

    }

    //public List<Integer> getResults() {
       // return null;
    //}


}

