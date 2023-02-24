import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age to claim giveaway");
        int age = scanner.nextInt();

        if (age < 12) {
            System.out.println("$100");
        } else if (age >= 13 && age <= 19) {
            System.out.println("$200");
        } else if (age >= 20 && age <= 25) {
            System.out.println("$300");
        } else if (age >= 26 && age <= 29) {
            System.out.println("$400");
        } else if (age >= 30 && age <= 35) {
            System.out.println("$500");
        } else if (age >= 36 && age <= 40) {
            System.out.println("$600");
        } else {
            System.out.println("Invalid!");
        }
        scanner.close();
    }
}
