import java.util.Scanner;

public class MyCalculator {

   public  int number1;
    public  int number2;
    public  int number3;

    public void  userInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");
        number1 = input.nextInt();

        System.out.println("Enter your first number:");
        number2 = input.nextInt();

        System.out.println("Enter your first number:");
        number3 = input.nextInt();
    }

    public void sum(){
        int sum = number1 +number2 +number3;
        System.out.println("The sum is " +sum);
    }
    public void product(){
        int product = number1 * number2 * number3;
        System.out.println( "the Product "+ product);
    }
    public void divide(){
        int divide =  number1 / number2 / number3;
        System.out.println( "the Division "+ divide);
    }
    public void modulo(){
        int modulos = number1 % number2 % number3;
        System.out.println( "the Modulos of the numbers  "+ modulos);
    }
    public void average(){
        int average = (number1 + number2 + number3)/3;
        System.out.println( "the average on the numbers "+ average);
    }
}
