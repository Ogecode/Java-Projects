import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double num1 = 0; double num2 = 0; double num3 = 0;
        double sum = 0.0; double avg = 0.0; double max = 0.0;

        System.out.println();
        System.out.println("\t Sum, Average, Max of 3 numbers");
        System.out.println();
        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();

        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();

        System.out.print("Enter Third Number: ");
        num3 = scan.nextInt();

        System.out.println();
        sum = num1 + num2 + num3;
        System.out.println("Sum of these numbers:"+sum);

        avg = sum / 3;
        System.out.println("Average of these number:"+avg);

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("Largest number is:"+num1);
        }
        else if(num2 > num3)
        {
            System.out.println("Largest number is:"+num2);
        }
        else
        {
            System.out.println("Largest number is:"+num3);
        }
    }
    {

    }
}