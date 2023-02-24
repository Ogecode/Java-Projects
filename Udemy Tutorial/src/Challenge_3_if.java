import java.util.Scanner;

public class Challenge_3_if {
    public static void main(String[] args) {

        int x = 7;
        int y = 9;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comparing x and y");

        System.out.println("Enter a x");
        double number = scanner.nextDouble();
        System.out.println("Enter a y");
        double number1 = scanner.nextDouble();

        if(x > y) {
            System.out.println("x is greater than y");
        }
        else if (x < y){
            System.out.println("y is lesser  than x");
        }
        else {  System.out.println("y and x are the same");}
    }
}
