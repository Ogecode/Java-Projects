import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sum = 0;
        int count = 0;
        double avg = 0.0;

        for (int i = 0; i <= 100; i++) {
            if ((i % 2) != 0) {
                sum += i;
                count++;
                avg = sum / count;
            }
        }

        System.out.print("Sum of all odd numbers between 1 to 100 is  "
                + sum);
        System.out.println("\nThe Count Of Odd Numbers are:" + count);
        System.out.println("Average Number+: " + avg);
    }
}