import java.util.Scanner;

public class CalculatorRunner {
    public static void main(String[] args) {
        MyCalculator  calculator = new MyCalculator();
        calculator.userInput();
        calculator.sum();
        calculator.product();
        calculator.divide();
        calculator.modulo();
        calculator.average();
    }

}

