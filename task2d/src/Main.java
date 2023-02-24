import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter Number");
       int  count = scanner.nextInt();

        for (int i = 0; i <= count; i+=4) {

            if (i % 2 == 0) {
                System.out.printf("\n%d: fizz", i);
            } else if (i % 2 == 1) {
                System.out.printf("\n%d: buzz", i);
            }
        }
        System.out.printf("\n");
        scanner.close();

    }
}