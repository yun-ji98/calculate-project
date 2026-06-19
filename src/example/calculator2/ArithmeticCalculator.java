package example.calculator2;

public class ArithmeticCalculator {
    public static void main(String[] args) {

    }

    public int calculate(int firstNumber, int secondNumber, char operator) {
        int result = 0;

        OperatorType operatorType = OperatorType.fromSymbol(operator);

        if (operatorType == OperatorType.PLUS) {
            result = firstNumber + secondNumber;
        } else if (operatorType == OperatorType.MINUS) {
            result = firstNumber - secondNumber;
        } else if (operatorType == OperatorType.MULTIPLY) {
            result = firstNumber * secondNumber;
        } else if (operatorType == OperatorType.DIVIDE) {
            result = firstNumber / secondNumber;
        }
        return result;

    }

    enum OperatorType {
        PLUS('+'),
        MINUS('-'),
        MULTIPLY('*'),
        DIVIDE('/');

        private final char symbol;

        OperatorType(char symbol) {
            this.symbol = symbol;
        }

        public char getSymbol() {
            return symbol;
        }

        public static OperatorType fromSymbol (char operator) {
            OperatorType[] values = OperatorType.values();
            for (int i = 0; i < values.length; i++) {
                OperatorType value = values[i];

                if (value.getSymbol() == operator) {
                    return value;
                }
            }

            throw new IllegalArgumentException("지원하지 않는 연산자입니다.");
        }
    }
}