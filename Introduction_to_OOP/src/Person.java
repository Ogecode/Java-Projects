import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    String homeAddress;
    int age;
    String religion;
    String hobbies;
    double height;

    public void userInput() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");
        firstName = input.nextLine();

        System.out.println("Enter your lastname:");
        lastName = input.nextLine();


        System.out.println("Enter your home address:");
        homeAddress = input.nextLine();

        System.out.println("Enter your age:");
        age = input.nextInt();

        System.out.println("Select your religion");
        System.out.println("Christianity");
        System.out.println("Islam");
        System.out.println("Do not disclose");
        religion = input.nextLine();

        System.out.println("What are your hobbies:");
        hobbies = input.nextLine();

        System.out.println("Enter your height:");
        height = input.nextDouble();
    }
    /*void walk(){
        System.out.println("Read a book");
    }
    void run(){
        System.out.println("Write on a book");
    }
    void dance(){
        System.out.println("Read a book");
    }
    void eat(){
        System.out.println("Write on a book");
    }
    void jump(){
        System.out.println("Read a book");
    }

     */

}
