import java.util.Scanner;

public class other_exercises {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

      /*  System.out.println("Enter your number");
        int number = scanner.nextInt();
if ( number >0){System.out.println("Number is positive");}
else System.out.println("number is negative");*/

        System.out.println("Enter your first  number");
        int number1 = scanner.nextInt();
        System.out.println("Enter your  second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter your third number");
        int number3 = scanner.nextInt();
 if ( number1 > number2)
     if ( number1 > number3){
         System.out.println("Number 1 is greatest");
     }  if (number2> number1)
         if (number2> number3){
     System.out.println("Number 2 is greatest");
     }
        if( number3 > number1)
            if ( number3 > number2) System.out.println("Number 3 is  the greatest");
    }
}
