import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator_simplified {
    public static void main(String[] args) {

            final int MonthsInYear = 12;
            final int Percent = 100;
            int Principal = 0;
            double monthlyInterest = 0;
            int  numberOfPayments = 0;
            Scanner scanner = new Scanner(System.in);  //scanner object created//

            while (true){
                System.out.println("Enter your Principal:");
                Principal = scanner.nextInt();
                if (Principal >= 1000 && Principal <=9000)
                    break;
                System.out.println("Enter a valid number between 1000 and 9000");}

            while (true){
                System.out.println("Enter your Annual Interest Rate:");
                double annualInterest = scanner.nextDouble();
                if (annualInterest >=1 && annualInterest <=20)
                    break;
                monthlyInterest = annualInterest/Percent/MonthsInYear;}
            System.out.println("Enter number between 1 and 20");

            while(true){
                System.out.println("Enter your Period(Years):");
                int Period_years = scanner.nextInt();
                if (Period_years >= 1 && Period_years <= 10)
                    break;
                numberOfPayments = Period_years * MonthsInYear;}
            System.out.println("Enter a valid period between 1 and 10 years");

            double mortgage = Principal* (monthlyInterest *Math.pow(1+ monthlyInterest, numberOfPayments))
                    /(Math.pow(1+monthlyInterest,numberOfPayments) -1);

            String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);  // change string to currency//
            System.out.println("Mortgage: " + mortgageFormatted);

    }

}
