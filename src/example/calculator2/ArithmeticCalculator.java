package example.calculator2;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        enum OperatorType {
            plus('+'),
            minus('-'),
            multiply('*'),
            divide('/');

           private final char symbol;

           OperatorType(char symbol) {
               this.symbol = symbol;
            }

            public char getSymbol() {
               return symbol;
            }
        }
    }
}
