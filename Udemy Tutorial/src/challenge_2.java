import java.util.Scanner;

public class challenge_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 3;

        System.out.println("Enter your Name:");
        String userName = scanner.nextLine();

        System.out.println("Your name is " + userName +", Your name is " + userName.length() + " character long." );


        System.out.println("Age: ");
        int age = scanner.nextInt();

        System.out.println("You have lived "+ age);
        System.out.println("You will be "+ (age + x) + " in " +  x + " years");




    }
}
