import java.util.Scanner;

public class loop_password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        int count =0;
        System.out.println("Enter Password for access to your profile");
        do { count++;
            if (count >1){
            System.out.println("Ty again: ");
            }
            System.out.print("Enter Password: ");
            input = scanner.next();
        } while (!input.equals("shark50") );

        System.out.println("ACCESS APPROVED");




    }
}
