import example.calculator.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int result = calculator.calculate(1, 2, '+');
        System.out.println(result);

        result = calculator.calculate(1, 2, '-');
        System.out.println(result);

        result = calculator.calculate(1, 2, '*');
        System.out.println(result);

        result = calculator.calculate(1, 2, '/');
        System.out.println(result);





        for (int i = 1; i <= 5; i++) {

            System.out.println("i = " + i);
        }
    }
}