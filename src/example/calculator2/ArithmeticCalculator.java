package example.calculator2;

public class ArithmeticCalculator {
    public static void main(String[] args) {

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

        public static OperatorType fromSymbol ( char operator) {
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