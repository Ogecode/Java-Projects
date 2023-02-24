import java.util.Scanner;

public class challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Restaurant Bill calculator");

        System.out.println("Enter your bill: $");
        double bill = scanner.nextDouble();

        System.out.println("Enter the number of people");
        int people = scanner.nextInt();

        double eachPay = bill/people;

        System.out.println("Amount payable is " + bill/people );

    }
}
